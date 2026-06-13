/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.obraspublicas;

/**
 *
 * @author teito
 */
public class ObrasPublicas {

    public static void main(String[] args) {
        Ciudadano ciudadanos = new Ciudadano("Anonimus", 1212);

        System.out.println("Nombre: " + ciudadanos.getNombre());

        System.out.println("Ingreso correcto: "
                + ciudadanos.validarIngreso(1212));

        System.out.println("Ingreso incorrecto: "
                + ciudadanos.validarIngreso(9999));

        ciudadanos.cambiarPassword("1234");

        System.out.println("Nueva password: "
                + ciudadanos.getPassword());

        Ciudadano c2 =
                new Ciudadano("Juan", 2222);

        System.out.println("Son diferentes: "
                + ciudadanos.ciudadanosDiferentes(c2));
    }
}
    

