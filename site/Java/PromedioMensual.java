import java.util.Scanner;
public class PromedioMensual{
    public static void main(String args[]) {

        Scanner d1 = new Scanner(System.in);

        double n1,n2,n3,prom;

        System.out.println("Ingrese la primer nota: ");
        n1 = d1.nextDouble();

        System.out.println("Ingrese la segunda nota: ");
        n2 = d1.nextDouble();

        System.out.println("Ingrese la tercer nota: ");
        n3 = d1.nextDouble();

        prom = ((n1+n2+n3)/3);

        System.out.println("El promedio mensual es : "+ prom);
        d1.close();

      }
}
