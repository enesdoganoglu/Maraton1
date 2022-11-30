package DorduncuSoru;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DaireCevreHesaplama {

	private JFrame frame;
	private JTextField txtYariCap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DaireCevreHesaplama window = new DaireCevreHesaplama();
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
	public DaireCevreHesaplama() {
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
		
		JLabel lblNewLabel = new JLabel("Dairenin çevresi için yarıçap:");
		lblNewLabel.setBounds(64, 80, 200, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSonuc = new JLabel("Sonuç:");
		lblSonuc.setBounds(64, 254, 200, 13);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnDaireCevre = new JButton("Çevre Hesapla");
		btnDaireCevre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double pi = 3.14;
			    double yariCap;
				yariCap = Double.valueOf(txtYariCap.getText());  
				double daireCevre = 2*pi*yariCap;
				lblSonuc.setText("Dairenin çevresi: "+daireCevre+"cm");
			}
		});
		btnDaireCevre.setBounds(291, 204, 118, 21);
		frame.getContentPane().add(btnDaireCevre);
		
		txtYariCap = new JTextField();
		txtYariCap.setBounds(291, 77, 96, 19);
		frame.getContentPane().add(txtYariCap);
		txtYariCap.setColumns(10);
	}

}
