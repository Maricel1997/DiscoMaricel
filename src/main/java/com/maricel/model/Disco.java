/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maricel.model;

/**
 *
 * @author Usuario
 */
public class Disco {
    private Integer id;
    private String autor;
    private String titulo;
    private String formato;
    private String genero;
    private String duracion;
public Disco(){
            
        }
         
           //getters y setters
        public Integer getId(){
            return id;
        }
        public void setId(Integer id){
            this.id= id;
        }
   
        public String getAutor(){
            return autor;
        }
        public void setAutor(String autor){
            this.autor = autor;
            
            
        }
        public String getTitulo(){
            return titulo;
        }
        public void setTitulo(String titulo){
            this.titulo = titulo;
              
        }
        public String getFormato(){
            return formato;
        }
        public void setFormato(String formato){
            this.formato = formato;
            
        }
        public String getGenero(){
            return genero;
        }
        public void setGenero(String genero){
            this.genero = genero;
             
        }
        public String getDuracion(){
            return duracion;
        }
        public void setDuracion(String duracion){
            this.duracion = duracion;
            
        }
        }