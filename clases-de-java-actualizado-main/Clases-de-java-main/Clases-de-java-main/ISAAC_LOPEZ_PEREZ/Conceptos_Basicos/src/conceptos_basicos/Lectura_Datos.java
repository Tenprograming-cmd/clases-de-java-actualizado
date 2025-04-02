package conceptos_basicos;

import java.util.Scanner;

public class Lectura_Datos {
    
    public static void main(String[] args) {
        
        Scanner scnn = new Scanner(System.in);
        
        String Nombre = "";
        int Edad = 0;
        float Peso = 0;
        double Salario = 0;
        
        System.out.println("Ingrese el nombre");
        Nombre = scnn.nextLine();
        System.out.println("Ingrese la edad");
        Edad = scnn.nextInt();
        System.out.println("Ingrese el peso");
        Peso = scnn.nextFloat();
        System.out.println("Ingrese el salario mensual");
        Salario = scnn.nextDouble();
        
        System.out.println("-------- DATOS DEL USUARIO --------");
        System.out.println("Nombre del usuario: " + Nombre);
        System.out.println("Edad del usuario: " + Edad);
        System.out.println("Peso del usuario: " + Peso);
        System.out.println("Salario del usuario: " + Salario);
    }
}
