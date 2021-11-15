import java.util.Arrays;

public class PersonSorter {

    public void start(){
        //opret et arrat af person objeketer med 3 persons i

        Person[] arr = new Person[3];
        arr[0] = new Person("Hassan", "Niku");
        arr[1] = new Person("Mohammed", "Signh");
        arr[2] = new Person("Allan", "Hansen");

        System.out.println("Før sortering: " + Arrays.toString(arr));

        QuickSort.sort(arr);

        System.out.println("Efter sortering: " + Arrays.toString(arr));

    }

    public static void main(String[] args) {
        PersonSorter app = new PersonSorter();
        app.start();
    }
}
