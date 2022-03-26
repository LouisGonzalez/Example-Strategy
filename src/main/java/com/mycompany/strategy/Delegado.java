/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strategy;

/**
 *
 * @author Luis
 */
public class Delegado {
    
    public void executeTask(Operacion op, double num1, double num2){
        op.buildOperation(num1, num2);
    }
    
}
