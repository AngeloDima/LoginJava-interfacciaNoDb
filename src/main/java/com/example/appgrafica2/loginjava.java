package com.example.appgrafica2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class loginjava implements ActionListener {

	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel succes;

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setSize(600, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(panel);

		// USER
		panel.setLayout(null);
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);

		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);

		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 60, 80, 25);
		panel.add(passwordLabel);

		passwordText = new JPasswordField();
		passwordText.setBounds(100, 60, 165, 25);
		panel.add(passwordText);

		// BUTTON
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new loginjava());
		panel.add(button);

		succes = new JLabel("");
		succes.setBounds(10, 110, 300, 25);
		panel.add(succes);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println("user" + ", " + password);

		if (user.equals("Angelo") && password.equals("best")) {
			succes.setText("Loggato!");
		}
	}

}
