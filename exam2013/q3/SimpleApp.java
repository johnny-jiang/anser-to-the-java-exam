package exam2013.q3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SimpleApp extends JFrame {
	private JLabel label;
	private JTextField txtField;
	private JButton button;
	private int count = 0;

	public SimpleApp() {
		setLayout(new FlowLayout());
		label = new JLabel("Counter");
		add(label);
		txtField = new JTextField(count + "", 10);
		txtField.setEditable(false); // The text field is read-only.
		add(txtField);
		button = new JButton("Count");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				 int a = Integer.parseInt(txtField.getText()) + 1;
				 txtField.setText(String.valueOf(a));
			}
		});
		add(button);
		setSize(250, 100);
		setTitle("SimpleCounter");
		setVisible(true);
	}


	public void buttonActionPerformed(ActionEvent evt) {
		 int a = Integer.parseInt(txtField.getText()) + 1;
		 txtField.setText(String.valueOf(a));
	}

	public static void main(String[] args) {
		new SimpleApp();
	}
}