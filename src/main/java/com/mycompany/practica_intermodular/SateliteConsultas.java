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
    

    public ArrayList<Satelite> obtenerSatelitesPorPlaneta(String nombrePlaneta) {
        ArrayList<Satelite> satelites = new ArrayList<>();
        String query = "SELECT s.nombre, s.tipo, s.radio_km, s.distancia_planeta, s.periodo_orbital, s.temperatura_media " +
                       "FROM Satelite s " +
                       "JOIN Planeta p ON s.planeta_id = p.id " +
                       "WHERE p.nombre = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, nombrePlaneta);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String nombre = rs.getString("nombre");
                    String tipo = rs.getString("tipo");
                    double radio = rs.getDouble("radio_km");
                    double distancia = rs.getDouble("distancia_planeta");
                    double periodo = rs.getDouble("periodo_orbital");
                    double temperatura = rs.getDouble("temperatura_media");

                    Satelite satelite = new Satelite(nombre, tipo, radio, distancia, periodo, temperatura);
                    satelites.add(satelite);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return satelites;
    }
}
