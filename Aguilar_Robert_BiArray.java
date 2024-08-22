/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aguilar_robert_biarray;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Selvin Aguilar
 */
public class Aguilar_Robert_BiArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea=new Scanner(System.in);
        Random ran=new Random();
        
        System.out.println("Ingresar el numero de Filas y Columnas que desea para la tabla: ");
        int n=lea.nextInt();
        int fila=n,columna=n;
        
        int tabla[][]=new int [fila][columna];
        
        for (columna = 0; columna < n; columna++) {
            for (fila = 0; fila < n; fila++) {
                tabla[fila][columna]=10+ran.nextInt(90);
            }  
        }
        System.out.println("    ");
        
        for (columna = 0; columna < n; columna++) {
            for (fila = 0; fila < n; fila++) {
                System.out.print(tabla[fila][columna]+" ");
            }
            System.out.println();
        }
        int suma_izq_diag=0;
        for (int i = 0; i < n; i++) {
            suma_izq_diag+=tabla[fila][columna];
        }
        int suma_der_diag=0;
        for (int i = 0; i < n; i++) {
            suma_der_diag+=tabla[fila][i-1-columna];
        }
        System.out.println(" ");
        System.out.println(suma_izq_diag);    
        System.out.println(suma_der_diag);
            }
            
            
        }
    }
    
}
