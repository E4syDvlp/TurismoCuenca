package frm;

import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

public class frm_mapa extends javax.swing.JInternalFrame {

    private Image mapImage; // Imagen del mapa
    private JScrollPane scrollPane;
    private JPanel imagePanel;  // El panel donde se dibuja la imagen

    public frm_mapa() {
        initComponents(); // Llamamos a initComponents que es generado por NetBeans
        cargarImagen();   // Llamamos a cargarImagen para mostrar la imagen
    }

    private void cargarImagen() {
    try {
        // Cargar la imagen desde una ruta relativa
        URL imageURL = getClass().getResource("/imagenes/cuenca.jpg");
        mapImage = ImageIO.read(imageURL);

        // Asegúrate de que la imagen cargue correctamente
        if (mapImage == null) {
            JOptionPane.showMessageDialog(this, "Error al cargar la imagen.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear un JPanel que dibuje la imagen
        imagePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(mapImage, 0, 0, this);
            }
        };

        // Ajustar el tamaño del panel al tamaño de la imagen
        imagePanel.setPreferredSize(new Dimension(mapImage.getWidth(null), mapImage.getHeight(null)));

        // Crear un JScrollPane para manejar el desplazamiento
        scrollPane = new JScrollPane(imagePanel);

        // Calcular la posición inicial para centrar la imagen
        Dimension viewportSize = scrollPane.getViewport().getSize();
        int x = Math.max(0, (mapImage.getWidth(null) - viewportSize.width) / 2);
        int y = Math.max(0, (mapImage.getHeight(null) - viewportSize.height) / 2);

        // Establecer la posición inicial del scroll
        scrollPane.getViewport().setViewPosition(new Point(x, y));

        setContentPane(scrollPane); // Establecer el JScrollPane como el contenedor

    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen del mapa.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    // Este es el método necesario para inicializar los componentes del JFrame, generado por NetBeans
    @SuppressWarnings("unchecked")
    private void initComponents() {
        // Código generado por NetBeans (sin cambios)
        setClosable(true);
        setIconifiable(true);
        setTitle("Mapa Principal");
        setSize(800, 600);
        setLocation(100, 100);
        
        // Los demás componentes de la interfaz gráfica, como botones y textos
        // Pueden ir aquí según tu diseño
    }

    // Métodos de ActionListener generados por NetBeans (puedes dejarlos vacíos si no los necesitas)
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) { /* acción */ }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) { /* acción */ }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { /* acción */ }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) { /* acción */ }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) { /* acción */ }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) { /* acción */ }
}
