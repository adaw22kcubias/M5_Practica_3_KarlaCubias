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

        System.out.println(MyUtils.inverteix("hola como estas"));

    }
}
