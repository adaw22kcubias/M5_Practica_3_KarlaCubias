/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practica_3_karlacubias;

import java.util.Scanner;

/**
 *
 * @author Karla Cubias
 */
public class MainClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia, mes, any;

        System.out.println("________________________________\n"
                + "Introdueix la data del teu aniversari (dd/mm/aaaa)");
        dia = in.nextInt();
        mes = in.nextInt();
        any = in.nextInt();
        MyUtils.edat(dia, mes, any);
        System.out.println("________________________________\n");
        
        System.out.println("EdatCalculada: "+ MyUtils.edat(22, 11, 1992));
        System.out.println("Eadt impossible: " +MyUtils.edat(12, 12, 1800));

        String cadena = null;
        System.out.println("Cadena == null: "+ MyUtils.inverteix(cadena));
        System.out.println("Cadena inverteix: "+ MyUtils.inverteix("hola como estas"));
        
        System.out.println("Factorial de num positiu: "+ MyUtils.factorial(5));
        System.out.println("Factorial de num > 0: "+MyUtils.factorial(0));
        System.out.println("Factorial de num negatiu: "+MyUtils.factorial(-10));

    }
}
