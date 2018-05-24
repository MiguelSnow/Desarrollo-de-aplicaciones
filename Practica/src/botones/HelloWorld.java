package botones;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld extends JFrame
{
	private JLabel lbl_hello,lbl_hello1,lbl_hello2;
	
	public HelloWorld() 
	{
		super("HelloWorld!!!");
		setLayout(new FlowLayout());
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lbl_hello=new JLabel("HelloWorld!!!");
		lbl_hello1=new JLabel("HelloWorld!!!");
		lbl_hello2=new JLabel("HelloWorld!!!");
		
		add(lbl_hello);
		add(lbl_hello1);
		add(lbl_hello2);
		
		
		setVisible(true);
	}
	public static void main (String []args) 
	{
		HelloWorld ventana=new HelloWorld();
	}
}