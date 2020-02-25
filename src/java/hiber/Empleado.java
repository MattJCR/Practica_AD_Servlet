package hiber;
// Generated 21-feb-2020 12:01:47 by Hibernate Tools 4.3.1



/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private String dni;
     private Departamento departamento;
     private String nomEmp;
     private EmpleadoDatosProf empleadoDatosProf;

    public Empleado() {
    }

	
    public Empleado(String dni, Departamento departamento, String nomEmp) {
        this.dni = dni;
        this.departamento = departamento;
        this.nomEmp = nomEmp;
    }
    public Empleado(String dni, Departamento departamento, String nomEmp, EmpleadoDatosProf empleadoDatosProf) {
       this.dni = dni;
       this.departamento = departamento;
       this.nomEmp = nomEmp;
       this.empleadoDatosProf = empleadoDatosProf;
    }
   
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public String getNomEmp() {
        return this.nomEmp;
    }
    
    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }
    public EmpleadoDatosProf getEmpleadoDatosProf() {
        return this.empleadoDatosProf;
    }
    
    public void setEmpleadoDatosProf(EmpleadoDatosProf empleadoDatosProf) {
        this.empleadoDatosProf = empleadoDatosProf;
    }




}


