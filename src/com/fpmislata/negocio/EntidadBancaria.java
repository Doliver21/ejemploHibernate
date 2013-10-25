/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.negocio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EntidadBancaria {

    private int idEntidadBancaria;
    private String codigoEntidad;
    private String nombre;
    private String cif;
    private TipoEntidadBancaria tipoEntidadBancaria;
    private List <SucursalBancaria> Surcursales = new ArrayList <>();
    
    public EntidadBancaria(){
        
    }

    public int getIdEntidadBancaria() {
        return idEntidadBancaria;
    }

    public void setIdEntidadBancaria(int idEntidadBancaria) {
        this.idEntidadBancaria = idEntidadBancaria;
    }
    
    
    
   public EntidadBancaria(int idEntidadBancaria ,String codigoEntidad,String nombre,String cif , TipoEntidadBancaria tipoEntidadBancaria){
        
       this.cif=cif;
       this.codigoEntidad=codigoEntidad;
       this.idEntidadBancaria=idEntidadBancaria;
       this.nombre=nombre;
       this.tipoEntidadBancaria= tipoEntidadBancaria;
    }
    public List<SucursalBancaria> getSurcursales() {
        return Surcursales;
    }

    public void setSurcursales(List<SucursalBancaria> Surcursales) {
        this.Surcursales = Surcursales;
    }
    

   

    public String getCodigoEntidad() {
        return codigoEntidad;
    }

    public void setCodigoEntidad(String codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public TipoEntidadBancaria getTipoEntidadBancaria() {
        return tipoEntidadBancaria;
    }

    public void setTEB(TipoEntidadBancaria tipoEntidadBancaria) {
        this.tipoEntidadBancaria = tipoEntidadBancaria;
    }
    
    
}
