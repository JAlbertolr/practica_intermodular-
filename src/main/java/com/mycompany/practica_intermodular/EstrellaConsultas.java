/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_intermodular;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Informatico
 */
/**
 * Esta clase proporciona métodos para consultar información sobre una estrella
 * en la base de datos.
 */
public class EstrellaConsultas {

    /**
     * Obtiene el nombre de la estrella.
     *
     * @return El nombre de la estrella.
     */
    public String obtenerNombreEstrella() {
        String nombreEstrella = "";
        String query = "SELECT nombre FROM Estrella WHERE id = 1";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                nombreEstrella = rs.getString("nombre");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nombreEstrella;
    }

    /**
     * Obtiene el tipo de la estrella.
     *
     * @return El tipo de la estrella.
     */
    public String obtenerTipoEstrella() {
        String tipoEstrella = "";
        String query = "SELECT tipo FROM Estrella WHERE id = 1";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                tipoEstrella = rs.getString("tipo");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipoEstrella;
    }

    /**
     * Obtiene el radio de la estrella en kilómetros.
     *
     * @return El radio de la estrella en kilómetros.
     */
    public double obtenerRadioEstrella() {
        double radioEstrella = 0;
        String query = "SELECT radio_km FROM Estrella WHERE id = 1";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                radioEstrella = rs.getDouble("radio_km");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return radioEstrella;
    }

    /**
     * Obtiene la temperatura superficial de la estrella en grados Celsius.
     *
     * @return La temperatura superficial de la estrella en grados Celsius.
     */
    public double obtenerTemperaturaEstrella() {
        double temperaturaEstrella = 0;
        String query = "SELECT temperatura_superficial FROM Estrella WHERE id = 1";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                temperaturaEstrella = rs.getDouble("temperatura_superficial");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return temperaturaEstrella;
    }

    /**
     * Obtiene la distancia de la estrella a la Tierra en kilómetros.
     *
     * @return La distancia de la estrella a la Tierra en kilómetros.
     */
    public double obtenerDistanciaEstrella() {
        double distanciaEstrella = 0;
        String query = "SELECT distancia_tierra FROM Estrella WHERE id = 1";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                distanciaEstrella = rs.getDouble("distancia_tierra");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return distanciaEstrella;
    }

    /**
     * Obtiene la composición de la estrella.
     *
     * @return La composición de la estrella.
     */
    public String obtenerComposicionEstrella() {
        String composicionEstrella = "";
        String query = "SELECT composicion FROM Estrella WHERE id = 1";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query); ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                composicionEstrella = rs.getString("composicion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return composicionEstrella;
    }
}
