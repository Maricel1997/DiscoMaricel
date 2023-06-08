/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.maricel.dao;

import com.maricel.model.Disco;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface DiscoDAO {
     //Metodo que devuelve el listado de objetos
    public List<Disco> findAll();
    // Metodo que inserta un onjeto en la BBDD
    public Disco insert(Disco objDisco);
    //Metodo que devuelde un objeto en base a su ID
    public Disco findById(Integer id);
    //Metodo que modifica un objeto en la BBDD en base a su ID
    public Disco updateById(Integer id, Disco objDisco);
    //Metodo que elimina un objeto en la BDD en base a su ID
    public Boolean deleteById(Integer id);
    
}
