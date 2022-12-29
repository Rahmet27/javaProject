package destan_Library;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class IssueBooks extends JFrame {
    static IssueBooks frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IssueBooks frame = new IssueBooks();
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
	public IssueBooks() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 135, 72));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Issue Book");
		lblNewLabel.setForeground(new Color(40, 40, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(277, 158, 154, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Book Call No:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(189, 199, 90, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Student ID:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(189, 230, 90, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Student Name:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(189, 261, 90, 30);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(295, 205, 227, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(295, 236, 227, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(295, 267, 227, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Issue Book");
		btnNewButton.setBackground(new Color(253, 252, 200));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookcallno=textField.getText();
				int studentid=Integer.parseInt(textField_1.getText());
				String name=textField_2.getText();
				
				
				if(IssueBookDB.checkBook(bookcallno)){
				
				int i=IssueBookDB.save(bookcallno, studentid, name);
				if(i>0){
					JOptionPane.showMessageDialog(IssueBooks.this,"Book issued successfully!");
					UserSection.main(new String[]{});
					frame.dispose();
					
				}else{
					JOptionPane.showMessageDialog(IssueBooks.this,"Sorry, unable to issue!");
				}//end of save if-else
				
				}else{
					JOptionPane.showMessageDialog(IssueBooks.this,"Sorry, Callno doesn't exist!");
				}//end of checkbook if-else
				
			}
		});
		btnNewButton.setBounds(346, 319, 97, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserSection.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(253, 252, 200));
		btnNewButton_1.setBounds(453, 319, 85, 31);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Note: Please check the Student ID carefully before issuing book!");
		lblNewLabel_4.setForeground(new Color(249, 70, 38));
		lblNewLabel_4.setBounds(170, 363, 375, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\My project 2.png"));
		lblNewLabel_5.setBounds(149, 120, 411, 281);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\My project 1.jpg"));
		lblNewLabel_6.setBounds(-63, 0, 747, 461);
		contentPane.add(lblNewLabel_6);
	}

}
