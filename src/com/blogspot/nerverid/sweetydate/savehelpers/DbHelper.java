package com.blogspot.nerverid.sweetydate.savehelpers;

import java.sql.*;

public class DbHelper {
    /*
    *      JDBS Driver and database url
     */
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DATABASE_URL = "jdbc:mysql://localhost/NETMARK";
    private String pass;
    private String user;

    public void dbUse() throws ClassNotFoundException, SQLException{
        Connection connection = null;
        Statement statement = null;
        System.out.println("Registering JDBC driver...");

        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Creating database connection...");
        connection = DriverManager.getConnection(DATABASE_URL, user, pass);
        
        System.out.println("Executing statement...");
        statement = connection.createStatement();

        String sql;
        sql = "SELECT * FROM clients";

        ResultSet resultSet = statement.executeQuery(sql);
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setUser(String user) {
        this.user = user;
    }


}
