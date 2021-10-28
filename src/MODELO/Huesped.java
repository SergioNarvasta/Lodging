
package MODELO;


public class Huesped {
    
    private String uesped;
    private int numeroHabitacion;
    private String fechaIngreso;
    private String fechasalida;

    public Huesped() {
    }

    public void  setHuesped( Object[] datos) {
        this.uesped = datos[0].toString();
        this.numeroHabitacion =Integer.parseInt(datos[1].toString());
        this.fechaIngreso = datos[2].toString();
        
        this.fechasalida = datos[3].toString();
    }

    public Huesped(Object[] element) {
       
        this.uesped = element[0].toString();
        this.numeroHabitacion =Integer.parseInt(element[1].toString());
        this.fechaIngreso = element[2].toString();
        
        
        
        
        
    }
    
   
   
        
    public Object[] getRegistron(){
    Object[] registr={uesped,numeroHabitacion,fechaIngreso,fechasalida};
  return registr;  
}
   
    
public Object[] getregistro(){
    Object[] registr={uesped,numeroHabitacion,fechaIngreso};
  return registr;  
}
    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }


    public String getUesped() {
        return uesped;
    }

    public void setUesped(String uesped) {
        this.uesped = uesped;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
}
