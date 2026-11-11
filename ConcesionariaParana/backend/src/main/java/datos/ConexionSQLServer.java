package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQLServer {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=ConcesionariaParanaDB;encrypt=true;trustServerCertificate=true;";
    private static final String USUARIO = "sa"; 
    private static final String CONTRASENA = "TuPassword123"; 

    public static Connection obtenerConexion() {
        try {
            Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("¡Conexión exitosa a SQL Server!");
            return conexion;
        } catch (SQLException e) {
            System.err.println("Error al conectar con la Base de Datos: " + e.getMessage());
            return null;
        }
    }
}