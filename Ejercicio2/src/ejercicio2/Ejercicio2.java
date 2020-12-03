
package ejercicio2;

import javax.swing.JOptionPane;


public class Ejercicio2 {

    
    public static void main(String[] args) {
       int num;
       
       do{
       num=Integer.parseInt(JOptionPane.showInputDialog("digite la edad del estudiante 1"));
       num++;
       }while(num>=20);
       num=num-1;
       JOptionPane.showMessageDialog(null,num +"rango"); 
//            switch(num){
//          case 10: {JOptionPane.showMessageDialog(null, "dentro del rango");
//          }
//          case 12: {JOptionPane.showMessageDialog(null, "dentro del rango");
//          }
//          case 13: {JOptionPane.showMessageDialog(null, "dentro del rango");
//          }
//          case 14: {JOptionPane.showMessageDialog(null, "dentro del rango");
//          }
//          case 15: {JOptionPane.showMessageDialog(null, "dentro del rango");
//          }
//          case 16: {JOptionPane.showMessageDialog(null, "dentro del rango");
//          }
//          case 17: {JOptionPane.showMessageDialog(null, "dentro del rango");
//          }
//          case 18: {JOptionPane.showMessageDialog(null, "dentro del rango");
//          }
//          case 19: {JOptionPane.showMessageDialog(null, "dentro del rango");
//          }
//          case 20: {JOptionPane.showMessageDialog(null, "dentro del rango");
//          }
//        }
//    
    }}

