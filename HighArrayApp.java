public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray ha = new HighArray(maxSize);
        ha.insert(77);
        ha.insert(99);
        ha.insert(44);
        ha.insert(55);
        ha.insert(22);
        ha.insert(88);
        ha.insert(11);
        ha.insert(00);
        ha.insert(66);
        ha.insert(33);
        ha.display();

        int searchKey = 35;
        if(ha.find(searchKey)) System.out.println("Found: " + searchKey);
        else System.out.println("Not found: " + searchKey);

        ha.delete(00);
        ha.delete(55);
        ha.delete(99);

        ha.display();
    }   
}


class HighArray{

    private long[] a;
    private int nElems;

    public HighArray(int max){ // тут создание массива просто в конструкторе
        a = new long[max];
        nElems = 0;
    }
    
    public boolean find(long searchKey){ // линейный алгоритм поиска элемента в массиве
        int j;
        for(j = 0; j < nElems; j++){
            if(a[j] == searchKey) break;
        }
        if(j == nElems) return false;
        else return true;
    }

    public void insert(long value){ // операция вставки в массив. После добавления -> кол-во инкрементируем
        a[nElems] = value;
        nElems++;
    }
    
    public boolean delete(long value){ // операция удаления. если элемента нет, то возвращает false, если есть, то удаление со сдвигом и возвращение true
        int j;
        for(j = 0; j < nElems; j++){
            if(a[j] == value) break;
        }
        if(j == nElems) return false;
        else {
            for(int k = j; k < nElems; k++){
                a[k] = a[k+1];
            }
            nElems--;
            return true;
        }


    }

    public void display(){
        for(int j = 0; j < nElems; j++){
            System.out.print(a[j] + " ");
        }
        System.out.println("\n");
    }


}
