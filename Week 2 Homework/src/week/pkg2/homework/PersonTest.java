
package week.pkg2.homework;


public class PersonTest {

   
    public static void main(String[] args) {
        System.out.printf("Benjamin Knauth = Teacher's Copy\n\n");
        
        System.out.printf("toString() on Person returns => \t%s\n", new Person().toString());
        System.out.printf("toString() on Student returns => \t%s\n", new Student().toString());
        System.out.printf("toString() on Employee returns => \t%s\n", new Employee().toString());
        System.out.printf("toString() on Student returns => \t%s\n", new Faculty().toString());
        System.out.printf("toString() on Employee returns => \t%s\n", new Staff().toString());
    }
}
