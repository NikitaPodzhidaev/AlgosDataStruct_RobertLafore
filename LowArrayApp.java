public class LowArrayApp {
    public static void main(String[] args) {
        LowArray la = new LowArray(100);
        int nElems = 0;
        int j;

        la.setElem(0, 77);
        la.setElem(1, 99);
        la.setElem(2, 44);
        la.setElem(3, 55);
        la.setElem(4, 22);
        la.setElem(5, 88);
        la.setElem(6, 11);
        la.setElem(7, 00);
        la.setElem(8, 66);
        la.setElem(9, 33);
        nElems = 10; // 10 elements

        for(j = 0; j < nElems; j++){
            System.out.print(la.getElem(j) + " ");
        }
        System.out.println("\n\n");

        int searchKey = 66;
        for(j = 0; j < nElems; j++){
            if(la.getElem(j) == searchKey) break;
        }
        if(j == nElems) System.out.println("Not found! " + searchKey);
        else System.out.println("Found! " + searchKey);
    }
}

class LowArray{

    private long a[]; // ссылка на массив
    public LowArray(int size){
        a = new long[size];
    }

    public void setElem(int index, long value){
        a[index] = value;
    }

    public long getElem(int index){
        return a[index];
    }

}
