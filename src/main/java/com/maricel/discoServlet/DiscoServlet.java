/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maricel.discoServlet;

import com.maricel.dao.DiscoDAO;
import com.maricel.dao.DiscoDAOImpl;
import com.maricel.model.Disco;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
@WebServlet(urlPatterns="/DiscoServlet")
public class DiscoServlet extends HttpServlet{
    
    private DiscoDAO DiscoDAO;
    
    public  DiscoServlet(){
        super();
        DiscoDAO = new DiscoDAOImpl();   
    }
    
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        this.procesarSolicitud(req, resp);
                   
    }  
     @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
         this.procesarSolicitud(req, resp);
              
     }
     protected void procesarSolicitud(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         switch (request.getParameter("action")){
             case "list":
                // this.list(request, response);
                 break;
             case "create":
                 this.create(request, response);
                 break;
             case "read":
                // this.read(request, response);
                 break;
             case "update":
                 //this.update(request, response);
                 break;
             case "delete":
                 //this.delete(request, response);
                 break;
             case "showRegister":
                 this.showRegister(request, response);
                 break;
             case "index":
                this.index(request, response);
                break;
            default:
               this.index(request, response);
                break;  
             
         }
     }
            
       

    private void index(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Se redirecciona al JSP "index.jsp", es decir la pagina principal.
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
        
        private void showRegister(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
               RequestDispatcher dispatcher = request.getRequestDispatcher("/view/create.jsp");
               dispatcher.forward(request, response);
        }    
               
               private void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
               //Recoger los datos desde la peticion
               String autor =request.getParameter("autor");
               String titulo =request.getParameter("titulo");
               String formato =request.getParameter("formato");
               String genero =request.getParameter("genero");
               String duracion =request.getParameter("duracion");
               //crear el objeto que se envia al BD
               Disco objdisco = new Disco();
               objdisco.setAutor(autor);
               objdisco.setTitulo(titulo);
               objdisco.setFormato(formato);
               objdisco.setGenero(genero);
               objdisco.setDuracion(duracion);
               
              DiscoDAO.insert(objdisco);
              
              //Redireccionar al "index"
              this.index(request, response);
              
               }                     
} 


