/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Repuestos;

/**
 *
 * @author Jose
 */
public class Mostrar_Repuestos extends javax.swing.JFrame {

    /**
     * Creates new form Mostrar_Repuestos
     */
    public Mostrar_Repuestos() {
        initComponents();
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_idRepuesto = new javax.swing.JTextField();
        btn_Consultar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Descripcion = new javax.swing.JTextPane();
        txt_Modelo = new javax.swing.JTextField();
        txt_marca = new javax.swing.JTextField();
        btn_ModificarRespuesto = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Mostrar Repuestos");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        jToggleButton1.setText("Buscar Repuestos Por Marca");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Ingrese La id Del Repuesto A Modificar");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 42, -1, -1));

        txt_idRepuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idRepuestoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_idRepuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 40, 108, -1));

        btn_Consultar.setText("Consultar");
        jPanel2.add(btn_Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 37, -1, -1));

        jLabel3.setText("Modelo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel4.setText("Marca");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 113, -1, -1));

        jLabel5.setText("Descripción");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 146, -1, -1));

        txt_Descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txt_Descripcion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 200, 40));

        txt_Modelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ModeloKeyTyped(evt);
            }
        });
        jPanel2.add(txt_Modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 200, -1));

        txt_marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_marcaKeyTyped(evt);
            }
        });
        jPanel2.add(txt_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 200, -1));

        btn_ModificarRespuesto.setText("Modificar Repuesto");
        jPanel2.add(btn_ModificarRespuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        jTabbedPane2.addTab("Modificar Repuestos", jPanel2);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Ingresar La id del Repuesto A Eliminar");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 28, -1, -1));

        jLabel7.setText("Id del Repuesto");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 95, -1, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 93, 157, -1));

        jButton1.setText("Eliminar Repuesto");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 163, -1, -1));

        jTabbedPane2.addTab("Eliminar Repuestos", jPanel1);

        jToggleButton4.setText("Buscar Repuesto Por Modelo");

        jToggleButton5.setText("Salir");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton4)
                        .addGap(85, 85, 85)
                        .addComponent(jToggleButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3)
                        .addComponent(jTabbedPane2)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jToggleButton5)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jToggleButton5))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton4))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void txt_idRepuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idRepuestoKeyTyped
       char c=evt.getKeyChar(); 
            if(Character.isAlphabetic(c)) 
            { evt.consume();        
            } 
    }//GEN-LAST:event_txt_idRepuestoKeyTyped

    private void txt_ModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ModeloKeyTyped
        char c=evt.getKeyChar(); 
            if(Character.isAlphabetic(c)) 
            { evt.consume();        
            } 
    }//GEN-LAST:event_txt_ModeloKeyTyped

    private void txt_marcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_marcaKeyTyped
        char c=evt.getKeyChar(); 
            if(Character.isDigit(c)) 
            { evt.consume();        
            } 
    }//GEN-LAST:event_txt_marcaKeyTyped

    private void txt_DescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DescripcionKeyTyped
        char c=evt.getKeyChar(); 
            if(Character.isDigit(c)) 
            { evt.consume();        
            } 
    }//GEN-LAST:event_txt_DescripcionKeyTyped

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
            java.util.logging.Logger.getLogger(Mostrar_Repuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Repuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Repuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Repuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar_Repuestos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_Consultar;
    private javax.swing.JToggleButton btn_ModificarRespuesto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JTextPane txt_Descripcion;
    private javax.swing.JTextField txt_Modelo;
    private javax.swing.JTextField txt_idRepuesto;
    private javax.swing.JTextField txt_marca;
    // End of variables declaration//GEN-END:variables
}
