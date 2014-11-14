/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

import java.util.ArrayList;
import model.CartaEstado;
import model.CartaObjetivo;
import model.Estado;
import model.Jogador;
import model.Regioes;
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
public class RegrasTest {
    
    public RegrasTest() {
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
     * Test of verificaJogadorGanhouJogo method, of class Regras.
     */
    @Test
    public void testVerificaJogadorGanhouJogo() {
        System.out.println("verificaJogadorGanhouJogo");
        Jogador jogador = null;
        CartaObjetivo cartaObjetivo = null;
        ArrayList<Jogador> jogadores = null;
        Regras instance = new Regras();
        boolean expResult = false;
        boolean result = instance.verificaJogadorGanhouJogo(jogador, cartaObjetivo, jogadores);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaJogadorPossuiTodaRegiao method, of class Regras.
     */
    @Test
    public void testVerificaJogadorPossuiTodaRegiao() {
        System.out.println("verificaJogadorPossuiTodaRegiao");
        Jogador jogador = null;
        Regioes regiao = null;
        Regras instance = new Regras();
        boolean expResult = false;
        boolean result = instance.verificaJogadorPossuiTodaRegiao(jogador, regiao);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaElimicacaoConcorrente method, of class Regras.
     */
    @Test
    public void testVerificaElimicacaoConcorrente() {
        System.out.println("verificaElimicacaoConcorrente");
        Jogador jogador = null;
        Regras instance = new Regras();
        boolean expResult = false;
        boolean result = instance.verificaElimicacaoConcorrente(jogador);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaPossuiEstadoCarta method, of class Regras.
     */
    @Test
    public void testVerificaPossuiEstadoCarta() {
        System.out.println("verificaPossuiEstadoCarta");
        CartaEstado c1 = null;
        Jogador j = null;
        Regras instance = new Regras();
        boolean expResult = false;
        boolean result = instance.verificaPossuiEstadoCarta(c1, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerificaTrocaObrigatoria method, of class Regras.
     */
    @Test
    public void testVerificaTrocaObrigatoria() {
        System.out.println("VerificaTrocaObrigatoria");
        Jogador j = null;
        Regras instance = new Regras();
        boolean expResult = false;
        boolean result = instance.VerificaTrocaObrigatoria(j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaTrocaCartas method, of class Regras.
     */
    @Test
    public void testValidaTrocaCartas() {
        System.out.println("validaTrocaCartas");
        CartaEstado c1 = null;
        CartaEstado c2 = null;
        CartaEstado c3 = null;
        Regras instance = new Regras();
        boolean expResult = false;
       // boolean result = instance.validaTrocaCartas( c1, c2, c3);
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conquistaCarta method, of class Regras.
     */
    @Test
    public void testConquistaCarta() {
        System.out.println("conquistaCarta");
        Estado e = null;
        Regras instance = new Regras();
        boolean expResult = false;
        boolean result = instance.conquistaCarta(e);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validaDeslocamento method, of class Regras.
     */
    @Test
    public void testValidaDeslocamento() {
        System.out.println("validaDeslocamento");
        Estado origem = null;
        Estado destino = null;
        int qtdDeslocamento = 0;
        Estado ultimoDestino = null;
        Regras instance = new Regras();
        boolean expResult = false;
        boolean result = instance.validaDeslocamento(origem, destino, qtdDeslocamento, ultimoDestino);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deslocaExercitoAposConquista method, of class Regras.
     */
    @Test
    public void testDeslocaExercitoAposConquista() {
        System.out.println("deslocaExercitoAposConquista");
        int numAtaque = 0;
        int numDesloca = 0;
        Regras instance = new Regras();
        boolean expResult = false;
        boolean result = instance.deslocaExercitoAposConquista(numAtaque, numDesloca);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conquistaTerritorio method, of class Regras.
     */
    @Test
    public void testConquistaTerritorio() {
        System.out.println("conquistaTerritorio");
        Estado defensor = null;
        Regras instance = new Regras();
        boolean expResult = false;
        boolean result = instance.conquistaTerritorio(defensor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of condicaoAtaque method, of class Regras.
     */
    @Test
    public void testCondicaoAtaque() {
        System.out.println("condicaoAtaque");
        Estado atacante = null;
        Estado defensor = null;
        int numExercitos = 0;
        Regras instance = new Regras();
        boolean expResult = false;
        boolean result = instance.condicaoAtaque(atacante, defensor, numExercitos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificaVizinhos method, of class Regras.
     */
    @Test
    public void testVerificaVizinhos() {
        System.out.println("verificaVizinhos");
        Estado e1 = null;
        Estado e2 = null;
        Regras instance = new Regras();
        boolean expResult = false;
        boolean result = instance.verificaVizinhos(e1, e2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
