/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.practica_3_karlacubias;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Karla Cubias
 */
public class MyUtilsTest {

    public MyUtilsTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of inverteix method, of class MyUtils.
     */
    @Test
    public void testInverteix() {
        System.out.println("Prova 1: cadena == null ");
        String cadena = null;
        String expResult = null;
        String result = MyUtils.inverteix(cadena);
        assertEquals(expResult, result);

        System.out.println("Prova 2: inverteix cadena");
        String cadena1 = "Hola Mundo";
        String expResult1 = "odnuM aloH";
        String result1 = MyUtils.inverteix(cadena1);
        assertEquals(expResult1, result1);

        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of edat method, of class MyUtils.
     */
    @Test
    public void testEdat() {
        System.out.println("Prova 1: edatCalculada");
        int dayIn = 22;
        int mesIn = 11;
        int anyIn = 1992;
        
        int expResult = 31;
        int result = MyUtils.edat(dayIn, mesIn, anyIn);
        assertEquals(expResult, result);

        
        /*Retorna edadt impossible si es donen aquests casos:       
        -Mes incorrecte per any traspas.
        -Dia < 1 o dia > dia segun el mes
        -Mes és < 1 o mes > 12 */     
        System.out.println("Prova 2: edatImpossible");
        int day = 12;
        int mes = 12;
        int any = 1800;
        int exResult = -1;

        result = MyUtils.edat(day, mes, any);
        assertEquals(exResult, result);

        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of factorial method, of class MyUtils.
     */
    @Test
    public void testFactorial() {
        System.out.println("Proba 1: num > 0");
        double numRebut = 5;
        double expResult = 120.0;
        double result = MyUtils.factorial(numRebut);
        assertEquals(expResult, result);
        
        System.out.println("Proba 2: num = 0");
        double numRebut2 = 0;
        double expResult2 = 1.0;
        double result2 = MyUtils.factorial(numRebut2);
        assertEquals(expResult2, result2);
        
        System.out.println("Proba 3: num < 0");
        double numRebut3 = -10;
        double expResult3 = -1.0;
        double result3 = MyUtils.factorial(numRebut3);
        assertEquals(expResult3, result3);
        
        // TODO review the generated test code and remove the default call to fail.

    }


}
