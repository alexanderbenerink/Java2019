// Voorbeeld KnopImage
// Opstartklasse voor applicatie met paneel voor twee knoppen en tekstvak
import javax.swing.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class KnopImage extends JFrame {

  public static void main( String args[] ) {
    JFrame frame = new KnopImage();
    frame.setSize( 800, 800 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "Knop met plaatje" );
    JPanel paneel = new KnopImagePaneel();
    frame.setContentPane( paneel );
    frame.setVisible( true );
	
	BufferedImage image = null;
        try {
            image = ImageIO.read(
                frame.getClass().getResource("images/mario.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        frame.setIconImage(image);
	
  }
}

