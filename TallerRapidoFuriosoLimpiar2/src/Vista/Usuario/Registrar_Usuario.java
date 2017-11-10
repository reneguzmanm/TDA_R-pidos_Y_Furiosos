package Vista.Usuario;

import Modelo.ConexionBD;
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Registrar_Usuario extends javax.swing.JFrame {
    public Registrar_Usuario() {
        initComponents();
        
           PreparedStatement ps = null;
    ResultSet rs = null;
    
    ConexionBD conn = new ConexionBD();
    
    Connection con = conn.getConnection();
    
    try 
    {
        String sql = "SELECT * FROM region";
        ps = (PreparedStatement) con.prepareStatement(sql);
        rs = ps.executeQuery();
        
        comboRegion.addItem("Seleccione Region");
        
        while (rs.next()) 
        {
            comboRegion.addItem(rs.getString("nombre_region"));
            
            
        }
    
    }
    catch(SQLException e)
    {
        System.err.println(e.toString());
    
    }
        
        
        
        
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboCiudad = new javax.swing.JComboBox<>();
        txt_Direccion = new javax.swing.JTextField();
        btn_Salir = new javax.swing.JToggleButton();
        comboRegion = new javax.swing.JComboBox<>();
        comboComuna = new javax.swing.JComboBox<>();
        btn_Limpiar = new javax.swing.JButton();
        btn_Registrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_RutCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Apellido_Paterno = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_Apellido_Materno = new javax.swing.JTextField();
        txt_Digito = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel6.setText("Dirección:");

        jLabel10.setText("Cuidad");

        jLabel7.setText("Rut Cliente:");

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
            }
        });

        comboRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRegionActionPerformed(evt);
            }
        });

        btn_Limpiar.setText("Limpiar Formulario");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        btn_Registrar.setText("Registar Usuario");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        jLabel8.setText("Telefono:");

        txt_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefonoActionPerformed(evt);
            }
        });
        txt_Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_TelefonoKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Ingresar nuevo Usuario");

        txt_RutCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RutClienteActionPerformed(evt);
            }
        });
        txt_RutCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_RutClienteKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido Paterno:");

        jLabel5.setText("Apellido Materno:");

        txt_Apellido_Paterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Apellido_PaternoKeyTyped(evt);
            }
        });

        txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NombreKeyTyped(evt);
            }
        });

        jLabel4.setText("Comuna:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("-");

        txt_Apellido_Materno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Apellido_MaternoActionPerformed(evt);
            }
        });
        txt_Apellido_Materno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_Apellido_MaternoKeyTyped(evt);
            }
        });

        txt_Digito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DigitoKeyTyped(evt);
            }
        });

        jLabel11.setText("Region:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 101, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboComuna, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboRegion, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Apellido_Materno)
                                .addComponent(txt_Apellido_Paterno)
                                .addComponent(txt_Nombre)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txt_RutCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                    .addGap(15, 15, 15)
                                    .addComponent(txt_Digito, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(comboCiudad, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txt_Direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 444, Short.MAX_VALUE)
                    .addComponent(btn_Salir)
                    .addGap(98, 98, 98))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(414, 414, 414)
                    .addComponent(jLabel9)
                    .addGap(133, 133, 133)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_RutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Digito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Apellido_Paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Apellido_Materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(comboRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Registrar)
                    .addComponent(btn_Limpiar))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(btn_Salir)
                    .addGap(119, 119, 119)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(417, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DigitoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DigitoKeyTyped

        // limita la cantidad de caracteres a 1.
        int Limite = 1;
        char c=evt.getKeyChar();

        if (txt_Digito.getText().length()== Limite)
        {
            evt.consume();

        }if

        // permite ingressar solo numeros y las letras k,K.
        ((int)evt.getKeyChar()>=32 && (int)evt.getKeyChar()<=47 ||
            (int)evt.getKeyChar()>=58 && (int)evt.getKeyChar()<=74 ||
            (int)evt.getKeyChar()>=76 && (int)evt.getKeyChar()<=106 ||
            (int)evt.getKeyChar()>=108 && (int)evt.getKeyChar()<=254 )
        {

            evt.consume();

        }

    }//GEN-LAST:event_txt_DigitoKeyTyped

    private void txt_Apellido_MaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Apellido_MaternoKeyTyped
        // valida que se ingresen solo letras
        char c=evt.getKeyChar();
        if(Character.isDigit(c))
        { evt.consume();
        }
    }//GEN-LAST:event_txt_Apellido_MaternoKeyTyped

    private void txt_Apellido_MaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Apellido_MaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Apellido_MaternoActionPerformed

    private void txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombreKeyTyped
        // valida que se ingresen solo letras
        char c=evt.getKeyChar();
        if(Character.isDigit(c))
        { evt.consume();
        }

    }//GEN-LAST:event_txt_NombreKeyTyped

    private void txt_Apellido_PaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Apellido_PaternoKeyTyped
        // valida que se ingresen solo letras

        char c=evt.getKeyChar();
        if(Character.isDigit(c))
        { evt.consume();

        }
    }//GEN-LAST:event_txt_Apellido_PaternoKeyTyped

    private void txt_RutClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_RutClienteKeyTyped
        // Limita la cantidad de caracteres a 8.
        int Limite = 8;
        char c=evt.getKeyChar();

        if (txt_RutCliente.getText().length()== Limite)
        {
            evt.consume();

        }
        // valida que se ingresen solo numeros
        if(Character.isAlphabetic(c))
        { evt.consume();
        }
    }//GEN-LAST:event_txt_RutClienteKeyTyped

    private void txt_RutClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RutClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RutClienteActionPerformed

    private void txt_TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_TelefonoKeyTyped
        // valida que solo se ingresen numeros
        int Limite = 9;
        char c=evt.getKeyChar();
        if (txt_Telefono.getText().length()== Limite)
        {
            evt.consume();

        }
        if(Character.isAlphabetic(c))
        { evt.consume();
        }
        // valida que se ingresen max 9 num.
        if (txt_RutCliente.getText().length()== Limite)
        {
            evt.consume();

        }
    }//GEN-LAST:event_txt_TelefonoKeyTyped

    private void txt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoActionPerformed

    }//GEN-LAST:event_txt_TelefonoActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed

        if (txt_Nombre.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Ingrese Nombre");
        }
        if (txt_Apellido_Paterno.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Ingrese Apellido Paterno");
        }
        if (txt_Apellido_Materno.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Ingrese Apellido Materno");
        }
        if (txt_Direccion.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Ingrese Direccion");
        }
        if (txt_RutCliente.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Ingrese Rut");
        }
        if (txt_Digito.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Ingrese Digito");
        }
        if (txt_Telefono.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Ingrese Telefono");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

    private void comboRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRegionActionPerformed
    
    }//GEN-LAST:event_comboRegionActionPerformed

    public void LimpiarCampos()
    {        
        txt_Apellido_Materno.setText("");
        txt_Apellido_Paterno.setText("");
        txt_Direccion.setText("");
        txt_Nombre.setText("");
        txt_RutCliente.setText(""); 
        txt_Telefono.setText("");
        txt_Digito.setText("");
    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(Registrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JToggleButton btn_Salir;
    private javax.swing.JComboBox<String> comboCiudad;
    private javax.swing.JComboBox<String> comboComuna;
    private javax.swing.JComboBox<String> comboRegion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Apellido_Materno;
    private javax.swing.JTextField txt_Apellido_Paterno;
    private javax.swing.JTextField txt_Digito;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_RutCliente;
    private javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables
}
