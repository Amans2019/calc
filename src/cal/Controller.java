package cal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Controller implements ActionListener {

	Model model;
	View view;
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == view.add) {
			double v1 = Double.parseDouble(view.T1.getText());
			double v2 = Double.parseDouble(view.T2.getText());
			model.setValue(v1, v2);
			model.add(); 
			view.T3.setText("" + model.getResult());
		}
		else if (e.getSource() == view.sub) {
			double v1 = Double.parseDouble(view.T1.getText());
			double v2 = Double.parseDouble(view.T2.getText());
			model.setValue(v1, v2);
			model.sub(); 
			view.T3.setText("" + model.getResult());
		}
		else if (e.getSource() == view.mul) {
			double v1 = Double.parseDouble(view.T1.getText());
			double v2 = Double.parseDouble(view.T2.getText());
			model.setValue(v1, v2);
			model.mul();
			view.T3.setText("" + model.getResult());
		}
		else if (e.getSource() == view.div) {
			double v1 = Double.parseDouble(view.T1.getText());
			double v2 = Double.parseDouble(view.T2.getText());
			model.setValue(v1, v2);
			model.div(); 
			view.T3.setText("" + model.getResult());
		}
		else if (e.getSource() == view.rem) {
			double v1 = Double.parseDouble(view.T1.getText());
			double v2 = Double.parseDouble(view.T2.getText());
			model.setValue(v1, v2);
			model.remainder(); 
			view.T3.setText("" + model.getResult());
		}
		else if (e.getSource() == view.sqrt) {
			double v1 = Double.parseDouble(view.T1.getText());
			model.setValue(v1, 0.0);
			model.sqrt(); 
			view.T3.setText("" + model.getResult());
		}
	}
	
	public void addModel(Model m){
		this.model = m;
	}

	public void addView(View v){
		this.view = v;
	}

	public void initModel(double v1, double v2){
		model.setValue(v1, v2);
	}

}
