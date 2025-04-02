package conceptos_basicos;

import java.util.Scanner;

public class Operaciones {
    
    public static void main(String[] args) {
        
        // Herramientas para la lectura de datos
        Scanner sn = new Scanner(System.in);
        
        // Declaración de variables
        int num1, num2, num3, num4, suma, resta, multi;
        float divi;
        
        num1 = num2 = num3 = num4 = suma = resta = multi = 0;
        divi = 0.0f;

        // Recolección de los datos / lectura
        System.out.println("BIENVENIDO AL SISTEMA NUMÉRICO");
        System.out.println("------------------------------");

        System.out.print("Valor del primer número: ");
        num1 = sn.nextInt();
        
        System.out.print("Valor del segundo número: ");
        num2 = sn.nextInt();
        
        System.out.print("Valor del tercer número: ");
        num3 = sn.nextInt();
        
        System.out.print("Valor del cuarto número: ");
        num4 = sn.nextInt();

        // Procesamiento de los datos y cálculo de las operaciones
        suma = num1 + num2 + num3 + num4;
        resta = num1 - num2 - num3 - num4;
        multi = num1 * num2 * num3 * num4;
        divi = (float) num1 / num2 / num3 / num4;

        // Impresión de resultados
        System.out.println("\nResultados:");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multi);
        System.out.println("División: " + divi);

        // Cerrar el Scanner
        sn.close();
    }
}
