/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author SONY
 */
public class Auto extends Informacion
{
    private String matricula;
    private String marca;
    private String modelo;
    private int costo;
    private String tiposervicio;
    private String fechafin;
    
    public Auto()
    {
        super();
        matricula="sin matricula";
        marca="sin marca";
        modelo="sin modelo";
        costo=0;
        tiposervicio="sin tipo";
        fechafin="sin fecha";
    }
    
    public Auto(String nombre, String fechainicio,String matricula,String marca, String modelo, int costo, String tiposervicio, String fechafin)
    {
        super(nombre,fechainicio);
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.costo=costo;
        this.tiposervicio=tiposervicio;
        this.fechafin=fechafin;
    }
    
    public String desp()
    {
        return
                super.desp()+
                "Marca: "+marca+"\n"+
                "Modelo: "+modelo+"\n"+
                "Matricula: "+matricula+"\n"+
                "Tipo servicio: "+tiposervicio+"\n"+
                "Costo: "+costo+"\n"+
                "Fecha final: "+fechafin+"\n";
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }

    /**
     * @return the tiposervicio
     */
    public String getTiposervicio() {
        return tiposervicio;
    }

    /**
     * @param tiposervicio the tiposervicio to set
     */
    public void setTiposervicio(String tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    /**
     * @return the fechafin
     */
    public String getFechafin() {
        return fechafin;
    }

    /**
     * @param fechafin the fechafin to set
     */
    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }
}
