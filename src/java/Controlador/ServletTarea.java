/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.TareaDAO;
import Modelo.Tarea;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author RepjA
 */
public class ServletTarea extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String opcion = request.getParameter("btnAccion");

        if (opcion.equals("Agregar")) {
            agregar(request, response);
        }
    }

    protected void agregar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String responsable = request.getParameter("cboResponsable");
            String plazo = request.getParameter("DtPlazo");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date
            formato = sdf.parse(plazo);
            java.sql.Date fecha = new java.sql.Date(formato.getDate());
            String descripcion = request.getParameter("txtDescripcion");
            int cumplimiento = Integer.parseInt(request.getParameter("nbCumplimiento"));
            int id_usu_asig = Integer.parseInt(request.getParameter("cboUsuario"));
            int id_indicador = 1;
            
            Tarea tarea = new Tarea(responsable, fecha, descripcion, cumplimiento, id_usu_asig, id_indicador);
            TareaDAO dao = new TareaDAO();
            
            if (dao.create(tarea)) {
                request.setAttribute("msjOK", "Tarea agregada correctamente");
            } else {
                request.setAttribute("msjNO", "Error al agregar Tarea");
            }
        } catch (Exception e) {

        } finally {
            response.sendRedirect("funcionario/agregarTarea.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
