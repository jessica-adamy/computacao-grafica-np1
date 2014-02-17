/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.unifor;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
    http://stackoverflow.com/questions/7047749/painting-pixels-images-in-java
*/

public class Principal extends Canvas {
    private static final int WIDTH = 50;
    private static final int HEIGHT = 50;
    private static final Random random = new Random();

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for(int x = 10; x < 11; x++) {
            for(int y = 10; y < 11; y++) {
                g.setColor(randomColor());
                g.drawLine(x, y, x, y);
            }
        }
    }

    private Color randomColor() {
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(WIDTH, HEIGHT);
        frame.add(new Principal());

        frame.setVisible(true);
    }
}