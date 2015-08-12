/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Lista.Nodo;
import java.io.Serializable;

/**
 *
 * @author SONY
 */
public class Informacion implements Serializable
{
    Nodo obj;
    private String nombre;
    private String fechainicio;

    public Informacion()
    {
        nombre="sin nombre";
        fechainicio="sin fecha de inicio";
    }
    
    public Informacion(String nom, String fecha)
    {
        this.nombre=nom;
        this.fechainicio=fecha;
    }
    
    public String desp()
    {
        return 
                "Nombre: "+ nombre+"\n"
                +"Fecha de Inicio: "+ fechainicio+"\n";
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the fechainicioo
     */
    public String getFechainicio() {
        return fechainicio;
    }

    /**
     * @param fechainicioo the fechainicioo to set
     */
    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }
    
    
}
