/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tictac;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Md. Mahfuzur Rahman
 */
public class Java_TicTak_JFrame extends javax.swing.JFrame {

    private JFrame frame;

    private String startGame="x";
    private  int xcount=0;
    private  int ocount=0;
    boolean checker;
    
    public Java_TicTak_JFrame() {
        initComponents();
    }
    private void gameSoore()
    {
        jbPlayerX.setText(String.valueOf(xcount));
        jbPlayerO.setText(String.valueOf(ocount));
    }
    
    private void choose_a_player()
    {
        if (startGame.equalsIgnoreCase("x"))
        {
            startGame="o";
        }
        else
        {
            startGame="x";
        }
    }
    
     private void winningGame()
    {
       String b1= jButton4.getText();
       String b2= jButton3.getText(); 
       String b3= jButton1.getText();
       String b4= jButton7.getText();
       String b5= jButton6.getText(); 
       String b6= jButton2.getText(); 
       String b7= jButton8.getText();
       String b8= jButton9.getText(); 
       String b9= jButton10.getText(); 
       
        
       if(b1.equals("x")&& b2.equals("x")&& b3.equals("x"))
       {
              jButton4.setEnabled(true);
              jButton3.setEnabled(true);
              jButton1.setEnabled(true);
              
              jButton4.setBackground(Color.blue);
              jButton3.setBackground(Color.blue);
              jButton1.setBackground(Color.blue);
        
         xcount++;
        gameSoore();
        
        JOptionPane.showMessageDialog( this,"player X win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
     
        
        
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
 
       
        
             /* jButton4.setEnabled(true);
              jButton3.setEnabled(true);
              jButton1.setEnabled(true);
              
        jButton4.setBackground(Color.blue);
        jButton3.setBackground(Color.blue);
        jButton1.setBackground(Color.blue);*/
       
         
       }
      
       
        if(b4.equals("x")&& b5.equals("x")&& b6.equals("x"))
       {
              jButton7.setEnabled(true);
              jButton6.setEnabled(true);
              jButton2.setEnabled(true);
              
              jButton7.setBackground(Color.cyan);
              jButton6.setBackground(Color.cyan);
              jButton2.setBackground(Color.cyan); 
               xcount++;
        gameSoore();
        
        JOptionPane.showMessageDialog( this,"player X win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
       
         
       }
        
         if(b7.equals("x")&& b8.equals("x")&& b9.equals("x"))
       {
           
              jButton8.setEnabled(true);
              jButton9.setEnabled(true);
              jButton10.setEnabled(true);
              
        jButton8.setBackground(Color.ORANGE);
        jButton9.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE); 
        xcount++;
        gameSoore();
        
        JOptionPane.showMessageDialog( this,"player x win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
        
       }
         
         if(b1.equals("x")&& b4.equals("x")&& b7.equals("x"))
       {
           jButton7.setEnabled(true);
              jButton4.setEnabled(true);
              jButton8.setEnabled(true);
              
              jButton4.setBackground(Color.MAGENTA);
        jButton7.setBackground(Color.MAGENTA);
        jButton8.setBackground(Color.MAGENTA); 
        xcount++;
        gameSoore();
        
        JOptionPane.showMessageDialog( this,"player x win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
       }  
       
       if(b2.equals("x")&& b5.equals("x")&& b8.equals("x"))
       {
            jButton3.setEnabled(true);
              jButton6.setEnabled(true);
              jButton9.setEnabled(true);
              
              jButton3.setBackground(Color.PINK);
        jButton6.setBackground(Color.PINK);
        jButton9.setBackground(Color.PINK); 
        xcount++;
        gameSoore();
           
        JOptionPane.showMessageDialog( this,"player x win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
       
       } 
       
        if(b3.equals("x")&& b6.equals("x")&& b9.equals("x"))
       {
           
           jButton1.setEnabled(true);
              jButton2.setEnabled(true);
              jButton10.setEnabled(true);
              
              jButton1.setBackground(Color.DARK_GRAY);
        jButton2.setBackground(Color.DARK_GRAY);
        jButton10.setBackground(Color.DARK_GRAY); 
        xcount++;
        gameSoore();
        JOptionPane.showMessageDialog( this,"player x win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
       
       } 
        
        if(b1.equals("x")&& b5.equals("x")&& b9.equals("x"))
       {
          jButton4.setEnabled(true);
              jButton6.setEnabled(true);
              jButton10.setEnabled(true); 
              
               jButton4.setBackground(Color.yellow);
        jButton6.setBackground(Color.yellow);
        jButton10.setBackground(Color.yellow); 
        xcount++;
        gameSoore();
          
        JOptionPane.showMessageDialog( this,"player x win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
       }
        
         if(b3.equals("x")&& b5.equals("x")&& b7.equals("x"))
       {
            jButton1.setEnabled(true);
              jButton6.setEnabled(true);
              jButton8.setEnabled(true);
              
              jButton1.setBackground(Color.red);
        jButton6.setBackground(Color.red);
        jButton8.setBackground(Color.red); 
        xcount++;
        gameSoore();
        JOptionPane.showMessageDialog( this,"player x win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
       }
       
       if(b7.equals("o")&& b8.equals("o")&& b9.equals("o"))
       {
           jButton10.setEnabled(true);
              jButton9.setEnabled(true);
              jButton8.setEnabled(true);
              
              jButton8.setBackground(Color.ORANGE);
        jButton9.setBackground(Color.ORANGE);
        jButton10.setBackground(Color.ORANGE); 
        ocount++;
       gameSoore();
           
        JOptionPane.showMessageDialog( this,"player 0 win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
       } 
       
       if(b1.equals("o")&& b2.equals("o")&& b3.equals("o"))
       {
            jButton1.setEnabled(true);
              jButton3.setEnabled(true);
              jButton4.setEnabled(true);
              
              jButton4.setBackground(Color.CYAN);
        jButton3.setBackground(Color.CYAN);
        jButton1.setBackground(Color.CYAN); 
        ocount++;
        gameSoore();
           
        JOptionPane.showMessageDialog( this,"player O win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
       }
       
        if(b4.equals("o")&& b5.equals("o")&& b6.equals("o"))
       {
            jButton7.setEnabled(true);
              jButton6.setEnabled(true);
              jButton2.setEnabled(true);
              
               jButton7.setBackground(Color.BLUE);
        jButton6.setBackground(Color.BLUE);
        jButton2.setBackground(Color.BLUE); 
        ocount++;
        gameSoore();
           
        JOptionPane.showMessageDialog( this,"player O win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
       
       }
        
       if(b1.equals("o")&& b4.equals("o")&& b7.equals("o"))
       {
           
            jButton4.setEnabled(true);
              jButton7.setEnabled(true);
              jButton8.setEnabled(true);
              
              jButton4.setBackground(Color.DARK_GRAY);
        jButton7.setBackground(Color.DARK_GRAY);
        jButton8.setBackground(Color.DARK_GRAY); 
        ocount++;
        gameSoore();
        JOptionPane.showMessageDialog( this,"player O win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
       
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
       
       }
       
       if(b2.equals("o")&& b5.equals("o")&& b8.equals("o"))
       {
            jButton3.setEnabled(true);
              jButton6.setEnabled(true);
              jButton9.setEnabled(true);
              
              jButton3.setBackground(Color.GRAY);
        jButton6.setBackground(Color.GRAY);
        jButton9.setBackground(Color.GRAY); 
        ocount++;
        gameSoore();
           
        JOptionPane.showMessageDialog( this,"player O win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
       } 
       
       if(b3.equals("o")&& b6.equals("o")&& b9.equals("o"))
       {
           jButton1.setEnabled(true);
              jButton2.setEnabled(true);
              jButton10.setEnabled(true);
              
               jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY); 
        ocount++;
        gameSoore();
              
        JOptionPane.showMessageDialog( this,"player O win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
       } 
       
       if(b1.equals("o")&& b5.equals("o")&& b9.equals("o"))
       {
           jButton4.setEnabled(true);
              jButton6.setEnabled(true);
              jButton10.setEnabled(true);
              
               jButton4.setBackground(Color.PINK);
        jButton6.setBackground(Color.PINK);
        jButton10.setBackground(Color.PINK); 
        ocount++;
        gameSoore();
              
        JOptionPane.showMessageDialog( this,"player O win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
       
       }
       if(b3.equals("o")&& b5.equals("o")&& b7.equals("o"))
       {
            jButton1.setEnabled(true);
              jButton6.setEnabled(true);
              jButton8.setEnabled(true);
              
               jButton1.setBackground(Color.GREEN);
        jButton6.setBackground(Color.GREEN);
        jButton8.setBackground(Color.GREEN); 
        ocount++;
        gameSoore();
           
        JOptionPane.showMessageDialog( this,"player O win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
      
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
       
       }
       
       
       
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jbPlayerO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbPlayerX = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setForeground(new java.awt.Color(105, 29, 29));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 150, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(95, 150, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 500, 400));

        jPanel7.setBackground(new java.awt.Color(95, 150, 160));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(95, 150, 160));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 500, 400));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 500, 400));

        jPanel9.setBackground(new java.awt.Color(204, 102, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(95, 150, 160));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(95, 150, 160));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 500, 400));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 500, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Player O :");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 79, -1, 50));

        jbPlayerO.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jbPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbPlayerO.setText("0");
        jbPlayerO.setOpaque(true);
        jPanel9.add(jbPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 190, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("Player X :");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 60));

        jbPlayerX.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jbPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbPlayerX.setText("0");
        jbPlayerX.setToolTipText("");
        jbPlayerX.setOpaque(true);
        jbPlayerX.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jbPlayerXAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel9.add(jbPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 190, 50));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 140));

        jPanel12.setBackground(new java.awt.Color(95, 150, 160));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBackground(new java.awt.Color(95, 150, 160));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(95, 150, 160));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 500, 400));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 500, 400));

        jButton11.setFont(new java.awt.Font("Sylfaen", 3, 40)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 153, 0));
        jButton11.setText("New Game");
        jButton11.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton11.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton11.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 80));

        jButtonExit.setFont(new java.awt.Font("Sylfaen", 3, 40)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(153, 0, 0));
        jButtonExit.setText("Exit");
        jButtonExit.setMaximumSize(new java.awt.Dimension(200, 158));
        jButtonExit.setMinimumSize(new java.awt.Dimension(200, 158));
        jButtonExit.setPreferredSize(new java.awt.Dimension(200, 158));
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 230, 70));

        jButtonReset.setFont(new java.awt.Font("Sylfaen", 3, 40)); // NOI18N
        jButtonReset.setForeground(new java.awt.Color(153, 153, 0));
        jButtonReset.setText("Reset");
        jButtonReset.setMaximumSize(new java.awt.Dimension(200, 158));
        jButtonReset.setMinimumSize(new java.awt.Dimension(200, 158));
        jButtonReset.setPreferredSize(new java.awt.Dimension(200, 158));
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        jPanel12.add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 70));

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 500, 180));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 520, 350));

        jPanel3.setBackground(new java.awt.Color(95, 150, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(95, 150, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(95, 150, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 500, 400));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 500, 400));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton1.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton1.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 160, 110));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton2.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 160, 100));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton3.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton3.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 160, 110));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton4.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton4.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton4.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 110));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton6.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton6.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 160, 100));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton7.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton7.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, 100));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton8.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton8.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 160, 100));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton9.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton9.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 160, 100));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton10.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton10.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton10.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 160, 100));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 520, 350));

        jPanel15.setBackground(new java.awt.Color(0, 153, 153));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 153));
        jLabel4.setText("Java Advance Tic Tac Toc Game");
        jPanel15.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 810, 90));

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1090, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setText(startGame);
        if(startGame.equalsIgnoreCase(startGame))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setText(startGame);
        if(startGame.equalsIgnoreCase(startGame))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
         frame = new JFrame("Exit");

    if (JOptionPane.YES_OPTION!=JOptionPane.showConfirmDialog( frame,"confirm if you Want to Exit","Tic Tac Toe",
            JOptionPane.YES_NO_OPTION)) {
        } else {
        System.exit(0);
        }
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        jButton4.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton10.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
         jbPlayerX.setText(String.valueOf(xcount=0));
        jbPlayerO.setText(String.valueOf(ocount=0));
       
       jbPlayerX.setText("0");
       jbPlayerO.setText("0");
        
        jButton4.setText("");
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton10.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton10.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setText(startGame);
        if(startGame.equalsIgnoreCase(startGame))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();
        jButton4.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.setText(startGame);
        if(startGame.equalsIgnoreCase(startGame))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jButton7.setText(startGame);
        if(startGame.equalsIgnoreCase(startGame))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();
        jButton7.setEnabled(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jButton6.setText(startGame);
        if(startGame.equalsIgnoreCase(startGame))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();
        jButton6.setEnabled(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText(startGame);
        if(startGame.equalsIgnoreCase(startGame))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();
        jButton8.setEnabled(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jButton9.setText(startGame);
        if(startGame.equalsIgnoreCase(startGame))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();
        jButton9.setEnabled(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         jButton10.setText(startGame);
        if(startGame.equalsIgnoreCase(startGame))
        {
            checker=false;
        }
        else
        {
            checker=true;
        }
        choose_a_player();
        winningGame();
        jButton10.setEnabled(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jbPlayerXAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jbPlayerXAncestorAdded
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jbPlayerXAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_TicTak_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Java_TicTak_JFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jbPlayerO;
    private javax.swing.JLabel jbPlayerX;
    // End of variables declaration//GEN-END:variables

    private void setvible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void gamesour() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void gameScour() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object $(Java_TicTak_JFrame aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object $(String spantest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
