package frm;

import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

public class mapa extends JFrame {  // Cambié JInternalFrame por JFrame

    private Image mapImage; // Imagen del mapa
    private JScrollPane scrollPane;
    private JPanel imagePanel;  // El panel donde se dibuja la imagen
    private JButton btnRegresar;

    public mapa() {
        initComponents(); // Llamamos a initComponents
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

            getContentPane().add(scrollPane); // Usar getContentPane() en lugar de setContentPane()

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen del mapa.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Este es el método necesario para inicializar los componentes del JFrame
    private void initComponents() {
        // Configuración básica del JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mapa Principal");
        setSize(800, 600);
        setLocation(100, 100);
        btnRegresar = new JButton("Regresar");
        btnRegresar.addActionListener(e -> {
            
            // Aquí puedes definir la acción que se debe realizar al hacer clic en el botón
                  plataformaPrincipal plataPrincipal = new plataformaPrincipal();
                    dispose();
                    plataPrincipal.setVisible(true); // Cierra la ventana actual
            // Si necesitas abrir otra ventana, puedes hacerlo aquí
            // Por ejemplo: new VentanaAnterior().setVisible(true);
        });

        // Agregar el botón al JFrame
        getContentPane().add(btnRegresar, BorderLayout.SOUTH); // Agregar el botón en la parte inferior
    

        // Los demás componentes de la interfaz gráfica, como botones y textos
        // Pueden ir aquí según tu diseño
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mapa().setVisible(true);
            }
        });
    }
}
