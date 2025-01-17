/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author RYZEN 7
 */
public class lugaresVisita extends javax.swing.JFrame {
  DefaultTableModel modelo;
    private static boolean ga = false;
    /**
     * Creates new form lugaresVisita
     */
    public lugaresVisita() {
        initComponents();
        mtd_prepararTabla();
        setLocationRelativeTo(null);
                cargarDatosDesdeArchivo(); // Cargar datos al iniciar

    

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
    private void cargarDatosDesdeArchivo() {
    
    String rutaArchivo = "Registros/datos_lugares.txt"; // Cambia el nombre del archivo según sea necesario
    try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(","); // Suponiendo que los datos están separados por comas
            modelo.addRow(datos); // Agrega la fila a la tabla
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage());
    }

    }

private void guardarDatosEnArchivo() {
    String rutaArchivo = "Registros/datos_lugares.txt"; // Cambia el nombre del archivo según sea necesario
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String nombreLugar = modelo.getValueAt(i, 0).toString();
            String ubicacionLugar = modelo.getValueAt(i, 1).toString();
            String descripcionLugar = modelo.getValueAt(i, 2).toString();
            String calificacionLugar = modelo.getValueAt(i, 3).toString();
            
            // Escribir la fila en el archivo
            writer.write(nombreLugar + "," + ubicacionLugar + "," + descripcionLugar + "," + calificacionLugar);
            writer.newLine(); // Nueva línea para la siguiente fila
        }
        JOptionPane.showMessageDialog(this, "Datos guardados exitosamente en " + rutaArchivo);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
    }
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

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lugar = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ubicacion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        calificacion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        agregar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/06.png"))); // NOI18N
        jLabel5.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAppTurismo (1).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 80, 80));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Felix Titling", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lugares Para Visitar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 450, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de lugar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        lugar.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        lugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Turi", "Catedral", "San Blas", "Parque de la madre", "Mall del rio", "Parque miraflores", "Parque industrial", "Parque del Paraiso", " " }));
        jPanel1.add(lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 89, 339, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripcion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        descripcion.setEditable(false);
        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        descripcion.setRows(5);
        descripcion.setText("El texto se generará automáticamente al elegir el lugar a\nvisitar.\n");
        jScrollPane2.setViewportView(descripcion);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 360, 60));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ubicación");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        ubicacion.setEditable(false);
        ubicacion.setColumns(20);
        ubicacion.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        ubicacion.setRows(5);
        ubicacion.setText("El texto se generará automáticamente al elegir el lugar a\nvisitar.\n");
        ubicacion.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                ubicacionComponentMoved(evt);
            }
        });
        jScrollPane3.setViewportView(ubicacion);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 360, 70));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Calificacion");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        calificacion.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        calificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Califique ", "1", "2", "3", "4", "5" }));
        jPanel1.add(calificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 114, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 317, 620, 134));

        agregar.setBackground(new java.awt.Color(0, 0, 204));
        agregar.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        jPanel1.add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 120, 50));

        editar.setBackground(new java.awt.Color(153, 153, 255));
        editar.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });
        jPanel1.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 469, 110, 50));

        eliminar.setBackground(new java.awt.Color(255, 0, 0));
        eliminar.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 110, 50));

        btnRegresar.setBackground(new java.awt.Color(204, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 170, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/06.png"))); // NOI18N
        jLabel6.setText("jLabel1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-420, 210, 730, 490));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/04.png"))); // NOI18N
        jLabel7.setText("jLabel2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, -150, 520, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if (lugar.getSelectedItem() != null && lugar.getSelectedItem().toString().length() > 0) {
            String lugarSeleccionado = lugar.getSelectedItem().toString();

            // Validación para verificar si el lugar ya existe en la tabla
            if (mtd_validacioningreso(lugarSeleccionado)) {
                JOptionPane.showMessageDialog(null, "Este lugar ya está agregado.");
                return;  // Sale del método para evitar agregarlo de nuevo
            }

            // Actualizamos los JTextFields en el botón agregar
            switch (lugarSeleccionado) {
                case "Turi":
                    descripcion.setText("Mirador natural con vista panorámica, perfecto para visitar en familia. Si va en la noche, llevar abrigo.");
                    ubicacion.setText("https://maps.app.goo.gl/sSAHr8wrKQgbxB9t8");
                    break;
                case "Catedral":
                    descripcion.setText("Iglesia principal, famosa por su arquitectura, construida en 1790.");
                    ubicacion.setText("https://maps.app.goo.gl/BBirhfNAd9PWGUDj6");
                    break;
                case "San Blas":
                    descripcion.setText("Barrio histórico con arquitectura colonial.");
                    ubicacion.setText("https://maps.app.goo.gl/rQv2gxiXJ4Mv8bx27");
                    break;
                case "Parque de la madre":
                    descripcion.setText("Parque recreativo con jardines y monumentos.");
                    ubicacion.setText("https://maps.app.goo.gl/wfykCAqdkgYiqJMb7");
                    break;
                case "Mall del rio":
                    descripcion.setText("Centro comercial moderno con tiendas y restaurantes.");
                    ubicacion.setText("https://maps.app.goo.gl/o4vLk3RsYfLLS3U37");
                    break;
                case "Parque miraflores":
                    descripcion.setText("Parque familiar con actividades recreativas.");
                    ubicacion.setText("https://maps.app.goo.gl/zyvHJU11NK8fUMQt6");
                    break;
                case "Parque industrial":
                    descripcion.setText("Zona industrial con fábricas y comercios.");
                    ubicacion.setText("https://maps.app.goo.gl/GVbzZ6FjdpHCnTwT8");
                    break;
                case "Parque del Paraiso":
                    descripcion.setText("Parque natural con senderos y áreas para picnic.");
                    ubicacion.setText("https://maps.app.goo.gl/nfPfMpi9HVc1rUpS9");
                    break;
                default:
                    descripcion.setText("");
                    ubicacion.setText("");
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
                guardarDatosEnArchivo(); // Guardar después de agregar

    }//GEN-LAST:event_agregarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        //"Nombre del lugar", "Ubicacion", "Descripcion", "Calificacion"
      int filasel = tablita.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila!");
        } else {
            lugar.setSelectedItem(tablita.getValueAt(filasel, 0).toString());
            descripcion.setText(tablita.getValueAt(filasel, 1).toString());
            ubicacion.setText(tablita.getValueAt(filasel, 2).toString());
            calificacion.setSelectedItem(tablita.getValueAt(filasel, 3).
toString());

            ga = true; // Indica que estamos en modo de edición
        }
        guardarDatosEnArchivo(); // Guardar después de editar
    }//GEN-LAST:event_editarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
      int filasel = tablita.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "No hay ninguna fila seleccionada");
        } else {
            modelo = (DefaultTableModel) tablita.getModel();
            modelo.removeRow(filasel);
            guardarDatosEnArchivo(); // Guardar después de eliminar
        }

    }//GEN-LAST:event_eliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
        new plataformaPrincipal().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void ubicacionComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ubicacionComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionComponentMoved

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
            java.util.logging.Logger.getLogger(lugaresVisita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lugaresVisita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lugaresVisita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lugaresVisita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lugaresVisita().setVisible(true);
            }
        });
    }
private boolean mtd_validacioningreso(String dato_validacion) {
        boolean ban = false;
        for (int i = 0; i < tablita.getRowCount(); i++) {
            if (dato_validacion.equals(tablita.getValueAt(i, 0).toString())) {
                ban = true;
                break;
            }
        }
        return ban;
    }

    private void mtd_limpiar() {
        lugar.setSelectedIndex(0);
        ubicacion.setText("");
        descripcion.setText("");
        calificacion.setSelectedIndex(0);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> calificacion;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
