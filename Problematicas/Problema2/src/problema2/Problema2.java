/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author USUARIO
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int  contador1 = 1;
        int  contador2 = 10;
        int  contador3 = 20;
        while (contador1 <= 6) {            
            if ((contador1 % 2) == 0){
            System.out.println(contador1 + "/" + contador3);
            contador3 = contador3 + 1;
            }else{
            System.out.println(contador1 + "/" + contador2);
             contador2 = contador2 + 1;                 
            }
          contador1 = contador1 + 1;   
        }
   
    }
    
}
      
    
