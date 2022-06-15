/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Locale;
import java.util.Scanner;
import paquete1.*;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        entrada.useLocale(Locale.US);
        System.out.println("Escoja una opción:");
        System.out.println("1. Ingresar datos del docente");
        System.out.println("2. Factura del docente");
        int op = entrada.nextInt();

        if (op != 1 && op != 2) {
            System.out.println("Error, opción no válida");
        } else {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del Docente: ");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese la cédula del Docente: ");
            String cedula = entrada.nextLine();
            
            if (op == 1){
                System.out.println("Ingrese el sueldo del docente: ");
                double sueldo = entrada.nextDouble();
                System.out.println("Ingrese el valor de las horas extra: ");
                double vHorasExt = entrada.nextDouble();
                System.out.println("Ingrese el numero de horas extra: ");
                int numHorasExt = entrada.nextInt();
                
                DocenteNombramiento docente = new DocenteNombramiento();
                docente.establecerNombresDocente(nombre);
                docente.establecerCedulaDocente(cedula);
                docente.establecerValorSueldo(sueldo);
                docente.establecerValorHorasExtra(vHorasExt);
                docente.establecerNumeroHorasExtra(numHorasExt);
                docente.establecerTotalSueldo();
                
                System.out.printf("\n%s\n", docente );
            } else {
                if (op == 2){
                    System.out.println("Ingrese el valor de la factura: ");
                    double valorFac = entrada.nextDouble();
                    double vIvaDes = 0.12;
                    
                    DocenteFactura factura = new DocenteFactura();
                    factura.establecerNombresDocente(nombre);
                    factura.establecerCedulaDocente(cedula);
                    factura.establecerValorFactura(valorFac);
                    factura.establecerValorIvaDescuento(vIvaDes);
                    factura.establecerValorCancelar();
                    System.out.printf("\n%s\n", factura);
                }
            }
            
        }     
    }
}
