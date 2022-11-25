
public class Search01_LinearSearch{
    public static int LinearSh(int a[], int key){
        for(int i = 0; i < a.length; i++){
            if(a[i] == key){
                // System.out.println(key + " is avalable at "+ i + " index");
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int array[] = {3, 6, 9, 4, 5, 10, 11};
        int key = 13;
        int index = LinearSh(array, key);
        if(index == -1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("Found at " + index);

        }

    }
}