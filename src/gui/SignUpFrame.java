package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import database.DatabaseOperations;
import networking.Player;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpFrame extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JPasswordField confirmPasswordField;
	private JLabel logoLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpFrame frame = new SignUpFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUpFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setForeground(new Color(0, 0, 51));
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		usernameLabel.setBounds(112, 169, 83, 17);
		contentPane.add(usernameLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(239, 169, 246, 20);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setForeground(new Color(0, 0, 51));
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordLabel.setBounds(112, 219, 83, 19);
		contentPane.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(239, 219, 246, 20);
		contentPane.add(passwordField);
		
		JLabel passwordConfirmLabel = new JLabel("Confirm password");
		passwordConfirmLabel.setForeground(new Color(0, 0, 51));
		passwordConfirmLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordConfirmLabel.setBounds(48, 270, 147, 17);
		contentPane.add(passwordConfirmLabel);
		
		confirmPasswordField = new JPasswordField();
		confirmPasswordField.setBounds(239, 270, 246, 20);
		contentPane.add(confirmPasswordField);
		
		JButton signupButton = new JButton("Sign Up");
		signupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		signupButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		signupButton.setForeground(new Color(0, 0, 51));
		signupButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Player p = new Player();
				p.setUsername(usernameField.getText());
				p.setPassword(new String(passwordField.getPassword()));
				
				//mai trb verificat daca confirmpassword egala cu password
				
				System.out.println(p);
				DatabaseOperations.insertPlayer(p);
				}
		});
		signupButton.setBounds(186, 335, 147, 27);
		contentPane.add(signupButton);
		
		JLabel lblWelcomePleaseSign = new JLabel("WELCOME!");
		lblWelcomePleaseSign.setForeground(new Color(0, 0, 51));
		lblWelcomePleaseSign.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWelcomePleaseSign.setBounds(217, 70, 95, 46);
		contentPane.add(lblWelcomePleaseSign);
	}
}
