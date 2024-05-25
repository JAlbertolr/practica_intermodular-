/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_intermodular;

/**
 *
 * @author Informatico
 */
/**
 * Clase que representa un satélite.
 */
public class Satelite {

    /**
     * Nombre del satélite.
     */
    private String nombre;
    /**
     * Tipo del satélite.
     */
    private String tipo;
    /**
     * Radio del satélite en kilómetros.
     */
    private double radio;
    /**
     * Distancia del satélite a su planeta en kilómetros.
     */
    private double distancia;
    /**
     * Período orbital del satélite en días.
     */
    private double periodoOrbital;
    /**
     * Temperatura media del satélite en grados Celsius.
     */
    private double temperaturaMedia;

    /**
     * Constructor de la clase Satelite.
     *
     * @param nombre Nombre del satélite.
     * @param tipo Tipo del satélite.
     * @param radio Radio del satélite en kilómetros.
     * @param distancia Distancia del satélite a su planeta en kilómetros.
     * @param periodoOrbital Período orbital del satélite en días.
     * @param temperaturaMedia Temperatura media del satélite en grados Celsius.
     */
    public Satelite(String nombre, String tipo, double radio, double distancia, double periodoOrbital, double temperaturaMedia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.radio = radio;
        this.distancia = distancia;
        this.periodoOrbital = periodoOrbital;
        this.temperaturaMedia = temperaturaMedia;
    }

    /**
     * Devuelve el nombre del satélite.
     *
     * @return El nombre del satélite.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del satélite.
     *
     * @param nombre El nombre del satélite.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el tipo del satélite.
     *
     * @return El tipo del satélite.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo del satélite.
     *
     * @param tipo El tipo del satélite.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Devuelve el radio del satélite en kilómetros.
     *
     * @return El radio del satélite en kilómetros.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Establece el radio del satélite en kilómetros.
     *
     * @param radio El radio del satélite en kilómetros.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Devuelve la distancia del satélite a su planeta en kilómetros.
     *
     * @return La distancia del satélite a su planeta en kilómetros.
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * Establece la distancia del satélite a su planeta en kilómetros.
     *
     * @param distancia La distancia del satélite a su planeta en kilómetros.
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * Devuelve el período orbital del satélite en días.
     *
     * @return El período orbital del satélite en días.
     */
    public double getPeriodoOrbital() {
        return periodoOrbital;
    }

    /**
     * Establece el período orbital del satélite en días.
     *
     * @param periodoOrbital El período orbital del satélite en días.
     */
    public void setPeriodoOrbital(double periodoOrbital) {
        this.periodoOrbital = periodoOrbital;
    }

    /**
     * Devuelve la temperatura media del satélite en grados Celsius.
     *
     * @return La temperatura media del satélite en grados Celsius.
     */
    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    /**
     * Establece la temperatura media del satélite en grados Celsius.
     *
     * @param temperaturaMedia La temperatura media del satélite en grados
     * Celsius.
     */
    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    /**
     * Devuelve una representación en cadena del objeto Satélite.
     *
     * @return Una cadena que representa el objeto Satélite.
     */
    @Override
    public String toString() {
        return "Satelite{"
                + "nombre='" + nombre + '\''
                + ", tipo='" + tipo + '\''
                + ", radio=" + radio
                + ", distancia=" + distancia
                + ", periodoOrbital=" + periodoOrbital
                + ", temperaturaMedia=" + temperaturaMedia
                + '}';
    }
}
