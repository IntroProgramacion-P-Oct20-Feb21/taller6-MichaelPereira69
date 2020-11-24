/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jamil
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // TODO code application logic here
      String contador = "si";
      String nombre;
      int numerodias;
      String cadenafinal = "";
      double costodia;
      double cancelar;     
        while (contador.equals("si")) {            
        System.out.println("Nombre del empleado: ");
        nombre = entrada.nextLine();   
        System.out.println("Días trabajados: ");
        numerodias = entrada.nextInt();  
        System.out.println("Costo del día trabajado:");
        costodia = entrada.nextDouble();
        cancelar = costodia*numerodias;
        cadenafinal = String.format("%s%s\t%d\t$%.2f\t\t$%.2f\n",
        cadenafinal,
        nombre,
        numerodias,
        costodia,
        cancelar);
        System.out.println(" Si decea colocar mas empleados ingrese si \n"+"o\n"+"Ingrese no, si decea ver la tabla");
        entrada.nextLine();
        contador = entrada.nextLine();
        }
       System.out.printf("%s\n", cadenafinal);
    }
    
}

