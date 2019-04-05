package cal;

import java.awt.Button;
import java.awt.Panel;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.WindowEvent;	//for CloseListener()
import java.awt.event.WindowAdapter;	//for CloseListener()
import java.lang.Integer;		//int from Model is passed as an Integer
import java.util.Observable;		//for update();
import java.awt.event.ActionListener;	//for addController()


class View {

	TextField T1, T2, T3;
	Button add, sub, div, mul, rem, sqrt; 

	public View() {
		
		Frame frame = new Frame("Calculator");

		Panel p1 = new Panel();
		T1 = new TextField(8);
		T2 = new TextField(8);
		T3 = new TextField(8);
		T3.setEditable(false);
		p1.add(T1);
		p1.add(T2);
		p1.add(T3);
		frame.add("North", p1);
		
		
		Panel p2 = new Panel();
		add = new Button("          +          ");
		sub = new Button("          -          ");
		div = new Button("          /          ");
		mul = new Button("          *          ");
		rem = new Button("          %          ");
		sqrt = new Button("     Square root     ");

		p2.add(add);
		p2.add(sub);
		p2.add(div);
		p2.add(mul);
		p2.add(rem);
		frame.add("Center", p2);
		
		
		Panel p3 = new Panel();
		p3.add(sqrt);
		frame.add("South", p3);
		
		
		frame.addWindowListener(new CloseListener());	
		frame.setSize(300,160);
		frame.setLocation(100,100);
		frame.setVisible(true);
		frame.setResizable(false);

	}


	public void setValue(double v1, double v2, double v3){
		T1.setText("" + v1);
		T2.setText("" + v2);
		T3.setText("" + v3);
	}
    	
	public void addController(ActionListener controller){
		add.addActionListener(controller);
		sub.addActionListener(controller);
		div.addActionListener(controller);
		mul.addActionListener(controller);
		rem.addActionListener(controller);
		sqrt.addActionListener(controller);
	}

	public static class CloseListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			e.getWindow().setVisible(false);
			System.exit(0);
		}
	}

}
