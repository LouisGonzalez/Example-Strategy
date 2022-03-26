/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author Luis
 */
public class Resta extends Operacion {

    @Override
    public void buildOperation(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("El resultado de la resta es: "+result);
    }
    
    
    
}
