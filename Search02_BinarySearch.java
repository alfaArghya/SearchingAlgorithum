import java.util.*;

public class Search02_BinarySearch {

    public static int BinarySc(int array[], int n, int key){
        int start = 0, mid = 0, end = n-1;

        while(start <= end){
            mid = (start + end)/2;
            if(array[mid] == key){
                return mid;
            }
            else if(array[mid] > key){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int Data[] = new int[100];
        System.out.println("How many data u want to add?");
        System.out.print("--> ");
        int n = scn.nextInt();
        System.out.println("Enter sorted data: ");
        for(int i = 0; i < n; i++){
            Data[i] = scn.nextInt();
        }
        System.out.println("which data u want fo find?");
        System.out.print("--> ");
        int key = scn.nextInt();

        int index = BinarySc(Data, n, key);
        if(index == -1){
            System.out.println("The data is not inside the set");
        }
        else{
            System.out.println(key + " is found at index " + index);
        }

        scn.close();
    }
}
