/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ConexionBD;
import Vista.Usuario.Registar_Usuario;
import Talleres.Eliminar_Mecanico;

import Talleres.Ingresar_Nuevo_Mecanico;

import Talleres.IngresarNuevotaller;
import Talleres.Mostrar_Mecanico;
import Talleres.Mostrar_todos_talleres;

import Vista.Automovil.MostrarAutomoviles;
import Vista.Automovil.ModificarAutomoviles;

import Vista.Automovil.*;
import Vista.Factura.Ingresar_Factura;

import Vista.Repuestos.Ingresar_nuevo_Repuesto;
import Vista.Repuestos.Mostrar_Repuestos;

import Vista.Diagnostico.*;
import Vista.Factura.Detalles_Facctura;
import Vista.Usuario.Mostrar_Usuario;
import java.sql.Connection;

/**
 *
 * @author Jose
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        ProbarConexion();
    }
    
     public  Connection Connecta(){
   ConexionBD Conn=new ConexionBD(); 

    return Conn.getConnection();
}
public Connection Desconectar(){
       Connection conn=null;
        return conn=null;
    }
public void ProbarConexion(){
    Connection conn;
    conn=Connecta();
    conn=Desconectar();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem54 = new javax.swing.JMenuItem();
        bt_Salir = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        BTModificarRut = new javax.swing.JMenuItem();
        BtEliminar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu19 = new javax.swing.JMenu();
        Bt_Ingresar_Vehiculo = new javax.swing.JMenuItem();
        Bt_Mostrar_Todos_Los_Automoviles = new javax.swing.JMenuItem();
        Bt_Modificar___Patente = new javax.swing.JMenuItem();
        Bt_Eliminar_Vehiculo = new javax.swing.JMenuItem();
        jMenu20 = new javax.swing.JMenu();
        Bt_nuevo_Color_Auto = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenu23 = new javax.swing.JMenu();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenu25 = new javax.swing.JMenu();
        Menu_bt_Ingreso_Mecanico = new javax.swing.JMenuItem();
        bt_menu_mostrar_mecanico = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenu26 = new javax.swing.JMenu();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem51 = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        jMenu30 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu29 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jMenuItem55 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenuItem11.setText("jMenuItem11");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem46.setText("jMenuItem46");

        jMenuItem53.setText("jMenuItem53");

        jMenuItem54.setText("jMenuItem54");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt_Salir.setText("Salir De la Aplicación");
        bt_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SalirActionPerformed(evt);
            }
        });
        getContentPane().add(bt_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, -1, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Cliente");

        jMenu16.setText("Cliente");

        jMenuItem3.setText("Registrar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu16.add(jMenuItem3);

        BTModificarRut.setText("Modificar Usuario");
        BTModificarRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTModificarRutActionPerformed(evt);
            }
        });
        jMenu16.add(BTModificarRut);

        BtEliminar.setText("Eliminar");
        BtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEliminarActionPerformed(evt);
            }
        });
        jMenu16.add(BtEliminar);

        jMenu1.add(jMenu16);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Automóviles");

        jMenu19.setText("Automóvil");

        Bt_Ingresar_Vehiculo.setText("Registrar");
        Bt_Ingresar_Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Ingresar_VehiculoActionPerformed(evt);
            }
        });
        jMenu19.add(Bt_Ingresar_Vehiculo);

        Bt_Mostrar_Todos_Los_Automoviles.setText("Mostrar todos");
        Bt_Mostrar_Todos_Los_Automoviles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Mostrar_Todos_Los_AutomovilesActionPerformed(evt);
            }
        });
        jMenu19.add(Bt_Mostrar_Todos_Los_Automoviles);

        Bt_Modificar___Patente.setText("Modificar Automovil");
        Bt_Modificar___Patente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Modificar___PatenteActionPerformed(evt);
            }
        });
        jMenu19.add(Bt_Modificar___Patente);

        Bt_Eliminar_Vehiculo.setText("Eliminar");
        Bt_Eliminar_Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Eliminar_VehiculoActionPerformed(evt);
            }
        });
        jMenu19.add(Bt_Eliminar_Vehiculo);

        jMenu2.add(jMenu19);

        jMenu20.setText("Detalles");

        Bt_nuevo_Color_Auto.setText("Colores Del Vehiculos");
        Bt_nuevo_Color_Auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_nuevo_Color_AutoActionPerformed(evt);
            }
        });
        jMenu20.add(Bt_nuevo_Color_Auto);

        jMenuItem22.setText("Marca Del AutoMovil");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu20.add(jMenuItem22);

        jMenu2.add(jMenu20);

        jMenuBar1.add(jMenu2);

        jMenu9.setText("Talleres");

        jMenu23.setText("Taller");

        jMenuItem32.setText("Registrar");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem32);

        jMenuItem35.setText("Mostrar/Administrar Talleres");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu23.add(jMenuItem35);

        jMenu9.add(jMenu23);

        jMenu25.setText("Mecánicos");

        Menu_bt_Ingreso_Mecanico.setText("Registrar");
        Menu_bt_Ingreso_Mecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_bt_Ingreso_MecanicoActionPerformed(evt);
            }
        });
        jMenu25.add(Menu_bt_Ingreso_Mecanico);

        bt_menu_mostrar_mecanico.setText("Mostrar Todos Los Mecanicos");
        bt_menu_mostrar_mecanico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_menu_mostrar_mecanicoActionPerformed(evt);
            }
        });
        jMenu25.add(bt_menu_mostrar_mecanico);

        jMenuItem41.setText("Eliminar");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenu25.add(jMenuItem41);

        jMenu9.add(jMenu25);

        jMenuBar1.add(jMenu9);

        jMenu11.setText("Repuesto");

        jMenu26.setText("Repuestos");

        jMenuItem42.setText("Registrar");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu26.add(jMenuItem42);

        jMenuItem47.setText("Lista/Administrar");
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem47ActionPerformed(evt);
            }
        });
        jMenu26.add(jMenuItem47);

        jMenu11.add(jMenu26);

        jMenuBar1.add(jMenu11);

        jMenu12.setText("Presupuesto");

        jMenuItem51.setText("Administrador de Diagonstico");
        jMenuItem51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem51ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem51);

        jMenuBar1.add(jMenu12);

        jMenu15.setText("Localizacion");

        jMenu30.setText("Ciudad");

        jMenuItem1.setText("Administrador De Ciudades");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu30.add(jMenuItem1);

        jMenu15.add(jMenu30);

        jMenu29.setText("Comuna");

        jMenuItem5.setText("Administrador De Comuna");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu29.add(jMenuItem5);

        jMenu15.add(jMenu29);

        jMenuBar1.add(jMenu15);

        jMenu13.setText("O/S");

        jMenuItem52.setText("Orden de Servicio");
        jMenuItem52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem52ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem52);

        jMenuItem4.setText("Modificar Orden de Servicios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu13.add(jMenuItem4);

        jMenuBar1.add(jMenu13);

        jMenu14.setText("Facturas");

        jMenuItem55.setText("Ingresar Factura");
        jMenuItem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem55ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem55);

        jMenuItem56.setText("Detalles Factura");
        jMenuItem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem56ActionPerformed(evt);
            }
        });
        jMenu14.add(jMenuItem56);

        jMenuBar1.add(jMenu14);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_Ingresar_VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Ingresar_VehiculoActionPerformed
Ingresar_Automovil A=new Ingresar_Automovil();
A.setVisible(true);
    }//GEN-LAST:event_Bt_Ingresar_VehiculoActionPerformed

    private void Bt_Modificar___PatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Modificar___PatenteActionPerformed
  ModificarAutomoviles M =new ModificarAutomoviles();
  M.setVisible(true);
    }//GEN-LAST:event_Bt_Modificar___PatenteActionPerformed

    private void bt_menu_mostrar_mecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_menu_mostrar_mecanicoActionPerformed
       Mostrar_Mecanico M=new Mostrar_Mecanico();
       M.setVisible(true);
    }//GEN-LAST:event_bt_menu_mostrar_mecanicoActionPerformed

    private void jMenuItem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem47ActionPerformed
       Mostrar_Repuestos M=new Mostrar_Repuestos();
       M.setVisible(true);
    }//GEN-LAST:event_jMenuItem47ActionPerformed

    private void bt_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SalirActionPerformed
    System.exit(0);
    }//GEN-LAST:event_bt_SalirActionPerformed

    private void Bt_nuevo_Color_AutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_nuevo_Color_AutoActionPerformed
Colores_del_Vehiculo C=new Colores_del_Vehiculo();
C.setVisible(true);
    }//GEN-LAST:event_Bt_nuevo_Color_AutoActionPerformed

    private void Bt_Eliminar_VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Eliminar_VehiculoActionPerformed
     Eliminar_Vehiculo R=new Eliminar_Vehiculo();
     R.setVisible(true);
    }//GEN-LAST:event_Bt_Eliminar_VehiculoActionPerformed

    private void Bt_Mostrar_Todos_Los_AutomovilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Mostrar_Todos_Los_AutomovilesActionPerformed
      MostrarAutomoviles M=new MostrarAutomoviles();
      M.setVisible(true);
      
    }//GEN-LAST:event_Bt_Mostrar_Todos_Los_AutomovilesActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
      IngresarNuevotaller n = new IngresarNuevotaller();
      n.setVisible(true);
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
       Mostrar_todos_talleres M=new Mostrar_todos_talleres();
       M.setVisible(true);
               
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
    Eliminar_Mecanico M=new Eliminar_Mecanico();
    M.setVisible(true);
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void BtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEliminarActionPerformed
        Mostrar_Usuario N = new Mostrar_Usuario();
        N.setVisible(true);
    }//GEN-LAST:event_BtEliminarActionPerformed

    private void BTModificarRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTModificarRutActionPerformed
    Mostrar_Usuario N = new Mostrar_Usuario();
    N.setVisible(true);
    }//GEN-LAST:event_BTModificarRutActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Registar_Usuario R=new Registar_Usuario();
        R.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
       Marca_del_Vehiculo M=new Marca_del_Vehiculo();
       M.setVisible(true);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void Menu_bt_Ingreso_MecanicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_bt_Ingreso_MecanicoActionPerformed
        Ingresar_Nuevo_Mecanico M=new Ingresar_Nuevo_Mecanico();
        M.setVisible(true);
    }//GEN-LAST:event_Menu_bt_Ingreso_MecanicoActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
      Ingresar_nuevo_Repuesto M=new Ingresar_nuevo_Repuesto();
      M.setVisible(true);
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem51ActionPerformed
        Ingresar_Diagnostico D = new Ingresar_Diagnostico();
        D.setVisible(true);
    }//GEN-LAST:event_jMenuItem51ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Administrador_Ciudad A=new Administrador_Ciudad();
        A.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Administrador_De_Comuna A =new Administrador_De_Comuna();
        A.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem52ActionPerformed
        Vista.OrdendeServicio.NuevaOrdenDeServicio P= new Vista.OrdendeServicio.NuevaOrdenDeServicio();
        P.setVisible(true);
    }//GEN-LAST:event_jMenuItem52ActionPerformed

    private void jMenuItem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem55ActionPerformed
        Pedir_Orden F=new Pedir_Orden();
        F.setVisible(true);
    }//GEN-LAST:event_jMenuItem55ActionPerformed

    private void jMenuItem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem56ActionPerformed
       Detalles_Facctura D =new Detalles_Facctura();
       D.setVisible(true);
    }//GEN-LAST:event_jMenuItem56ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       Vista.OrdendeServicio.Elimina_Modificar_Orden P=new Vista.OrdendeServicio.Elimina_Modificar_Orden();
       P.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BTModificarRut;
    private javax.swing.JMenuItem BtEliminar;
    private javax.swing.JMenuItem Bt_Eliminar_Vehiculo;
    private javax.swing.JMenuItem Bt_Ingresar_Vehiculo;
    private javax.swing.JMenuItem Bt_Modificar___Patente;
    private javax.swing.JMenuItem Bt_Mostrar_Todos_Los_Automoviles;
    private javax.swing.JMenuItem Bt_nuevo_Color_Auto;
    private javax.swing.JMenuItem Menu_bt_Ingreso_Mecanico;
    private javax.swing.JToggleButton bt_Salir;
    private javax.swing.JMenuItem bt_menu_mostrar_mecanico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu19;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu20;
    private javax.swing.JMenu jMenu23;
    private javax.swing.JMenu jMenu25;
    private javax.swing.JMenu jMenu26;
    private javax.swing.JMenu jMenu29;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu30;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    // End of variables declaration//GEN-END:variables

    private Ingresar_Nuevo_Mecanico Ingresar_Nuevo_Mecanico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
