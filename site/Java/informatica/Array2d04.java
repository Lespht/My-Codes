package periodo.pkg2;

import java.util.*;
public class Array2d04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int filas = 3;//el final es una constante, ed decir, el valor se mantiene
        final int columnas = 3;
        char [] [] matriz = new char [filas][columnas];
        char letra1 = 'A';

        for(int i = 0; i<filas;i++){
            for(int j = 0; j<columnas;j++){
                matriz[i][j] = letra1;
                letra1++;
              System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
//Este codigo es una base a como generar un arreglo bidimensional