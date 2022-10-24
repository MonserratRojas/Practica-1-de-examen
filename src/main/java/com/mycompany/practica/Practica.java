/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author monse
 */
public class Practica {

    public static void main(String[] args) {
        String asteriscos = generadorDeAsteriscos(4);
        System.out.println(asteriscos);
    }

    public static String generadorDeAsteriscos(int totalAsteriscos) {
        String asteriscosGenerados = "";
        for (int i = 0; i < totalAsteriscos; i++) {
            for (int j = 0; j < totalAsteriscos; j++) {
                asteriscosGenerados = asteriscosGenerados + "*";
            }
            asteriscosGenerados = asteriscosGenerados + " ";
        }

        return asteriscosGenerados;
    }

}
