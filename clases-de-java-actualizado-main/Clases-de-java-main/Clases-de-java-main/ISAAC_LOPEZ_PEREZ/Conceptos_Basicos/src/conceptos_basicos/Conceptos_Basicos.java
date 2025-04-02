package conceptos_basicos;

/*
Author: Maira Pérez
Date: 27/04/2025
*/
public class Conceptos_Basicos {

    
    /*
    Comentario multilinea
    */
    // comentarios para una sola linea
    public static void main(String[] args) {

        System.out.println("Hola mundo"); //Formas de impresion code
        
        // Variables Primitivas
        // String, Integer, Float, Double
        
        // Variables de tipo integer
        int Edad;
        Edad = 45;
        
        int Cantidad = 0;
        int a,b,c;
        a = b = c = 10;
        System.out.println(Edad + Cantidad);
        //Long para numeros enteros más largos
       long metrosCuadros = 5000000;
       
       System.out.println(metrosCuadros);
       
       // Float son numeros con una cantidad de decimas
       float pagoMensual;
       pagoMensual = 35000f;
       
       System.out.print(pagoMensual);
       
       // Double son numeros con decimas más grandes que los float
       double PagoCartera;
       
       PagoCartera= 500000000d;
       
       System.out.println(PagoCartera);
       
       // Boleanos son valores de true and false
       boolean Activo,Inactivo;
       Activo = true;
       Inactivo = false;
       System.out.println(Activo + " Y EL INACTIVO " + Inactivo);
       
       // string son tipo caracter, simbolos, espacios y numeros
       String NombreCompleto;
       NombreCompleto = "Isaac Lopez Perez";
       System.out.println(NombreCompleto);
       
       // Char son para guardar valores de un caracter
       char Genero;
       Genero = 'M';
       
       System.out.println(Genero);
       
       char var1, var2, var3;
       var1 = 67; //codificacion en ASCII
               
       System.out.println(var1);
    }

}
