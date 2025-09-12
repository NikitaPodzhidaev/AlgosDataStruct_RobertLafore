public class ClassDataApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ClassPersonArray cpa = new ClassPersonArray(maxSize);
        cpa.insert("Nikita", "Targaryen", 21);
        cpa.insert("Milana", "Chechel", 21);
        cpa.insert("Tandzhiro", "Kamado", 16);
        cpa.insert("Joseph", "Joestar", 57);
        cpa.insert("Kakyein", "Nariyaki", 17);
        cpa.displayArray();

        String searchKey = "Joestar";
        Person personToFind = cpa.find(searchKey);
        if(personToFind != null) {
            System.out.println("Found such a person: " + searchKey);
            personToFind.displayPerson();
        } else {
            System.out.println("That person was not found: " + searchKey);
        }

    }

    static class Person{
        private String lastName;
        private String firstName;
        private int age;

        public Person(String firstName, String lastName, int age){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void displayPerson(){
            System.out.print(" -- Last name: " + lastName);
            System.out.print(", First name: " + firstName);
            System.out.println("\t Age: " + age + ".");
        }

        public int getAge() {
            return age;
        }
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }

    }

    static class ClassPersonArray{
        private Person[] a;
        private int nElems;

        /* constructor. makes an object with some maxSize(capacity)
         * and makes amount of elements = 0
        */
        public ClassPersonArray(int maxSize){
            a = new Person[maxSize];
            nElems = 0;
        }
        
        /* find method. returns an object with necessary String searchName
         * if index < nElems => means that searchName was found => return that a[index]
         * if index == nElems => means that searchName wasn't found => return null
        */
        public Person find(String searchLastName){
            int j;
            for(j = 0; j < nElems; j++){
                if(a[j].getLastName().equals(searchLastName)) break;
            }
            if (j == nElems) return null;
            else return a[j];
        }

        /* insert method. adds an object to the array and increases the amount of elements */
        public void insert(String firstName, String lastName, int age){
            a[nElems] = new Person(firstName, lastName, age);
            nElems++;
        }

        /* delete method. finds an object with necessary String searchLastName
         * if there's no such object => returns false
         * if there's such object => a lineal shift of an object and decreases amount of elements
         */
        public boolean delete(String searchLastName){
            int j;
            for(j = 0; j < nElems; j++){
                if(a[j].getLastName().equals(searchLastName)) break;
            }
            if(j == nElems) return false; // not found => return false (not deleted)
            else { // if found => return true
                for(int k = j; k < nElems; k++){
                    a[k] = a[k+1];
                }
                nElems--;
                return true;
            }
        }

        public void displayArray(){
            for(int i = 0; i < nElems; i++){
                a[i].displayPerson();
            }
        }

    }

    

}
