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
public class CacheParticipantes{
    private HashMap<Integer,Participante> list;

    public HashMap<Integer, Participante> getList() {
        return list;
    }

    public CacheParticipantes() {
        this.list = new HashMap<>();
    }

    public boolean crear(Participante objeto) {
        if(objeto == null){
            return false;
        }
        list.put(objeto.getCedula(),objeto);
        return true;
    }

    public Participante leer(Object objeto) {
        if(objeto == null){
            return null;
        }
        return list.get(Integer.parseInt(String.valueOf(objeto)));  
    }
}
