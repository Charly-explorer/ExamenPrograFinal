/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.Dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Student
 */
public interface Dao<T> {
    boolean crear(T objeto) throws SQLException;
    T leer(Object objeto)throws SQLException;
    ArrayList leerTodo()throws SQLException;
}