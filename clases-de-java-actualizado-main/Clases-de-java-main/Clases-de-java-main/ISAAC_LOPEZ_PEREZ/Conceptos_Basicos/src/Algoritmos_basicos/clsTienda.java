package Algoritmos_basicos;

import javax.swing.JOptionPane;
        
public class clsTienda {
   /*
    ALgoritmo de tienda
    realice un algoritmo que permita capturar el valor de venta de un almacen
    junto con un color de bolita.
    aplique el descuento segun su bola, imprime el total a pagar y el valor
    descontado de su factura
    condiciones:
    bolita verde: 0%
    bolita roja: 20%
    bolita amarilla: 20%
    bolita azul: 60%
    bolita morada: 100%
    
    */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "Bienvenidos al sistema / tienda isaac");
        
        // Variables para el sistema
        String IDCli="", NombreCli="";
        double ValorCompra = 0;
        int Bolita = 0;
       
        
        // lectura de los datos
        NombreCli = JOptionPane.showInputDialog("Dame tu nombre");
        IDCli = JOptionPane.showInputDialog("Dame tu ID");
        ValorCompra = Double.parseDouble(JOptionPane.showInputDialog("cual es el valor de tu compra"));
        Bolita = Integer.parseInt(JOptionPane.showInputDialog(
            "Cual es el color de tu bolita\n"
                + "1. Verde\n"
                + "2. Rojo\n"
                + "3. Amarilla\n"
                + "4. Azul\n"
                + "5. Morada\n"));
        
        double TotalPago = 0, Descuento = 0;
        
        switch (var) {
            case val:
                
                break;
            default:
                throw new AssertionError();
        }
    }
    
}