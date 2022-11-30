package DorduncuSoru;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class KareCevreHesaplamaFormu {

	private JFrame frame;
	private JTextField txtKenar;
	private JLabel lblSonuc;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KareCevreHesaplamaFormu window = new KareCevreHesaplamaFormu();
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
	public KareCevreHesaplamaFormu() {
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
		
		JLabel lblNewLabel = new JLabel("Karenin bir kenar uzunluğu(cm):");
		lblNewLabel.setBounds(47, 98, 183, 13);
		frame.getContentPane().add(lblNewLabel);
		
		txtKenar = new JTextField();
		txtKenar.setBounds(288, 95, 96, 19);
		frame.getContentPane().add(txtKenar);
		txtKenar.setColumns(10);
		
		JButton btnKareCevre = new JButton("Çevre Hesapla");
		btnKareCevre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int kenar;
				kenar = Integer.valueOf(txtKenar.getText());
				int kareCevre = 4*kenar;
				lblSonuc.setText("Karenin çevresi: "+kareCevre+"cm");
				
			}
		});
		btnKareCevre.setBounds(288, 223, 116, 21);
		frame.getContentPane().add(btnKareCevre);
		
		lblSonuc = new JLabel("Sonuç:");
		lblSonuc.setBounds(70, 360, 146, 13);
		frame.getContentPane().add(lblSonuc);
		
		lblNewLabel_1 = new JLabel("     KARE ÇEVRE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(176, 26, 155, 35);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
