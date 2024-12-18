package frm;

import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

public class frm_mapa extends JFrame {  // Cambié JInternalFrame por JFrame

    private Image mapImage; // Imagen del mapa
    private JScrollPane scrollPane;
    private JPanel imagePanel;  // El panel donde se dibuja la imagen
    private JButton btnRegresar;
    private int xpunto = 9154; // Coordenada X del punto
    private int ypunto = 9321; // Coordenada Y del punto
    // Coordenadas de el punto rojo inicial
    int xInicial = -2900561;
    int yInicial = -79000085;

    public frm_mapa() {
        initComponents(); // Llamamos a initComponents
        cargarImagen();   // Llamamos a cargarImagen para mostrar la imagen
        setLocationRelativeTo(null);
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

                    // Establecer el color rojo para el punto
                    g.setColor(Color.RED);
                    
                    // Dibujar el punto (círculo rojo de 5x5 px en las coordenadas xpunto, ypunto)
                    g.fillOval(xpunto, ypunto, 50, 50);
                }
            };

            // Ajustar el tamaño del panel al tamaño de la imagen
            imagePanel.setPreferredSize(new Dimension(mapImage.getWidth(null), mapImage.getHeight(null)));

            // Crear un JScrollPane para manejar el desplazamiento
            scrollPane = new JScrollPane(imagePanel);

            // Calcular la posición inicial para centrar la imagen
            Dimension viewportSize = scrollPane.getViewport().getSize();
            int xcual = Math.max(0, (mapImage.getWidth(null) - viewportSize.width) / 3);
            int ycual = Math.max(0, (mapImage.getHeight(null) - viewportSize.height) / 2);
            
            int x = xcual + 800;
            int y = ycual + 2050;

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
             this.dispose();
        new plataformaPrincipal().setVisible(true);  // Cierra la ventana actual
            // Si necesitas abrir otra ventana, puedes hacerlo aquí
            // Por ejemplo: new VentanaAnterior().setVisible(true);
        });

        // Agregar el botón al JFrame
        getContentPane().add(btnRegresar, BorderLayout.SOUTH); // Agregar el botón en la parte inferior
    
    }
 
    public static void main(String[] args) {
        // Mostrar la ventana
        SwingUtilities.invokeLater(() -> {
            new frm_mapa().setVisible(true);
        });
    }
}
