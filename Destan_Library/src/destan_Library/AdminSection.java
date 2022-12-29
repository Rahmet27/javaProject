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
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.sql.*;
import javax.swing.ImageIcon;

public class AdminSection extends JFrame {
    static AdminSection frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSection frame = new AdminSection();
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
	public AdminSection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(253, 252, 200));
		contentPane.setBackground(new Color(204, 135, 72));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(253, 252, 200)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Admin Section");
		lblNewLabel.setForeground(new Color(40, 40, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(221, 146, 258, 37);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Add User");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Downloads\\My_project__12_-removebg-preview.png"));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(253, 252, 200));
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Userform.main(new String[]{});
				dispose();
			}
		});
		btnNewButton.setBounds(164, 194, 175, 53);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View User");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\View user.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewUser.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(253, 252, 200));
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_1.setBounds(349, 194, 184, 53);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete User");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\Delete.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteUser.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(new Color(253, 252, 200));
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_2.setBounds(349, 258, 184, 51);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("  Logout");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\exit.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryMain.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setBackground(new Color(253, 252, 200));
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_3.setBounds(349, 320, 184, 53);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Add Book");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Downloads\\My_project__14_-removebg-preview.png"));
		btnNewButton_4.setBackground(new Color(253, 252, 200));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddBook.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_4.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_4.setBounds(164, 258, 175, 53);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("View Issued");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Downloads\\My_project__15_-removebg-preview.png"));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewIssuedBooks.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_5.setBackground(new Color(253, 252, 200));
		btnNewButton_5.setFont(new Font("Calibri", Font.PLAIN, 18));
		btnNewButton_5.setBounds(164, 320, 175, 53);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\My project 2.png"));
		lblNewLabel_1.setBounds(147, 111, 400, 307);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\My project 1.jpg"));
		lblNewLabel_2.setBounds(-71, 0, 755, 472);
		contentPane.add(lblNewLabel_2);
	}
}
