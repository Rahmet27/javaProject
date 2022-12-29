package destan_Library;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DeleteUser extends JFrame {
    static DeleteUser frame;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteUser frame = new DeleteUser();
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
	public DeleteUser() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 135, 72));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(253, 252, 200)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete User");
		lblNewLabel.setForeground(new Color(253, 252, 200));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setBounds(239, 161, 176, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Student ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(167, 218, 109, 23);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(253, 252, 200));
		textField.setBounds(296, 218, 221, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBackground(new Color(253, 252, 200));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sid=textField.getText();
				if(sid==null||sid.trim().equals("")){
					JOptionPane.showMessageDialog(DeleteUser.this,"Id can't be blank");
				}else{
					int id=Integer.parseInt(sid);
					int i=UserDB.delete(id);
					if(i>0){
						JOptionPane.showMessageDialog(DeleteUser.this,"Record deleted successfully!");
					}else{
						JOptionPane.showMessageDialog(DeleteUser.this,"Unable to delete given id!");
					}
				}
			}
		});
		btnNewButton.setBounds(314, 323, 89, 31);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminSection.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBackground(new Color(253, 252, 200));
		btnNewButton_1.setBounds(419, 323, 82, 31);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\My project 2.png"));
		lblNewLabel_2.setBounds(144, 115, 415, 293);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\My project 1.jpg"));
		lblNewLabel_3.setBounds(-62, 0, 746, 461);
		contentPane.add(lblNewLabel_3);
	}
}
