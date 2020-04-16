/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unpam.ac.id;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Ashart
 */
public class BarChart extends JPanel{
    public BarChart() {
        this.setPreferredSize(new Dimension(650, 500));
        this.setBackground(Color.WHITE);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
   
        GeneralPath gp = new GeneralPath(GeneralPath.WIND_NON_ZERO);
            gp.moveTo(77,50);
            gp.lineTo(79,50);
            gp.moveTo(80, 450);
            gp.lineTo(80,50);
            gp.moveTo(77,90);
            gp.lineTo(79,90);
            gp.moveTo(140, 450);
            gp.lineTo(140,50);
            gp.moveTo(77,130);
            gp.lineTo(79,130);
            gp.moveTo(200, 450);
            gp.lineTo(200,50);
            gp.moveTo(77,170);
            gp.lineTo(79,170);
            gp.moveTo(260, 450);
            gp.lineTo(260,50);
            gp.moveTo(77,210);
            gp.lineTo(79,210);
            gp.moveTo(320, 450);
            gp.lineTo(320,50);
            gp.moveTo(77,250);
            gp.lineTo(79,250);
            gp.moveTo(380, 450);
            gp.lineTo(380,50);
            gp.moveTo(77,290);
            gp.lineTo(79,290);
            gp.moveTo(440, 450);
            gp.lineTo(440,50);
            gp.moveTo(77,330);
            gp.lineTo(79,330);
            gp.moveTo(77,370);
            gp.lineTo(79,370);
            gp.moveTo(77,410);
            gp.lineTo(79,410);
            gp.moveTo(77, 447);
            gp.lineTo(441,447);
     
            gp.closePath();
        g2.draw(gp);
     
     
        g2.drawString("N10",50,75);
        //g2.drawString("110",5,70);
        g2.drawString("N09",50,115);
        //g2.drawString("90",13,110);
        g2.drawString("N08",50,155);
        //g2.drawString("70",13,150);
        g2.drawString("N07",50,195);
        //g2.drawString("50",13,190);
        g2.drawString("N06",50,235);
        //g2.drawString("30",13,230);
        g2.drawString("N05",50,275);
        //g2.drawString("10", 13, 270);
        g2.drawString("N04",50,315);
        //g2.drawString("10", 13, 270);
        g2.drawString("N03",50,355);
        //g2.drawString("10", 13, 270);
        g2.drawString("N02",50,395);
        //g2.drawString("10", 13, 270);
        g2.drawString("N01",50,435);
     
     
//        Angka 
        g2.drawString("0",77,470);
        g2.drawString("20",135,470);
        g2.drawString("40",195,470);
        g2.drawString("60",255,470);
        g2.drawString("80",315,470);
        g2.drawString("100",370,470);
        g2.drawString("120",430,470);
        g2.drawString("Series1",510,252);
     
        Shape kotak10 = new Rectangle2D.Double(80,65,105,15); //36
        Shape kotak09 = new Rectangle2D.Double(80,105,105,15); //36
        Shape kotak08 = new Rectangle2D.Double(80,145,315,15); //109
        Shape kotak07 = new Rectangle2D.Double(80,185,225,15); //73
        Shape kotak06 = new Rectangle2D.Double(80,225,295,15); //98
        Shape kotak05 = new Rectangle2D.Double(80,265,255,15); //84
        Shape kotak04 = new Rectangle2D.Double(80,305,240,15); //80
        Shape kotak03 = new Rectangle2D.Double(80,345,300,15); //100
        Shape kotak02 = new Rectangle2D.Double(80,385,155,15); //51
        Shape kotak01 = new Rectangle2D.Double(80,425,90,15); //30
     
        Shape Series1 = new Rectangle2D.Double(490,240,15,15);//Series1
     
        g2.setColor(Color.BLUE);
        g2.fill(kotak10);
        g2.fill(kotak09);
        g2.fill(kotak08);
        g2.fill(kotak07);
        g2.fill(kotak06);
        g2.fill(kotak05);
        g2.fill(kotak04);
        g2.fill(kotak03);
        g2.fill(kotak02);
        g2.fill(kotak01);
        g2.fill(Series1);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here

        JFrame frame = new JFrame("BarChart Muhamad Ihsan Ashari");
     
       frame.setSize(800,800);
        frame.addWindowListener(new WindowAdapter()

            {
            @Override
            public void windowClosing(WindowEvent e)
            { System.exit(0); }
        });

        //tambahkan panel
        BarChart canvas = new BarChart();

        frame.getContentPane().add(canvas);
        frame.pack();
        frame.setVisible(true);
     }
}
