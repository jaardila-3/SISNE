
package sisne;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

  private JCheckBox check1;
  private JLabel lterminos, lleyenda;
  private JButton boton1, boton2;
  private JScrollPane scroll1;
  private JTextArea textarea1;
  String nombre = ""; //**para alojar la variable de la otra interfaz

  public Licencia(){ // constructor
    setLayout(null);
    setTitle("Licencia de uso");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage()); // "images/icon.png" es nombre de carpeta y nombre de archivo con su extensi�n
    
    Bienvenida  ventanaBienvenida = new Bienvenida();//**se crea un objeto de la interfaz donde queremos utilizar la variable
    nombre = ventanaBienvenida.ardilar; //**recuperamos la variable que necesitamos

    lterminos = new JLabel("TERMINOS Y CONDICIONES");
    lterminos.setBounds(215,5,200,30);
    lterminos.setFont(new Font("Andale Mono", 1, 14)); 
    lterminos.setForeground(new Color(0,0,0));
    add(lterminos);

    textarea1 = new JTextArea();
    textarea1.setEditable(false); // para no editar o alterar el contenido del textarea
    textarea1.setFont(new Font("Andale Mono", 0, 9));
    textarea1.setText("\n\n          TERMINOS Y CONDICIONES" +
		"\n\n          A.  PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE JORGE ARDILA." +
		"\n          B.  PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISENO DE LA INTERFAZ." +
		"\n          C.  JORGE ARDILA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
		"\n\n       LA APLICACION ESTA BASADA EN EL DECRETO 1002 DEL 06 DE JUNIO DE 2019, DECRETO 324 DEL 19 DE" +
		"\n       FEBRERO DE 2018 Y EN EL DECRETO 1091 DEL 27 DE JUNIO DE 1995; ADEMAS ESTE SOFTWARE ES UNA" +
		"\n       PRACTICA INDIVIDUAL Y NO CORRESPONDE A UN PROYECTO PROFESIONAL, PATROCINADO O LUCRATIVO."    );
    scroll1 = new JScrollPane(textarea1);
    scroll1.setBounds(10,40,575,145);
    add(scroll1);

    check1 = new JCheckBox("Yo " + nombre + " Acepto");
    check1.setBounds(10,200,200,30);
    check1.addChangeListener(this);
    add(check1);

    boton1 = new JButton("Continuar");
    boton1.setBounds(10,260,120,30);
    boton1.addActionListener(this);
    boton1.setEnabled(false);
    add(boton1);

    boton2 = new JButton("No Acepto");
    boton2.setBounds(140,260,120,30);
    boton2.addActionListener(this);
    boton2.setEnabled(true);
    add(boton2);

    ImageIcon ileyenda = new ImageIcon("images/leyenda.png");
    lleyenda = new JLabel(ileyenda);
    lleyenda.setBounds(280,135,300,250);
    add(lleyenda);

  }

  public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true){
      boton1.setEnabled(true);
      boton2.setEnabled(false);
    } else{
      boton1.setEnabled(false);
      boton2.setEnabled(true);
    }
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){

      Principal ventanaprincipal = new Principal();
      ventanaprincipal.setBounds(0,0,640,640);
      ventanaprincipal.setVisible(true);
      ventanaprincipal.setResizable(false);
      ventanaprincipal.setLocationRelativeTo(null);
      this.setVisible(false);
    } else if(e.getSource() == boton2){

      Bienvenida ventanabienvenida = new Bienvenida();
      ventanabienvenida.setBounds(0,0,350,450);
      ventanabienvenida.setVisible(true);
      ventanabienvenida.setResizable(false);
      ventanabienvenida.setLocationRelativeTo(null);
      this.setVisible(false);
    }
  }

  public static void main(String args[]){
    Licencia ventanalicencia = new Licencia();
    ventanalicencia.setBounds(0,0,600,360);
    ventanalicencia.setVisible(true);
    ventanalicencia.setResizable(false);
    ventanalicencia.setLocationRelativeTo(null);
  } 
}