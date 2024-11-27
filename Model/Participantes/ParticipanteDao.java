/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Participantes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import DataBase.BaseDatos;
import Model.Dao.Dao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class ParticipanteDao implements Dao<ParticipanteDTO> {

    protected Connection connection;

    public ParticipanteDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean crear(ParticipanteDTO objeto) throws SQLException {
        if (objeto == null) {
            return false;
        }
        String query = "Call participantesCreate(?,?,?,?)";
        try ( PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, objeto.getCedula());
            stmt.setString(2, objeto.getNombre());
            stmt.setString(3, objeto.getTelefono());
            stmt.setString(4, objeto.getCorreo());
            return stmt.executeUpdate() > 0;
        }
    }

    @Override
    public ParticipanteDTO leer(Object objeto) throws SQLException {
        if (objeto == null) {
            return null;
        }
        String query = "Call participantesRead(?)";
        try ( PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, Integer.parseInt(String.valueOf(objeto)));
            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next()){
                    return new ParticipanteDTO(
                            rs.getInt(1), 
                            rs.getString(2), 
                            rs.getString(3), 
                            rs.getString(4));
                }
            }
        }
        return null;
    }

    @Override
    public ArrayList leerTodo() throws SQLException {
        String query = "Call participantesRead(?)";
        ArrayList<ParticipanteDTO> list = new ArrayList<>();
        try ( PreparedStatement stmt = connection.prepareStatement(query)) {
            try(ResultSet rs = stmt.executeQuery()){
                while(rs.next()){
                    list.add(new ParticipanteDTO(
                            rs.getInt(1), 
                            rs.getString(2), 
                            rs.getString(3), 
                            rs.getString(4)));
                }
            }
        }
        return list;
    }

}
