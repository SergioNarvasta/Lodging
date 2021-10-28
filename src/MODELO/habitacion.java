
package MODELO;

import javax.swing.JOptionPane;

public class habitacion {
    int numero;
    double precio;
    String estado;

    public habitacion() {
    }

    public habitacion(int numero, double precio, String estado) {
        this.numero = numero;
        this.precio = precio;
        this.estado = estado;
    }
    public habitacion(Object[] elemento) {
        this.numero =Integer.parseInt( elemento[0].toString());
        this.precio =Double.parseDouble(elemento[1].toString());
        this.estado = elemento[2].toString(); 
    }
    
    public Object[] gettregistro(){
    Object[] registro= {numero,precio,estado};
    return registro;
    
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
        
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
