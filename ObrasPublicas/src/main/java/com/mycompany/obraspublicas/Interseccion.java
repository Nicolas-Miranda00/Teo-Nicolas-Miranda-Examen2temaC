/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obraspublicas;

/**
 *
 * @author teito
 */
public class Interseccion {
    String calleA;
    String calleB;
    int altura;
    String barrio;

    public Interseccion(String calleA, String calleB, int altura, String barrio) {
        this.calleA = calleA;
        this.calleB = calleB;
        this.altura = altura;
        this.barrio = barrio;
    }

    public String getCalleA() {
        return calleA;
    }

    public void setCalleA(String calleA) {
        this.calleA = calleA;
    }

    public String getCalleB() {
        return calleB;
    }

    public void setCalleB(String calleB) {
        this.calleB = calleB;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    public void interseccion(){
        System.out.println("El bache se encuentra entre " + calleA + " y " + calleB + "la altura es de " + altura + " esta en el barrio " + barrio);  
    }
    
}
