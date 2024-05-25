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
    public String obtenerNombrePlaneta(String nombrePlaneta) {
        String query = "SELECT nombre FROM Planeta WHERE nombre = ?";
        String nombre = "";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombrePlaneta);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    nombre = rs.getString("nombre");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nombre;
    }

    public double obtenerRadioPlaneta(String nombrePlaneta) {
        String query = "SELECT radio FROM Planeta WHERE nombre = ?";
        double radio = 0;

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombrePlaneta);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    radio = rs.getDouble("radio");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return radio;
    }

    public double obtenerDistanciaPlaneta(String nombrePlaneta) {
        String query = "SELECT distancia FROM Planeta WHERE nombre = ?";
        double distancia = 0;

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombrePlaneta);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    distancia = rs.getDouble("distancia");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return distancia;
    }

    public double obtenerPeriodoOrbitalPlaneta(String nombrePlaneta) {
        String query = "SELECT periodo_orbital FROM Planeta WHERE nombre = ?";
        double periodo = 0;

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombrePlaneta);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    periodo = rs.getDouble("periodo_orbital");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return periodo;
    }

    public double obtenerTemperaturaPlaneta(String nombrePlaneta) {
        String query = "SELECT temperatura FROM Planeta WHERE nombre = ?";
        double temperatura = 0;

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombrePlaneta);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    temperatura = rs.getDouble("temperatura");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return temperatura;
    }

    public int obtenerNumeroSatelitesPlaneta(String nombrePlaneta) {
        String query = "SELECT COUNT(*) AS num_satelites FROM Satelite WHERE planeta_id = (SELECT id FROM Planeta WHERE nombre = ?)";
        int numSatelites = 0;

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombrePlaneta);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    numSatelites = rs.getInt("num_satelites");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return numSatelites;
    }

    public List<String> obtenerNombresSatelitesPorPlaneta(String nombrePlaneta) {
        List<String> nombresSatelites = new ArrayList<>();
        String query = "SELECT nombre FROM Satelite WHERE planeta_id = (SELECT id FROM Planeta WHERE nombre = ?)";

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
}
