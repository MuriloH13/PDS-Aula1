package Visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Calculos;

import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPriNumero;
	private JTextField txtSegNumero;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 212, 36);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblPriNumero = new JLabel("Primeiro número inteiro:");
		panel.add(lblPriNumero);
		
		txtPriNumero = new JTextField();
		txtPriNumero.setBounds(228, 11, 196, 36);
		contentPane.add(txtPriNumero);
		txtPriNumero.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 71, 212, 36);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblSegNumero = new JLabel("Segundo número inteiro:");
		panel_1.add(lblSegNumero);
		
		txtSegNumero = new JTextField();
		txtSegNumero.setColumns(10);
		txtSegNumero.setBounds(228, 71, 196, 36);
		contentPane.add(txtSegNumero);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 118, 212, 98);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnAdi = new JRadioButton("+ Adição");
		buttonGroup.add(rdbtnAdi);
		panel_2.add(rdbtnAdi);
		
		JRadioButton rdbtnSub = new JRadioButton("-Subtração");
		buttonGroup.add(rdbtnSub);
		panel_2.add(rdbtnSub);
		
		JRadioButton rdbtnMul = new JRadioButton("X Multiplicação");
		buttonGroup.add(rdbtnMul);
		panel_2.add(rdbtnMul);
		
		JRadioButton rdbtnDiv = new JRadioButton("/ Divisão");
		buttonGroup.add(rdbtnDiv);
		panel_2.add(rdbtnDiv);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(91, 227, 106, 29);
		contentPane.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(222, 227, 117, 23);
		contentPane.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblResultado = new JLabel("");
		panel_4.add(lblResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float Prim = Float.valueOf(txtPriNumero.getText());
				float Seg = Float.valueOf(txtSegNumero.getText());
						
				Calculos Calc = new Calculos();
				if(rdbtnAdi.isSelected())
				{
					float Resultado = Calc.CalcAdicao(Prim, Seg);
					lblResultado.setText(String.valueOf(Resultado));
				}
				if(rdbtnSub.isSelected())
				{
					float Resultado = Calc.CalcSubtracao(Prim, Seg);
					lblResultado.setText(String.valueOf(Resultado));
				}
				if(rdbtnMul.isSelected())
				{
					float Resultado = Calc.CalcMultiplicacao(Prim, Seg);
					lblResultado.setText(String.valueOf(Resultado));
				}
				if(rdbtnDiv.isSelected())
				{
					float Resultado = Calc.CalcDivisao(Prim, Seg);
					lblResultado.setText(String.valueOf(Resultado));
				}
			}
		});
		panel_3.add(btnCalcular);
		
	}
}
