/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalez05_array02;

/**
 *
 * @author tss
 */
public class JavaLez05_array02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeri = {11, 8, 72, 26, 12, 4, 5, 76};

        stampa(numeri);
        System.out.println("IL NUMERO PIU' GRANDE E':");
        int massimo = max(numeri);
        System.out.println(max(numeri));
        System.out.println(cerca(numeri, 26));

    }

    public static void stampa(int[] array) {
        //foreach
        for (int numero : array) {
            System.out.println(numero);

        }
    }

    //fare una funzione per ogni esercizio
    // 1) trovare il numero massimo in un array e ritornarlo;
    public static int max(int[] array) {

        int massimo = array[0];

        for (int i = 0; i < array.length; i++) {
            if (massimo < array[i]) {
                massimo = array[i];
            }

        }
        return massimo;
    }

    // 2)ricerca di un numero;
    public static boolean cerca(int[] array, int numero) {

        boolean trovato = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                trovato = true;
            }

        }
        return trovato;

    }

    // 3) estrarre i numeri pari dall'array e ritornarli;
    public static int[] pari(int[] array) {
        

        return null;

    }

    // 4) ordina in modo crescente;
    public static void ordina(int[] array) {

    }

}
