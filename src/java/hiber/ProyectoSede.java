package hiber;
// Generated 21-feb-2020 12:01:47 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * ProyectoSede generated by hbm2java
 */
public class ProyectoSede  implements java.io.Serializable {


     private ProyectoSedeId id;
     private Proyecto proyecto;
     private Sede sede;
     private Date FInicio;
     private Date FFin;

    public ProyectoSede() {
    }

	
    public ProyectoSede(ProyectoSedeId id, Proyecto proyecto, Sede sede, Date FInicio) {
        this.id = id;
        this.proyecto = proyecto;
        this.sede = sede;
        this.FInicio = FInicio;
    }
    public ProyectoSede(ProyectoSedeId id, Proyecto proyecto, Sede sede, Date FInicio, Date FFin) {
       this.id = id;
       this.proyecto = proyecto;
       this.sede = sede;
       this.FInicio = FInicio;
       this.FFin = FFin;
    }
   
    public ProyectoSedeId getId() {
        return this.id;
    }
    
    public void setId(ProyectoSedeId id) {
        this.id = id;
    }
    public Proyecto getProyecto() {
        return this.proyecto;
    }
    
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }
    public Sede getSede() {
        return this.sede;
    }
    
    public void setSede(Sede sede) {
        this.sede = sede;
    }
    public Date getFInicio() {
        return this.FInicio;
    }
    
    public void setFInicio(Date FInicio) {
        this.FInicio = FInicio;
    }
    public Date getFFin() {
        return this.FFin;
    }
    
    public void setFFin(Date FFin) {
        this.FFin = FFin;
    }




}


