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
public class PlanetaConsultas {
    public String obtenerNombrePlanetaPorSatelite(String nombreSatelite) {
        String nombrePlaneta = "";
        String query = "SELECT nombre FROM Planeta WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

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

    public double obtenerRadioPlanetaPorSatelite(String nombreSatelite) {
        double radioPlaneta = 0.0;
        String query = "SELECT radio_km FROM Planeta WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

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

    public double obtenerDistanciaPlanetaPorSatelite(String nombreSatelite) {
        double distanciaPlaneta = 0.0;
        String query = "SELECT distancia_sol FROM Planeta WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

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

    public double obtenerPeriodoOrbitalPlanetaPorSatelite(String nombreSatelite) {
        double periodoOrbitalPlaneta = 0.0;
        String query = "SELECT periodo_orbital FROM Planeta WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

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

    public double obtenerTemperaturaPlanetaPorSatelite(String nombreSatelite) {
        double temperaturaPlaneta = 0.0;
        String query = "SELECT temperatura_media FROM Planeta WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

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

    public int obtenerNumeroSatelitesPlanetaPorSatelite(String nombreSatelite) {
        int numeroSatelitesPlaneta = 0;
        String query = "SELECT numero_satelites FROM Planeta WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

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
   
   public String obtenerTipoSatelitesPlanetaPorSatelite(String nombreSatelite) {
        String nombrePlaneta = "";
        String query = "SELECT tipo FROM Planeta WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombreSatelite);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    nombrePlaneta = rs.getString("tipo");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nombrePlaneta;
    }
}
