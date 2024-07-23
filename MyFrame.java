package java84;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyFrame extends Frame {
	MyActionListener a;
	public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20
	,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40;
	private Panel p1;
	public Label l1;
	

	public MyFrame() {
		super("calculator");
		setBounds(25,25,1000,700);
		setBackground(Color.GRAY);
		a=new MyActionListener(this);
		
		p1=new Panel();
		p1.setBounds(200,200,500,600);
		p1.setBackground(Color.GREEN);
		p1.setLayout(new GridLayout(8,5) );
		add(p1);
		
		b1=new Button("sin");		
		b1.setBackground(Color.RED);
		b1.addActionListener(a);
		b1.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b1);
		
		b2=new Button("cos");
		b2.setBackground(Color.BLUE);
		b2.addActionListener(a);
		b2.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b2);
		
		b3=new Button("tan");
		b3.setBackground(Color.WHITE);
		b3.addActionListener(a);
		b3.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b3);
		
		b4=new Button("(");
		b4.setBackground(Color.MAGENTA);
		b4.addActionListener(a);
		b4.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b4);
		
		b5=new Button(")");
		b5.setBackground(Color.orange);
		b5.addActionListener(a);
		b5.setFont(new Font("Algerian",Font.BOLD,24));
	    p1.add(b5);
	    

		b6=new Button("sin^-1");
		b6.setBackground(Color.red);
		b6.addActionListener(a);
		b6.setFont(new Font("Algerian",Font.BOLD,24));
	    p1.add(b6);

		b7=new Button("cos^-1");
		b7.setBackground(Color.blue);
		b7.addActionListener(a);
		b7.setFont(new Font("Algerian",Font.BOLD,24));
	    p1.add(b7);

		b8=new Button("tan^-1");
		b8.setBackground(Color.white);
		b8.addActionListener(a);
		b8.setFont(new Font("Algerian",Font.BOLD,24));
	    p1.add(b8);
		
		b9=new Button("π");
		b9.setBackground(Color.magenta);
		b9.addActionListener(a);
		b9.setFont(new Font("Algerian",Font.BOLD,24));
	    p1.add(b9);
	    
	    b10=new Button("e");
		b10.setBackground(Color.orange);
		b10.addActionListener(a);
		b10.setFont(new Font("Algerian",Font.BOLD,24));
	    p1.add(b10);
		
		b11=new Button("x^y");
		b11.setBackground(Color.red);
		b11.addActionListener(a);
		b11.setFont(new Font("Algerian",Font.BOLD,24));
	    p1.add(b11);
		
		b12=new Button("x^3");
		b12.setBackground(Color.blue);
		b12.addActionListener(a);
		b12.setFont(new Font("Algerian",Font.BOLD,24));
	    p1.add(b12);
		
		b13=new Button("x^2");
		b13.setBackground(Color.white);
		b13.addActionListener(a);
		b13.setFont(new Font("Algerian",Font.BOLD,24));
	    p1.add(b13);
		
		b14=new Button("ln");
		b14.setBackground(Color.MAGENTA);
		b14.addActionListener(a);
		b14.setFont(new Font("Algerian",Font.BOLD,24));
	    p1.add(b14);
		
		b15=new Button("log");
		b15.setBackground(Color.orange);
		b15.addActionListener(a);
		b15.setFont(new Font("Algerian",Font.BOLD,24));
	    p1.add(b15);
		
		b16=new Button("y√x");
		b16.setBackground(Color.red);
		b16.addActionListener(a);
		b16.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b16);
		
		b17=new Button("3√x");
		b17.setBackground(Color.blue);
		b17.addActionListener(a);
		b17.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b17);
		
		b18=new Button("2√x");
		b18.setBackground(Color.white);
		b18.addActionListener(a);
		b18.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b18);
		
		b19=new Button("%");
		b19.setBackground(Color.magenta);
		b19.addActionListener(a);
		b19.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b19);
		
		b20=new Button("n!");
		b20.setBackground(Color.orange);
		b20.addActionListener(a);
		b20.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b20);
		

		b21=new Button("1");
		b21.setBackground(Color.red);
		b21.addActionListener(a);
		b21.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b21);
		

		b22=new Button("2");
		b22.setBackground(Color.blue);
		b22.addActionListener(a);
		b22.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b22);

		b23=new Button("3");
		b23.setBackground(Color.white);
		b23.addActionListener(a);
		b23.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b23);
		

		b24=new Button("+");
		b24.setBackground(Color.magenta);
		b24.addActionListener(a);
		b24.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b24);
		

		b25=new Button("back");
		b25.setBackground(Color.orange);
		b25.addActionListener(a);
		b25.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b25);
		

		b26=new Button("4");
		b26.setBackground(Color.red);
		b26.addActionListener(a);
		b26.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b26);
		

		b27=new Button("5");
		b27.setBackground(Color.blue);
		b27.addActionListener(a);
		b27.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b27);
		

		b28=new Button("6");
		b28.setBackground(Color.white);
		b28.addActionListener(a);
		b28.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b28);
		

		b29=new Button("-");
		b29.setBackground(Color.magenta);
		b29.addActionListener(a);
		b29.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b29);
		

		b30=new Button("Ans");
		b30.setBackground(Color.orange);
		b30.addActionListener(a);
		b30.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b30);
		
		b31=new Button("7");
		b31.setBackground(Color.red);
		b31.addActionListener(a);
		b31.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b31);
		
		b32=new Button("8");
		b32.setBackground(Color.blue);
		b32.addActionListener(a);
		b32.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b32);
		
		b33=new Button("9");
		b33.setBackground(Color.white);
		b33.addActionListener(a);
		b33.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b33);
		
		b34=new Button("*");
		b34.setBackground(Color.magenta);
		b34.addActionListener(a);
		b34.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b34);
		
		b35=new Button("AC");
		b35.setBackground(Color.orange);
		b35.addActionListener(a);
		b35.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b35);
		
		b36=new Button("0");
		b36.setBackground(Color.red);
		b36.addActionListener(a);
		b36.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b36);
		
		b37=new Button(".");
		b37.setBackground(Color.blue);
		b37.addActionListener(a);
		b37.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b37);
		
		b38=new Button("=");
		b38.setBackground(Color.white);
		b38.addActionListener(a);
		b38.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b38);
		
		b39=new Button("/");
		b39.setBackground(Color.magenta);
		b39.addActionListener(a);
		b39.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b39);
		
		b40=new Button("Inv");
		b40.setBackground(Color.orange);
		b40.addActionListener(a);
		b40.setFont(new Font("Algerian",Font.BOLD,24));
		p1.add(b40);
		
		

		setLayout(null);
		setVisible(true);
		

		l1=new Label();
		l1.setBounds(200,100,500,50);
		l1.setBackground(Color.yellow);
		l1.setAlignment(Label.RIGHT);
		l1.setFont(new Font("Algerian",Font.BOLD,24));
		add(l1);
	    
addWindowListener(new WindowAdapter() {
			
			public void windowClosing(WindowEvent e) {
				dispose();
			}
});



}
}
