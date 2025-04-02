
package conceptos_basicos;

import java.util.Scanner;

public class CLS_Discoteca {
    
    /* Realice un algoritmo que permita preguntar a la entrada de la discoteca
    cual es elaño de nacimiento de una persona y me permita el ingreso o no
    dependiendo de que sea mayor de 21 años de edad
    */
    
    public static void main(String[] args) {
        
        // instancia para recoger los datos
        Scanner sn = new Scanner(System.in);
        
        // declaracion de las variables
        int anio = 0, edad = 0;
        String nombre = "";
        
        int anioact = 2025;
        
        String preg = "S";
        
        while(preg.equalsIgnoreCase("S")){ // preg == "s"
        // recoleccion de los datos
        System.out.println("...:: Burdel luna nueva ::...");
        System.out.println("-----------------------------");
        
        System.out.println("El nombre ahora: ");
        nombre = sn.next();
        
        System.out.println("Y en que año nacio: ");
        anio = sn.nextInt();
        
        // Procesamiento de la informacion
        edad = anioact - anio;
        
        if(edad >= 21){
            System.out.println("...:: bienvenido al burdel ::...");
        }else{
            System.out.println("...:: no vas a tener setso :V ::...");
        }
        }
    }
}
