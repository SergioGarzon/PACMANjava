/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JDialog;
import javax.swing.JFrame;
import static pacman.panelTablero.sw;

public class principal {
    
    private JFrame frame;
    
    public principal() {
        frame = new frameJuego();
        /*
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = frame.getSize();
        
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }*/
        
        //frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        
        
        frame.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent ke) {
                
            }

            public void keyPressed(KeyEvent ke) {
                accionPresionarBoton(ke);
            }

            public void keyReleased(KeyEvent ke) {
                
            }
        });
        
    }
    
    private void accionPresionarBoton(KeyEvent ke) {
                
        int valor = 0;
        
        if(ke.getKeyChar() == ke.VK_8) {
            valor = 4;            
        }   
        if(ke.getKeyChar() == ke.VK_2) {
            valor = 3;            
        }
        if(ke.getKeyChar() == ke.VK_4) {
            valor = 2;
        }
        if(ke.getKeyChar() == ke.VK_6) {
            valor = 1;
        }
        
        sw = valor;
        
       
    }    
    
    public static void main(String[] args) {
        try {
            //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        new principal();
    }
}
