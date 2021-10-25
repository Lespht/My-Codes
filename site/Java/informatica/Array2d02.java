package periodo.pkg2;

import javax.swing.JOptionPane; 
import java.util.*;
public class Array2d02 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [] [],nFila,nCol;
        
        nFila = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas"));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas"));
        matriz = new int [nFila][nCol];
        System.out.println("llenando matriz...");
        
       for(int i = 0; i<nFila; i++){
           for(int j = 0; j<nCol; j++){
               System.out.print("Digite los elementos de la matriz en la posicion" + "["+i+"]" + "["+j+"]:");
               matriz [i] [j] = entrada.nextInt();
               
           }
       }
       for(int i = 0; i<nFila; i++){
          for(int j = 0; j<nCol; j++){
              System.out.print(matriz [i] [j] + " ");
              
          }
          System.out.println("");
       }
       
    }
}