/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RYZEN 7
 */
public class preferenciasUsuario extends javax.swing.JFrame {
    DefaultTableModel modelox;
    /**
     * Creates new form preferenciasUsuario
     */
    public preferenciasUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        mtdPrepararTabla();
    }
private void mtdPrepararTabla(){
    String titulos []={"Tipo","Actividades","Dirección","Apertura","Descripçion"};
modelox=new DefaultTableModel(null,titulos);
tablaLugar.setModel(modelox);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtActividades = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLugar = new javax.swing.JTable();
        txtTipoLugar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnEliminar = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtHoraApertura = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel5.setText("Destacar sitios y ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 390, 60));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel6.setText("actividades dentro de Cuenca");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 490, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoAppTurismo (1).png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 80, 80));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 110));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Tipo de lugar");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Dirección");
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
        jPanel2.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 160, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Actividades");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 30));

        txtActividades.setBackground(new java.awt.Color(204, 204, 204));
        txtActividades.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtActividades.setBorder(null);
        txtActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActividadesActionPerformed(evt);
            }
        });
        txtActividades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtActividadesKeyTyped(evt);
            }
        });
        jPanel2.add(txtActividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 360, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 360, 10));

        tablaLugar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaLugar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaLugar);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 570, 120));

        txtTipoLugar.setBackground(new java.awt.Color(204, 204, 204));
        txtTipoLugar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtTipoLugar.setBorder(null);
        txtTipoLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoLugarActionPerformed(evt);
            }
        });
        txtTipoLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoLugarKeyTyped(evt);
            }
        });
        jPanel2.add(txtTipoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 360, 40));

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
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, 160, 40));

        txtDireccion.setBackground(new java.awt.Color(204, 204, 204));
        txtDireccion.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtDireccion.setBorder(null);
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 360, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 360, 10));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Hora de apertura");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, 30));

        txtHoraApertura.setBackground(new java.awt.Color(204, 204, 204));
        txtHoraApertura.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtHoraApertura.setBorder(null);
        txtHoraApertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraAperturaActionPerformed(evt);
            }
        });
        txtHoraApertura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraAperturaKeyTyped(evt);
            }
        });
        jPanel2.add(txtHoraApertura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 360, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 360, 10));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Descripción");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 180, 30));

        txtDescripcion.setBackground(new java.awt.Color(204, 204, 204));
        txtDescripcion.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        txtDescripcion.setBorder(null);
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 360, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 360, 10));

        btnRegresar.setBackground(new java.awt.Color(204, 0, 0));
        btnRegresar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 170, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 870, 610));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/159.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 740, 660));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/04.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 370, 520, 460));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/04.png"))); // NOI18N
        jLabel7.setText("jLabel2");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, -110, 520, 460));

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
clases.lugar obj = new clases.lugar(txtTipoLugar.getText(), txtActividades.getText(), txtDireccion.getText(), txtHoraApertura.getText(), txtDescripcion.getText());
if (txtTipoLugar.getText().length() > 0) {
    if(txtActividades.getText().length()>0){
        if(txtDireccion.getText().length()>0){
            if(txtHoraApertura.getText().length()>0){
                if(txtDescripcion.getText().length()>0){
                                    modelox = (DefaultTableModel) tablaLugar.getModel(); 
                                    String nuevaFila[] = {obj.getTipoLugar(), obj.getActividades(), obj.getDireccion(), obj.getHorarios(),obj.getDescripcion()};
                modelox.addRow(nuevaFila);
                JOptionPane.showMessageDialog(null, "Actividad agendada con éxito");
guardarActividadEnArchivo(obj);

                mtdLimpiar();
                }else{
                    JOptionPane.showMessageDialog(null, "Debe ingresar una pequeña descripcion del lugar ingresado");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Debe de ingresar la hora de apertura");
            }
        }else{
         JOptionPane.showMessageDialog(null, "Debe de ingresar la direccion del lugar");   
        }
    }else{
        JOptionPane.showMessageDialog(null, "Debe de ingresar al menos una actividad que se puede realizar en el lugar a ingresar");
    }
}else{
    JOptionPane.showMessageDialog(null, "Debe de ingresar el nombre del lugar o su tipo");
}
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void guardarActividadEnArchivo(clases.lugar lugares) {
    String archivo = "lugar.txt"; // Nombre del archivo donde se guardarán las actividades
    File crearArchivo = new File("Registros" + File.separator + archivo); // Asegúrate de que la ruta sea correcta

    try {
        // Crea el archivo si no existe
        if (!crearArchivo.exists()) {
            crearArchivo.createNewFile();
        }

        // Escribir en el archivo
        FileWriter fw = new FileWriter(crearArchivo, true); // 'true' para agregar al final del archivo
        fw.write(lugares.getTipoLugar()+ ":" + lugares.getActividades()+ ":" + lugares.getDireccion()+ ":" + lugares.getHorarios()+ ":" + lugares.getDescripcion()+ "\n"); // Guarda la actividad
        fw.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar el lugar: " + e.getMessage());
    }
    }  
    private void mtdLimpiar(){
    txtTipoLugar.setText("");
    txtActividades.setText("");
    txtDireccion.setText("");
        txtHoraApertura.setText("");
            txtDescripcion.setText("");

}
    private void txtActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActividadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActividadesActionPerformed

    private void txtActividadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtActividadesKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtActividadesKeyTyped

    private void txtTipoLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoLugarActionPerformed

    private void txtTipoLugarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoLugarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoLugarKeyTyped

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
 int filasel = tablaLugar.getSelectedRow();
    if (filasel == -1) {
        JOptionPane.showMessageDialog(null, "No hay ninguna fila seleccionada, para continuar debe seleccionar una", "error", JOptionPane.INFORMATION_MESSAGE);
    } else {
        // Obtener los datos de la fila seleccionada
        String tipoLugar = (String) tablaLugar.getValueAt(filasel, 0);
        String actividades = (String) tablaLugar.getValueAt(filasel, 1);
        String direccion = (String) tablaLugar.getValueAt(filasel, 2);
        String horaApertura = (String) tablaLugar.getValueAt(filasel, 3);
        String descripcion = (String) tablaLugar.getValueAt(filasel, 4);

        // Eliminar la fila de la tabla
        modelox = (DefaultTableModel) tablaLugar.getModel();
        modelox.removeRow(filasel);

        // Eliminar la actividad del archivo de texto
        eliminarActividadDelArchivo(tipoLugar, actividades, direccion, horaApertura, descripcion);
    }
    }

        private void eliminarActividadDelArchivo(String tipoLugar, String actividades, String direccion, String horaApertura, String descripcion) {
     String archivo = "lugar.txt"; // Nombre del archivo donde se guardan los lugares
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
            if (partes.length == 5) { // Asegúrate de que haya 5 partes
                if (!(partes[0].equals(tipoLugar) && partes[1].equals(actividades) && partes[2].equals(direccion) && partes[3].equals(horaApertura) && partes[4].equals(descripcion))) {
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

        JOptionPane.showMessageDialog(null, "Lugar eliminado con éxito");
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al eliminar la actividad: " + e.getMessage());
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtHoraAperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraAperturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraAperturaActionPerformed

    private void txtHoraAperturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraAperturaKeyTyped
        char c = evt.getKeyChar();
        // Permitir solo números
        if (!Character.isDigit(c)) {
            evt.consume();
        }    }//GEN-LAST:event_txtHoraAperturaKeyTyped

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionKeyTyped

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
            java.util.logging.Logger.getLogger(preferenciasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(preferenciasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(preferenciasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(preferenciasUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new preferenciasUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable tablaLugar;
    private javax.swing.JTextField txtActividades;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtHoraApertura;
    private javax.swing.JTextField txtTipoLugar;
    // End of variables declaration//GEN-END:variables
}
