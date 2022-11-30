package DorduncuSoru;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireAlanHesaplamaFormu {

	private JFrame frame;
	private JTextField txtYariCap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaireAlanHesaplamaFormu window = new DaireAlanHesaplamaFormu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DaireAlanHesaplamaFormu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 500, 550, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dairenin alanı için yarıçap:");
		lblNewLabel.setBounds(47, 85, 154, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSonuc = new JLabel("Sonuç:");
		lblSonuc.setBounds(47, 260, 135, 13);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnDaireAlan = new JButton("Alan Hesapla");
		btnDaireAlan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double pi = 3.14;
			    double yariCap;
				yariCap = Double.valueOf(txtYariCap.getText());  
				double daireAlan = pi*yariCap*yariCap;
				lblSonuc.setText("Dairenin alanı: "+daireAlan+"cm²");
			}
		});
		btnDaireAlan.setBounds(270, 195, 123, 21);
		frame.getContentPane().add(btnDaireAlan);
		
		txtYariCap = new JTextField();
		txtYariCap.setBounds(270, 82, 96, 19);
		frame.getContentPane().add(txtYariCap);
		txtYariCap.setColumns(10);
	}

}
