/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model.Dao;

import java.util.ArrayList;

/**
 *
 * @author Student
 */
public interface Dao<T> {
    boolean crear(T objeto);
    T leer(Object objeto);
    ArrayList leerTodo(Object objeto);
}