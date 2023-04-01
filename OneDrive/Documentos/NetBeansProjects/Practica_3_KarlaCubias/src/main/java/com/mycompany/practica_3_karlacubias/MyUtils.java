/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_3_karlacubias;

/**
 *
 * @author Karla Cubias
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String texto = "";

        if (cadena == null) {

            return null;

        } else {

            for (int i = cadena.length() - 1; i >= 0; i--) {

                texto += cadena.charAt(i);
            }
            return texto;
        }
    }

    /**
     *
     * @param dayIn int dia del naixement
     * @param mesIn int mes del naixement
     * @param anyIn int any del naixement
     * @return edat de la persona, per edat > 150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int dayIn, int mesIn, int anyIn) {
        int anyActual = 2023;
        int anyImpossible = 150;

        //calcular edad
        int edatCalculada = anyActual - anyIn;

        // Detectar error en mesIn
        if (mesIn < 1 || mesIn > 12) {

            return -2;

            // calcular si nombre de dies del mes es una data impossible:
        } else if (comprobarDiesSegunMes(dayIn, mesIn, anyIn)) {

            return -2;

            // comprobar que no es una edat impossible
        } else if (edatCalculada > anyImpossible || edatCalculada < 0) {

            return -1;
        }

        return edatCalculada;

    }

    /**
     *
     * @param numRebut número del que es calcula el factorial
     * @return retorna el factorial d'un nombre. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numRebut) {

        int factorial = 1;

        if (numRebut == 0) {

            return 1;

        } else if (numRebut < 0) {
            
            return -1;

        } else {

            for (int i = 1; i <= numRebut; i++) {
                factorial *= i;
            }

            return factorial;
        }
    }

    /**
     *
     * @param dayIn int dia del naixement
     * @param mesIn int mes del naixement
     * @param anyIn int any del naixement
     * @return boolean true si el mes correspon i false si és un mes impossible
     *
     */
    public static boolean comprobarDiesSegunMes(int dayIn, int mesIn, int anyIn) {
        int diesMes;

        switch (mesIn) {
            case 2:
                /*Un any és traspas si:
                    -. és múltiple de 4 () i no de 100, (com 1988, però no 1900)
                    -. és múltiple de 4 i de 400 (com 2000)
                 */
                if (anyIn % 4 == 0 && (anyIn % 100 != 0 || anyIn % 400 == 0)) {
                    diesMes = 29;

                } else {
                    diesMes = 28;
                }
                break;
            case 11:
                diesMes = 30; //abril(4) juny(6) setembre(9) novembre(11)
                break;
            default:
                diesMes = 31; //la resta de dies que no tenen ni 28-29 ni 30 dies
            }
        // Detectar error al dia:
        if (dayIn < 1 || dayIn > diesMes) {

            return true;
        }

        return false; // <<--- no se porque no me devuelve esto
    }
}
