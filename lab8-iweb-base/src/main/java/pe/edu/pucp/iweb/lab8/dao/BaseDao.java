package pe.edu.pucp.iweb.lab8.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Ejercicio 2: DAO base.
 *
 *  - Esta clase debe ser ABSTRACTA.
 *  - GeneroDao y CancionDao deben heredar de ella y obtener la conexión
 *    únicamente con getConnection().
 */
public abstract class BaseDao { // TODO: convertir en clase abstracta

    public Connection getConnection() throws SQLException {
        // TODO: cargar el driver (com.mysql.cj.jdbc.Driver) y retornar la conexión
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        String URL = "jdbc:mysql://localhost:3306/melodiape";
        String USER = "root";
        String PASS = "12345678";
        return DriverManager.getConnection(URL,USER,PASS);

        //throw new UnsupportedOperationException("getConnection() aún no implementado");
    }
}
