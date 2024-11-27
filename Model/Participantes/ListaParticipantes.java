/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Participantes;

import Model.Dao.Dao;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Student
 */
public class ListaParticipantes implements Dao<Participante>{
    private HashMap<Integer,Participante> list;

    public HashMap<Integer, Participante> getList() {
        return list;
    }

    public ListaParticipantes() {
        this.list = new HashMap<>();
    }

    @Override
    public boolean crear(Participante objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Participante leer(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList leerTodo(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
