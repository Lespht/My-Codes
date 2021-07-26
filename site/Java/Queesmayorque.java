import java.util.Scanner;
public class Queesmayorque{
    public static void main(String args[]) {

        Scanner v1 = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Ingresar el primer numero :");
        num1 = v1.nextInt();

        System.out.println("Ingrese el segundo numero :");
        num2 = v1.nextInt();

        System.out.println("Ingrese el tercer numero :");
        num3= v1.nextInt();

        if(num1 > num2){

            System.out.println("El número " + num1 + " es mayor que el numero " + num2);
        }else{

            System.out.println("El número " + num2 + " es mayor que el número " + num1);

        if(num2 > num3){

            System.out.println("El número " + num2 + " es mayor que el numero " + num3);
        }else{

            System.out.println("El número " + num3 + " es mayor que el número " + num2);
        if(num1 > num3){

            System.out.println("El número " + num1 + " es mayor que el numero " + num3);
        }else{

            System.out.println("El número " + num3 + " es mayor que el número " + num1);
            v1.close();
        }
        }
        }

    }
}
