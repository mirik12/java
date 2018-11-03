package hw1;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GUI extends JFrame {
    JLabel label = new JLabel("Choose your language");
    JRadioButton enButton = new JRadioButton(new ImageIcon("images/hw1/en.png"));
    JRadioButton uaButton = new JRadioButton(new ImageIcon("images/hw1/ua.png"));
    JRadioButton chinaButton = new JRadioButton(new ImageIcon("images/hw1/ch.png"));
    Pudge pudge = new Pudge();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    
    GUI(){
        super("Pudge says...");
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout());
        label3.setIcon(new ImageIcon("images/hw1/pudge.png"));
        panel.add(label3);
    
        panel.add(label);
        panel.add(enButton);
        panel.add(uaButton);
        panel.add(chinaButton);
        panel.add(label2);
        add(panel);
        initListener();
        setSize(1000, 1000);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initListener() {
        enButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {

                pudge.setLan("en");
                pudge.setCountry("EN");
                pudge.setLocale("en","EN");
                label2.setText(pudge.saySomething());
            }
        });
        
        uaButton.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent arg0) {
                pudge.setLan("ua");
                pudge.setCountry("UA");
                pudge.setLocale("ua","UA");
                label2.setText(pudge.saySomething());
            }
        });
        
        chinaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                pudge.setLan("ch");
                pudge.setCountry("CH");
                pudge.setLocale("ch","CH");
                label2.setText(pudge.saySomething());
            }
        });
        
        
    }
}