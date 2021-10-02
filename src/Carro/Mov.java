package Carro;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.*; 

public class Mov extends JPanel { 
	
	JLabel  lb2, lb3; 
	JButton bt1, bt2;
	int pose;
	ImageIcon img1, img2;
	
public Mov(){
	InicializarComponentes();
	DefinirEventos();
	
}

public void InicializarComponentes(){
	 setLayout(null);
	 
	 img1 = new ImageIcon("C:\\Users\\gabriel  feitosa\\Pictures\\carro.png");
	 img2 = new ImageIcon("C:\\Users\\gabriel  feitosa\\Pictures\\rua.jpg");
	 
	 
	 lb2 = new JLabel(img1);
	 lb3 = new JLabel(img2);
	 
	 bt1 = new JButton("<--");
	 bt2 = new JButton("-->");
	
	 
	 lb3.setBounds(0, 10,470,200);
	 bt1.setBounds(150, 200, 70,30);
	 bt2.setBounds(250,200, 70,30);
	
	 add(lb2);
	 add(lb3);
	 add(bt1);
	 add(bt2);
}
public void DefinirEventos(){
	bt1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){	
			lb2.setBounds(pose, 50, 500, 100);
			
			pose= pose - 10 ;	
			}	
	});
	
	bt2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){	
				lb2.setBounds(pose, 50, 500, 100);
				
				pose= pose + 10 ;
			}	
	});
	
}

public static void main(String args[]){
	
	 JFrame frame = new JFrame("Janela com imagem");
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.getContentPane().add(new movimento()); 
	
	 frame.setVisible(true);
}
}




