import java.util.Scanner;
public class areadelrectangulo{
    public static void main(String args[]) {

        int base,altura, area;

        Scanner d1 = new Scanner(System.in);

        System.out.println("Escriba el valor de la base: ");
        base = d1.nextInt();

        System.out.println("Escriba el valor de la altura: ");
        altura = d1.nextInt();

        area = base * altura;

        System.out.println("El valor del area es :" + area);

      }
}
