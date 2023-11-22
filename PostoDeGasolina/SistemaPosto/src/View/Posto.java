package View;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import Model.Calculos;
import net.miginfocom.swing.MigLayout;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import Model.ComboBoxEnum;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Posto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOleoDiesel;
	private JTextField txtGasComum;
	private JTextField txtGasAditivada;
	private JTextField txtEtanol;
	private JTextField txtFrasco500Preco;
	private JTextField txtFrasco1Preco;
	private JTextField txtDias;
	private JTextField txtQuantidadeLitros;
	private JTextField txtFrasco500Oleo;
	private JTextField txtFrasco1Oleo;
	private JTextField txtQuantL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Posto frame = new Posto();
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
	public Posto() {
		setTitle("Posto de Combustível");
		Calculos chama = new Calculos ();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 585, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setMinimumSize(new Dimension(585, 500));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Tabela de Preco do Combustivel", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(21, 23, 267, 109);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblOleoDiesel = new JLabel("Oleo Diesel:");
		panel.add(lblOleoDiesel);
		
		txtOleoDiesel = new JTextField();
		txtOleoDiesel.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) 
			{
				chama.vdi=Float.valueOf(txtOleoDiesel.getText());
			}
		});
		panel.add(txtOleoDiesel);
		txtOleoDiesel.setColumns(10);
		
		JLabel lblGasComum = new JLabel("Gas.Comum:");
		panel.add(lblGasComum);
		
		txtGasComum = new JTextField();
		txtGasComum.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) 
			{
				chama.vcom=Float.valueOf(txtGasComum.getText());
			}
		});
		panel.add(txtGasComum);
		txtGasComum.setColumns(10);
		
		JLabel lblGasAditivada = new JLabel("Gas.Aditivada:");
		panel.add(lblGasAditivada);
		
		txtGasAditivada = new JTextField();
		txtGasAditivada.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) 
			{
				chama.vadi=Float.valueOf(txtGasAditivada.getText());
			}
		});
		panel.add(txtGasAditivada);
		txtGasAditivada.setColumns(10);
		
		JLabel lblEtanol = new JLabel("Etanol:");
		panel.add(lblEtanol);
		
		txtEtanol = new JTextField();
		txtEtanol.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) 
			{
				chama.veta=Float.valueOf(txtEtanol.getText());
			}
		});
		panel.add(txtEtanol);
		txtEtanol.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Tabela de Preco do Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(318, 23, 241, 109);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblF500 = new JLabel("Frasco 500ml");
		panel_1.add(lblF500);
		
		txtFrasco500Preco = new JTextField();
		txtFrasco500Preco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) 
			{
				chama.v500ml=Float.valueOf(txtFrasco500Preco.getText());
			}
		});
		panel_1.add(txtFrasco500Preco);
		txtFrasco500Preco.setColumns(10);
		
		JLabel lblF1Oleo = new JLabel("Frasco 1L ");
		panel_1.add(lblF1Oleo);
		
		txtFrasco1Preco = new JTextField();
		txtFrasco1Preco.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) 
			{
				chama.v1l=Float.valueOf(txtFrasco1Preco.getText());
			}
		});
		panel_1.add(txtFrasco1Preco);
		txtFrasco1Preco.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Oleo Motor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(21, 143, 538, 109);
		contentPane.add(panel_2);
		panel_2.setLayout(new MigLayout("", "[][][grow][][][][][][][][][][][]", "[][][]"));
		
		JLabel lblQnt = new JLabel("Quantidade");
		lblQnt.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblQnt, "cell 2 0");
		
		JLabel lblVPagar = new JLabel("Valor a Pagar");
		panel_2.add(lblVPagar, "cell 9 0");
		
		JLabel lblTotalO = new JLabel("Total Oleo");
		panel_2.add(lblTotalO, "cell 13 0");
		
		JLabel lblF05l = new JLabel("Frasco de 500ml");
		panel_2.add(lblF05l, "cell 1 1,alignx trailing");
		
		JLabel llblFrascoP500 = new JLabel("-");
		llblFrascoP500.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(llblFrascoP500, "cell 9 1");
		
		JLabel lblTotalOleo = new JLabel("-");
		panel_2.add(lblTotalOleo, "cell 13 1");
		
		JLabel lblF500ml = new JLabel("Frasco de 1L");
		panel_2.add(lblF500ml, "cell 1 2,alignx trailing");
		
		JLabel lblFPagar = new JLabel("-");
		panel_2.add(lblFPagar, "cell 9 2");
		
		txtFrasco500Oleo = new JTextField();
		txtFrasco500Oleo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) 
			{
				chama.q500ml=Float.valueOf(txtFrasco500Oleo.getText());
				llblFrascoP500.setText("R$" + chama.ToF500());
				lblTotalOleo.setText("R$ " + chama.Tooleo());
			}
		});
		panel_2.add(txtFrasco500Oleo, "cell 2 1,growx");
		txtFrasco500Oleo.setColumns(10);
		
		txtFrasco1Oleo = new JTextField();
		txtFrasco1Oleo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) 
			{
				chama.q1l=Float.valueOf(txtFrasco1Oleo.getText());
				lblFPagar.setText("R$ " + chama.ToF1l());
				lblTotalOleo.setText("R$ " + chama.Tooleo());
			}
		});
		panel_2.add(txtFrasco1Oleo, "cell 2 2,growx");
		txtFrasco1Oleo.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Abastecimento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(21, 284, 248, 109);
		contentPane.add(panel_3);
		panel_3.setLayout(new MigLayout("", "[][][][grow]", "[][][]"));
		
		JLabel lblCombustivel = new JLabel("Combustivel:");
		panel_3.add(lblCombustivel, "cell 1 0");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(ComboBoxEnum.values()));
		panel_3.add(comboBox, "cell 3 0,growx");
		
		JLabel lblQuantidadeLitros = new JLabel("Quantidade Litros:");
		panel_3.add(lblQuantidadeLitros, "cell 1 1");
		
		panel_3.add(txtQuantidadeLitros, "cell 3 1,growx");
		txtQuantidadeLitros.setColumns(10);
		
		JLabel lblTotalResCombustivel = new JLabel("-");
		panel_3.add(lblTotalResCombustivel, "cell 3 2");
		
		txtQuantL = new JTextField();
		txtQuantL.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) 
			{
				int posicao=comboBox.getSelectedIndex();
				float qLitros=Float.valueOf(txtQuantL.getText());
				if(posicao==0)
				{
					lblTotalResCombustivel.setText("R$ " + chama.ToDiesel(qLitros));
				}
				if(posicao==1)
				{
					lblTotalResCombustivel.setText("R$ " + chama.ToCombustivel(qLitros));
				}
				if(posicao==2)
				{
					lblTotalResCombustivel.setText("R$ " + chama.ToAditiv(qLitros));
				}
				if(posicao==3)
				{
					lblTotalResCombustivel.setText("R$ " + chama.ToEtanol(qLitros));
				}
			}
		});
		panel_3.add(txtQuantL, "cell 3 1,growx");
		txtQuantL.setColumns(10);
		
		JLabel lblTotalCombustivel = new JLabel("Total Combustivel");
		panel_3.add(lblTotalCombustivel, "cell 1 2");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Formas De Pagamento", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(305, 284, 254, 109);
		contentPane.add(panel_4);
		panel_4.setLayout(new MigLayout("", "[][][][grow]", "[][][][]"));
		
		JRadioButton rdbtnVista = new JRadioButton("À vista");
		panel_4.add(rdbtnVista, "cell 0 0");
		
		JRadioButton rdbtnPrazo = new JRadioButton("À prazo");
		panel_4.add(rdbtnPrazo, "cell 0 1");
		
		JLabel lblDias = new JLabel("Dias:");
		panel_4.add(lblDias, "cell 2 1,alignx trailing");
		
		txtDias = new JTextField();
		panel_4.add(txtDias, "cell 3 1,growx");
		txtDias.setColumns(10);
		
		JLabel lblTotalAPagar = new JLabel("Total a Pagar:  ");
		lblTotalAPagar.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(lblTotalAPagar, "cell 0 3");
		
		txtQuantidadeLitros = new JTextField();
		txtQuantidadeLitros.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) 
			{
				int posicao=comboBox.getSelectedIndex();
				Float qlitros=Float.valueOf(txtQuantidadeLitros.getText());
				if (posicao==0)
				{
					lblTotalResCombustivel.setText("R$: " );
				}
			}
		});
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(rdbtnVista.isSelected())
				{
					String Total=chama.ToAvista();
				}
				else if(rdbtnPrazo.isSelected())
				{
					Integer dias = Integer.valueOf(txtDias.getText());
					if(dias<30)
					{
						String Total = chama.ToAprazo();
						lblTotalAPagar.setText("R$ " + Total);
					}
					else if(dias>30)
					{
						String Total = chama.ToAprazo30();
						lblTotalAPagar.setText("R$ " + Total);
					}
				}
			}
		});
		btnCalcular.setBounds(78, 416, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNovaCalculo = new JButton("Novo Calculo");
		btnNovaCalculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDias.setText(null);
				txtEtanol.setText(null);
				txtFrasco1Oleo.setText(null);
				txtFrasco1Preco.setText(null);
				txtFrasco500Oleo.setText(null);
				txtFrasco500Preco.setText(null);
				txtGasAditivada.setText(null);
				txtGasComum.setText(null);
				txtOleoDiesel.setText(null);
				txtQuantidadeLitros.setText(null);
				lblTotalOleo.setText("");
				llblFrascoP500.setText("");
				lblFPagar.setText("");
				lblTotalResCombustivel.setText("");
				
			}
		});
		btnNovaCalculo.setBounds(232, 416, 111, 23);
		contentPane.add(btnNovaCalculo);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setBounds(402, 416, 89, 23);
		contentPane.add(btnFechar);
	}
}
