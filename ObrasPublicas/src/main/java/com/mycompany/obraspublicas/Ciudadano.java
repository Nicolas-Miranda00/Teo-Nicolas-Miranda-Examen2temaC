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
    int  idCiudadano;
    String nombre;
    String email;

    public Ciudadano(int idCiudadano, String nombre, String email) {
        this.idCiudadano = idCiudadano;
        this.nombre = nombre;
        this.email = email;
    }

    public int getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(int idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    
    }
    public void recibirNotificacion(){
        System.out.println( " Enviar noticia : " + email );
        
    }

    @Override
    public String toString() {
        return "||Ciudadano||" + "ID Ciudadano: " + idCiudadano + " Nombre: " + nombre + " Email: " + email ;
    }
    
}
