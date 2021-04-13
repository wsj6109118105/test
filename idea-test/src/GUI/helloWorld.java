package GUI;

import javax.swing.*;

public class helloWorld {
    public static void create() {
        JFrame frame =new JFrame("helloWorld");    //创建带有标题窗口
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //设置关闭窗体时自动关闭窗口
        JLabel label =new JLabel("hello world");     //创建带有文字内容的标签对象
        frame.getContentPane().add(label);        //将获得的标签对象添加到内容面板
        frame.pack();   //显示窗体
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                create();
            }
        });
    }
}
