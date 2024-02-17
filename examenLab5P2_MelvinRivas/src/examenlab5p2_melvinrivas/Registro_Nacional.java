/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examenlab5p2_melvinrivas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author l3306
 */
public class Registro_Nacional extends javax.swing.JFrame {
    /**
     * Creates new form Registro_Nacional
     */
    static ArrayList <Usuarios> user = new ArrayList();
    public Registro_Nacional() {
        initComponents();
        logaparecer();

        DefaultTableModel t = (DefaultTableModel) uno3.getModel();
        for (int i = 0; i < user.size(); i++) {
            if (user.get(i) instanceof Civiles) {
                Object[] k = {user.get(i).nombre, user.get(i).identidad, user.get(i).nacimiento};
                t.addRow(k);
            }
        }
    }
  
   
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Civil = new javax.swing.JPanel();
        tres1 = new javax.swing.JLabel();
        tres2 = new javax.swing.JButton();
        tres3 = new javax.swing.JTabbedPane();
        tres4 = new javax.swing.JPanel();
        tres5 = new javax.swing.JPanel();
        empleado = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        salida = new javax.swing.JButton();
        pagina = new javax.swing.JTabbedPane();
        uno1 = new javax.swing.JPanel();
        uno2 = new javax.swing.JScrollPane();
        uno3 = new javax.swing.JTable();
        uno4 = new javax.swing.JLabel();
        uno5 = new javax.swing.JScrollPane();
        uno6 = new javax.swing.JTable();
        uno7 = new javax.swing.JLabel();
        uno8 = new javax.swing.JPanel();
        log = new javax.swing.JPanel();
        dos1 = new javax.swing.JLabel();
        dos2 = new javax.swing.JLabel();
        textnombre = new javax.swing.JTextField();
        dos3 = new javax.swing.JLabel();
        textcontraseña = new javax.swing.JPasswordField();
        dos4 = new javax.swing.JButton();
        advertencia = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tres1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tres1.setForeground(new java.awt.Color(0, 0, 0));
        tres1.setText("Bienvenido: ");

