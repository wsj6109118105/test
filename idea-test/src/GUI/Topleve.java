package GUI;

import javax.swing.*;
import java.awt.*;

public class Topleve {
    public static void createshow() {
        //创建并设置窗体
        JFrame frame=new JFrame("Topleve");//写标题
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗体自动推出程序
        //创建一个菜单栏，背景设置为蓝色
        JMenuBar greenMenubar =new JMenuBar();
        greenMenubar.setOpaque(true);         //将菜单栏背景设置为不透明
        greenMenubar.setBackground(new Color(154,165,127));// 设置菜单栏背景
        greenMenubar.setPreferredSize(new Dimension(200,20));//设置菜单栏大小
        JLabel yellow =new JLabel();   //创建一个黄色标签放入面板中
        yellow.setOpaque(true);
        yellow.setBackground(new Color(248,213,131));//设置背景颜色
        yellow.setPreferredSize(new Dimension(200,180));//设置大小
        frame.setJMenuBar(greenMenubar);//将菜单栏添加到窗体上
        frame.getContentPane().add(yellow,BorderLayout.CENTER);//向窗体内容面板添加标签
        frame.pack();//显示
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createshow();
            }
        });
    }
}
