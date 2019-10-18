/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Date;

/**
 *
 * @author RepjA
 */
public class Tarea {
    private int id_tarea;
    private String responsable;
    private Date plazo;
    private String descripcion;
    private int cumplimiento;
    private int id_usuario_asignado;
    private int indicador_id_indicador;

    public Tarea() {
    }

    public Tarea(String responsable, Date plazo, String descripcion, int cumplimiento, int id_usuario_asignado, int indicador_id_indicador) {
        this.responsable = responsable;
        this.plazo = plazo;
        this.descripcion = descripcion;
        this.cumplimiento = cumplimiento;
        this.id_usuario_asignado = id_usuario_asignado;
        this.indicador_id_indicador = indicador_id_indicador;
    }
    
    

    public Tarea(int id_tarea, String responsable, Date plazo, String descripcion, int cumplimiento, int id_usuario_asignado, int indicador_id_indicador) {
        this.id_tarea = id_tarea;
        this.responsable = responsable;
        this.plazo = plazo;
        this.descripcion = descripcion;
        this.cumplimiento = cumplimiento;
        this.id_usuario_asignado = id_usuario_asignado;
        this.indicador_id_indicador = indicador_id_indicador;
    }

    public int getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(int id_tarea) {
        this.id_tarea = id_tarea;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public Date getPlazo() {
        return plazo;
    }

    public void setPlazo(Date plazo) {
        this.plazo = plazo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCumplimiento() {
        return cumplimiento;
    }

    public void setCumplimiento(int cumplimiento) {
        this.cumplimiento = cumplimiento;
    }

    public int getId_usuario_asignado() {
        return id_usuario_asignado;
    }

    public void setId_usuario_asignado(int id_usuario_asignado) {
        this.id_usuario_asignado = id_usuario_asignado;
    }

    public int getIndicador_id_indicador() {
        return indicador_id_indicador;
    }

    public void setIndicador_id_indicador(int indicador_id_indicador) {
        this.indicador_id_indicador = indicador_id_indicador;
    }

    @Override
    public String toString() {
        return "Tarea{" + "id_tarea=" + id_tarea + ", responsable=" + responsable + ", plazo=" + plazo + ", descripcion=" + descripcion + ", cumplimiento=" + cumplimiento + ", id_usuario_asignado=" + id_usuario_asignado + ", indicador_id_indicador=" + indicador_id_indicador + '}';
    }
    
    
}
