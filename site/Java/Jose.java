import java.util.*;
public class Jose {
    public static void main(String args[]) {
    Scanner sc = new Scanner (System.in);
    int n;
    System.out.print("Introduce un nuemro entero : ");
    n = sc.nextInt();

    System.out.print("Tabla del " + n);
    for(int i= 1; i <=10; i++){

        System.out.println(n + " * " + i + " * " + n * i);
   }



    }
}
