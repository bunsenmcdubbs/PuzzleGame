package gui;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;


public class Heart extends PegShape{

	public Heart(int side) {
		super(side);
	}

	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		if(getSide() == 1 || getSide() == 3){
			if(getSide() == 1){
				g2.setColor(Color.RED);
			}
			else{
				g2.setColor(new Color(238,238,238));
			}
			g2.fillOval(25, 0, 26, 25);
			g2.fillOval(50, 0, 25, 25);
			int[] xPoints = {26,51,74};
			int[] yPoints = {18,45,18};
			g2.fillPolygon(xPoints, yPoints, 3);
		}
		if(getSide() == 2 || getSide() == 4){
			if(getSide() == 2){
				g2.setColor(Color.RED);
			}
			else{
				g2.setColor(new Color(238,238,238));
			}
			g2.fillOval(25, 25, 25, 26);
			g2.fillOval(25, 50, 25, 25);
			int[] xPoints = {33,5,33};
			int[] yPoints = {26,51,74};
			g2.fillPolygon(xPoints, yPoints, 3);
		}
	}
	
	public static void main(String[] args){
		JFrame frame = new JFrame("asdf");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setVisible(true);
		Heart heart = new Heart(2);
		frame.add(heart);
	}
}
