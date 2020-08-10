package sisne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener { //

    private JMenuBar menu;
    private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
    private JMenuItem miExp, miBasico, miOrdenP, miEjecutivo, miSubFamiliar,
            miTodos, miVerde, miNegro, miMorado, miElCreador, miSalir, miNuevo;
    private JLabel lPlaca, lBienvenido, lPrimaO, lGrado, lAntiguedad,
            lResultado, lFooter, lHijos;
    private JTextField tfHijos;
    private JComboBox comboGrado, comboAntiguedad, comboPrimaO;
    private JScrollPane scpResultado;
    private JTextArea txtResultado;
    String nombreAdministrador = "";
    double basicoGeneral = 6251195;
    int SubsidioFamiliar = 32729;
    int SubsidioAlimentacion = 59342;
    int SegurodeVida = 14961;

    public Principal() {
        setLayout(null);
        setTitle("Pantalla principal");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(0, 145, 0));
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        Bienvenida ventanaBienvenida = new Bienvenida();
        nombreAdministrador = ventanaBienvenida.ardilar;

        menu = new JMenuBar();
        menu.setBackground(new Color(0, 145, 0));
        setJMenuBar(menu);

        menuOpciones = new JMenu("Opciones");
        menuOpciones.setBackground(new Color(0, 145, 0));  //fondo
        menuOpciones.setFont(new Font("Andale Mono", 1, 14));  //fuente
        menuOpciones.setForeground(new Color(255, 255, 255));  //color fuente
        menu.add(menuOpciones);

        menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(0, 145, 0));  //fondo
        menuCalcular.setFont(new Font("Andale Mono", 1, 14));  //fuente
        menuCalcular.setForeground(new Color(255, 255, 255));
        menu.add(menuCalcular);

        menuAcercaDe = new JMenu("Acerca De");
        menuAcercaDe.setBackground(new Color(0, 145, 0));  //fondo
        menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));  //fuente
        menuAcercaDe.setForeground(new Color(255, 255, 255));
        menu.add(menuAcercaDe);

        menuColorFondo = new JMenu("Color de Fondo");
        menuColorFondo.setFont(new Font("Andale Mono", 1, 14));  //fuente
        menuColorFondo.setForeground(new Color(0, 145, 0));
        menuOpciones.add(menuColorFondo);

        miBasico = new JMenuItem("Asignacion Basica");
        miBasico.setFont(new Font("Andale Mono", 1, 14));  //fuente
        miBasico.setForeground(new Color(0, 145, 0));
        menuCalcular.add(miBasico);
        miBasico.addActionListener(this);

        miOrdenP = new JMenuItem("Prima Orden Publico");
        miOrdenP.setFont(new Font("Andale Mono", 1, 14));  //fuente
        miOrdenP.setForeground(new Color(0, 145, 0));
        menuCalcular.add(miOrdenP);
        miOrdenP.addActionListener(this);

        miEjecutivo = new JMenuItem("Prima Nivel Ejecutivo");
        miEjecutivo.setFont(new Font("Andale Mono", 1, 14));  //fuente
        miEjecutivo.setForeground(new Color(0, 145, 0));
        menuCalcular.add(miEjecutivo);
        miEjecutivo.addActionListener(this);

        miSubFamiliar = new JMenuItem("Subsidio Familiar");
        miSubFamiliar.setFont(new Font("Andale Mono", 1, 14));  //fuente
        miSubFamiliar.setForeground(new Color(0, 145, 0));
        menuCalcular.add(miSubFamiliar);
        miSubFamiliar.addActionListener(this);

        miExp = new JMenuItem("Retorno Experiencia");
        miExp.setFont(new Font("Andale Mono", 1, 14));  //fuente
        miExp.setForeground(new Color(0, 145, 0));
        menuCalcular.add(miExp);
        miExp.addActionListener(this);

        miTodos = new JMenuItem("Todos");
        miTodos.setFont(new Font("Andale Mono", 1, 14));  //fuente
        miTodos.setForeground(new Color(0, 145, 0));
        menuCalcular.add(miTodos);
        miTodos.addActionListener(this);

        miVerde = new JMenuItem("Verde");
        miVerde.setFont(new Font("Andale Mono", 1, 14));  //fuente
        miVerde.setForeground(new Color(0, 145, 0));
        menuColorFondo.add(miVerde);
        miVerde.addActionListener(this);

        miNegro = new JMenuItem("Negro");
        miNegro.setFont(new Font("Andale Mono", 1, 14));  //fuente
        miNegro.setForeground(new Color(0, 145, 0));
        menuColorFondo.add(miNegro);
        miNegro.addActionListener(this);

        miMorado = new JMenuItem("Morado");
        miMorado.setFont(new Font("Andale Mono", 1, 14));  //fuente
        miMorado.setForeground(new Color(0, 145, 0));
        menuColorFondo.add(miMorado);
        miMorado.addActionListener(this);

        miNuevo = new JMenuItem("Nuevo");
        miNuevo.setFont(new Font("Andale Mono", 1, 14));  //fuente
        miNuevo.setForeground(new Color(0, 145, 0));
        menuOpciones.add(miNuevo);
        miNuevo.addActionListener(this);

        miElCreador = new JMenuItem("El creador");
        miElCreador.setFont(new Font("Andale Mono", 1, 14));  //fuente
        miElCreador.setForeground(new Color(0, 145, 0));
        menuAcercaDe.add(miElCreador);
        miElCreador.addActionListener(this);

        miSalir = new JMenuItem("Salir");
        miSalir.setFont(new Font("Andale Mono", 1, 14));  //fuente
        miSalir.setForeground(new Color(0, 145, 0));
        menuOpciones.add(miSalir);
        miSalir.addActionListener(this);

        ImageIcon iplaca = new ImageIcon("images/placa.png");
        lPlaca = new JLabel(iplaca);
        lPlaca.setBounds(30, 35, 250, 300);
        add(lPlaca);

        lBienvenido = new JLabel("Bienvenido " + nombreAdministrador);
        lBienvenido.setBounds(100, 10, 350, 50);
        lBienvenido.setFont(new Font("Andale Mono", 1, 32));
        lBienvenido.setForeground(new Color(255, 255, 255));
        add(lBienvenido);

        lGrado = new JLabel("Selecciona el Grado");
        lGrado.setBounds(300, 60, 180, 25);
        lGrado.setFont(new Font("Andale Mono", 1, 12));
        lGrado.setForeground(new Color(255, 255, 255));
        add(lGrado);

        comboGrado = new JComboBox();
        comboGrado.setBounds(300, 90, 220, 25);
        comboGrado.setBackground(new java.awt.Color(224, 224, 224)); //fondo
        comboGrado.setFont(new java.awt.Font("Andale Mono", 0, 14)); //fuente
        comboGrado.setForeground(new java.awt.Color(40, 40, 40)); //color fuente
        add(comboGrado);
        comboGrado.addItem("Seleccione");
        comboGrado.addItem("Patrullero");
        comboGrado.addItem("Subintendente");
        comboGrado.addItem("Intendente");
        comboGrado.addItem("Intendente Jefe");
        comboGrado.addItem("Subcomisario");
        comboGrado.addItem("Comisario");

        lAntiguedad = new JLabel("Selecciona la Antiguedad");
        lAntiguedad.setBounds(300, 120, 180, 25);
        lAntiguedad.setFont(new Font("Andale Mono", 1, 12));
        lAntiguedad.setForeground(new Color(255, 255, 255));
        add(lAntiguedad);

        comboAntiguedad = new JComboBox();
        comboAntiguedad.setBounds(300, 150, 220, 25);
        comboAntiguedad.setBackground(new java.awt.Color(224, 224, 224)); //fondo
        comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 0, 14)); //fuente
        comboAntiguedad.setForeground(new java.awt.Color(40, 40, 40)); //color fuente
        add(comboAntiguedad);
        comboAntiguedad.addItem("Seleccione");
        comboAntiguedad.addItem("1 annio en el grado");
        comboAntiguedad.addItem("2 annio en el grado");
        comboAntiguedad.addItem("3 annio en el grado");
        comboAntiguedad.addItem("4 annio en el grado");
        comboAntiguedad.addItem("5 annio en el grado");
        comboAntiguedad.addItem("6 annio en el grado");
        comboAntiguedad.addItem("7 annio en el grado");
        comboAntiguedad.addItem("8 annio en el grado");
        comboAntiguedad.addItem("9 annio en el grado");
        comboAntiguedad.addItem("10 annio en el grado");
        comboAntiguedad.addItem("11 annio en el grado");
        comboAntiguedad.addItem("12 annio en el grado");
        comboAntiguedad.addItem("13 annio en el grado");
        comboAntiguedad.addItem("14 annio en el grado");
        comboAntiguedad.addItem("15 annio en el grado");
        comboAntiguedad.addItem("16 annio en el grado");
        comboAntiguedad.addItem("17 annio en el grado");
        comboAntiguedad.addItem("18 annio en el grado");
        comboAntiguedad.addItem("19 annio en el grado");
        comboAntiguedad.addItem("20 annio en el grado");
        comboAntiguedad.addItem("21 annio en el grado");
        comboAntiguedad.addItem("22 annio en el grado");
        comboAntiguedad.addItem("23 annio en el grado");
        comboAntiguedad.addItem("24 annio en el grado");
        comboAntiguedad.addItem("25 annio en el grado");

        lPrimaO = new JLabel("Recibe prima de orden publico?");
        lPrimaO.setBounds(300, 180, 250, 25);
        lPrimaO.setFont(new Font("Andale Mono", 1, 12));
        lPrimaO.setForeground(new Color(255, 255, 255));
        add(lPrimaO);

        comboPrimaO = new JComboBox();
        comboPrimaO.setBounds(300, 210, 220, 25);
        comboPrimaO.setBackground(new java.awt.Color(224, 224, 224)); //fondo
        comboPrimaO.setFont(new java.awt.Font("Andale Mono", 0, 14)); //fuente
        comboPrimaO.setForeground(new java.awt.Color(40, 40, 40)); //color fuente
        add(comboPrimaO);
        comboPrimaO.addItem("NO");
        comboPrimaO.addItem("SI");

        lHijos = new JLabel("Personas subsidio familiar");
        lHijos.setBounds(300, 240, 250, 25);
        lHijos.setFont(new Font("Andale Mono", 1, 12));
        lHijos.setForeground(new Color(255, 255, 255));
        add(lHijos);

        tfHijos = new JTextField("0");
        tfHijos.setBounds(300, 270, 220, 25);
        tfHijos.setBackground(new Color(224, 224, 224)); // color de fondo gris
        tfHijos.setFont(new Font("Andale Mono", 0, 14)); // fuente de la caja de texto
        tfHijos.setForeground(new Color(40, 40, 40)); // color de la fuente
        add(tfHijos);
        soloNumeros(tfHijos);//keyTyped

        lResultado = new JLabel("Resultado del calculo");
        lResultado.setBounds(200, 320, 180, 25);
        lResultado.setFont(new Font("Andale Mono", 1, 12));
        lResultado.setForeground(new Color(255, 255, 255));
        add(lResultado);

        txtResultado = new JTextArea();
        txtResultado.setEditable(false); // para no editar o alterar el contenido del textarea
        txtResultado.setBackground(new Color(224, 224, 224)); //fondo    
        txtResultado.setFont(new Font("Andale Mono", 1, 11));
        txtResultado.setForeground(new Color(40, 40, 40));
        txtResultado.setText("\n  Aqui aparece el resultado del calculo.");
        scpResultado = new JScrollPane(txtResultado);
        scpResultado.setBounds(50, 345, 500, 200);
        add(scpResultado);

        lFooter = new JLabel("@ 2019 Policia Nacional de Colombia | Todos los derechos reservados");
        lFooter.setBounds(62, 555, 500, 30);
        lFooter.setFont(new Font("Andale Mono", 1, 12));
        lFooter.setForeground(new Color(255, 255, 255));
        add(lFooter);

    }

    private void soloNumeros(JTextField var) {
        var.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isLetter(c)) {
                    getToolkit().beep();
                    e.consume();
                }
            }
        });
    }

    public double basicoPatrullero() {
        double basicoPatrullero = basicoGeneral * 0.253733;
        basicoPatrullero = Math.round(basicoPatrullero * 100) / 100D;
        return basicoPatrullero;
    }

    public double basicoSubintendente() {
        double basicoSubintendente = basicoGeneral * 0.318202;
        basicoSubintendente = Math.round(basicoSubintendente * 100) / 100D;
        return basicoSubintendente;
    }

    public double basicoIntendente() {
        double basicoIntendente = basicoGeneral * 0.405007;
        basicoIntendente = Math.round(basicoIntendente * 100) / 100D;
        return basicoIntendente;
    }

    public double basicoIntendenteJefe() {
        double basicoIntendenteJefe = basicoGeneral * 0.426660;
        basicoIntendenteJefe = Math.round(basicoIntendenteJefe * 100) / 100D;
        return basicoIntendenteJefe;
    }

    public double basicoSubcomisario() {
        double basicoSubcomisario = basicoGeneral * 0.448164;
        basicoSubcomisario = Math.round(basicoSubcomisario * 100) / 100D;
        return basicoSubcomisario;
    }

    public double basicoComisario() {
        double basicoComisario = basicoGeneral * 0.527816;
        basicoComisario = Math.round(basicoComisario * 100) / 100D;
        return basicoComisario;
    }

    public String sueldoBasico() {
        String Grado = comboGrado.getSelectedItem().toString();
        String basico = "";
        if (Grado.equals("Seleccione")) {

            JOptionPane.showMessageDialog(null, "Debes de llenar el campo del Grado.");

        } else {

            if (Grado.equals("Patrullero")) {
                basico = "\n  Asignacion Basica........$ " + basicoPatrullero();
            }
            if (Grado.equals("Subintendente")) {
                basico = "\n  Asignacion Basica........$ " + basicoSubintendente();
            }
            if (Grado.equals("Intendente")) {
                basico = "\n  Asignacion Basica........$ " + basicoIntendente();
            }
            if (Grado.equals("Intendente Jefe")) {
                basico = "\n  Asignacion Basica........$ " + basicoIntendenteJefe();
            }
            if (Grado.equals("Subcomisario")) {
                basico = "\n  Asignacion Basica........$ " + basicoSubcomisario();
            }
            if (Grado.equals("Comisario")) {
                basico = "\n  Asignacion Basica........$ " + basicoComisario();
            }
        }
        return basico;
    }

    public String primaDeOrdenPublico() {
        String Grado = comboGrado.getSelectedItem().toString();
        String OrdenPublico = comboPrimaO.getSelectedItem().toString();
        String ordenPublico = "";

        if (Grado.equals("Seleccione")) {

            JOptionPane.showMessageDialog(null, "Debes de llenar el campo del Grado.");

        } else {

            if (Grado.equals("Patrullero")) {

                if (OrdenPublico.equals("SI")) {
                    double Resultado = Math.round((basicoPatrullero() * 0.15) * 100) / 100D;
                    ordenPublico = "\n  Prima de Orden Publico.........$ " + Resultado;
                }
                if (OrdenPublico.equals("NO")) {
                    ordenPublico = "\n  No Recibe Prima de Orden Publico.";
                }
            }
            if (Grado.equals("Subintendente")) {

                if (OrdenPublico.equals("SI")) {
                    double Resultado = Math.round((basicoSubintendente() * 0.15) * 100) / 100D;
                    ordenPublico = "\n  Prima de Orden Publico.........$ " + Resultado;
                }
                if (OrdenPublico.equals("NO")) {
                    ordenPublico = "\n  No Recibe Prima de Orden Publico.";
                }
            }
            if (Grado.equals("Intendente")) {

                if (OrdenPublico.equals("SI")) {
                    double Resultado = Math.round((basicoIntendente() * 0.15) * 100) / 100D;
                    ordenPublico = "\n  Prima de Orden Publico.........$ " + Resultado;
                }
                if (OrdenPublico.equals("NO")) {
                    ordenPublico = "\n  No Recibe Prima de Orden Publico.";
                }
            }
            if (Grado.equals("Intendente Jefe")) {

                if (OrdenPublico.equals("SI")) {
                    double Resultado = Math.round((basicoIntendenteJefe() * 0.15) * 100) / 100D;
                    ordenPublico = "\n  Prima de Orden Publico.........$ " + Resultado;
                }
                if (OrdenPublico.equals("NO")) {
                    ordenPublico = "\n  No Recibe Prima de Orden Publico.";
                }
            }
            if (Grado.equals("Subcomisario")) {

                if (OrdenPublico.equals("SI")) {
                    double Resultado = Math.round((basicoSubcomisario() * 0.15) * 100) / 100D;
                    ordenPublico = "\n  Prima de Orden Publico.........$ " + Resultado;
                }
                if (OrdenPublico.equals("NO")) {
                    ordenPublico = "\n  No Recibe Prima de Orden Publico.";
                }
            }
            if (Grado.equals("Comisario")) {

                if (OrdenPublico.equals("SI")) {
                    double Resultado = Math.round((basicoComisario() * 0.15) * 100) / 100D;
                    ordenPublico = "\n  Prima de Orden Publico.........$ " + Resultado;
                }
                if (OrdenPublico.equals("NO")) {
                    ordenPublico = "\n  No Recibe Prima de Orden Publico.";
                }
            }
        }
        return ordenPublico;
    }

    public String primaNivelEjecutivo() {
        String Grado = comboGrado.getSelectedItem().toString();
        String nivelEjecutivo = "";

        if (Grado.equals("Seleccione")) {

            JOptionPane.showMessageDialog(null, "Debes de llenar el campo del Grado.");

        } else {

            if (Grado.equals("Patrullero")) {

                double Resultado = Math.round((basicoPatrullero() * 0.2) * 100) / 100D;
                nivelEjecutivo = "\n  Prima de Nivel Ejecutivo.........$ " + Resultado;
            }
            if (Grado.equals("Subintendente")) {

                double Resultado = Math.round((basicoSubintendente() * 0.2) * 100) / 100D;
                nivelEjecutivo = "\n  Prima de Nivel Ejecutivo.........$ " + Resultado;
            }
            if (Grado.equals("Intendente")) {

                double Resultado = Math.round((basicoIntendente() * 0.2) * 100) / 100D;
                nivelEjecutivo = "\n  Prima de Nivel Ejecutivo.........$ " + Resultado;
            }
            if (Grado.equals("Intendente Jefe")) {

                double Resultado = Math.round((basicoIntendenteJefe() * 0.2) * 100) / 100D;
                nivelEjecutivo = "\n  Prima de Nivel Ejecutivo.........$ " + Resultado;
            }
            if (Grado.equals("Subcomisario")) {

                double Resultado = Math.round((basicoSubcomisario() * 0.2) * 100) / 100D;
                nivelEjecutivo = "\n  Prima de Nivel Ejecutivo.........$ " + Resultado;
            }
            if (Grado.equals("Comisario")) {

                double Resultado = Math.round((basicoComisario() * 0.2) * 100) / 100D;
                nivelEjecutivo = "\n  Prima de Nivel Ejecutivo.........$ " + Resultado;
            }
        }
        return nivelEjecutivo;
    }

    public String subsidioFamiliar() {
        String Grado = comboGrado.getSelectedItem().toString();
        String familiar = "";

        if (Grado.equals("Seleccione")) {
            JOptionPane.showMessageDialog(null, "Debes de llenar el campo del Grado e ingresar la cantidad en subsidio familiar.");
        } else {
            int Hijos = Integer.parseInt(tfHijos.getText());
            double Resultado = Hijos * SubsidioFamiliar;

            familiar = "\n  Subsidio Familiar........$ " + Resultado;
        }
        return familiar;
    }

    public String retornoALaExperiencia() {
        String Grado = comboGrado.getSelectedItem().toString();
        String Antiguedad = comboAntiguedad.getSelectedItem().toString();
        String experiencia = "";

        if (Grado.equals("Seleccione") || Antiguedad.equals("Seleccione")) {

            JOptionPane.showMessageDialog(null, "Debes de llenar los campos de grado y antiguedad.");

        } else {

            if (Grado.equals("Patrullero")) {

                if (Antiguedad.equals("1 annio en el grado") || Antiguedad.equals("2 annio en el grado")
                        || Antiguedad.equals("3 annio en el grado") || Antiguedad.equals("4 annio en el grado")) {
                    experiencia = "\n  No Tiene Prima de Retorno a la Experiencia.";
                }
                if (Antiguedad.equals("5 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.05) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("6 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.06) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("7 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.07) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("8 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.08) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("9 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.09) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("10 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.1) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("11 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.11) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("12 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.12) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("13 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.13) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("14 annioo en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.14) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("15 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.15) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("16 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.16) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("17 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.17) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("18 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.18) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("19 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.19) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("20 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.2) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("21 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.21) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("22 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.22) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("23 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.23) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("24 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.24) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("25 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoPatrullero() * 0.25) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }

            }

            if (Grado.equals("Subintendente")) {

                if (Antiguedad.equals("1 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubintendente() * 0.01) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("2 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubintendente() * 0.02) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("3 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubintendente() * 0.03) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("4 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubintendente() * 0.04) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("5 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubintendente() * 0.05) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("6 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubintendente() * 0.06) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("7 annio en el grado") || Antiguedad.equals("8 annio en el grado")
                        || Antiguedad.equals("9 annio en el grado") || Antiguedad.equals("10 annio en el grado")
                        || Antiguedad.equals("11 annio en el grado") || Antiguedad.equals("12 annio en el grado")
                        || Antiguedad.equals("13 annio en el grado") || Antiguedad.equals("14 annio en el grado")
                        || Antiguedad.equals("15 annio en el grado") || Antiguedad.equals("16 annio en el grado")
                        || Antiguedad.equals("17 annio en el grado") || Antiguedad.equals("18 annio en el grado")
                        || Antiguedad.equals("19 annio en el grado") || Antiguedad.equals("20 annio en el grado")
                        || Antiguedad.equals("21 annio en el grado") || Antiguedad.equals("22 annio en el grado")
                        || Antiguedad.equals("23 annio en el grado") || Antiguedad.equals("24 annio en el grado")
                        || Antiguedad.equals("25 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubintendente() * 0.07) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }

            }

            if (Grado.equals("Intendente")) {

                if (Antiguedad.equals("1 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoIntendente() * 0.01) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("2 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoIntendente() * 0.02) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("3 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoIntendente() * 0.03) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("4 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoIntendente() * 0.04) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("5 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoIntendente() * 0.05) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("6 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoIntendente() * 0.06) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("7 annio en el grado") || Antiguedad.equals("8 annio en el grado")
                        || Antiguedad.equals("9 annio en el grado") || Antiguedad.equals("10 annio en el grado")
                        || Antiguedad.equals("11 annio en el grado") || Antiguedad.equals("12 annio en el grado")
                        || Antiguedad.equals("13 annio en el grado") || Antiguedad.equals("14 annio en el grado")
                        || Antiguedad.equals("15 annio en el grado") || Antiguedad.equals("16 annio en el grado")
                        || Antiguedad.equals("17 annio en el grado") || Antiguedad.equals("18 annio en el grado")
                        || Antiguedad.equals("19 annio en el grado") || Antiguedad.equals("20 annio en el grado")
                        || Antiguedad.equals("21 annio en el grado") || Antiguedad.equals("22 annio en el grado")
                        || Antiguedad.equals("23 annio en el grado") || Antiguedad.equals("24 annio en el grado")
                        || Antiguedad.equals("25 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoIntendente() * 0.07) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }

            }

            if (Grado.equals("Intendente Jefe")) {

                double RetornoExperiencia = Math.round((basicoIntendenteJefe() * 0.07) * 100) / 100D;
                experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
            }

            if (Grado.equals("Subcomisario")) {

                if (Antiguedad.equals("1 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.005) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("2 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.01) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("3 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.015) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("4 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.02) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("5 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.025) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("6 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.03) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("7 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.035) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("8 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.04) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("9 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.045) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("10 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.05) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("11 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.055) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("12 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.06) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("13 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.065) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("14 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.07) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("15 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.075) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("16 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.08) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("17 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.085) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("18 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.09) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("19 annio en el grado") || Antiguedad.equals("20 annio en el grado")
                        || Antiguedad.equals("21 annio en el grado") || Antiguedad.equals("22 annio en el grado")
                        || Antiguedad.equals("23 annio en el grado") || Antiguedad.equals("24 annio en el grado")
                        || Antiguedad.equals("25 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoSubcomisario() * 0.095) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }

            }

            if (Grado.equals("Comisario")) {

                if (Antiguedad.equals("1 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.005) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("2 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.01) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("3 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.015) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("4 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.02) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("5 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.025) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("6 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.03) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("7 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.035) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("8 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.04) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("9 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.045) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("10 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.05) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                    txtResultado.setText("\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia);
                }
                if (Antiguedad.equals("11 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.055) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("12 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.06) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("13 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.065) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("14 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.07) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("15 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.075) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("16 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.08) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("17 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.085) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("18 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.09) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("19 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.095) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("20 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.1) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("21 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.105) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("22 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.11) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("23 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.115) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("24 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.12) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
                if (Antiguedad.equals("25 annio en el grado")) {
                    double RetornoExperiencia = Math.round((basicoComisario() * 0.12) * 100) / 100D;
                    experiencia = "\n  Prima de Retorno a la Experiencia....$ " + RetornoExperiencia;
                }
            }
        }
        return experiencia;
    }

    public void desprendibleCompleto() {
        txtResultado.setText("\n    El Total Devengado sin contar los descuentos legales es de:"
                + "\n" + "  *" + sueldoBasico() + "\n" + "  *" + primaDeOrdenPublico()
                + "\n" + "  *" + primaNivelEjecutivo() + "\n" + "  *" + subsidioFamiliar()
                + "\n" + "  *" + retornoALaExperiencia());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == miBasico) {
            txtResultado.setText(sueldoBasico());
        }

        if (e.getSource() == miOrdenP) {
            txtResultado.setText(primaDeOrdenPublico());
        }

        if (e.getSource() == miEjecutivo) {
            txtResultado.setText(primaNivelEjecutivo());
        }

        if (e.getSource() == miSubFamiliar) {
            txtResultado.setText(subsidioFamiliar());
        }

        if (e.getSource() == miExp) {
            txtResultado.setText(retornoALaExperiencia());
        }

        if (e.getSource() == miTodos) {
            desprendibleCompleto();
        }

        if (e.getSource() == miVerde) {
            getContentPane().setBackground(new Color(0, 145, 0));
            menu.setBackground(new Color(0, 145, 0));
        }

        if (e.getSource() == miNegro) {
            getContentPane().setBackground(new Color(0, 0, 0));
            menu.setBackground(new Color(0, 0, 0));
        }

        if (e.getSource() == miMorado) {
            getContentPane().setBackground(new Color(51, 0, 51));
            menu.setBackground(new Color(51, 0, 51));
        }

        if (e.getSource() == miNuevo) {
            tfHijos.setText("0");
            comboGrado.setSelectedIndex(0);
            comboAntiguedad.setSelectedIndex(0);
            comboPrimaO.setSelectedIndex(0);
            txtResultado.setText("\n  Aqui aparece el resultado del calculo.");
        }

        if (e.getSource() == miSalir) {
            Bienvenida ventanabienvenida = new Bienvenida();
            ventanabienvenida.setBounds(0, 0, 350, 450);
            ventanabienvenida.setVisible(true);
            ventanabienvenida.setResizable(false);
            ventanabienvenida.setLocationRelativeTo(null);
            this.setVisible(false);
        }

        if (e.getSource() == miElCreador) {
            JOptionPane.showMessageDialog(null, "Desarrollado por Jorge Alexander Ardila Restrepo");
        }
    }

    public static void main(String args[]) {
        Principal ventanaprincipal = new Principal();
        ventanaprincipal.setBounds(0, 0, 610, 670);
        ventanaprincipal.setVisible(true);
        ventanaprincipal.setResizable(false);
        ventanaprincipal.setLocationRelativeTo(null);
    }
}