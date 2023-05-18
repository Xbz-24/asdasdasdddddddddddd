package com.webapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionUtil {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/dab_di22232b_52";
    private static final String USERNAME = "dab_di22232b_52";
    private static final String PASSWORD = "EZhl18ezcNw3QdyO";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
    }
}
