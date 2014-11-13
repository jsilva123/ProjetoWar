/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luiz Felipe
 */
public class DadoTest {
    
    public DadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of jogarDado method, of class Dado.
     */
    @Test
    public void testJogarDado() {
        System.out.println("jogarDado");
        int numeroDeDados = 1;
        Dado instance = new Dado();
        int[] expResult = null;
        int[] result = instance.jogarDado(numeroDeDados);
        assertFalse(!(0<result[0] && result[0]<6));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
