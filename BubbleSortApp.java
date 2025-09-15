public class BubbleSortApp {
    public static void main(String[] args) {
        int[] array = {7, 9, 22, 2, 3, 51, 29};
        bubbleSort(array);
        for(int x : array){
            System.out.print(x + " ");
        }
    }

    public static void bubbleSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] > array[j+1]){
                    int box = array[j];
                    array[j] = array[j+1];
                    array[j+1] = box;
                }
            }
        }
    }

}
