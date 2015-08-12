/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Lista.ListaDobleC;
import Lista.Nodo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author chass
 */
public class Archivo {

    
    public static ListaDobleC cargarLista(int fr, int su, int au){
        ListaDobleC lista=new ListaDobleC();
//        String f=null, s=null, a=null;
        Nodo apS=null, apF=null;
        FileInputStream entrada= null;
        try{
            
            entrada= new FileInputStream("listaD.txt");
            ObjectInputStream objE= new ObjectInputStream(entrada);
            Nodo nodo;
            
            while((nodo=(Nodo)objE.readObject())!=null){
               if(nodo.getObj() instanceof Franquicia){
//                   f=nodo.getClave();
                   fr++;
                   apF=nodo;
                   lista.r= lista.insertar(nodo, lista.r);
               }
               if(nodo.getObj() instanceof Sucursal){
//                   s=nodo.getClave();
                   su++;
                    apS=nodo;
                    apF.setOtro(lista.insertar(nodo, apF.getOtro()));
               }
               if(nodo.getObj() instanceof Auto){
//                   a=nodo.getClave();
                   au++;
                   apS.setOtro(lista.insertar(nodo, apS.getOtro()));
                   
               }
               
                
            }
            
            objE.close();
        }catch(Exception e){
            System.out.println("Problema al leer lista");
        }
        
        return lista;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void leerLista(Nodo apuntador, Nodo finAuto, Nodo finSucursal, Nodo finFranquicia, ObjectOutputStream objS) throws IOException{
        
        objS.writeObject(apuntador);
        
        if(apuntador.getObj() instanceof Franquicia){
            
            if(apuntador.getOtro()!=null){
                leerLista(apuntador.getOtro(),  null, null, finFranquicia,objS);
                if(apuntador.getSiguiente()!=finFranquicia){
                    
                    leerLista(apuntador.getSiguiente(),  null, null, finFranquicia,objS);
                }
            }else if(apuntador.getSiguiente()!=finFranquicia ){
               
                leerLista(apuntador.getSiguiente(), null, null, finFranquicia, objS);
                
            }
            
            
        }else if(apuntador.getObj() instanceof Sucursal){
            
            if(apuntador.getOtro()!= null){
                leerLista(apuntador.getOtro(),  null, finSucursal, finFranquicia, objS);
                if(apuntador.getSiguiente()!=apuntador && (finSucursal ==null)){
                    finSucursal=apuntador;
                    leerLista(apuntador.getSiguiente(), null, finSucursal, finFranquicia, objS);
                    
                }
            }else if(apuntador.getSiguiente()!=apuntador && (finSucursal==null)){
                 finSucursal=apuntador;
                    leerLista(apuntador.getSiguiente(),  null,finSucursal, finFranquicia, objS);
                
            }else if(apuntador.getSiguiente()!=finSucursal && (finSucursal!=null)){
                leerLista(apuntador.getSiguiente(), null, finSucursal, finFranquicia, objS);
            }
            finAuto=null;
        }else if(apuntador.getObj() instanceof Auto){
            
            if((apuntador.getSiguiente()!=apuntador) && finAuto==null){
                finAuto=apuntador;
                leerLista(apuntador.getSiguiente(),  finAuto, finSucursal, finFranquicia, objS);
            }else if(apuntador.getSiguiente()!=finAuto && (finAuto!=null)){
                leerLista(apuntador.getSiguiente(),  finAuto,finSucursal, finFranquicia, objS);
                
            }
        }
        
        
       
    }
     public static void guardarNodo( ListaDobleC list){
        
        FileOutputStream salida= null;
        try{
            salida= new FileOutputStream("listaD.txt");
            ObjectOutputStream objS= new ObjectOutputStream(salida);
            leerLista(list.r, null, null, list.r, objS);
            objS.close();
        }catch(Exception e){
            
        }
        
    }
     public static void guardarContadores(int fr, int su, int au){
         
         
          FileOutputStream salida= null;
        try{
            int arre[]= new int[]{fr, su, au};
            salida= new FileOutputStream("cont.txt");
            ObjectOutputStream cont= new ObjectOutputStream(salida);
            cont.writeObject(arre);
            cont.close();
        }catch(Exception e){
            
        }
     }
     public static int[] abrirContadores(){
         
         int arre[]=null;
          FileInputStream entrada= null;
        try{
            
            entrada= new FileInputStream("cont.txt");
            ObjectInputStream cont= new ObjectInputStream(entrada);
            arre=(int[]) cont.readObject();
            cont.close();
            
        }catch(Exception e){
            
        }
        return arre;
     }

}
