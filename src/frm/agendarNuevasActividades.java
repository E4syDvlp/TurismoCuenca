/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package frm;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class agendarNuevasActividades extends javax.swing.JFrame {

    DefaultTableModel modelo;
    
    public agendarNuevasActividades() {
        initComponents();
        setLocationRelativeTo(null);
        mtdPrepararTabla();
    }
private void mtdPrepararTabla(){
    String titulos []={"Presupuesto","Lugar","Fecha"};
modelo=new DefaultTableModel(null,titulos);
tablaActividades.setModel(modelo);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtFecha = new org.jdesktop.swingx.JXDatePicker();
        jLabel10 = new javax.swing.JLabel();
        txtPresupuesto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaActividades = new javax.swing.JTable();
        txtLugarInteres = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/06.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image-removebg-preview (11) (1).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 290, 390));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel11.setText("aventurate!");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 220, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel12.setText("Cuenca es una ciudad con gran ");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 220, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel13.setText("amplitud cultural, muchas");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel14.setText("actividades que se pueden realizar");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel15.setText("grandes lugares por visitar");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel16.setText("y una historia por descubrir ");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 220, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel17.setText("por algo es conocida como");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 220, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel18.setText("\"La Atenas del Ecuador\"");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 220, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel19.setText("Planifica tus actividades y");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 220, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 230, 290));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel5.setText("Agendar ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 60));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel6.setText("próximas actividades");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 350, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAppTurismo (1).png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 80, 80));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 110));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Lugar interés");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Presupuesto");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 30));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 160, 40));
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 200, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Fecha de planeación");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 30));

        txtPresupuesto.setBackground(new java.awt.Color(204, 204, 204));
        txtPresupuesto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtPresupuesto.setBorder(null);
        txtPresupuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPresupuestoActionPerformed(evt);
            }
        });
        txtPresupuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPresupuestoKeyTyped(evt);
            }
        });
        jPanel2.add(txtPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 360, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 360, 10));

        tablaActividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaActividades);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 570, 120));

        txtLugarInteres.setBackground(new java.awt.Color(204, 204, 204));
        txtLugarInteres.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtLugarInteres.setBorder(null);
        txtLugarInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLugarInteresActionPerformed(evt);
            }
        });
        txtLugarInteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLugarInteresKeyTyped(evt);
            }
        });
        jPanel2.add(txtLugarInteres, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 360, 40));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 360, 10));

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 160, 40));

        btnRegresar.setBackground(new java.awt.Color(204, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 170, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 630, 560));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/159.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 740, 660));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/04.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -110, 520, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1090, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private static boolean ga=false;

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
 clases.futurasActividades obj = new clases.futurasActividades(txtLugarInteres.getText(), txtFecha.getEditor().getText(), txtPresupuesto.getText());
    
    if (txtLugarInteres.getText().length() > 0) {
        if (txtFecha.getEditor().getText().length() > 0) {
            if (txtPresupuesto.getText().length() > 0) {
                modelo = (DefaultTableModel) tablaActividades.getModel(); 
                String nuevaFila[] = {obj.getLugarInteres(), obj.getFechaAct(), obj.getPresupuesto()};
                modelo.addRow(nuevaFila);
                JOptionPane.showMessageDialog(null, "Actividad agendada con éxito");

                // Guardar en archivo de texto
                guardarActividadEnArchivo(obj);

                mtdLimpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Debe de ingresar su presupuesto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese la fecha de planeación");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Ingrese el nombre del lugar que le interesa visitar");
    }
}

private void guardarActividadEnArchivo(clases.futurasActividades actividad) {
    String archivo = "actividades.txt"; // Nombre del archivo donde se guardarán las actividades
    File crearArchivo = new File("Registros" + File.separator + archivo); // Asegúrate de que la ruta sea correcta

    try {
        // Crea el archivo si no existe
        if (!crearArchivo.exists()) {
            crearArchivo.createNewFile();
        }

        // Escribir en el archivo
        FileWriter fw = new FileWriter(crearArchivo, true); // 'true' para agregar al final del archivo
        fw.write(actividad.getLugarInteres() + ":" + actividad.getFechaAct() + ":" + actividad.getPresupuesto() + "\n"); // Guarda la actividad
        fw.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar la actividad: " + e.getMessage());
    }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtPresupuestoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPresupuestoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        // Permitir solo números
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPresupuestoKeyTyped
private void mtdLimpiar(){
    txtLugarInteres.setText("");
    txtFecha.getEditor().setText("");
    txtPresupuesto.setText("");

    
}
    private void txtPresupuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPresupuestoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPresupuestoActionPerformed

    private void txtLugarInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLugarInteresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLugarInteresActionPerformed

    private void txtLugarInteresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLugarInteresKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLugarInteresKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       int filasel = tablaActividades.getSelectedRow();
    if (filasel == -1) {
        JOptionPane.showMessageDialog(null, "No hay ninguna fila seleccionada, para continuar debe seleccionar una", "error", JOptionPane.INFORMATION_MESSAGE);
    } else {
        // Obtener los datos de la fila seleccionada
        String lugarInteres = (String) tablaActividades.getValueAt(filasel, 0);
        String fechaAct = (String) tablaActividades.getValueAt(filasel, 1);
        String presupuesto = (String) tablaActividades.getValueAt(filasel, 2);

        // Eliminar la fila de la tabla
        modelo = (DefaultTableModel) tablaActividades.getModel();
        modelo.removeRow(filasel);

        // Eliminar la actividad del archivo de texto
        eliminarActividadDelArchivo(lugarInteres, fechaAct, presupuesto);
    }
}

private void eliminarActividadDelArchivo(String lugarInteres, String fechaAct, String presupuesto) {
    String archivo = "actividades.txt"; // Nombre del archivo donde se guardan las actividades
    File crearArchivo = new File("Registros" + File.separator + archivo); // Asegúrate de que la ruta sea correcta

    try {
        // Leer todas las actividades
        List<String> lineas = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(crearArchivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            lineas.add(linea);
        }
        br.close();

        // Filtrar las actividades que no se deben eliminar
        List<String> nuevasLineas = new ArrayList<>();
        for (String l : lineas) {
            String[] partes = l.split(":");
            if (partes.length == 3) {
                if (!(partes[0].equals(lugarInteres) && partes[1].equals(fechaAct) && partes[2].equals(presupuesto))) {
                    nuevasLineas.add(l); // Mantener la línea si no coincide
                }
            }
        }

        // Escribir las actividades restantes de nuevo en el archivo
        FileWriter fw = new FileWriter(crearArchivo);
        for (String nuevaLinea : nuevasLineas) {
            fw.write(nuevaLinea + "\n");
        }
        fw.close();

        JOptionPane.showMessageDialog(null, "Actividad eliminada con éxito");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar la actividad: " + e.getMessage());
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(agendarNuevasActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agendarNuevasActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agendarNuevasActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agendarNuevasActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agendarNuevasActividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tablaActividades;
    private org.jdesktop.swingx.JXDatePicker txtFecha;
    private javax.swing.JTextField txtLugarInteres;
    private javax.swing.JTextField txtPresupuesto;
    // End of variables declaration//GEN-END:variables
}