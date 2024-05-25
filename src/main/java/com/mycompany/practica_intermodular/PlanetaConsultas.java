/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_intermodular;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Informatico
 */
/**
 * Esta clase proporciona métodos para consultar información sobre un planeta en
 * la base de datos a partir del nombre de un satélite asociado a dicho planeta.
 */
public class PlanetaConsultas {

    /**
     * Obtiene el nombre del planeta al que pertenece un satélite específico.
     *
     * @param nombreSatelite El nombre del satélite.
     * @return El nombre del planeta al que pertenece el satélite.
     */
    public String obtenerNombrePlanetaPorSatelite(String nombreSatelite) {
        String nombrePlaneta = "";
        String query = "SELECT nombre FROM Planeta WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombreSatelite);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    nombrePlaneta = rs.getString("nombre");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nombrePlaneta;
    }

    /**
     * Obtiene el radio del planeta al que pertenece un satélite específico en
     * kilómetros.
     *
     * @param nombreSatelite El nombre del satélite.
     * @return El radio del planeta al que pertenece el satélite en kilómetros.
     */
    public double obtenerRadioPlanetaPorSatelite(String nombreSatelite) {
        double radioPlaneta = 0.0;
        String query = "SELECT radio_km FROM Planeta WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombreSatelite);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    radioPlaneta = rs.getDouble("radio_km");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return radioPlaneta;
    }

    /**
     * Obtiene la distancia del planeta al sol al que pertenece un satélite
     * específico en kilómetros.
     *
     * @param nombreSatelite El nombre del satélite.
     * @return La distancia del planeta al sol al que pertenece el satélite en
     * kilómetros.
     */
    public double obtenerDistanciaPlanetaPorSatelite(String nombreSatelite) {
        double distanciaPlaneta = 0.0;
        String query = "SELECT distancia_sol FROM Planeta WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombreSatelite);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    distanciaPlaneta = rs.getDouble("distancia_sol");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return distanciaPlaneta;
    }

    /**
     * Obtiene el período orbital del planeta al que pertenece un satélite
     * específico en días.
     *
     * @param nombreSatelite El nombre del satélite.
     * @return El período orbital del planeta al que pertenece el satélite en
     * días.
     */
    public double obtenerPeriodoOrbitalPlanetaPorSatelite(String nombreSatelite) {
        double periodoOrbitalPlaneta = 0.0;
        String query = "SELECT periodo_orbital FROM Planeta WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombreSatelite);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    periodoOrbitalPlaneta = rs.getDouble("periodo_orbital");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return periodoOrbitalPlaneta;
    }

    /**
     * Obtiene la temperatura media del planeta al que pertenece un satélite
     * específico en grados Celsius.
     *
     * @param nombreSatelite El nombre del satélite.
     * @return La temperatura media del planeta al que pertenece el satélite en
     * grados Celsius.
     */
    public double obtenerTemperaturaPlanetaPorSatelite(String nombreSatelite) {
        double temperaturaPlaneta = 0.0;
        String query = "SELECT temperatura_media FROM Planeta WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombreSatelite);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    temperaturaPlaneta = rs.getDouble("temperatura_media");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return temperaturaPlaneta;
    }

    /**
     * Obtiene el número de satélites que orbitan al planeta al que pertenece un
     * satélite específico.
     *
     * @param nombreSatelite El nombre del satélite.
     * @return El número de satélites que orbitan al planeta al que pertenece el
     * satélite.
     */
    public int obtenerNumeroSatelitesPlanetaPorSatelite(String nombreSatelite) {
        int numeroSatelitesPlaneta = 0;
        String query = "SELECT numero_satelites FROM Planeta WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombreSatelite);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    numeroSatelitesPlaneta = rs.getInt("numero_satelites");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return numeroSatelitesPlaneta;
    }

    /**
     * Obtiene el tipo de satélites que orbitan al planeta al que pertenece un
     * satélite específico.
     *
     * @param nombreSatelite El nombre del satélite.
     * @return El tipo de satélites que orbitan al planeta al que pertenece el
     * satélite.
     */
    public String obtenerTipoSatelitesPlanetaPorSatelite(String nombreSatelite) {
        String tipoSatelitesPlaneta = "";
        String query = "SELECT tipo FROM Planeta WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombreSatelite);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    tipoSatelitesPlaneta = rs.getString("tipo");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipoSatelitesPlaneta;
    }
}
