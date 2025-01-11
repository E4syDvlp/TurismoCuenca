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
public class guiasFrm extends javax.swing.JFrame {
  DefaultTableModel modelo;
    private static boolean ga = false;
    /**
     * Creates new form guiasFrm
     */
    public guiasFrm() {
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
                    txtNomGuia.setSelectedItem(tablita.getValueAt(fila, 0).toString());
                    txtExpGuia.setText(tablita.getValueAt(fila, 2).toString());
                    txtRecGuia.setText(tablita.getValueAt(fila, 1).toString());
                    calificacion.setSelectedItem(tablita.getValueAt(fila, 3).toString());
                    ga = true;  // Esto indica que estamos en modo de edición
                }
            }
        });
    }
    
private void cargarDatosDesdeArchivo() {
    String rutaArchivo = "Registros/datos_guias.txt"; // Cambia el nombre del archivo según sea necesario
    modelo.setRowCount(0); // Limpiar la tabla antes de cargar los datos
    try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(","); // Suponiendo que los datos están separados por comas
            if (datos.length == 4) { // Asegúrate de que haya 4 partes
                modelo.addRow(datos); // Agrega la fila a la tabla
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage());
    }
}

private void guardarDatosEnArchivo() {
    String rutaArchivo = "Registros/datos_guias.txt"; // Cambia el nombre del archivo según sea necesario
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo))) {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String nombreGuia = modelo.getValueAt(i, 0).toString();
            String recomendacionGuia = modelo.getValueAt(i, 1).toString();
            String experienciaGuia = modelo.getValueAt(i, 2).toString();
            String calificacionGuia = modelo.getValueAt(i, 3).toString();
            
            // Escribir la fila en el archivo
            writer.write(nombreGuia + "," + recomendacionGuia + "," + experienciaGuia + "," + calificacionGuia);
            writer.newLine(); // Nueva línea para la siguiente fila
        }
        JOptionPane.showMessageDialog(this, "Datos guardados exitosamente en " + rutaArchivo);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar los datos: " + e.getMessage());
    }
}
    
 private void mtd_prepararTabla() {
        String titulos[] = {"Nombre del Guia", "Experiencia", "Recomendación", "Calificacion"};
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
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNomGuia = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtExpGuia = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtRecGuia = new javax.swing.JTextArea();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAppTurismo (1).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 80, 80));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Felix Titling", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Guias para contratar");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 490, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del guia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        txtNomGuia.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        txtNomGuia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Maria Jose Guzman", "Carlos Alberto Pérez", "Lucía Fernanda Morales", "Diego Andrés Herrera", "Ana Sofía Delgado", "Jorge Luis Sánchez", "Valeria Jiménez Ávila", "Pablo Emilio Ortiz", "Isabela Torres Ramírez", "Ricardo Gómez Castillo", "Camila Andrea Vega", "Manuel Eduardo Rojas", "Fernanda López Martínez", "Gabriel Sebastián Ruiz" }));
        jPanel1.add(txtNomGuia, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 89, 339, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Calificación del guia");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        txtExpGuia.setEditable(false);
        txtExpGuia.setColumns(20);
        txtExpGuia.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        txtExpGuia.setRows(5);
        txtExpGuia.setText("El texto se generará automáticamente al elegir el lugar a\nvisitar.\n");
        jScrollPane2.setViewportView(txtExpGuia);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 360, 60));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Recomendacion del guia");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtRecGuia.setEditable(false);
        txtRecGuia.setColumns(20);
        txtRecGuia.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        txtRecGuia.setRows(5);
        txtRecGuia.setText("El texto se generará automáticamente al elegir el lugar a\nvisitar.\n");
        txtRecGuia.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                txtRecGuiaComponentMoved(evt);
            }
        });
        jScrollPane3.setViewportView(txtRecGuia);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 360, 70));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Experiencia del guia");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

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

    private void txtRecGuiaComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtRecGuiaComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecGuiaComponentMoved

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
     if (txtNomGuia.getSelectedItem() != null && txtNomGuia.getSelectedItem().toString().length() > 0) {
        String guiaSeleccionado = txtNomGuia.getSelectedItem().toString();

        // Validación para verificar si el guía ya existe en la tabla
        if (mtd_validacioningreso(guiaSeleccionado)) {
            JOptionPane.showMessageDialog(null, "Este guía ya está agregado.");
            return;  // Sale del método para evitar agregarlo de nuevo
        }

        // Actualizamos los JTextFields en el botón agregar
        switch (guiaSeleccionado) {
            case "Maria Jose Guzman":
                txtExpGuia.setText("Dos años de experiencia, centrada en el turismo local e internacional en sudamérica.");
                txtRecGuia.setText("Ir preparado para cambios de clima frecuentes, el centro historico de la ciudad es el mejor lugar para adentrarse en la cultura azuaya");
                break;
                
                case "Carlos Alberto Pérez":  
    txtExpGuia.setText("Cuatro años de experiencia, especializado en ecoturismo y rutas de montaña.");  
    txtRecGuia.setText("Llevar ropa cómoda y repelente para mosquitos. No te pierdas los amaneceres desde los miradores locales."); 
                break;
                case "Lucía Fernanda Morales":  
    txtExpGuia.setText("Tres años de experiencia, enfocada en turismo gastronómico y cultural.");  
    txtRecGuia.setText("Probar los platillos típicos de la región y visitar mercados locales para una experiencia auténtica."); 
                break;
               case "Diego Andrés Herrera":  
    txtExpGuia.setText("Cinco años de experiencia, experto en tours históricos y arqueológicos.");  
    txtRecGuia.setText("Llevar calzado cómodo para caminar largas distancias y disfrutar de visitas guiadas en sitios históricos."); 
                break;
               case "Ana Sofía Delgado":  
    txtExpGuia.setText("Dos años de experiencia, especializada en recorridos en playas y deportes acuáticos.");  
    txtRecGuia.setText("Usar protector solar, llevar traje de baño y considerar alquilar equipo de snorkel.");  
                break;
               case "Jorge Luis Sánchez":  
    txtExpGuia.setText("Seis años de experiencia, apasionado por la fotografía de paisajes.");  
    txtRecGuia.setText("Llevar cámara o smartphone con buena capacidad y estar atento a los mejores momentos de luz."); 
                break;
               case "Valeria Jiménez Ávila":  
    txtExpGuia.setText("Cuatro años de experiencia, enfocada en recorridos familiares y actividades recreativas.");  
    txtRecGuia.setText("Traer snacks para los niños y ropa adecuada para actividades al aire libre."); 
                break;
                case "Pablo Emilio Ortiz":  
    txtExpGuia.setText("Ocho años de experiencia, especializado en turismo de aventura y escalada.");  
    txtRecGuia.setText("Usar ropa adecuada para actividades extremas y no olvidar equipo de seguridad si es requerido."); 
                break;
                
                case "Isabela Torres Ramírez":  
    txtExpGuia.setText("Tres años de experiencia, apasionada por el turismo ecológico y la observación de aves.");  
    txtRecGuia.setText("Llevar binoculares, guía de aves y calzado para senderismo.");
                break;
                case "Ricardo Gómez Castillo":  
    txtExpGuia.setText("Diez años de experiencia, experto en historia colonial y rutas culturales.");  
    txtRecGuia.setText("Leer un poco sobre la historia del lugar para aprovechar más las explicaciones.");  
                break;
                case "Camila Andrea Vega":  
    txtExpGuia.setText("Cinco años de experiencia, especializada en recorridos nocturnos y astroturismo.");  
    txtRecGuia.setText("Llevar linterna, ropa abrigada y familiarizarse con las constelaciones básicas.");   
                break;
                case "Manuel Eduardo Rojas":  
    txtExpGuia.setText("Siete años de experiencia, enfocado en rutas gastronómicas y mercados locales.");  
    txtRecGuia.setText("Traer apetito, cámara para fotografiar platillos y paciencia para probar nuevos sabores.");  
    break;
   case "Fernanda López Martínez":  
    txtExpGuia.setText("Cuatro años de experiencia, con enfoque en turismo rural y comunidades indígenas.");  
    txtRecGuia.setText("Respetar las costumbres locales y llevar algo para intercambiar en comunidades, si es apropiado.");    
    break;
   case "Gabriel Sebastián Ruiz":  
    txtExpGuia.setText("Dos años de experiencia, especializado en recorridos en bicicleta y ciclismo de montaña.");  
    txtRecGuia.setText("Llevar casco, agua y estar preparado para recorridos largos.");    
    break;
    
    
                default:
                txtExpGuia.setText("");
                txtRecGuia.setText("");
                break;
            }

            if (txtRecGuia.getText().length() > 0) {
            if (txtExpGuia.getText().length() > 0) {
                if (calificacion.getSelectedItem() != null && calificacion.getSelectedItem().toString().length() > 0) {
                    // Crear el objeto LugaresParaVisitar
                    clases.LugaresParaVisitar obj = new clases.LugaresParaVisitar(
                        txtNomGuia.getSelectedItem().toString(),
                        txtRecGuia.getText(),
                        txtExpGuia.getText(),
                        calificacion.getSelectedItem().toString()
                    );

                    // Agregar a la tabla
                    modelo = (DefaultTableModel) tablita.getModel();
                    String nuevaFila[] = {obj.getNombrelugar(), obj.getUbicacion(), obj.getDescripcion(), String.valueOf(obj.getCalificacion())};
                    modelo.addRow(nuevaFila);
                    mtd_limpiar();
                    guardarDatosEnArchivo(); // Guardar después de agregar
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione una calificación");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una experiencia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una recomendación");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Seleccione un guía");
    }
    }//GEN-LAST:event_agregarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        //"Nombre del lugar", "Ubicacion", "Descripcion", "Calificacion"
        int filasel = tablita.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione una fila!");
        } else {
            txtNomGuia.setSelectedItem(tablita.getValueAt(filasel, 0).toString());
            txtExpGuia.setText(tablita.getValueAt(filasel, 1).toString());
            txtRecGuia.setText(tablita.getValueAt(filasel, 2).toString());
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
        txtNomGuia.setSelectedIndex(0);
        txtRecGuia.setText("");
        txtExpGuia.setText("");
        calificacion.setSelectedIndex(0);

    }
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
            java.util.logging.Logger.getLogger(guiasFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiasFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiasFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiasFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiasFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> calificacion;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablita;
    private javax.swing.JTextArea txtExpGuia;
    private javax.swing.JComboBox<String> txtNomGuia;
    private javax.swing.JTextArea txtRecGuia;
    // End of variables declaration//GEN-END:variables
}