package com.project;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;

public class WelcomePage {
   public static void main(String[] args) {
      Frame f = new Frame("PhaseOne_Project");
      Component text = new TextArea("WELCOME!!!");
      Component button = new Button("Next");
      f.add(text, BorderLayout.NORTH);
      f.add(button, BorderLayout.SOUTH);
      int width = 300;
      int height = 300;
      f.setSize(width, height);
      f.setVisible(true);
   } 
}