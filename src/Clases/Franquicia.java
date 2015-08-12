/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author SONY
 */
public class Franquicia extends Informacion
{
    private String tipo;
   // private int num_sucursales;
    
    public Franquicia()
    {
        super();
        tipo="sin tipo";
   //     num_sucursales=0;
    }
    public Franquicia(String nombre, String fechainicio, String tipo)
    {
        super(nombre, fechainicio);
        this.tipo=tipo;
        //this.num_sucursales=numsuc;
    }
    
    public String desp()
    {
        return 
                super.desp()+
                "Tipo: "+ tipo+"\n";
                //"Numero de Sucursales: "+num_sucursales;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
//
//    /**
//     * @return the num_sucursales
//     */
//    public int getNum_sucursales() {
//        return num_sucursales;
//    }
//
//    /**
//     * @param num_sucursales the num_sucursales to set
//     */
//    public void setNum_sucursales(int num_sucursales) {
//        this.num_sucursales = num_sucursales;
//    }
    
}
