package com.mycompany.calculator.jsf.maven;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Basic {
    private String firstNumber="";
    private String secondNumber="";
    private String result="";

    
    public String getFirstNumber() {
        return firstNumber;
    }
    
    public void setFirstNumber(String firstNumber) {
        this.firstNumber = firstNumber;
    }

    public String getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(String secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
  
    public void add(){
           double number1 = Double.parseDouble(firstNumber);
           double number2 = Double.parseDouble(secondNumber);
           double result = number1 + number2;           
           setResult(String.valueOf(result));      
        
    }
    public void subtract(){
           double number1 = Double.parseDouble(firstNumber);
           double number2 = Double.parseDouble(secondNumber);
           double result = number1 - number2;           
           setResult(String.valueOf(result));      
        
    }
    
    public void multiply(){
           double number1 = Double.parseDouble(firstNumber);
           double number2 = Double.parseDouble(secondNumber);
           double result = number1 * number2;           
           setResult(String.valueOf(result));     
        
    }
   
    public void divide(){
           double number1 = Double.parseDouble(firstNumber);
           double number2 = Double.parseDouble(secondNumber);
           double result = number1 / number2;           
           setResult(String.valueOf(result)); 
    }
    
    public void clear(){
           setFirstNumber("");
           setSecondNumber("");
           setResult(""); 
    }
   
}
