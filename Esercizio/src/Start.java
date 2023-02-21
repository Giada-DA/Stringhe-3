import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        String[] array1 = {
                " I want ",
                " to learn ",
                " how to code! ",
        };
        /*System.out.println(array1[0].trim());
        System.out.println(array1[1].trim());
        System.out.println(array1[2].trim());*/
        String[] array2 = array1;
        System.out.println(array2[0].trim());
        System.out.println(array2[1].trim());
        System.out.println(array2[2].trim());
        int statemen1 = array2[0].compareTo("I want");
        int statemen2 = array2[1].compareToIgnoreCase("To learn");
        System.out.println(statemen1);
        System.out.println(statemen2);
        boolean A = !(statemen1 > statemen2);
        System.out.println(A);
    }
}
