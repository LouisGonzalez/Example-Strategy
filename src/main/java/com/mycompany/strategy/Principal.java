/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Principal {
    
    public static void main(String[] args){
        
        /*CREANDO INSTANCIAS*/
        Operacion sum = new Suma();
        Operacion resta = new Resta();
        Operacion mult = new Multiplicacion();
        Delegado del = new Delegado();
        boolean cycle = true;
        
        Scanner scanner = new Scanner(System.in);
        while(cycle){
            System.out.println("Ingrese primer valor");
            double num1 = scanner.nextDouble();
            System.out.println("Ingrese segundo valor");
            double num2 = scanner.nextDouble();
        
            System.out.println("Menu de operaciones:\n"
                    + "1. SUMA\n"
                    + "2. RESTA\n"
                    + "3. MULTIPLICACION\n"
                    + "4. Terminar\n");
            int menu = scanner.nextInt();
            switch(menu){
                case 1:
                    del.executeTask(sum, num1, num2);
                    break;
                case 2:
                    del.executeTask(resta, num1, num2);
                    break;
                case 3:
                    del.executeTask(mult, num1, num2);
                    break;
                case 4:
                    System.out.println("ADIOS");
                    cycle = false;
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }
    }
}
