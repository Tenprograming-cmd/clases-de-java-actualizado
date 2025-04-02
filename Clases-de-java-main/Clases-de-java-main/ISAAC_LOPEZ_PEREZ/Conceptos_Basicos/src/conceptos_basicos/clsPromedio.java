package conceptos_basicos;

import java.util.Scanner;

public class clsPromedio {
    
    /*
    Realice un algoritmo que permita capturar las 5 calificaciones de una
    materia de una cantidad de x estudiantes, donde las notas van en un formato
    float. indicar cual es la nota final de los estudiantes y el promedio de
    nota del curso en total}
    Condiciones
    1. la primera nota vale el 20%
    2. la segunda nota vale el 20%
    3. las otras dos valen 15%
    4. la última vake el 20%
    5. pedir los datos del estudiante como ID, nombre y las cinco notas
    6. imprimir el listado de estudiantes
    7. imprimir la nota definitiva de cada estudiante
    8. imprimir el primedio de calificaciones de los X estudiantes
    */
    
    public static void main(String[] args) {
        
        
        // Herramienta de captura de datos
        Scanner scan = new Scanner(System.in);
        
        // declaracion de variables necesarias
        String NomDocente, NomMateria;
        NomDocente = NomMateria = "";
        
        int CantidadEst = 0;
        // Lectura de los datos iniciales
        System.out.println("Bienvendos al instituto mihbolanegrah");
        System.out.println("-------------------------------------");
        
        System.out.println("Nombre del señor (docente) del curso: ");
        NomDocente = scan.nextLine();
        
        System.out.println("Nombre de la materia en curso: ");
        NomMateria = scan.nextLine();
        
        System.out.println("Cantidad de estudiantes matriculados: ");
        CantidadEst = scan.nextInt();
        
        // datos del estudiante
        // declaracion de vectores organicos, indicando la cantidad de datos
        // Tipodedato [] nombrevariable = new Tipodedati[Cantidad]
        String[] IDest = new String[CantidadEst];
        String[] Nomest = new String[CantidadEst];
        float[] cal1_20 = new float[CantidadEst];
        float[] cal2_30 = new float[CantidadEst];
        float[] cal3_15 = new float[CantidadEst];
        float[] cal4_15 = new float[CantidadEst];
        float[] cal5_20 = new float[CantidadEst];
        
        System.out.println("-------------------------");
        System.out.println("DATOS DE LOS ESTUDIANTES");
        
        // estructura ciclo FOR
        // for (i=0;i<=10;i++)
        for (int i = 0; i <= CantidadEst; i++) {
            System.out.println("------***-------");
            System.out.println("ID Estudiante " + (i+1));
            IDest[i] = scan.nextLine();
            
            System.out.println("Calificacion del 20% - Est " + (i+1));
            Nomest[i] = scan.next();
            
            System.out.println("Calificacion del 20% - Est " + (i+1));
            cal1_20[i] = scan.nextFloat();
            
            System.out.println("Calificacion del 30% - Est " + (i+1));
            cal2_30[i] = scan.nextFloat();
            
            System.out.println("Calificacion del 15% - Est " + (i+1));
            cal3_15[i] = scan.nextFloat();
            
            System.out.println("Calificacion del 15% - Est " + (i+1));
            cal4_15[i] = scan.nextFloat();
            
            System.out.println("Calificacion del 20% - Est " + (i+1));
            cal5_20[i] = scan.nextFloat();
        }
            // procesamiento de la info
            // nota definitiva y promedio del curso
            float[] Definitiva = new float[CantidadEst];
            float Promedio = 0; // esta variable se utiliza como acumulador
            
            for (int i = 0; 1 < CantidadEst; i++) {
                Definitiva[i] = (float) ((cal1_20[i]*0.20f)
                        + (cal2_30[i]*0.30)
                        + (cal3_15[i]*0.15)
                        + (cal4_15[i]*0.15)
                        + (cal5_20[i]*0.20));
            // Promedio = Promedio + Definitiva
            Promedio += Definitiva[i];
            }
            
            // Resultados de las operaciones realizadas
                System.out.println("-------------------------------");
                System.out.println("--------- RESULTADOS ----------");
                System.out.println("");
                
                System.out.println("Datos del grupo");
                
                System.out.println("Nombre del señor (docente) del curso: " + NomDocente);
        
                System.out.println("Nombre de la materia en curso: " + NomMateria);
        
                System.out.println("Cantidad de estudiantes matriculados: " + CantidadEst);
                
                System.out.println("PROMEDIO TOTAL DEL GRUPO: " + Promedio);
                
                System.out.println("--------------------------------------");
                String Cadena = "";
                for (int i =  0; i < CantidadEst; i++) {
                    Cadena += "-------- ESTUDIANTE " + (i+1) + " -------"
                            + "ID: " + IDest[i] + "\n"
                            + "Nombre completo: " + Nomest[i] + "\n"
                            + "Calificacion 1: " + cal1_20[i] + "\n"
                            
            
                    
            }
        }
    }
