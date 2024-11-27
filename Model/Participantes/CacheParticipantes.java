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
public class CacheParticipantes implements Dao<Participante>{
    private HashMap<Integer,Participante> list;

    public HashMap<Integer, Participante> getList() {
        return list;
    }

    public CacheParticipantes() {
        this.list = new HashMap<>();
    }

    @Override
    public boolean crear(Participante objeto) {
        if(objeto == null){
            return false;
        }
        list.put(objeto.getCedula(),objeto);
        return true;
    }

    @Override
    public Participante leer(Object objeto) {
        if(objeto == null){
            return null;
        }
        return list.get(Integer.parseInt(String.valueOf(objeto)));  
    }

    @Override
    public ArrayList leerTodo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
