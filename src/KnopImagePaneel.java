// Paneel met twee knoppen en een tekstvak


// nodig om een kleurtje te maken 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class KnopImagePaneel extends JPanel {
  private JButton knop, herstelknop, funknop;
  private JTextField tekstvak;
  private JLabel melding;
  private int diameter=50;
  private int rood=150, groen=200, blauw=75;
  private Color kleur1=new Color(rood,groen,blauw);
  private Font f1 = new Font("Serif", Font.BOLD+Font.ITALIC, 28 );
  private Font f2 = new Font("SansSerif", Font.BOLD, 32 );
  private boolean knopgedrukt=false;

  public KnopImagePaneel() {
	setLayout(null);
	setBackground(Color.white);
	
	melding= new JLabel();
	melding.setBounds(50,280,600,40);
	melding.setFont(f1);

    knop = new JButton( "Klik" );
	knop.setBounds(20,30,80,20);
    knop.addActionListener( new KnopHandler() );
    
    herstelknop = new JButton( "Veeg uit" );
	herstelknop.setBounds(220,30,80,20);
    herstelknop.addActionListener( new HerstelknopHandler() );
	
	// werkt niet in eclips, wel in cmd
    // funknop = new JButton( new ImageIcon("images/jw.jpg"));
    
    BufferedImage plaatje2=null;
	try {   
       plaatje2 = ImageIO.read(getClass().getResource("images\\jw.jpg"));
    } catch (IOException e) {
        e.printStackTrace();
    }
     
    
    funknop = new JButton( new ImageIcon( plaatje2) );
	funknop.addActionListener(new FunknopHandler());

	funknop.setBounds(20,60,280,300);
	funknop.setFocusPainted(false);
	funknop.setBorderPainted(false);
    funknop.setContentAreaFilled(false);
	
    
    tekstvak = new JTextField( );
	tekstvak.setBounds(110,30,100,20);
	
    add( knop );
    add( tekstvak );
    add( herstelknop );
	add(funknop);
	add(melding);
	
  }
  
  class KnopHandler implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
     tekstvak.setForeground(Color.RED);
	 tekstvak.setHorizontalAlignment(JTextField.LEFT);
	 tekstvak.setText( "Je hebt geklikt!" );
	 tekstvak.setBackground(Color.GREEN);
	 knopgedrukt=true;
	 repaint();
    }
  }
  
  class HerstelknopHandler implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
      tekstvak.setForeground(Color.WHITE); 
	  tekstvak.setHorizontalAlignment(JTextField.CENTER);
 	  tekstvak.setText( "xxx" );
	  tekstvak.setBackground(Color.BLUE);
	  diameter=50;
	  melding.setFont(f2);
	  melding.setForeground(Color.RED);
	  melding.setText("Ik ben nog steeds NIET in functie !!!");
	  knopgedrukt=false;
	  repaint();
    }
  }  
  
  class FunknopHandler implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
		diameter+=3;
		repaint();	
		melding.setFont(f1);	
		melding.setForeground(Color.BLUE);
		melding.setText("Ik ben nog niet in functie...");
      }
    }  
	
	public void paintComponent (Graphics potlood){
		super.paintComponent(potlood);
		potlood.setColor(kleur1);
		potlood.fillOval(400,400,diameter,diameter);	
		potlood.setColor(Color.GREEN);
		potlood.drawLine(10,10,10,250);	
		BufferedImage plaatje3=null;
		try {
           plaatje3 = ImageIO.read(getClass().getResource("images\\mario.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        if (knopgedrukt==true){ potlood.drawImage(plaatje3, 60, 300,  this);}
		
		
	}

  
}
