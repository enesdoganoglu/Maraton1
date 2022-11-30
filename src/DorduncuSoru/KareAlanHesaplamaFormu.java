package DorduncuSoru;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class KareAlanHesaplamaFormu {

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
					KareAlanHesaplamaFormu window = new KareAlanHesaplamaFormu();
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
	public KareAlanHesaplamaFormu() {
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
		
		txtKenar = new JTextField();
		txtKenar.setBounds(302, 97, 96, 19);
		frame.getContentPane().add(txtKenar);
		txtKenar.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Karenin bir kenar uzunluğu(cm):");
		lblNewLabel.setBounds(67, 100, 173, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnKareAlan = new JButton("Alan Hesapla");
		btnKareAlan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				int kenar;
				kenar = Integer.valueOf(txtKenar.getText());
				int kareAlan = kenar*kenar;
				lblSonuc.setText("Karenin alanı: "+kareAlan+"cm²");
				
				
			}
		});
		btnKareAlan.setBounds(255, 215, 107, 31);
		frame.getContentPane().add(btnKareAlan);
		
		lblSonuc = new JLabel("Sonuç: ");
		lblSonuc.setBounds(47, 356, 234, 31);
		frame.getContentPane().add(lblSonuc);
		
		lblNewLabel_1 = new JLabel("        KARE ALAN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(178, 28, 173, 31);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
