/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.obraspublicas;

/**
 *
 * @author teito
 */
public class Ciudadano {
    private String nombre;
    private int password;

    public Ciudadano(String nombre, int password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    public boolean validarIngreso( int psw){
        return this.password == psw;
    }
    public void cambiarPassword(String newPass){
        this.password = Integer.parseInt(newPass);
    }
    public void delay(int mili){
        try {
            Thread.sleep(mili);
        } catch (InterruptedException e) {
            System.out.println("Delay de " + mili + " milisegundos ");
        }
    }
    public boolean ciudadanosDiferentes(Ciudadano c2) {
    return this.equals(c2);
    }
}
