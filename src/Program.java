public class Program {
    public static void main(String[] args) {
        Person p = new Person("Trevor","Smith"); // somehow add birthdate to this object
        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
        System.out.println(p.getAge());

        p.setLastName("Jones");
        System.out.println(p.getFullName());
        System.out.println(p.getAge());

        p.gettingOlder();
        System.out.println(p.getFirstName() + " " + p.getLastName());
        System.out.println(p.getAge());
/*
        p.age = 18;
        System.out.println(p.firstName);
        System.out.println(p.lastName);
        System.out.println(p.age);
*/
    }
}
