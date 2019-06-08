/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator.jsf.maven;


import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author life
 */
public class BasicTest {   
    
    Basic basic = new Basic();
    
    @Test
    public void testAdd(){
        basic.setFirstNumber("10");
        assertEquals(basic.getFirstNumber(),"10");
        
    }
    
   
}
