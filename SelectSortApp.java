public class SelectSortApp {
    public static void main(String[] args) {
        int[] array = {71, 33, 12, 17, 90, 91};
        selectSort(array);
        for(int x : array) System.out.print(x + " ");

    }

    public static void selectSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }

            int box = array[i];
            array[i] = array[minIndex];
            array[minIndex] = box;
        }
    }
    
}
