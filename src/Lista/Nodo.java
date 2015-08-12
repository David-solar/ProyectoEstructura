/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import Clases.Informacion;
import java.io.Serializable;

/**
 *
 * @author SONY
 */
public class Nodo implements Serializable
{
    private Nodo siguiente;
    private Nodo atras;
    private Nodo otro;
    private Informacion obj;
    private  String clave;
    
    public Nodo(Informacion obj,String clave)
    {
        this.obj=obj;
        this.clave=clave;
        siguiente=null;
        atras=null;
        otro=null;
    }
 
    public String desp()
    {
        return
                "Clave tipo: "+clave+"\n";
    }
    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the atras
     */
    public Nodo getAtras() {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(Nodo atras) {
        this.atras = atras;
    }

    /**
     * @return the otro
     */
    public Nodo getOtro() {
        return otro;
    }

    /**
     * @param otro the otro to set
     */
    public void setOtro(Nodo otro) {
        this.otro = otro;
    }

    /**
     * @return the obj
     */
    public Informacion getObj() {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Informacion obj) {
        this.obj = obj;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }
    
}
