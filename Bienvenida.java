
package sisne;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

  private JTextField tfnombre;
  private JLabel lbandera, ltitulo, lnombre, lderechos, lsiglas;
  private JButton boton1;
  public static String ardilar = ""; //**variable para usar con las otras interfaz

  public Bienvenida(){ // constructor
    setLayout(null);
    setTitle("Bienvenido");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(new Color(0,145,0)); // metodo RGB
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage()); // "images/icon.png" es nombre de carpeta y nombre de archivo con su extensi�n
    
    ImageIcon ibandera = new ImageIcon("images/escudo-bandera.png");
    lbandera = new JLabel(ibandera);
    lbandera.setBounds(25,15,300,150);
    add(lbandera);

    lsiglas = new JLabel("SISNE");
    lsiglas.setBounds(140,180,200,30);
    lsiglas.setFont(new Font("Andale Mono", 1, 18));
    lsiglas.setForeground(new Color(255,255,255));
    add(lsiglas);
    
    ltitulo = new JLabel("Sistema Identificador de Sueldos");
    ltitulo.setBounds(35,205,350,30);
    ltitulo.setFont(new Font("Andale Mono", 1, 16)); // entre comillas el tipo de fuente
    	      						 // despues de la fuente, 0=Normal, 1=Negrita, 2=Cursiva, 3=Negrita y Cursiva
       						         // despues sigue el tamaño de la letra
    ltitulo.setForeground(new Color(255,255,255));  // para darle color a la letra, 255,255,255 da blanco
    add(ltitulo);

    lnombre = new JLabel("Ingrese su nombre");
    lnombre.setBounds(45,240,200,30);
    lnombre.setFont(new Font("Andale Mono", 1, 12));
    lnombre.setForeground(new Color(255,255,255));
    add(lnombre);

    lderechos = new JLabel("@ 2019 Policia Nacional de Colombia");
    lderechos.setBounds(55,375,300,30);
    lderechos.setFont(new Font("Andale Mono", 1, 12));
    lderechos.setForeground(new Color(255,255,255));
    add(lderechos);

    tfnombre = new JTextField();
    tfnombre.setBounds(45,265,255,25);
    tfnombre.setBackground(new Color(224,224,224)); // color de fondo gris
    tfnombre.setFont(new Font("Andale Mono", 0, 14)); // fuente de la caja de texto
    tfnombre.setForeground(new Color(40,40,40)); // color de la fuente
    add(tfnombre);

    boton1 = new JButton("Ingresar");
    boton1.setBounds(125,300,100,30);
    boton1.setBackground(new Color(255,255,255)); 
    boton1.setFont(new Font("Andale Mono", 1, 14)); 
    boton1.setForeground(new Color(40,40,40)); 
    boton1.addActionListener(this);
    add(boton1);
  }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      ardilar = tfnombre.getText().trim(); //**trim borra espacios de mas
      if(ardilar.equals("")){ //**verifica si la variable esta vacia
        JOptionPane.showMessageDialog(null, "Debe ingresar su nombre");//**cuadro de dialogo
      } else{  //**colocamos el metodo main de la interfaz que queremos llamar
        Licencia ventanalicencia = new Licencia();
        ventanalicencia.setBounds(0,0,600,360);
        ventanalicencia.setVisible(true);
        ventanalicencia.setResizable(false);
        ventanalicencia.setLocationRelativeTo(null);
        this.setVisible(false); //**para que esta interfaz no se vea, la de Bienvenida 
      }
    }
  }

  public static void main(String args[]){
    Bienvenida ventanabienvenida = new Bienvenida();
    ventanabienvenida.setBounds(0,0,350,450);
    ventanabienvenida.setVisible(true);
    ventanabienvenida.setResizable(false);
    ventanabienvenida.setLocationRelativeTo(null);
  } 
}