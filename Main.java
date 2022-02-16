public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullname= " + person.getFullName());
        System.out.println("isTeen = " + person.isTeen());
        person.setFirstName("Grace");
        person.setAge(34);
        System.out.println("fullname= " + person.getFullName());
        System.out.println("isTeen = " + person.isTeen());
        person.setLastName("Hanssen");
        System.out.println("fullname= " + person.getFullName());
    }
}
