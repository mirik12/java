package MnogoPot;


import javax.swing.*;

public class GUI extends JFrame {
	double percent = 0;
	  final JProgressBar progressBar2 = new JProgressBar();
		JLabel label = new JLabel(" ");
	GUI(){
		setTitle("Progress Bar");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JPanel panel = new JPanel();
			panel.add(label);
		  add(panel);
		
	        progressBar2.setStringPainted(true);
	        progressBar2.setMinimum(0);
	        progressBar2.setMaximum(100);
	        panel.add(progressBar2);
	     
	        progressBar2.setValue((int)percent);
	       
	
	   	setVisible(true);
	}

	void setPercent(int percent) {
		this.percent = percent;
	    progressBar2.setValue(percent);
	    if(percent == 100) {
	    	label.setText("Complite");
	    	this.repaint();
	    	this.validate();
	    }
	}
	
	}
	


