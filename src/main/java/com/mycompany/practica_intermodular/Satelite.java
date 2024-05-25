/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_intermodular;

/**
 *
 * @author Informatico
 */
public class Satelite {
    String nombre,tipo;
    double radio,distancia,periodoOrbital,temperaturaMedia;

    public Satelite(String nombre, String tipo, double radio, double distancia, double periodoOrbital, double temperaturaMedia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.radio = radio;
        this.distancia = distancia;
        this.periodoOrbital = periodoOrbital;
        this.temperaturaMedia = temperaturaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    public void setPeriodoOrbital(double periodoOrbital) {
        this.periodoOrbital = periodoOrbital;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    @Override
    public String toString() {
        return "Satelite{" + "nombre=" + nombre + ", tipo=" + tipo + ", radio=" + radio + ", distancia=" + distancia + ", periodoOrbital=" + periodoOrbital + ", temperaturaMedia=" + temperaturaMedia + '}';
    }
    
    
    
   
}
