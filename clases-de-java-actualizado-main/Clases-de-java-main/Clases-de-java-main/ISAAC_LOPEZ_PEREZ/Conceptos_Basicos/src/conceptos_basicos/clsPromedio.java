package conceptos_basicos;

import java.util.Scanner;

public class clsPromedio {
    public static void main(String[] args) {
        // Herramienta de captura de datos
        Scanner scan = new Scanner(System.in);

        // Declaración de variables necesarias
        String NomDocente, NomMateria;
        NomDocente = NomMateria = "";

        int CantidadEst = 0;

        // Lectura de los datos iniciales
        System.out.println("Bienvenidos al instituto mihbolanegrah");
        System.out.println("-------------------------------------");

        System.out.println("Nombre del señor (docente) del curso: ");
        NomDocente = scan.nextLine();

        System.out.println("Nombre de la materia en curso: ");
        NomMateria = scan.nextLine();

        System.out.println("Cantidad de estudiantes matriculados: ");
        CantidadEst = scan.nextInt();

        scan.nextLine(); // Para limpiar el buffer del scanner

        // Datos del estudiante
        String[] IDest = new String[CantidadEst];
        String[] Nomest = new String[CantidadEst];
        float[] cal1_20 = new float[CantidadEst];
        float[] cal2_30 = new float[CantidadEst];
        float[] cal3_15 = new float[CantidadEst];
        float[] cal4_15 = new float[CantidadEst];
        float[] cal5_20 = new float[CantidadEst];

        System.out.println("-------------------------");
        System.out.println("DATOS DE LOS ESTUDIANTES");

        // Estructura ciclo FOR
        for (int i = 0; i < CantidadEst; i++) {
            System.out.println("------***-------");
            System.out.println("ID Estudiante " + (i + 1));
            IDest[i] = scan.nextLine();
            System.out.println("Nombre completo del estudiante: ");
            Nomest[i] = scan.nextLine();

            System.out.println("Calificación del 20% - Est " + (i + 1));
            cal1_20[i] = scan.nextFloat();

            System.out.println("Calificación del 30% - Est " + (i + 1));
            cal2_30[i] = scan.nextFloat();

            System.out.println("Calificación del 15% - Est " + (i + 1));
            cal3_15[i] = scan.nextFloat();

            System.out.println("Calificación del 15% - Est " + (i + 1));
            cal4_15[i] = scan.nextFloat();

            System.out.println("Calificación del 20% - Est " + (i + 1));
            cal5_20[i] = scan.nextFloat();

            scan.nextLine(); // Para limpiar el buffer del scanner
        }

        // Procesamiento de la información
        float[] Definitiva = new float[CantidadEst];
        float Promedio = 0; // Acumulador del promedio del curso

        // Cálculo de la nota definitiva de cada estudiante
        for (int i = 0; i < CantidadEst; i++) {
            Definitiva[i] = Math.round(cal1_20[i] * 0.20f) + (cal2_30[i] * 0.30f) + (cal3_15[i] * 0.15f) + (cal4_15[i] * 0.15f) + (cal5_20[i] * 0.20f);
            Promedio += Definitiva[i];
        }

        // Resultados de las operaciones realizadas
        System.out.println("-------------------------------");
        System.out.println("--------- RESULTADOS ----------");
        System.out.println("");
        System.out.println("Datos del grupo:");
        System.out.println("Nombre del señor (docente) del curso: " + NomDocente);
        System.out.println("Nombre de la materia en curso: " + NomMateria);
        System.out.println("Cantidad de estudiantes matriculados: " + CantidadEst);
        System.out.println("PROMEDIO TOTAL DEL GRUPO: " + (Promedio / CantidadEst));

        System.out.println("--------------------------------------");

        // Mostrar resultados de cada estudiante
        for (int i = 0; i < CantidadEst; i++) {
            System.out.println("-------- ESTUDIANTE " + (i + 1) + " -------");
            System.out.println("ID: " + IDest[i]);
            System.out.println("Nombre completo: " + Nomest[i]);
            System.out.println("Calificación 1: " + cal1_20[i]);
            System.out.println("Calificación 2: " + cal2_30[i]);
            System.out.println("Calificación 3: " + cal3_15[i]);
            System.out.println("Calificación 4: " + cal4_15[i]);
            System.out.println("Calificación 5: " + cal5_20[i]);
            System.out.println("Nota definitiva: " + Definitiva[i]);
            System.out.println("-------------------------------------");
        }

        scan.close(); // Cerrar el scanner
    }
}
