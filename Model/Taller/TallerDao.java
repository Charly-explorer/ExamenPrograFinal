/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Taller;

import Model.Dao.Dao;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public class TallerDao implements Dao<Taller> {

    @Override
    public boolean crear(Taller objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }

    @Override
    public Taller leer(Object objeto)throws SQLException{
        if (objeto == null){
            return false;
        }
        String query = "Call "
        
    }

    @Override
    public ArrayList leerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
