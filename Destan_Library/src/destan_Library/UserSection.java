package destan_Library;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class UserSection extends JFrame {
    static UserSection frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserSection frame = new UserSection();
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
	public UserSection() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 135, 72));
		contentPane.setBorder(new LineBorder(new Color(253, 252, 200), 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Section");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(40, 40, 40));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(262, 150, 181, 36);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("View Books");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\issue.png"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewBooks.main(new String[] {});
				frame.dispose();
				
			}
		});
		btnNewButton_1.setBackground(new Color(253, 252, 200));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(174, 197, 171, 55);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Issue Book");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Downloads\\My_project__14_-removebg-preview.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBooks.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_2.setBackground(new Color(253, 252, 200));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.setBounds(366, 197, 171, 55);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("View Issued Books");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Downloads\\My_project__15_-removebg-preview.png"));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewIssuedBooks.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_3.setBackground(new Color(253, 252, 200));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setBounds(174, 263, 171, 49);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Return Book");
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\return-book-1-560407.png"));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnBook.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton_4.setBackground(new Color(253, 252, 200));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setBounds(366, 263, 171, 49);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton(" Logout");
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\exit.png"));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibraryMain.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton_5.setBackground(new Color(253, 252, 200));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_5.setBounds(262, 323, 171, 50);
		contentPane.add(btnNewButton_5);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\My project 2.png"));
		lblNewLabel_1.setBounds(152, 129, 400, 275);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Rahmet\\Pictures\\Java Project\\My project 1.jpg"));
		lblNewLabel_2.setBounds(-58, 0, 742, 461);
		contentPane.add(lblNewLabel_2);
	}

}
