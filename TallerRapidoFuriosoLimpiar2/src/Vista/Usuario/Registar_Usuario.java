package Vista.Usuario;
public class Registar_Usuario extends javax.swing.JFrame {
    public Registar_Usuario() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txt_RutCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Apellido_Paterno = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Apellido_Materno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_Direccion = new javax.swing.JTextField();
        btn_Salir = new javax.swing.JToggleButton();
        comboComuna = new javax.swing.JComboBox<>();
        btn_Limpiar = new javax.swing.JButton();
        btn_Registrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Digito = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        comboCiudad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

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

        jLabel6.setText("Dirección:");

        jLabel7.setText("Rut Cliente:");

        btn_Salir.setText("Salir");
        btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirActionPerformed(evt);
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

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("-");

        txt_Digito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DigitoKeyTyped(evt);
            }
        });

        jLabel10.setText("Cuidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Salir)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_Apellido_Materno, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_Apellido_Paterno, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txt_RutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_Digito, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(comboCiudad, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(comboComuna, javax.swing.GroupLayout.Alignment.LEADING, 0, 116, Short.MAX_VALUE)))))))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_Salir)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_RutCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Digito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Apellido_Paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Apellido_Materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(comboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(comboComuna, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Limpiar)
                    .addComponent(btn_Registrar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_RutClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RutClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RutClienteActionPerformed

    private void txt_Apellido_MaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Apellido_MaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Apellido_MaternoActionPerformed

    private void btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_SalirActionPerformed

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

    private void txt_Apellido_MaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Apellido_MaternoKeyTyped
        // valida que se ingresen solo letras
        char c=evt.getKeyChar(); 
            if(Character.isDigit(c)) 
            { evt.consume();        
            } 
    }//GEN-LAST:event_txt_Apellido_MaternoKeyTyped

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
      LimpiarCampos();
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void txt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoActionPerformed
        
    }//GEN-LAST:event_txt_TelefonoActionPerformed

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

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(Registar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registar_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registar_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JToggleButton btn_Salir;
    private javax.swing.JComboBox<String> comboCiudad;
    private javax.swing.JComboBox<String> comboComuna;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField txt_Apellido_Materno;
    private javax.swing.JTextField txt_Apellido_Paterno;
    private javax.swing.JTextField txt_Digito;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_RutCliente;
    private javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables
}
