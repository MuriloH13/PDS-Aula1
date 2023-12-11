package vision;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.ConsHospedes;
import model.MetodoPagamento;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class PanelADD extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtnhospede;
	private JTextField txtnquarto;
	private JTextField txtdconsumo;
	private JTextField txtdconsumido;
	private JTextField txtqconsumido;
	private JTextField txtcitem;
	private JTextField txtctitem;
	private JLabel lbltpago;
	private JTextField txttpago;
	private JLabel lblmetpaga;
	private JLabel lblhora;
	private JTextField txthora;
	private JLabel lblav;
	private JTextField txtav;
	private JLabel lblfunc;
	private JLabel lblchosp;
	private JTextField txtchosp;
	private JTextField txtfunc;
	private JLabel lblnitem;
	private JTextField txtnitem;
	private JButton btnFechar;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public PanelADD(JanelaTabela cadastra) {
		setTitle("Consumo de hóspede");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnhospede = new JLabel("Nome do hóspede");
		lblnhospede.setBounds(33, 11, 110, 14);
		contentPane.add(lblnhospede);
		
		JLabel lblnquarto = new JLabel("Número do quarto");
		lblnquarto.setBounds(200, 11, 103, 14);
		contentPane.add(lblnquarto);
		
		JLabel lbldconsumo = new JLabel("Data do consumo");
		lbldconsumo.setBounds(364, 11, 115, 14);
		contentPane.add(lbldconsumo);
		
		JLabel lbldconsumido = new JLabel("Descrição do item consumido");
		lbldconsumido.setBounds(524, 11, 188, 14);
		contentPane.add(lbldconsumido);
		
		JLabel lblqconsumido = new JLabel("Quantidade consumida");
		lblqconsumido.setBounds(738, 11, 132, 14);
		contentPane.add(lblqconsumido);
		
		JLabel lblcitem = new JLabel("Custo unitário do item");
		lblcitem.setBounds(919, 11, 145, 14);
		contentPane.add(lblcitem);
		
		txtnhospede = new JTextField();
		txtnhospede.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (txtnhospede.getText().isEmpty()) {
				    JOptionPane.showMessageDialog(null, "Não deixe esse campo vazio");
				} else if (!txtnhospede.getText().matches("[a-zA-Zç]+")) {
				    JOptionPane.showMessageDialog(null, "Digite apenas letras para o nome");
				 
			}
			}
				
		});
		txtnhospede.setBounds(20, 34, 125, 20);
		contentPane.add(txtnhospede);
		txtnhospede.setColumns(10);
		
		txtnquarto = new JTextField();
		txtnquarto.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Integer q = 0;
				try {
				    q = Integer.parseInt(txtnquarto.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para a quantidade");
				    return;
				}
				
			}
		});
		txtnquarto.setBounds(190, 34, 125, 20);
		contentPane.add(txtnquarto);
		txtnquarto.setColumns(10);
		
		txtdconsumo = new JTextField();
		txtdconsumo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float precof = 0;
				try {
				    precof = Float.parseFloat(txtdconsumo.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para a data");
				    return;
				}
			}
		});
		txtdconsumo.setBounds(354, 34, 125, 20);
		contentPane.add(txtdconsumo);
		txtdconsumo.setColumns(10);
		
		txtdconsumido = new JTextField();
		txtdconsumido.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {

				if (txtdconsumido.getText().isEmpty()) {
				    JOptionPane.showMessageDialog(null, "Não deixe esse campo vazio");
				} else if (!txtdconsumido.getText().matches("[a-zA-Zç]+")) {
				    JOptionPane.showMessageDialog(null, "Digite apenas letras para a descrição do item");
				 
			}
			}
		});
		txtdconsumido.setBounds(546, 36, 125, 20);
		contentPane.add(txtdconsumido);
		txtdconsumido.setColumns(10);
		
		txtqconsumido = new JTextField();
		txtqconsumido.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Integer q = 0;
				try {
				    q = Integer.parseInt(txtqconsumido.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para a quantidade");
				    return;
				}
			}
		});
		txtqconsumido.setBounds(738, 36, 125, 20);
		contentPane.add(txtqconsumido);
		txtqconsumido.setColumns(10);
		
		txtcitem = new JTextField();
		txtcitem.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float precof = 0;
				try {
				    precof = Float.parseFloat(txtcitem.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para o preço");
				    return;
				}
			}
		});
		txtcitem.setBounds(919, 36, 125, 20);
		contentPane.add(txtcitem);
		txtcitem.setColumns(10);
		
		JLabel lblctitem = new JLabel("Custo total do item");
		lblctitem.setBounds(33, 80, 110, 14);
		contentPane.add(lblctitem);
		
		txtctitem = new JTextField();
		txtctitem.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float precof = 0;
				try {
				    precof = Float.parseFloat(txtctitem.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para o preço");
				    return;
				}
			}
		});
		txtctitem.setColumns(10);
		txtctitem.setBounds(20, 102, 125, 20);
		contentPane.add(txtctitem);
		
		lbltpago = new JLabel("Total pago até o momento");
		lbltpago.setBounds(534, 80, 158, 14);
		contentPane.add(lbltpago);
		
		txttpago = new JTextField();
		txttpago.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float precof = 0;
				try {
				    precof = Float.parseFloat(txttpago.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para o preço");
				    return;
				}
			}
		});
		txttpago.setColumns(10);
		txttpago.setBounds(546, 102, 125, 20);
		contentPane.add(txttpago);
		
		lblmetpaga = new JLabel("Método de pagamento");
		lblmetpaga.setBounds(190, 80, 132, 14);
		contentPane.add(lblmetpaga);
		
		JComboBox cbmetpag = new JComboBox();
		cbmetpag.setBounds(190, 101, 125, 22);
		cbmetpag.setModel(new DefaultComboBoxModel(MetodoPagamento.values()));
		contentPane.add(cbmetpag);
		
		lblhora = new JLabel("Hora do consumo");
		lblhora.setBounds(364, 80, 110, 14);
		contentPane.add(lblhora);
		
		txthora = new JTextField();
		txthora.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float precof = 0;
				try {
				    precof = Float.parseFloat(txthora.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para a hora");
				    return;
				}
			}
		});
		txthora.setColumns(10);
		txthora.setBounds(354, 102, 125, 20);
		contentPane.add(txthora);
		
		lblav = new JLabel("Avaliação do serviço");
		lblav.setBounds(738, 80, 125, 14);
		contentPane.add(lblav);
		
		txtav = new JTextField();
		txtav.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float precof = 0;
				try {
				    precof = Float.parseFloat(txtav.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para a avaliação");
				    return;
				}
			}
		});
		txtav.setColumns(10);
		txtav.setBounds(738, 102, 125, 20);
		contentPane.add(txtav);
		
		lblfunc = new JLabel("Funcionário que registrou o consumo");
		lblfunc.setBounds(220, 177, 229, 14);
		contentPane.add(lblfunc);
		
		lblchosp = new JLabel("Comentários do hóspede");
		lblchosp.setBounds(909, 80, 145, 14);
		contentPane.add(lblchosp);
		
		txtchosp = new JTextField();
		txtchosp.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {

				if (txtchosp.getText().isEmpty()) {
				    JOptionPane.showMessageDialog(null, "Não deixe esse campo vazio");
			}
			}
		});
		txtchosp.setColumns(10);
		txtchosp.setBounds(919, 102, 125, 20);
		contentPane.add(txtchosp);
		
		txtfunc = new JTextField();
		txtfunc.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {

				if (txtfunc.getText().isEmpty()) {
				    JOptionPane.showMessageDialog(null, "Não deixe esse campo vazio");
				} else if (!txtfunc.getText().matches("[a-zA-Zç]+")) {
				    JOptionPane.showMessageDialog(null, "Digite apenas letras para o funcionário");
				}
			}
		});
		txtfunc.setColumns(10);
		txtfunc.setBounds(264, 202, 125, 20);
		contentPane.add(txtfunc);
		
		lblnitem = new JLabel("Número de itens restantes");
		lblnitem.setBounds(670, 177, 168, 14);
		contentPane.add(lblnitem);
		
		txtnitem = new JTextField();
		txtnitem.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Integer q = 0;
				try {
				    q = Integer.parseInt(txtnitem.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para a quantidade");
				    return;
				}
			}
		});
		txtnitem.setColumns(10);
		txtnitem.setBounds(685, 202, 125, 20);
		contentPane.add(txtnitem);
		
		JButton btncadastrar = new JButton("Cadastrar");
		btncadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = txtnhospede.getText();
				Integer nquarto = Integer.parseInt(txtnquarto.getText());
				String data = (txtdconsumo.getText());
				String desc = txtdconsumido.getText();
				Integer quantc = Integer.parseInt(txtqconsumido.getText());
				Float cuitem = Float.parseFloat(txtcitem.getText());
				Float cutitem = Float.parseFloat(txtctitem.getText());
				Float tpago = Float.parseFloat(txttpago.getText());
				String horac = txthora.getText();
				String func = txtfunc.getText();
				String comhosp = txtchosp.getText();
				String avserv = txtav.getText();
				Integer numitens = Integer.parseInt(txtnitem.getText());
				
				ConsHospedes h = new ConsHospedes();
				
				h.setNome(nome);
				h.setNumquarto(nquarto);
				h.setData(data);
				h.setDesc(desc);
				h.setQuantc(quantc);
				h.setCuitem(Float.valueOf(cuitem));
				h.setCutitem(Float.valueOf(cutitem));
				h.setMetpag(cbmetpag.getSelectedItem());
				h.setHorac(Float.valueOf(horac));
				h.setTpago(Float.valueOf(tpago));
				h.setAvserv(Float.valueOf(avserv));
				h.setComhosp(comhosp);
				h.setFunc(func);
				h.setNumitens(Integer.valueOf(numitens));
				
				
				cadastra.importvar(h);
				LimparCampos();
			}
		});
		btncadastrar.setBounds(602, 270, 158, 35);
		contentPane.add(btncadastrar);
		
		btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			
			}
		});
		btnFechar.setBounds(421, 270, 158, 35);
		contentPane.add(btnFechar);
		
	}
		
	public void LimparCampos() {
		txtnhospede.setText("");
		txtnquarto.setText("");
		txtdconsumo.setText("");
		txtdconsumido.setText("");
		txtqconsumido.setText("");
		txtcitem.setText("");
		txtctitem.setText("");
		txttpago.setText("");
		txthora.setText("");
		txtfunc.setText("");
		txtchosp.setText("");
		txtav.setText("");
		txtnitem.setText("");
	}
	
}
