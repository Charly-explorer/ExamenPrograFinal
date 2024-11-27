/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Taller;

import Model.Dao.Dao;
import Model.Participantes.ParticipanteDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


/**
 *
 * @author Student
 */
public class TallerDao implements Dao<Taller> {
 protected Connection connection;

    public TallerDao(Connection connection) {
        this.connection = connection;
    }
    @Override
    public boolean crear(Taller objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public Taller leer(Object objeto)throws SQLException{
        if (objeto == null);
        String query = "Call tallerRead(?)";
        try ( PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, Integer.parseInt(String.valueOf(objeto)));
            try(ResultSet rs = stmt.executeQuery()){
                if(rs.next()){
                    return new TallerDTO(
                            rs.getInt(1), 
                            rs.getString(2), 
                            rs.getDate(3), 
                            rs.getString(4),
                            rs.getInt(5));
                }
            }
        }
        return null;
         
    }

    @Override
    public ArrayList leerTodo()throws SQLException {
     String query = "Call participantesRead(?)";
        ArrayList<TallerDTO> list = new ArrayList<>();
        try ( PreparedStatement stmt = connection.prepareStatement(query)) {
            try(ResultSet rs = stmt.executeQuery()){
                while(rs.next()){
                    list.add(new TallerDTO(
                             rs.getInt(1), 
                            rs.getString(2), 
                            rs.getDate(3), 
                            rs.getString(4),
                            rs.getInt(5));                
                }
            }
        }
        return list;
    }

}
