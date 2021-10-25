package periodo.pkg2;

import java.util.*;
public class Array2d01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz [] [] = new int [3] [3];//i = filas, j = columnas
        int i;
        int j;
        //este es tu primer arreglo bidimensional, lo que significa numeros ordenados en columnas
        for(i = 0; i<matriz.length; i++){//formlula general que usaremos, parecida al ciclo for utilizado en un arreglo unidimensional
            for(j = 0; j<matriz[i].length; j++){//en este caso, el cicl for debera ser repetido
            matriz[i] [j] = (i*matriz.length)+(j+1);//con esto, se completa que ambos terminos sean multiplicados, generando una tabla numerica
            System.out.print(matriz[i][j]+" ");
            
        }
            System.out.println("");
      }
    }
}