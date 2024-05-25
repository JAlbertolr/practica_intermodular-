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
public class SateliteConsultas {
    
  public String obtenerNombreSatelite(String nombreSateliteSeleccionado) {
        String nombreSatelite = "";
        String query = "SELECT nombre FROM Satelite WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombreSateliteSeleccionado);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    nombreSatelite = rs.getString("nombre");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nombreSatelite;
    }
  public List<String> obtenerNombresSatelitesPorPlaneta(String nombrePlaneta) {
        List<String> nombresSatelites = new ArrayList<>();
        String query = "SELECT s.nombre " +
                       "FROM Satelite s " +
                       "JOIN Planeta p ON s.planeta_id = p.id " +
                       "WHERE p.nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombrePlaneta);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    nombresSatelites.add(rs.getString("nombre"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nombresSatelites;
    }
    public String obtenerTipoSatelite(String nombreSateliteSeleccionado) {
        String tipoSatelite = "";
        String query = "SELECT tipo FROM Satelite WHERE nombre = ?";
         try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombreSateliteSeleccionado);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    tipoSatelite = rs.getString("tipo");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return tipoSatelite;
    }

    public double obtenerRadioSatelite(String nombreSateliteSeleccionado) {
        double radioSatelite = 0.0;
        String query = "SELECT radio_km FROM Satelite WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombreSateliteSeleccionado);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    radioSatelite = rs.getDouble("radio_km");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return radioSatelite;
    }

    public double obtenerDistanciaSatelite(String nombreSateliteSeleccionado) {
        double distanciaSatelite = 0.0;
        String query = "SELECT distancia_planeta FROM Satelite WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombreSateliteSeleccionado);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    distanciaSatelite = rs.getDouble("distancia_planeta");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return distanciaSatelite;
    }

    public String obtenerPlanetaSatelite(String nombreSatelite) {
        String nombrePlaneta = "";
        String query = "SELECT p.nombre " +
                       "FROM Planeta p " +
                       "JOIN Satelite s ON p.id = s.planeta_id " +
                       "WHERE s.nombre = ?";

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

    public double obtenerTemperaturaSatelite(String nombreSateliteSeleccionado) {
        double temperaturaSatelite = 0.0;
        String query = "SELECT temperatura_media FROM Satelite WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombreSateliteSeleccionado);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    temperaturaSatelite = rs.getDouble("temperatura_media");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return temperaturaSatelite;
    }

    public double obtenerPeriodoOrbitalSatelite(String nombreSatelite) {
        double periodoOrbitalSatelite = 0.0;
        String query = "SELECT periodo_orbital FROM Satelite WHERE nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombreSatelite);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    periodoOrbitalSatelite = rs.getDouble("periodo_orbital");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return periodoOrbitalSatelite;
    }
}
