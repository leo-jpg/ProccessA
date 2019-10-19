/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Interface.MetodosCRUD.Metodos;
import Modelo.Tarea;
import Modelo.Usuario;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author RepjA
 */
public class TareaDAO implements Metodos<Tarea>{
    private static final String SQL_INSERT = "{call sp_insertar_tar(?,?,?,?,?,?)}";
    private static final String SQL_UPDATE = "{call sp_modificar_tar(?,?,?,?,?,?,?)}";
    private static final String SQL_DELETE = "{call sp_eliminar_tar(?)}";
    
    private static final Conexion conexion = Conexion.estado();

    @Override
    public boolean create(Tarea generico) {
        PreparedStatement pre;
        try{
            pre = conexion.getConnection().prepareCall(SQL_INSERT);
            pre.setString(1, generico.getResponsable());
            pre.setDate(2, generico.getPlazo());
            pre.setString(3, generico.getDescripcion());
            pre.setInt(4, generico.getCumplimiento());
            pre.setInt(5, generico.getId_usuario_asignado());
            pre.setInt(6, generico.getIndicador_id_indicador());

            if (pre.executeUpdate() > 0) {
                return true;
            }
        }catch(Exception e){
            conexion.cerrarConexion();
        }finally{
            return false;
        }
    }

    @Override
    public boolean update(Tarea generico) {
        PreparedStatement pre;
        try{
            pre = conexion.getConnection().prepareCall(SQL_UPDATE);
            pre.setInt(1, generico.getId_tarea());
            pre.setString(2, generico.getResponsable());
            pre.setDate(3, generico.getPlazo());
            pre.setString(4, generico.getDescripcion());
            pre.setInt(5, generico.getCumplimiento());
            pre.setInt(6, generico.getId_usuario_asignado());
            pre.setInt(7, generico.getIndicador_id_indicador());

            if (pre.executeUpdate() > 0) {
                return true;
            }
        }catch(Exception e){
            conexion.cerrarConexion();
        }finally{
            return false;
        }
    }

    @Override
    public boolean delete(Tarea generico) {
        PreparedStatement pre;
        try{
            pre = conexion.getConnection().prepareCall(SQL_DELETE);
            pre.setInt(1, generico.getId_tarea());
        
            if (pre.executeUpdate() > 0) {
                return true;
            }
        }catch(Exception e){
            conexion.cerrarConexion();
        }finally{
            return false;
        }
    }

    @Override
    public Usuario read(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tarea> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
