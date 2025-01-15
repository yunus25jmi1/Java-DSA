package yunus;

public class Primitives {
    public static void main(String[] args) {
           int rollno = 64;
           int age = 18;
           char letter = 'A';
           float marks = 3.14f;
           double largenum = 78.61238981402379468732746231273;
           long largeInt = 1600074354323435L;

           boolean bool = true;


           // String is not primitive.
           String name = "John Doe";

           Integer rno = 901;
           System.out.println(Integer.hashCode(rno));
    }
}
