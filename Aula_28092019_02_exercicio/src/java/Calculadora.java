/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Dieinimy
 */
@Named(value = "calculadora")
@Dependent
public class Calculadora {
    
    private double valor1;
    private double valor2;
    
    public void soma(){
         double valor = valor1 + valor2;
    }
    
    public Calculadora() {
    }
    
}
