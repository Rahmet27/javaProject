package destan_Library;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class Userform extends JFrame {
    static Userform frame;
	private JPanel contentPane;
    private JTextField txtname;
	private JPasswordField passwordField;
	private JTextField txtemail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Userform frame = new Userform();
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
	public Userform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 135, 72));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(253, 252, 200)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add User");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(40, 40, 40));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBackground(new Color(204, 135, 72));
		lblNewLabel.setBounds(260, 150, 175, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Username:");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setForeground(new Color(65, 65, 65));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(165, 196, 89, 34);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setForeground(new Color(65, 65, 65));
		lblNewLabel_3.setBounds(165, 238, 85, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email:");
		lblNewLabel_4.setForeground(new Color(65, 65, 65));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(165, 279, 53, 25);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("Add User");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=txtname.getText();
				String password=String.valueOf(passwordField.getPassword());
				String email=txtemail.getText();
				

				int i=UserDB.save(name, password, email);
				if(i>0){
					JOptionPane.showMessageDialog(Userform.this,"Librarian added successfully!");
					AdminSection.main(new String[]{});
					dispose();
					
				}else{
					JOptionPane.showMessageDialog(Userform.this,"Sorry, unable to save!");
				}
				
				
			}
				
		});
		
	
			
		btnNewButton.setBackground(new Color(253, 252, 200));
		btnNewButton.setForeground(new Color(65, 65, 65));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(336, 341, 105, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSection.main(new String[]{});
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(253, 252, 200));
		btnNewButton_1.setForeground(new Color(65, 65, 65));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(451, 341, 79, 30);
		contentPane.add(btnNewButton_1);
		
		txtname = new JTextField();
		txtname.setBounds(252, 203, 278, 25);
		contentPane.add(txtname);
		txtname.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setBounds(252, 280, 278, 27);
		contentPane.add(txtemail);
		txtemail.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(252, 241, 278, 25);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\My project 2.png"));
		lblNewLabel_1.setBounds(153, 110, 416, 302);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\My project 1.jpg"));
		lblNewLabel_5.setBounds(-54, 0, 738, 461);
		contentPane.add(lblNewLabel_5);
		
	}

}
