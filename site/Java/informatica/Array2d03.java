package periodo.pkg2;

import java.util.*;
public class Array2d03 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          int matriz [] [] = new int [7] [7];
          int valor = 1;
         
        for(int i = 0; i<matriz.length; i++){
               matriz [i][i] = valor = 1;
               
           }
       
         for (int[] matriz1 : matriz) {
             System.out.println(Arrays.toString(matriz1));
         } 
         
     }
}