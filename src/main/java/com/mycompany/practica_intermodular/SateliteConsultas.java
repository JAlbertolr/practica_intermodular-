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
    
   public String obtenerNombresSatelitesPorPlaneta(String nombrePlaneta) {
        String nombresSatelites = "";
        String query = "SELECT s.nombre " +
                       "FROM Satelite s " +
                       "JOIN Planeta p ON s.planeta_id = p.id " +
                       "WHERE p.nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombrePlaneta);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    nombresSatelites=rs.getString("nombre");
                 
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nombresSatelites;
    }
    public String obtenerTipoSatelitesPorPlaneta(String nombrePlaneta) {
        String nombresSatelites = "";
        String query = "SELECT s.tipo " +
                       "FROM Satelite s " +
                       "JOIN Planeta p ON s.planeta_id = p.id " +
                       "WHERE p.nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombrePlaneta);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    nombresSatelites=rs.getString("tipo");
                 
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nombresSatelites;
    }
   
     public double obtenerRadioSatelitesPorPlaneta(String nombrePlaneta) {
        double radioEstrella = 0;
        String query = "SELECT s.radio_km " +
                       "FROM Satelite s " +
                       "JOIN Planeta p ON s.planeta_id = p.id " +
                       "WHERE p.nombre = ?";  

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                radioEstrella = rs.getDouble("radio_km");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return radioEstrella;
    }
       public double obtenerDistanciaSatelitesPorPlaneta(String nombrePlaneta) {
        double radioEstrella = 0;
        String query = "SELECT s.distancia_planeta " +
                       "FROM Satelite s " +
                       "JOIN Planeta p ON s.planeta_id = p.id " +
                       "WHERE p.nombre = ?";  

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                radioEstrella = rs.getDouble("distancia_planeta");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return radioEstrella;
    }
        public double obtenerPeriodoSatelitesPorPlaneta(String nombrePlaneta) {
        double radioEstrella = 0;
        String query = "SELECT s.periodo_orbital " +
                       "FROM Satelite s " +
                       "JOIN Planeta p ON s.planeta_id = p.id " +
                       "WHERE p.nombre = ?";  

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                radioEstrella = rs.getDouble("periodo_orbital");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return radioEstrella;
    }
         public double obtenerTemperaturaSatelitesPorPlaneta(String nombrePlaneta) {
        double radioEstrella = 0;
        String query = "SELECT s.temperatura_media " +
                       "FROM Satelite s " +
                       "JOIN Planeta p ON s.planeta_id = p.id " +
                       "WHERE p.nombre = ?";  

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            if (rs.next()) {
                radioEstrella = rs.getDouble("temperatura_media");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return radioEstrella;
    }
}
