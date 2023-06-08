/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maricel.dao;

import com.maricel.config.Conexion;
import com.maricel.model.Disco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class DiscoDAOImpl implements DiscoDAO {
    
     private Conexion objConexion;
    private Connection objConnection;

    public DiscoDAOImpl() {
        objConexion = new Conexion();
    }

    @Override
    public List<Disco> findAll() {
        //Consulta SQL que se tiene que realizar
        String consulta = "SELECT *FROM discos";
        // Listado de datos que se retorna
        List<Disco> listado = new LinkedList<>();
        try {
            this.objConexion.conectar();
            this.objConnection = this.objConexion.getJdbcConnection();

            PreparedStatement prest = this.objConnection.prepareStatement(consulta);
            // Ejecuta la consulta
            ResultSet rs = prest.executeQuery(consulta);

            Disco objDisco;

            while (rs.next()) {
                objDisco = new Disco();
                objDisco.setAutor("autor");
                objDisco.setTitulo(rs.getString("titulo"));
                objDisco.setFormato(rs.getString("formato"));
                objDisco.setGenero(rs.getString("genero"));
                objDisco.setDuracion(rs.getString("duracion"));

                listado.add(objDisco);
            }

        } catch (Exception e) {
            System.out.println("Error en la consulta " + e);
        }
        return listado;
    }

    @Override
    public Disco insert(Disco objDisco) {
        String consulta = "INSERT INTO discos(autor, titulo, formato, genero, duracion) VALUES (?,?,?,?,?)";
        try{
            this.objConexion.conectar();
            this.objConnection = this.objConexion.getJdbcConnection();
            //Inicializacion de la consulta
            PreparedStatement  prest = this.objConnection.prepareStatement(consulta);
            //Agregar los datos dentro de la consulta
            prest.setString(1, objDisco.getAutor());
            prest.setString(2, objDisco.getTitulo());
            prest.setString(3, objDisco.getFormato());
            prest.setString(4, objDisco.getGenero());
            prest.setString(5, objDisco.getDuracion());
            
            int count = prest.executeUpdate();
            
            ResultSet rs = null;
            rs = prest.executeQuery("SELECT LAST_INSERT_ID()");
            
            int autoKey = -1;
            if(rs.next()){
                autoKey = rs.getInt("id");
                objDisco.setId(autoKey);
                System.out.println("Ultimo ID introducto " + autoKey);
            }else{
                System.out.println("No exite dato de ID");
            }
        }catch(Exception e){
            System.out.println("Error al insertar " + e);
        }
        return objDisco;
    }

    @Override
    public Disco findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Disco updateById(Integer id, Disco objDisco) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean deleteById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

   
