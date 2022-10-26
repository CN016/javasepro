package com.my016.GUI_innerclass;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        //创建窗口
        JFrame win = new JFrame("016系统登陆界面");

        JButton btn = new JButton("登录");

        JPanel panel = new JPanel();

        panel.add(btn);

        win.add(panel);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("016NB!!!");
                JOptionPane.showMessageDialog(btn,"016NB!!!");
            }
        });
        win.setSize(1280,720);
        win.setLocationRelativeTo(null);
        win.setVisible(true);


    }
}
