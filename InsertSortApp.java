public class InsertSortApp {
    public static void main(String[] args) {
        int[] source = {4, 11, 8, -2, 16, 13};
        // out = 1 = > "11"
        // a[in-1] = "4", a[in] = "11", "11" > "4", in > 0
        // after iter: a[in] = a[in-1] = "4"
        // a[in] = temp == "11"
        insertionSort(source);
        for(int x : source) System.out.println(x);
        
    }
    public static void insertionSort(int[] array){
        int in,out;
        for(out = 1; out < array.length; out++){
            int temp = array[out];
            in = out;
            while(in > 0 && array[in-1] >= temp){
                array[in] = array[in-1];
                --in;
            }
            array[in] = temp;
        }


    }

    
}
