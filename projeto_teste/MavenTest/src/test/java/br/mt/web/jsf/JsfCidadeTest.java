/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mt.web.jsf;

import br.mt.data.entity.Cidades;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alexandrelerario
 */
public class JsfCidadeTest {
    
    public JsfCidadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

   
    
    /**
     * Test of getAll method, of class JsfCidade.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        JsfCidade instance = new JsfCidade();
      //  Collection<Cidades> expResult = null;
        Collection<Cidades> result = instance.getAll();
        assertNotNull(result);
       /// assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of salvar_novo method, of class JsfCidade.
     */
    @Test
    public void testSalvar_novo() {
        System.out.println("salvar_novo");
      //  JsfCidade instance = new JsfCidade();
        //instance.salvar_novo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testSalvar_novo2() {
        System.out.println("salvar_novo2");
      //  JsfCidade instance = new JsfCidade();
        //instance.salvar_novo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
     @Test
    public void testSalvar_novo3() {
        System.out.println("salvar_novo3");
      //  JsfCidade instance = new JsfCidade();
        //instance.salvar_novo();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
      @Test
    public void testSalvar_novo34() {
        System.out.println("salvar_novo4");
      //  JsfCidade instance = new JsfCidade();
        //instance.salvar_novo();
        // TODO review the generated test code and remove the default call to fail.
      //  fail("o erro esta no usuario");
    }
    public void testSalvar_novo5() {
        System.out.println("salvar_novo5");
      //  JsfCidade instance = new JsfCidade();
        //instance.salvar_novo();
        // TODO review the generated test code and remove the default call to fail.
        fail("o erro esta no usuario");
    }
}