        tres2.setBackground(new java.awt.Color(0, 0, 0));
        tres2.setForeground(new java.awt.Color(255, 0, 0));
        tres2.setText("Cerrar");
        tres2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tres2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tres4Layout = new javax.swing.GroupLayout(tres4);
        tres4.setLayout(tres4Layout);
        tres4Layout.setHorizontalGroup(
            tres4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        tres4Layout.setVerticalGroup(
            tres4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        tres3.addTab("Informacion personal", tres4);

        javax.swing.GroupLayout tres5Layout = new javax.swing.GroupLayout(tres5);
        tres5.setLayout(tres5Layout);
        tres5Layout.setHorizontalGroup(
            tres5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );
        tres5Layout.setVerticalGroup(
            tres5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        tres3.addTab("Gestion de tramites", tres5);

        javax.swing.GroupLayout CivilLayout = new javax.swing.GroupLayout(Civil);
        Civil.setLayout(CivilLayout);
        CivilLayout.setHorizontalGroup(
            CivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CivilLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tres1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tres2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(CivilLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(tres3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        CivilLayout.setVerticalGroup(
            CivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CivilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tres1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(tres3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        empleado.setPreferredSize(new java.awt.Dimension(507, 266));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Bienvenido: ");

        salida.setBackground(new java.awt.Color(0, 0, 0));
        salida.setForeground(new java.awt.Color(255, 0, 0));
        salida.setText("Cerrar");
        salida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salidaMouseClicked(evt);
            }
        });

        pagina.setPreferredSize(new java.awt.Dimension(507, 266));

        uno1.setPreferredSize(new java.awt.Dimension(507, 266));

        uno3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        uno2.setViewportView(uno3);

        uno4.setText("Informacion de los civiles: ");

        uno6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        uno5.setViewportView(uno6);

        uno7.setText("Tramites:");

        javax.swing.GroupLayout uno1Layout = new javax.swing.GroupLayout(uno1);
        uno1.setLayout(uno1Layout);
        uno1Layout.setHorizontalGroup(
            uno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uno1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(uno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(uno5, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                        .addComponent(uno4)
                        .addComponent(uno2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(uno7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        uno1Layout.setVerticalGroup(
            uno1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uno1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(uno4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uno2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(uno7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(uno5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pagina.addTab("Informacion civiles", uno1);

        javax.swing.GroupLayout uno8Layout = new javax.swing.GroupLayout(uno8);
        uno8.setLayout(uno8Layout);
        uno8Layout.setHorizontalGroup(
            uno8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );
        uno8Layout.setVerticalGroup(
            uno8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );

        pagina.addTab("Modificacion civiles", uno8);

        javax.swing.GroupLayout empleadoLayout = new javax.swing.GroupLayout(empleado);
        empleado.setLayout(empleadoLayout);
        empleadoLayout.setHorizontalGroup(
            empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empleadoLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(empleadoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pagina, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        empleadoLayout.setVerticalGroup(
            empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empleadoLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(empleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salida, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(pagina, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
        );

        dos1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        dos1.setForeground(new java.awt.Color(0, 204, 204));
        dos1.setText("LogIn ");

        dos2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dos2.setForeground(new java.awt.Color(0, 0, 0));
        dos2.setText("Nombre Completo:");

        dos3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        dos3.setForeground(new java.awt.Color(0, 0, 0));
        dos3.setText("Contraseña:");

        dos4.setBackground(new java.awt.Color(0, 204, 204));
        dos4.setForeground(new java.awt.Color(0, 0, 0));
        dos4.setText("Ingresar");
        dos4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dos4MouseClicked(evt);
            }
        });
        dos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dos4ActionPerformed(evt);
            }
        });

        advertencia.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout logLayout = new javax.swing.GroupLayout(log);
        log.setLayout(logLayout);
        logLayout.setHorizontalGroup(
            logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logLayout.createSequentialGroup()
                .addGroup(logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(logLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(advertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dos2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))))
                    .addGroup(logLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(dos4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dos1)
                .addGap(263, 263, 263))
        );
        logLayout.setVerticalGroup(
            logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(dos1)
                .addGap(50, 50, 50)
                .addComponent(dos2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(logLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(dos4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dos3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(textcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(advertencia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(empleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Civil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(empleado, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Civil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dos4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dos4MouseClicked
        if (textnombre.getText().equals("") && textcontraseña.getText().equals("")) {
            advertencia.setText("Los campos no pueden estar vacios");
        }else{
                    String nom = textnombre.getText();
                    
            int contra = Integer.parseInt( textcontraseña.getText());
           
        for (int i = 0; i < user.size(); i++) {
            
            if (nom.contains(user.get(i).getApellido()) || nom.contains(user.get(i).getApellido())) {
                if (user.get(i).getContraseña() == contra) {
                    log.setVisible(false);
                    textcontraseña.setText("");
                    textnombre.setText("");
                    if(user.get(i) instanceof Empleados){
                    empleadoaparecer();
                    }else if (user.get(i) instanceof Civiles) {
                        Civil.setVisible(true);
                    }
                }
            }
        }
        }
    }//GEN-LAST:event_dos4MouseClicked

    private void dos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dos4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dos4ActionPerformed

    private void salidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salidaMouseClicked
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_salidaMouseClicked

    private void tres2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tres2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tres2MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ParseException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro_Nacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Nacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Nacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Nacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Nacional().setVisible(true);
            }
        }
       );
        
           
            
        // Fila 3 silla 3
        while(true){
        System.out.println("Ingrese 9 para crear un nuevo usario: ");
        int  opcrearusuario = input.nextInt();
        
        
        if (opcrearusuario == 9) {
            
            System.out.println("-----Bienvenido al creador de Usuario-----");
            System.out.println("1. Crear");
            System.out.println("2. Salir");
            int opcrearusuario2 = input.nextInt();
            switch (opcrearusuario2) {
                case 1: {
                    
                    System.out.print("Ingrese su nombre: ");
                    String nom = input.nextLine();
                    nom = input.nextLine();
                    
                    System.out.print("Ingrese su apellido: ");
                    String apellido = input.nextLine();
                    
                    System.out.print("Ingrese su contraseña: ");
                    int contra = input.nextInt();
                    
                    System.out.print("Ingrese su fecha de nacimiento dd/MM/yyyy: ");
                    String fecha = input.nextLine();
                    fecha = input.nextLine();
                    SimpleDateFormat fecha2 = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha3 = fecha2.parse(fecha);
                    
                    System.out.print("Ingrese su sexo: ");
                    String sexo = input.nextLine();
                   
                     int opproveniente = 1;
                    String departamento = " ";
                     do{
                    System.out.println("");
                    System.out.println("-----Departamento proveniente-----");
                    System.out.println("1. Fransisco Morazan");
                    System.out.println("2. Cortez");
                    System.out.println("3. Comayaguela");
                    System.out.print("De donde proviene: ");
                    opproveniente = input.nextInt();
                    
                    if (opproveniente == 1) {
                        departamento = "Fransisco";
                    }else if (opproveniente == 2) {
                        departamento = "Cortez";
                    }else if (opproveniente == 3) {
                        departamento = "Comayaguela";
                    }else{
                        System.out.println("-----Caracter Invalido-----");
                    }
                     }while(opproveniente != 1 && opproveniente !=2 && opproveniente !=3 );
                     
                    String identidad1= "";
                     if (departamento.equalsIgnoreCase("Fransisco")) {
                         int dado = random.nextInt(1,28);
                        identidad1 = "01"+dado;
                    }else  if (departamento.equalsIgnoreCase("Cortez")) {
                        int dado = random.nextInt(1,12);
                        identidad1 = "02"+dado;
                    }else  if (departamento.equalsIgnoreCase("Comayaguela")) {
                        int dado = random.nextInt(1,21);
                        identidad1 = "02"+dado;
                    }
                     int identidadint = fecha3.getYear();
                     int identidad3 = random.nextInt(1,9999);
                     
                     String identidad_final = identidad1+identidadint;
                     identidad_final =identidad_final + identidad3;
                     
                     System.out.println("-----Usuario-----");
                    System.out.println("1. Civiles");
                    System.out.println("2. Empleado");
                    int opelector = input.nextInt();
                    if (opelector == 1) {
                        Civiles civil = new Civiles(nom,apellido,contra,
                                fecha3,sexo,departamento,identidad_final);
                        user.add(civil);
                    }else if (opelector == 2) {
                        
                        System.out.print("Ingrese su carrera: ");
                        String carrera = input.nextLine();
                        carrera = input.nextLine();
                        System.out.print("Ingrese su puesto laboral: ");
                        String puesto = input.nextLine();
                        System.out.print("Ingrese sus años junto a la empreza: ");
                        int años = input.nextInt();
                        Empleados empleado = new Empleados(carrera,puesto,años, nom,
                                apellido,contra,fecha3,sexo,departamento,identidad_final);
                        user.add(empleado);
                       
                    }
                    
                    
                    for (int i = 0; i < user.size(); i++) {
                        
                    }
                     
                    break;
                }
                case 2: {
                    System.out.println("Regresando.....");
                    break;
                }          
                default: {
                    System.out.println("-----Caracter Invalido-----");
                    break;
                }
            }
            
            
        }
        }
    }
    
    public void empleadoaparecer() {
        pagina.setVisible(true);
        uno1.setVisible(true);
        uno2.setVisible(true);
        uno3.setVisible(true);
        uno4.setVisible(true);
        uno5.setVisible(true);
        uno6.setVisible(true);
        uno8.setVisible(true);
        dos1.setVisible(false);
        dos2.setVisible(false);
        dos3.setVisible(false);
        dos4.setVisible(false);
        tres1.setVisible(false);
        tres2.setVisible(false);
        tres3.setVisible(false);
        tres4.setVisible(false);
        tres5.setVisible(false);
              textnombre.setVisible(false);
        textcontraseña.setVisible(false);
        salida.setVisible(true);
} 
    public void logaparecer() {
        pagina.setVisible(false);
        uno1.setVisible(false);
        uno2.setVisible(false);
        uno3.setVisible(false);
        uno4.setVisible(false);
        uno5.setVisible(false);
        uno6.setVisible(false);
        uno8.setVisible(false);
        dos1.setVisible(true);
        dos2.setVisible(true);
        dos3.setVisible(true);
        dos4.setVisible(true);
        tres1.setVisible(false);
        tres2.setVisible(false);
        tres3.setVisible(false);
        tres4.setVisible(false);
        tres5.setVisible(false);
        textnombre.setVisible(true);
        textcontraseña.setVisible(true);
        salida.setVisible(false);
} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Civil;
    private javax.swing.JLabel advertencia;
    private javax.swing.JLabel dos1;
    private javax.swing.JLabel dos2;
    private javax.swing.JLabel dos3;
    private javax.swing.JButton dos4;
    private javax.swing.JPanel empleado;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel log;
    private javax.swing.JTabbedPane pagina;
    private javax.swing.JButton salida;
    private javax.swing.JPasswordField textcontraseña;
    private javax.swing.JTextField textnombre;
    private javax.swing.JLabel tres1;
    private javax.swing.JButton tres2;
    private javax.swing.JTabbedPane tres3;
    private javax.swing.JPanel tres4;
    private javax.swing.JPanel tres5;
    private javax.swing.JPanel uno1;
    private javax.swing.JScrollPane uno2;
    private javax.swing.JTable uno3;
    private javax.swing.JLabel uno4;
    private javax.swing.JScrollPane uno5;
    private javax.swing.JTable uno6;
    private javax.swing.JLabel uno7;
    private javax.swing.JPanel uno8;
    // End of variables declaration//GEN-END:variables
}
