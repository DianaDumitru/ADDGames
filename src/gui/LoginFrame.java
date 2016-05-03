package gui;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import database.DatabaseHandler;
import database.DatabaseOperations;
import networking.Player;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JLabel wrongPasswordLabel;
	private JLabel wrongUsernameLabel;
	private JLabel signUpLabel;
	private JLabel logoLabel;
	private static LoginFrame frame = new LoginFrame();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close()
	{
		WindowEvent winclosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclosing);
	}
	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setResizable(false);
		setTitle("ADDGames App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		logoLabel = new JLabel("");
		logoLabel.setIcon(new ImageIcon(".\\res\\logo.png"));
		logoLabel.setBounds(62, 11, 212, 189);
		contentPane.add(logoLabel);
		
		signUpLabel = new JLabel("You don't have an account? ");
		signUpLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		signUpLabel.setForeground(new Color(0, 0, 51));
		signUpLabel.setBounds(310, 75, 175, 20);
		contentPane.add(signUpLabel);
		
		JButton signupButton = new JButton("Sign Up");
		signupButton.setForeground(new Color(0, 0, 51));
		signupButton.addMouseListener(new MouseAdapter() {
			
		/*@Override
		public void mouseClicked(MouseEvent arg0) {
			Player p = new Player();
			p.setUsername(usernameField.getText());
			p.setPassword(new String(passwordField.getPassword()));
			System.out.println(p);
			DatabaseOperations.insertPlayer(p);
			}*/
			@Override
			public void mouseClicked(MouseEvent e) {
				
				SignUpFrame signFrame = new SignUpFrame();
				signFrame.main(null);
				
				frame.close();
					
			}
			
		});
		signupButton.setBounds(352, 105, 91, 23);
		contentPane.add(signupButton);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setForeground(new Color(0, 0, 51));
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		usernameLabel.setBounds(82, 239, 83, 17);
		contentPane.add(usernameLabel);
		
		usernameField = new JTextField();
		usernameField.setBounds(239, 239, 246, 20);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		wrongUsernameLabel = new JLabel("");
		wrongUsernameLabel.setForeground(Color.RED);
		wrongUsernameLabel.setBounds(82, 214, 260, 14);
		contentPane.add(wrongUsernameLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setForeground(new Color(0, 0, 51));
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		passwordLabel.setBounds(82, 296, 83, 17);
		contentPane.add(passwordLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(240, 296, 246, 20);
		contentPane.add(passwordField);
		
		JButton loginButton = new JButton("Log in");
		loginButton.setForeground(new Color(0, 0, 51));
		loginButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		
		loginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				wrongPasswordLabel.setText("");
				wrongUsernameLabel.setText("");
				Player player = new Player();
				player.setUsername(usernameField.getText());
				player.setPassword(new String(passwordField.getPassword()));
				System.out.println(player);
				String res = null;
				//JOptionPane.showMessageDialog(null,( res =  DatabaseOperations.searchPlayer(player))); 
				res =  DatabaseOperations.searchPlayer(player);
				if (res.equals("WRONG PASSWORD")){
					wrongPasswordLabel.setText(res);
					passwordField.setText("");
				}
				if(res.equals("WRONG USERNAME")){
					wrongUsernameLabel.setText(res);
					usernameField.setText("");
					passwordField.setText("");
				}
			}
		});
		
		wrongPasswordLabel = new JLabel("");
		wrongPasswordLabel.setForeground(Color.RED);
		wrongPasswordLabel.setBounds(82, 271, 260, 14);
		contentPane.add(wrongPasswordLabel);
		loginButton.setBounds(195, 352, 141, 23);
		contentPane.add(loginButton);
		
		/*
		JButton	btnRun = new JButton("run");
		btnRun.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main_Frame mainFrame = new Main_Frame();
				mainFrame.main(null);
				frame.setVisible(false);
			}
		});
		
		btnRun.setBounds(354, 161, 89, 23);
		contentPane.add(btnRun);
		validate();
		*/
	}
}
