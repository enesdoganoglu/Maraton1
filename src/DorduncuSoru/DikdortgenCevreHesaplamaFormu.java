package DorduncuSoru;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DikdortgenCevreHesaplamaFormu {

	private JFrame frame;
	private JTextField txtKisaKenar;
	private JTextField txtUzunKenar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DikdortgenCevreHesaplamaFormu window = new DikdortgenCevreHesaplamaFormu();
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
	public DikdortgenCevreHesaplamaFormu() {
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
		
		JLabel lblNewLabel = new JLabel("Dikdörtgen kısa kenar(cm):");
		lblNewLabel.setBounds(56, 86, 167, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Dikdörtgen uzun kenar(cm):");
		lblNewLabel_1.setBounds(56, 169, 167, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblSonuc = new JLabel("Sonuç:");
		lblSonuc.setBounds(56, 360, 172, 13);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnCevre = new JButton("Çevre Hesapla");
		btnCevre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int uzunKenar;
				int kisaKenar;
				
				uzunKenar = Integer.valueOf(txtUzunKenar.getText());
				kisaKenar = Integer.valueOf(txtKisaKenar.getText());
				int dikdortgenCevre = (uzunKenar+kisaKenar)*2;
				lblSonuc.setText("Dikdörtgenin alanı: "+dikdortgenCevre+"cm");
			}
		});
		btnCevre.setBounds(276, 264, 126, 21);
		frame.getContentPane().add(btnCevre);
		
		txtKisaKenar = new JTextField();
		txtKisaKenar.setBounds(289, 83, 96, 19);
		frame.getContentPane().add(txtKisaKenar);
		txtKisaKenar.setColumns(10);
		
		txtUzunKenar = new JTextField();
		txtUzunKenar.setBounds(289, 166, 96, 19);
		frame.getContentPane().add(txtUzunKenar);
		txtUzunKenar.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("   DİKDÖRTGEN ÇEVRE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(168, 28, 202, 30);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
