/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author RYZEN 7
 */
public class restaurante extends javax.swing.JFrame {
 DefaultTableModel modelo;
    private static boolean ga = false;
    /**
     * Creates new form restaurante
     */
    public restaurante() {
        initComponents();
        mtd_prepararTabla();
        setLocationRelativeTo(null);
        tablita.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (tablita.getSelectedRow() != -1) {
                    // Obtener los valores de la fila seleccionada
                    int fila = tablita.getSelectedRow();
                    lugar.setSelectedItem(tablita.getValueAt(fila, 0).toString());
                    descripcion.setText(tablita.getValueAt(fila, 2).toString());
                    ubicacion.setText(tablita.getValueAt(fila, 1).toString());
                    calificacion.setSelectedItem(tablita.getValueAt(fila, 3).toString());
                    ga = true;  // Esto indica que estamos en modo de edición
                }
            }
        });
    }
 private void mtd_prepararTabla() {
        String titulos[] = {"Nombre del lugar", "Ubicacion", "Descripcion", "Calificacion"};
        modelo = new DefaultTableModel(null, titulos);
        tablita.setModel(modelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lugar = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ubicacion = new javax.swing.JTextArea();
        calificacion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        agregar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Felix Titling", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Restaurante");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        lugar.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        lugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Sauja Bistro Restaurant ", "La guardia ", "Chill & Chela Brew Pub", "Tiesto's" }));
        jPanel1.add(lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 206, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de lugar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripcion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, 30));

        descripcion.setEditable(false);
        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        descripcion.setRows(5);
        descripcion.setText("El texto se generará automáticamente al elegir el lugar a\nvisitar.\n");
        jScrollPane2.setViewportView(descripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 350, 70));

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ubicacion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, 30));

        ubicacion.setEditable(false);
        ubicacion.setColumns(20);
        ubicacion.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        ubicacion.setRows(5);
        ubicacion.setText("El texto se generará automáticamente al elegir el lugar a\nvisitar.\n");
        jScrollPane3.setViewportView(ubicacion);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 370, 60));

        calificacion.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        calificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Califique ", "1", "2", "3", "4", "5" }));
        jPanel1.add(calificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 114, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Calificacion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        tablita.setBackground(new java.awt.Color(204, 255, 153));
        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablita);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 530, 110));

        agregar.setBackground(new java.awt.Color(0, 0, 255));
        agregar.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 110, 50));

        editar.setBackground(new java.awt.Color(102, 102, 255));
        editar.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        jPanel1.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 100, 50));

        eliminar.setBackground(new java.awt.Color(255, 0, 0));
        eliminar.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 130, 50));

        btnRegresar.setBackground(new java.awt.Color(204, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 170, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/162.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-480, 270, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/162.png"))); // NOI18N
        jLabel10.setText("jLabel9");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, -410, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAppTurismo (1).png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 80, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if (lugar.getSelectedItem() != null && lugar.getSelectedItem().toString().length() > 0) {
            String lugarSeleccionado = lugar.getSelectedItem().toString();

            // Validación para verificar si el lugar ya existe en la tabla
            //            if (mtd_validacioningreso(lugarSeleccionado)) {
                //                JOptionPane.showMessageDialog(null, "Este lugar ya está agregado.");
                //                return;  // Sale del método para evitar agregarlo de nuevo
                //            }

            // Actualizamos los JTextFields en el botón agregar
            switch (lugarSeleccionado) {
                case "Sauja Bistro Restaurant ":
                descripcion.setText("Especializado en cocina fusión ecuatiriana, este bistró es conocido por su ambiente íntimo y platos innovadores que combinan sabores locales con técnicas contemporáneas.");
                ubicacion.setText("https://maps.app.goo.gl/AffAo613pEPrbhGL7");
                break;
                case "La guardia ":
                descripcion.setText("Con una mezcla de cocina americana, internacional y ecuatoriana contemporánea, La Guardia es apreciada por su ambiente artístico y eventos culturales que complementan la experiencia gastronómica.");
                ubicacion.setText("https://maps.app.goo.gl/yg3XB4q4p2KknUtp6");
                break;
                case "Chill & Chela Brew Pub":
                descripcion.setText("Este pub es popular por su variedad de cervezas artesanales y ambiente relajado, ofreciendo también una selección de platos de bar y pub para acompañar las bebidas.");
                ubicacion.setText("https://maps.app.goo.gl/89rGy7ZMGPzSEfvm6");
                break;
                case "Tiesto's":
                descripcion.setText("Especializado en cocina ecuatoriana, Tiesto's es famoso por sus platos tradicionales presentados con un toque gourmet, en un ambiente cálido y acogedor.");
                ubicacion.setText("https://maps.app.goo.gl/KKHFfGhp5zVhTXHu9");
                break;
            }

            if (ubicacion.getText().length() > 0) {
                if (descripcion.getText().length() > 0) {
                    if (calificacion.getSelectedItem() != null && calificacion.getSelectedItem().toString().length() > 0) {
                        clases.LugaresParaVisitar obj = new clases.LugaresParaVisitar(
                            lugar.getSelectedItem().toString(),
                            descripcion.getText(),
                            ubicacion.getText(),
                            calificacion.getSelectedItem().toString()
                        );
                        if (!ga) {
                            modelo = (DefaultTableModel) tablita.getModel();
                            String nuevaFila[] = {obj.getNombrelugar(), obj.getUbicacion(), obj.getDescripcion(), String.valueOf(obj.getCalificacion())};
                            modelo.addRow(nuevaFila);
                            mtd_limpiar();
                        } else {
                            JOptionPane.showMessageDialog(null, "Se ha guardado su selección");
                        }
                        if (ga) {
                            int filasel = tablita.getSelectedRow();
                            if (filasel == -1) {
                                JOptionPane.showMessageDialog(null, "Seleccione una fila");
                            } else {
                                tablita.setValueAt(lugar.getSelectedItem(), filasel, 0);
                                tablita.setValueAt(ubicacion.getText(), filasel, 1);
                                tablita.setValueAt(descripcion.getText(), filasel, 2);
                                tablita.setValueAt(calificacion.getSelectedItem(), filasel, 3);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Seleccione una calificación");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese una descripción");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una ubicación");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un lugar");
        }
    }//GEN-LAST:event_agregarActionPerformed
  private void mtd_limpiar() {
        lugar.setSelectedIndex(0);
        ubicacion.setText("");
        descripcion.setText("");
        calificacion.setSelectedIndex(0);

    }
    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        //"Nombre del lugar", "Ubicacion", "Descripcion", "Calificacion"
        int filasel = tablita.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Por favor eleccione una fila!");
        } else {
            lugar.setSelectedItem(tablita.getValueAt(filasel, 0).toString());
            descripcion.setText(tablita.getValueAt(filasel, 1).toString());
            ubicacion.setText(tablita.getValueAt(filasel, 2).toString());
            calificacion.setSelectedItem(tablita.getValueAt(filasel, 3).toString());

            ga = true;
        }
    }//GEN-LAST:event_editarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int filasel = tablita.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "No hay ninguna fila selccionada");
        } else {
            modelo= (DefaultTableModel) tablita.getModel();
            modelo.removeRow(filasel);
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        new plataformaPrincipal().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(restaurante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new restaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> calificacion;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> lugar;
    private javax.swing.JTable tablita;
    private javax.swing.JTextArea ubicacion;
    // End of variables declaration//GEN-END:variables
}