public class Person extends Sammenlignbar {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int compareTo(Sammenlignbar other) {
        //retuner -1 hvis denne person kommer FØR andenPerson
        /*String voresFornavn = firstName;
        String andenFornavn = andenPerson.firstName;

        if (voresFornavn.compareTo(andenFornavn) <= 0) {
            return -1;
        } else {
            return 1;
        }

        return firstName.compareTo(andenPerson.firstName);
        */
        Person andenPerson = (Person) other;
        return lastName.compareTo(andenPerson.lastName);


    }


    @Override
    public String toString() {
        return lastName + " " + firstName;
    }
}
