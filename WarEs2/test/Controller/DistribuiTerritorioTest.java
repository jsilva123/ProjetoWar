/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.util.ArrayList;
import model.Jogador;
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
public class DistribuiTerritorioTest {
    
    public DistribuiTerritorioTest() {
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
     * Test of geraBaralho method, of class DistribuiTerritorio.
     */
    @Test
    public void testGeraBaralho() {
        System.out.println("geraBaralho");
        DistribuiTerritorio instance = new DistribuiTerritorio();
        instance.geraBaralho();
        // TODO review the generated test code and remove the default call to fail.
        assertNotNull(instance.getBaralhoTerritorio());
      
    }

    /**
     * Test of distribui method, of class DistribuiTerritorio.
     */
    @Test
    public void testDistribui() {
        System.out.println("distribui");
        ArrayList<Jogador> jogadores = null;
        DistribuiTerritorio instance = new DistribuiTerritorio();
        instance.distribui(jogadores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
