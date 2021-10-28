
package CONTROL;

import MODELO.Huesped;
import MODELO.habitacion;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

   public class arreglo_Huesped {
    Huesped[] arreglo= new Huesped[99];
    int i;
    
   public void agregar(Object[] elemento){
    if(i<arreglo.length){
      arreglo[i]=new Huesped(elemento);
      i++;
        JOptionPane.showMessageDialog(null, "Guardado con exito");
    }else {
        JOptionPane.showMessageDialog(null, "Habitaciones llenas");}
    }
    public void listarnormal(JTable datos){
    String[] cabecera={"Huesped","NumeroHabitacion","FechaIngreso","Salida"};
        DefaultTableModel modtable=new DefaultTableModel(cabecera, 0);
        
        datos.setModel(modtable);
        for (int pos = 0; pos < i; pos++) {
            modtable.addRow(arreglo[pos].getRegistron());   
        }
    }
    
     public boolean validar_codigo(String dato){
        try {
            if (Integer.parseInt(dato)>0) {    
           return true;}
        } catch (Exception e) {;
        }
   return false;
    }
    public int buscar_habitnume(String dato){
        int dta=Integer.parseInt(dato);
        for (int x = 0; x < i; x++) { 
            if (dta==arreglo[x].getNumeroHabitacion()){
                return x;
            }
        }
        return -1;
    }
    public Huesped getelemento(int pos){
    return arreglo[pos];}
    public int buscar_habitnombre(String dato){   
        for (int x = 0; x < i; x++) { 
            if (dato.equals(arreglo[x].getUesped()) ){
                return x;
            }
        }JOptionPane.showMessageDialog(null,"NO ESTA REGISTRADO EL HUESPED");
        return -1;
    }
    public void eliminar(int poseliminar){
        for (int pos =poseliminar; pos < i-1; pos++) {
            arreglo[pos]=arreglo[pos+1];
        }i--;
    }
     public void modificar_huesped(int posmodifi,String cadena){
       arreglo[posmodifi].setFechasalida(cadena);
               
            
    
    }
     public void OrdenarporSeleccion(){
        Huesped Temp;
        int Menor;
        for (int j = 0; j < i-1; j++) {
            Menor = j;
            for (int x = j+1; x < i; x++) {
                String Dato1 = arreglo[Menor].getUesped();
                String Dato2 = arreglo[x].getUesped();
                if(Dato1.compareTo(Dato2) > 0){
                    Menor = x;  }
            }
            Temp = arreglo[j];
            arreglo[j] = arreglo[Menor];
            arreglo[Menor] = Temp;
        }
    }
}
