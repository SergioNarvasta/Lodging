
package CONTROL;

import MODELO.Huesped;
import MODELO.habitacion;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class arreglo_habitacion {
     habitacion[] arreglohab=new habitacion[7];
     
     int i;
   
   public int Buscar_habitnume(String dato){
       int numero=Integer.parseInt(dato);
       for (int Pos = 0; Pos < i; Pos++) {
            if(arreglohab[Pos].getNumero()== numero){
                return Pos;
            }
        }
        return -1;   }  
   
     public void agregar(Object[] dato){  
    if(i<arreglohab.length){
        try {
            if(validar_habitacionnumero(dato[0].toString())==true){
                if (Buscar_habitnume(dato[0].toString())==-1) {
                     arreglohab[i]=new habitacion(dato);
                i++;
                JOptionPane.showMessageDialog(null,"Guardado con exito");    
                }else{JOptionPane.showMessageDialog(null,"Habitacion ya registrada");}    
                }else{JOptionPane.showMessageDialog(null,"Ingrese un valor valido");}
        } catch (Exception e) {
      }       
    }else{JOptionPane.showMessageDialog(null, "habitacion completada ");}        
    }
     
    public void listartodo(JTable control){
        
    String[] cabecera={"Numero","Precio","Estado"};
     DefaultTableModel modtabel=new DefaultTableModel(cabecera, 0);
    
        control.setModel(modtabel);
        for (int pos = 0; pos <i; pos++) {
          modtabel.addRow(arreglohab[pos].gettregistro());
        }    
    }
    
    public boolean validar_habitacionnumero(String dato){
    if(Integer.parseInt(dato)>0){
        return true;       
        }
          return false;
    }
    public int buscar_habitnume(String dato){
        int daato =Integer.parseInt(dato);
        for (int x = 0; x < i; x++) {
            if (daato==arreglohab[x].getNumero()) {
                return x;
            }
        }
        return -1;   }
    public habitacion getelemento(int pos){
    return arreglohab[pos];
    }
    
  
    public void filtro_habitanumero(JComboBox control,String cadena ){  
        DefaultComboBoxModel modcombox=new DefaultComboBoxModel();  
        control.setModel(modcombox);
        for (int pos = 0; pos < i; pos++) {  
            if (arreglohab[pos].getEstado().contains(cadena)) { 
                modcombox.addElement(arreglohab[pos].getNumero());    
            } 
        }
    }
    
    public void filtro_habita(JTable control,String cadena ){
        String[] cabecera={"numero","precio","estado"};
        DefaultTableModel modtabel=new DefaultTableModel(cabecera, 0);
        control.setModel(modtabel);
        for (int pos = 0; pos < i; pos++) {
            if (arreglohab[pos].getEstado().contains(cadena)) { 
                modtabel.addRow(arreglohab[pos].gettregistro());  
            } 
        }
    }
    public void modificar_habitacion(int posmodifi,String cadena){
       arreglohab[posmodifi].setEstado(cadena);
    
    }
    public void ordenar_numehabiSELECCION(){
        habitacion Temp;
        int Menor;
        for (int j = 0; j < i-1; j++) {
            Menor = j;
            for (int x = j+1; x < i; x++) {
               int Dato1 = arreglohab[Menor].getNumero();
                int Dato2 = arreglohab[x].getNumero();
                if(Dato1>Dato2){
                    Menor = x;  }
            }
            Temp = arreglohab[j];
            arreglohab[j] = arreglohab[Menor];
            arreglohab[Menor] = Temp;
        }
    }
    
        
    public void OrdenarporBurbuja()
    {
        habitacion Temp;
        for (int j = 0; j < i-1; j++) {
            for (int x = 0; x < i-1; x++) {
                int Dato1= arreglohab[x].getNumero();
                int Dato2= arreglohab[x+1].getNumero();
                if(Dato1 < Dato2){
                    Temp = arreglohab[x];
                    arreglohab[x] = arreglohab[x+1];
                    arreglohab[x+1] = Temp;
                }
            }
        }
    }
   
    
}
