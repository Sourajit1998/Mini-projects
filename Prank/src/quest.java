import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class quest extends JFrame {

	private JPanel contentPane;
	protected Component frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quest frame = new quest();
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
	public quest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAreUAn = new JLabel("Are u an idiot?");
		lblAreUAn.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblAreUAn.setBounds(95, 70, 247, 44);
		contentPane.add(lblAreUAn);
		
		JLabel lblPlzgiveAnHonest = new JLabel("Plz..Give an honest answer!!!");
		lblPlzgiveAnHonest.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPlzgiveAnHonest.setBounds(94, 11, 286, 26);
		contentPane.add(lblPlzgiveAnHonest);
		
		JLabel lblQ = new JLabel("Q.");
		lblQ.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblQ.setBounds(32, 79, 46, 26);
		contentPane.add(lblQ);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				JOptionPane.showMessageDialog(frame,"Thank u..That was an honest answer!!");		
			}
		});
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				JOptionPane.showMessageDialog(frame,"Thank u..That was an honest answer!!");
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				btnNewButton.setText("Yes");
				btnNewButton_1.setText("No");
			}
		});
		btnNewButton.setText("Yes");
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) 
			{
				btnNewButton.setText("No");
				btnNewButton_1.setText("Yes");
			}
		});
		
		btnNewButton_1.setText("No");
		btnNewButton_1.setBounds(221, 145, 89, 35);
		
		btnNewButton.setBounds(56, 145, 96, 35);
		contentPane.add(btnNewButton);
		contentPane.add(btnNewButton_1);
	}
}
