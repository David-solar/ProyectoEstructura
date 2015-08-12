 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

import java.io.Serializable;

/**
 *
 * @author SONY
 */
public class ListaDobleCircular implements Serializable
{
    public static  Nodo r;
    public ListaDobleCircular()
    {
        r=null;
    }  
    
    public Nodo insertar(Nodo aux,Nodo ap)
    {
        if(aux!=null)
        {
            if(ap==null)
            {
                ap=aux;
                aux.setAtras(aux);
                aux.setSiguiente(aux);
            }
            else
            {
              if(aux.getClave().compareTo(ap.getClave())<0)
                {
                    aux.setSiguiente(ap);
                    ap.getAtras().setSiguiente(aux);
                    aux.setAtras(ap.getAtras());
                    aux.getSiguiente().setAtras(aux);
                }
                else
                {
                    boolean band=true;
                    Nodo aux2=ap;
                    while(aux2.getSiguiente()!=ap && band)
                    {
                        if(!(aux2.getSiguiente().getClave().compareTo(aux.getClave())<0))
                        {
                            aux.setSiguiente(aux2.getSiguiente());
                            aux2.getSiguiente().setAtras(aux);
                            aux2.setSiguiente(aux);
                            aux.setAtras(aux2);
                            band=false;
                        }
                        else
                        {
                            aux2=aux2.getSiguiente();
                        }
                    }
                    if(band)
                    {
                        aux.setSiguiente(aux2.getSiguiente());
                        aux2.setSiguiente(aux);
                        aux.getSiguiente().setAtras(aux);
                        aux.setAtras(aux2);
                        
                    }
                }
             }
            
            if(aux.getClave().compareTo(ap.getClave())<0)
            {
                ap=ap.getAtras();
            }
        }
        return ap;
    }
    
     public Nodo elimina(String clave,Nodo ap)
    {
        Nodo aux=null;
        if(ap!=null)
        {
            if(ap.getClave().equals(clave))
            {
                aux=ap;
                ap=aux.getSiguiente();
                ap.setAtras(aux.getAtras());
                aux.getAtras().setSiguiente(ap);
                aux.setSiguiente(null);
                aux.setAtras(null);
            }
            else
                {
                    if(!(ap.getAtras().getClave().compareTo(clave)<0))
                    {
                        boolean band=true;
                        Nodo aux2=ap;
                        while(aux2.getSiguiente()!=ap && band)
                        {
                            if(aux2.getSiguiente().getClave().equals(clave))
                            {
                                aux=aux2.getSiguiente();
                                aux2.setSiguiente(aux.getSiguiente());
                                aux.getSiguiente().setAtras(aux2);
                                aux.setSiguiente(null);
                                aux.setAtras(null);
                                band=false;
                            }
                            else
                            {
                                aux2=aux2.getSiguiente();
                            }
                        }
                    }
                }
        }
        return aux;
    }
     
     public static Nodo buscar(String clave, Nodo ap)
    {
        Nodo ap1=null;
        if(!(ap.getAtras().getClave().compareTo(clave)<0))
        {
            ap1=ap;
            do
            {
                if(ap1.getClave().equals(clave))
                {
                    break;
                }
                else
                {
                    ap1=ap1.getSiguiente();
                }
            }while(ap1!=ap);
        }
        return ap1;
    }
    
//    public static Nodo buscar(int num1,int num2)
//    {
//        Nodo ap1=r;
//        Nodo ap2=null;
//        if(!(ap1.getAtras().getNum()<num1))
//        {
//            do
//            {
//                if(ap1.getNum()==num1)
//                {
//                    ap2=ap1.getOtro();
//                    do
//                    {
//                        if(ap2.getNum()==num2)
//                        {
//                            break;
//                        }
//                        else
//                        {
//                            ap2=ap2.getSiguiente();
//                        }
//                    }while(ap2!=ap1.getOtro());
//                    break;
//                }
//                else
//                {
//                    ap1=ap1.getSiguiente();
//                }
//            }while(ap1!=r);
//        }
//        return ap2;
//    }
//    
//     
//    public static boolean inserta(Nodo aux)
//    {
//        if(aux!=null)
//        {
//            if(r==null)
//            {
//                r=aux;
//                r.setSiguiente(r);
//                r.setAtras(r);
//            }
//            else
//            {
//                if(r.getNum()>aux.getNum())
//                {
//                    aux.setSiguiente(r);
//                    r.getAtras().setSiguiente(aux);
//                    aux.setAtras(r.getAtras());
//                    aux.getSiguiente().setAtras(aux);
//                    if(aux.getNum()<r.getNum())
//                    {
//                        r=r.getAtras();
//                    }
//                }
//                else
//                {
//                    boolean band=true;
//                    Nodo aux2=r;
//                    while(aux2.getSiguiente()!=r && band)
//                    {
//                        if(aux2.getSiguiente().getNum()> aux.getNum())
//                        {
//                            aux.setSiguiente(aux2.getSiguiente());
//                            aux2.getSiguiente().setAtras(aux);
//                            aux2.setSiguiente(aux);
//                            aux.setAtras(aux2);
//                            band=false;
//                        }
//                        else
//                        {
//                            aux2=aux2.getSiguiente();
//                        }
//                    }
//                    if(band)
//                    {
//                        aux.setSiguiente(aux2.getSiguiente());
//                        aux2.setSiguiente(aux);
//                        aux.getSiguiente().setAtras(aux);
//                        aux.setAtras(aux2);
//                        
//                    }
//                }
//             }
//                return true;
//        }
//            else
//        {
//            return false;
//        }
//    }
    
//    public Nodo elimina(int matricula)
//    {
//        Nodo aux=null;
//        if(r!=null)
//         {
//            if(r.getNum()==matricula)
//            {
//                aux=r;
//                r=aux.getSiguiente();
//                r.setAtras(aux.getAtras());
//                aux.getAtras().setSiguiente(r);
//                aux.setSiguiente(null);
//                aux.setAtras(null);
//                if(r==aux)
//                {
//                    r=null;
//                }
//            }
//            else
//                {
//                    if(!(r.getAtras().getNum() < matricula))
//                    {
//                        boolean band=true;
//                        Nodo aux2=r;
//                        while(aux2.getSiguiente()!=r && band)
//                        {
//                            if(aux2.getSiguiente().getNum()== matricula)
//                            {
//                                aux=aux2.getSiguiente();
//                                aux2.setSiguiente(aux.getSiguiente());
//                                aux.getSiguiente().setAtras(aux2);
//                                aux.setSiguiente(null);
//                                aux.setAtras(null);
//                                band=false;
//                            }
//                            else
//                            {
//                                aux2=aux2.getSiguiente();
//                            }
//                        }
//                    }
//                }
//        }
//        return aux;
//    }

    /**
     * @return the r
     */
    public Nodo getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(Nodo r) {
        this.r = r;
    }
    
}
