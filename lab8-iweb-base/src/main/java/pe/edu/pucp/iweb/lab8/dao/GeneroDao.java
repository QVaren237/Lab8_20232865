package pe.edu.pucp.iweb.lab8.dao;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.SQLException;


import pe.edu.pucp.iweb.lab8.beans.Genero;

public class GeneroDao extends BaseDao { // TODO: heredar de BaseDao

    /**
     * Ejercicio 2: todos los géneros ordenados por nombre.
     */
    public ArrayList<Genero> listar() {
        // TODO
        ArrayList<Genero> listaGenero = new ArrayList<>();

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from genero");){
            while(rs.next()){
                Genero genero = new Genero();
                genero.setIdGenero(rs.getInt(1));
                genero.setNombre(rs.getString(2));
                listaGenero.add(genero);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return listaGenero;

    }
}
