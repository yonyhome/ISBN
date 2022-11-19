/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yonyh
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int continuar = 1;
        int res[] = new int[100];
        int co[] = new int[100];
        int id[] = new int[100];
        int total[] = new int[100];
        int respuestas[] = new int[100];
        int tmp=0, tmp2=0;
        int n = 0, con, buenas = 0, malas = 0, k, i, contt;
        Random r = new Random(4);
        for (i = 1; i <= 30; i++) {
            res[i] = (int) (Math.random() * 4 + 1);

//            System.out.println("la respuesta " + i + " es: " + res[i]);
        }

        System.out.println("BIENVENIDO");

        i = 0;
        while (continuar == 1) {
            i++;
            n++;
            System.out.println("digite el numero de identificacion del estudiante # " + i);
            id[i] = teclado.nextInt();
            for (int j = 1; j <= 10; j++) {
                System.out.println("digite la respuesta a su pregunta # " + j);
                respuestas[j] = teclado.nextInt();
                while (respuestas[j] > 4 || respuestas[j] < 1) {
                    System.out.println("recuerde que debe ingresar un numero entre 1 y 4 por favor ingrese un numero valido");
                    respuestas[j] = teclado.nextInt();
                }
            }
            for (k = 1; k <= 10; k++) {
                if (res[k] == respuestas[k]) {
                    buenas++;
                } else {
                    malas++;
                }
            }
            buenas = buenas - (malas / 3);
            total[i] = buenas;
            System.out.println("digite 0 para ingresar otro estudiante o cualquier otro numero para terminar");
            continuar = teclado.nextInt();
            while (continuar != 0 || continuar != 1) {
                System.out.println("digite 0 para ingresar otro estudiante o cualquier otro numero para terminar");
                continuar = teclado.nextInt();
            }

        }

        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (total[j] < total[j + 1]) {
                    tmp = total[j + 1];
                    total[j + 1] = total[j];
                    total[j] = tmp;
                    tmp2 = id[j + 1];
                    id[j + 1] = id[j];
                    id[j] = tmp2;
                }
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("los puntajes de la prueba son los siguientes");
        System.out.println("");
        System.out.println("");
        for (i = 1; i <= n; i++) {
            System.out.println("el estudiante con numero de identificacion ");
            System.out.println("");
            System.out.print(id[i] + "\n");
            System.out.println("");
            System.out.println("");
            System.out.println("saco en la prueba: ");
            System.out.println("");
            System.out.println(total[i] + "\n");
        }
    }
}
