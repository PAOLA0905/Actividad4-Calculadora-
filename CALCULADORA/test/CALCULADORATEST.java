/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.TestCase;

/**
 *
 * @author Paola Montenegro
 */
public class CALCULADORATEST extends TestCase {
    
    public CALCULADORATEST(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

       @Test
    public void testresta() {
        int resultado = Calculadora.resta(3, 2);
        int esperado = 1;
        assertEquals(esperado,resultado);
              
        }
}
