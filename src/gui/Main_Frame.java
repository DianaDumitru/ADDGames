package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;


public class Main_Frame {

	private JFrame MainFrame_applicationWindow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Frame window = new Main_Frame();
					window.MainFrame_applicationWindow.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public Main_Frame() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MainFrame_applicationWindow = new JFrame();
		MainFrame_applicationWindow.setResizable(false);
		MainFrame_applicationWindow.setTitle("ADDGames App");
		MainFrame_applicationWindow.getContentPane().setBackground(new Color(0, 0, 51));
		MainFrame_applicationWindow.setBounds(100, 100, 840, 603);
		MainFrame_applicationWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame_applicationWindow.getContentPane().setLayout(null);
		
		JPanel profilePanel = new JPanel();
		profilePanel.setBackground(new Color(25, 25, 112));
		profilePanel.setBounds(54, 29, 382, 97);
		MainFrame_applicationWindow.getContentPane().add(profilePanel);
		profilePanel.setLayout(null);
		
		JLabel profileLabel = new JLabel("PROFILE");
		profileLabel.setForeground(new Color(173, 216, 230));
		profileLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		profileLabel.setBounds(10, 11, 102, 23);
		profilePanel.add(profileLabel);
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setForeground(new Color(173, 216, 230));
		usernameLabel.setBounds(30, 40, 102, 14);
		profilePanel.add(usernameLabel);
		
		JLabel rankLabel = new JLabel("Rank:");
		rankLabel.setForeground(new Color(173, 216, 230));
		rankLabel.setBounds(30, 61, 102, 14);
		profilePanel.add(rankLabel);
		
		JLabel usernameContentLabel = new JLabel("");
		usernameContentLabel.setBounds(127, 40, 183, 14);
		profilePanel.add(usernameContentLabel);
		
		JLabel rankContentLabel = new JLabel("");
		rankContentLabel.setBounds(127, 61, 183, 14);
		profilePanel.add(rankContentLabel);
		
		JList oponentList = new JList();
		oponentList.setBackground(new Color(25, 25, 112));
		oponentList.setBounds(509, 190, 250, 324);
		MainFrame_applicationWindow.getContentPane().add(oponentList);
		
		JLabel gamePickLabel = new JLabel(" Pick your favourite game then....");
		gamePickLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		gamePickLabel.setForeground(new Color(173, 216, 230));
		gamePickLabel.setBounds(54, 151, 312, 28);
		MainFrame_applicationWindow.getContentPane().add(gamePickLabel);
		
		JLabel oponentPickLabel = new JLabel("  ....pick your enemy");
		oponentPickLabel.setForeground(new Color(173, 216, 230));
		oponentPickLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		oponentPickLabel.setBounds(509, 151, 189, 29);
		MainFrame_applicationWindow.getContentPane().add(oponentPickLabel);
		
		JButton tictactoeButton = new JButton("Play>>");
		tictactoeButton.setBounds(347, 326, 89, 23);
		MainFrame_applicationWindow.getContentPane().add(tictactoeButton);
		
		JButton airplanesButton = new JButton("Play>>");
		airplanesButton.setBounds(347, 491, 89, 23);
		MainFrame_applicationWindow.getContentPane().add(airplanesButton);
		
		JLabel tictactoeLabel = new JLabel("");
		tictactoeLabel.setBounds(54, 191, 382, 130);
		tictactoeLabel.setIcon(new ImageIcon(".\\res\\tictactoe.png"));
		MainFrame_applicationWindow.getContentPane().add(tictactoeLabel);
		
		JLabel airplanesLabel = new JLabel("");
		airplanesLabel.setBounds(54, 356, 382, 130);
		airplanesLabel.setIcon(new ImageIcon(".\\res\\airplanes.png"));
		MainFrame_applicationWindow.getContentPane().add(airplanesLabel);
		
	}
}
