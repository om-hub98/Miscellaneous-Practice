package JavaBasic.EqualsAndHashCode;

public class MainImplementation {

    public static void main(String[] args) {

        Human h1 = new Human("Omraj",26);
        Human h2 = new Human("Niraj",24);
        Human h3 = new Human("Omraj",26);



        System.out.println("H1 hashcode : " + h1.hashCode());
        System.out.println("H2 hashcode : " + h2.hashCode());
        System.out.println("H3 hashcode : " + h3.hashCode());

        System.out.println(h1.equals(h3));
    }
}
