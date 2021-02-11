import java.util.Scanner;
public class PromedioAR {
    public static void main(String args[]) {

        int base,altura, area;

        Scanner d1 = new Scanner(System.in);

        double n1,n2,n3,prom;

        System.out.println("Ingrese la primer nota: ");
        n1 = d1.nextDouble();

        System.out.println("Ingrese la segunda nota: ");
        n2 = d1.nextDouble();

        System.out.println("Ingrese la tercer nota: ");
        n3 = d1.nextDouble();

        prom = ((n1+n2+n3)/3);

        if(prom > 6)

            System.out.println("Aprobado");

        if(prom < 6)

            System.out.println("Reprobado");


      }
}
