/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class panelTablero extends JPanel {

    static int sw;
    static int c = 0;
    int band = 0;
    private Timer t; // Importarlo con el java.swing
    int x = 10, y = 10;
    JFrame frame;
    panelTablero jta;
    

    public panelTablero(JFrame frame, int sw) {
        this.frame = frame;
        this.sw = sw;
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.black);
        this.setVisible(true);
        t = new Timer(150, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Update();
            }
        });
        
        
    }
    
    

    public void Update() {
        this.repaint();
    }

    public void Start() {
        t.start();
    }

    public void Stop() {
        t.stop();
    }

    public panelTablero() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setLayout(null);
        this.setForeground(new Color(0, 0, 82));
        this.setBackground(Color.black);
        this.setPreferredSize(new Dimension(400, 400));

    }
    
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(/*new GradientPaint(40, 10, Color.green, 50, 30, Color.blue, true)*/Color.yellow);        
       
        c++;
        
        
        
        switch (sw) {
            case 0:
                break;
            case 1:
                x += 15;
                band = 1;
                break;
            case 2:
                x -= 15;
                band = 2;
                break;
            case 3:
                y += 15;
                band = 3;
                break;
            case 4:
                y -= 15;
                band = 4;
                break;
        }


        if (c % 2 == 0) {
            if (band == 1) {
                g2d.fill(new Arc2D.Double(x, y, 50, 50, 45, 270, Arc2D.PIE));
            } else if (band == 2) {
                g2d.fill(new Arc2D.Double(x, y, 50, 50, 220, 270, Arc2D.PIE));
            } else if (band == 3) {
                g2d.fill(new Arc2D.Double(x, y, 50, 50, 320, 270, Arc2D.PIE));
            } else if (band == 4) {
                g2d.fill(new Arc2D.Double(x, y, 50, 50, 130, 270, Arc2D.PIE));
            }
        } else {
            g.fillOval(x, y, 50, 50);
        }
        
        g.setColor(Color.white);
        g.drawString("Pacman - Sergio Garzón", 10, 10);
        
    }
    
}
