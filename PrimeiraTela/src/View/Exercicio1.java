package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.ConversaoTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTemp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
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
	public Exercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Interface de conversão de Fahrenheit para Celsius");
		lblTitulo.setBounds(87, 11, 245, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblTemp = new JLabel("Temperatura F:");
		lblTemp.setBounds(10, 49, 75, 14);
		contentPane.add(lblTemp);
		
		txtTemp = new JTextField();
		txtTemp.setBounds(97, 46, 86, 20);
		contentPane.add(txtTemp);
		txtTemp.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = txtTemp.getText();
				float tempconvF = Float.valueOf(text);
				ConversaoTemperatura conv = new ConversaoTemperatura();
				float tempC = conv.converterFtoC(tempconvF);
				
				JOptionPane.showMessageDialog(null, "Temperatura convertida: " + tempC);
			}
		});
		btnCalcular.setBounds(94, 88, 89, 23);
		contentPane.add(btnCalcular);
	}

}
