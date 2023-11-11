package app.storemanagement.model.Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:sqlserver://127.0.0.1;databaseName=StoreManagementDb";
    private static final String USERNAME = System.getenv("DB_USER1");
    private static final String PASSWORD = System.getenv("DB_PASSWORD1");

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL + ";user=" + USERNAME + ";password=" + PASSWORD + ";integratedSecurity=true;encrypt=true;trustServerCertificate=true");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}