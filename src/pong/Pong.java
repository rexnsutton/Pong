package pong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pong implements ActionListener {

    public static Pong pong;

    public int width = 700, height = 700;

    public Renderer renderer;

    public Pong(){
        Timer timer = new Timer(20, this);

        JFrame jframe = new JFrame("Pong");

        renderer = new Renderer();

        jframe.setSize(width, height);

        jframe.setVisible(true);

        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);

        jframe.add(renderer);

        timer.start();

    }

    public void update(){
        System.out.println("hello world!");
    }

    public void render(Graphics g) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
        renderer.repaint();
    }


    public static void main(String[] args) {
    pong = new Pong();
    }



}
