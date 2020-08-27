/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class frameJuego extends JFrame {

    Container con;
    int sw;
    //JpTeclado jte;
    panelTablero jta;
    private Clip sonido;

    public frameJuego() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        this.cargarSonido();
    }
    
    
    
    private void cargarSonido() {
        String ruta = System.getProperty("user.dir");

        try {
            this.sonido = AudioSystem.getClip();
            this.sonido.open(AudioSystem.getAudioInputStream(new File(ruta + "\\src\\Sonido\\Sonidos_Pacman.wav")));

            this.sonido.loop(5);

        } catch (Exception e) {
        }
    }
    

    private void jbInit() throws Exception {
        this.getContentPane().setLayout(null);
        this.setSize(new Dimension(750, 750));
        this.setBackground(Color.black);        
        
        con = this.getContentPane();
        con.setLayout(new BorderLayout());
        
        jta = new panelTablero(this, sw);
        jta.Start();
        
        con.add(jta);
        

    }
}