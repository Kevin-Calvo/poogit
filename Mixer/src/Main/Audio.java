package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.*;

public class Audio { 

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana con Botones"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(300, 115); 
        frame.setLayout(new FlowLayout()); 

        
        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");
        JButton boton3 = new JButton("Botón 3");
        JButton boton4 = new JButton("Botón 4");
        JButton boton5 = new JButton("Botón 5");
        JButton boton6 = new JButton("Botón 6");
  
        // ActionListener para el Botón 1
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reproducirAudio("RutaDelAudio1"); 
            }
        });

        // ActionListener para el Botón 2
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reproducirAudio("RutaDelAudio2"); 
            }
        });
        
        // ActionListener para el Botón 3
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reproducirAudio("RutaDelAudio3"); 
            }
        });

        // ActionListener para el Botón 4
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reproducirAudio("RutaDelAudio4"); 
            }
        });
        
        // ActionListener para el Botón 5
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reproducirAudio("RutaDelAudio5"); 
            }
        });

        // ActionListener para el Botón 6
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reproducirAudio("RutaDelAudio6"); 
            }
        });
        
        frame.add(boton1);
        frame.add(boton2);
        frame.add(boton3);
        frame.add(boton4);
        frame.add(boton5);
        frame.add(boton6);
        
        frame.setVisible(true); 
    }
    
 // Método para reproducir audio
    public static void reproducirAudio(String ruta) {
        try {
            File archivoSonido = new File(ruta);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoSonido);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            ex.printStackTrace(); 
        }
    }
}