/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica_intermodular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Informatico
 */
/**
 * Esta clase proporciona métodos para establecer una conexión a la base de
 * datos.
 */
public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/practica_intermodular";
    private static final String USER = "root";
    private static final String PASSWORD = "Med@c";

    /**
     * Obtiene una conexión a la base de datos.
     *
     * @return Una instancia de Connection que representa la conexión a la base
     * de datos.
     * @throws SQLException Si se produce un error al intentar establecer la
     * conexión.
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
