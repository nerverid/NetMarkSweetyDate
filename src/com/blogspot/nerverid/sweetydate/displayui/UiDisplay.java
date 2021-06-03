package com.blogspot.nerverid.sweetydate.displayui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class UiDisplay {

    private JFrame frame = new JFrame();

    public UiDisplay() {
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createFileMenu());
        menuBar.add(createViewMenu());

        frame.setJMenuBar(menuBar);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    private JMenu createFileMenu (){
        JMenu file = new JMenu("File");
        JMenuItem open = new  JMenuItem ("Open", new ImageIcon("images/open.png"));
        JMenuItem exit = new JMenuItem(new ExitAction());
        exit.setIcon(new ImageIcon("images/exit.png"));
        file.add(open);
        file.addSeparator();
        file.add(exit);

        open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("It's open");
            }
        });
        return file;
    }

    private JMenu createViewMenu(){
        JMenu viewMenu = new JMenu("View");
        JMenuItem find = new JMenuItem("Find");
        viewMenu.add(find);
        return viewMenu;
    }

    class ExitAction extends AbstractAction{
         private static final long serialVersionUID = 1L;
         ExitAction(){
             putValue(NAME, "Exit");
         }
         public void actionPerformed (ActionEvent e){
             System.exit(0);
         }
    }
}
