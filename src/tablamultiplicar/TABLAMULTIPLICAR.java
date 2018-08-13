/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author franky
 */
public class TABLAMULTIPLICAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Leer=new Scanner(System.in);
        int A, B, C, D, E=0;
         
         System.out.println("Que tabla quiere practicar");
         A=Leer.nextInt();
         System.out.println("apartir de que numero quieres empesar");
         B = Leer.nextInt();
         System.out.println("en que numero quieres terminar");
         C = Leer.nextInt();
         
          for(D=B;D<=C;D++){
              B=A*D;
              do{
                  System.out.println(A+"x"+D+"=");
          E=Leer.nextInt();      
         
    }
            while(E!=B);
        } // TODO code application logic here
    }
    
}
