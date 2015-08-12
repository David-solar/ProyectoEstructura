/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author SONY
 */
public class Sucursal extends Informacion 
{
    private String ubicacion;
  //  private int numvehiculos;
  //  private int numsucursal;

    public Sucursal()
    {
        super();
        ubicacion="sin ubicacion";
       //numvehiculos=0;
       // numsucursal=0;
    }
    
    public Sucursal(String nombre, String fechainicio, String ubicacion/*,int numv,int numsuc*/)
    {
        super(nombre,fechainicio);
        this.ubicacion=ubicacion;
        //this.numvehiculos=numv;
        //this.numsucursal=numsuc;
    }
    
    public String desp()
    {
        return 
                super.desp()+
                "Ubicacion: "+ubicacion+"\n";
//                "Numero de Vehiculos: "+ numvehiculos+
//                "Numero de Sucursal: "+numsucursal;
    }
    /**
     * @return the ubicacion
     */
    public String getUbicacion() {
        return ubicacion;
    }
    

    /**
     * @param ubicacion the ubicacion to set
     */
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

//    /**
//     * @return the numvehiculos
//     */
//    public int getNumvehiculos() {
//        return numvehiculos;
//    }
//
//    /**
//     * @param numvehiculos the numvehiculos to set
//     */
//    public void setNumvehiculos(int numvehiculos) {
//        this.numvehiculos = numvehiculos;
//    }
//
//    /**
//     * @return the numsucursal
//     */
//    public int getNumsucursal() {
//        return numsucursal;
//    }
//
//    /**
//     * @param numsucursal the numsucursal to set
//     */
//    public void setNumsucursal(int numsucursal) {
//        this.numsucursal = numsucursal;
//    }
}
