package DorduncuSoru;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DikdortgenAlanHesaplamaFormu {

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
					DikdortgenAlanHesaplamaFormu window = new DikdortgenAlanHesaplamaFormu();
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
	public DikdortgenAlanHesaplamaFormu() {
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
		
		JLabel lblNewLabel = new JLabel("Dikdörtgen uzun kenar(cm):");
		lblNewLabel.setBounds(56, 168, 174, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSonuc = new JLabel("Sonuç: ");
		lblSonuc.setBounds(51, 366, 197, 13);
		frame.getContentPane().add(lblSonuc);
		
		JButton btnAlan = new JButton("Alan Hesapla");
		btnAlan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int uzunKenar;
				int kisaKenar;
				
				uzunKenar = Integer.valueOf(txtUzunKenar.getText());
				kisaKenar = Integer.valueOf(txtKisaKenar.getText());
				int dikdortgenAlan = uzunKenar*kisaKenar;
				lblSonuc.setText("Dikdörtgenin alanı: "+dikdortgenAlan+"cm²");
				
			}
		});
		btnAlan.setBounds(282, 253, 120, 21);
		frame.getContentPane().add(btnAlan);
		
		txtKisaKenar = new JTextField();
		txtKisaKenar.setBounds(271, 82, 96, 19);
		frame.getContentPane().add(txtKisaKenar);
		txtKisaKenar.setColumns(10);
		
		txtUzunKenar = new JTextField();
		txtUzunKenar.setBounds(271, 165, 96, 19);
		frame.getContentPane().add(txtUzunKenar);
		txtUzunKenar.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Dikdörtgen kısa kenar(cm):");
		lblNewLabel_2.setBounds(56, 85, 174, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("   DİKDÖRTGEN ALAN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(159, 25, 208, 31);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
