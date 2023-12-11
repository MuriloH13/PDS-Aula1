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
import java.awt.Color;
import net.miginfocom.swing.MigLayout;

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
	private JButton btnLimpar;

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public PanelADD(JanelaTabela cadastra) {
		setTitle("Consumo de hóspede");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[125px][132px][32px][125px][147px][14px][27px][26px][132px][155px]", "[14px][22px][14px][22px][14px][20px][23px]"));
		
		JLabel lblnhospede = new JLabel("Nome do hóspede");
		contentPane.add(lblnhospede, "cell 0 0,growx,aligny top");
		
		JLabel lblnquarto = new JLabel("Número do quarto");
		contentPane.add(lblnquarto, "cell 1 0,alignx center,aligny top");
		
		JLabel lbldconsumo = new JLabel("Data do consumo");
		contentPane.add(lbldconsumo, "cell 3 0,growx,aligny top");
		
		JLabel lbldconsumido = new JLabel("Descrição do item consumido");
		contentPane.add(lbldconsumido, "cell 4 0 3 1,growx,aligny top");
		
		JLabel lblqconsumido = new JLabel("Quantidade consumida");
		contentPane.add(lblqconsumido, "cell 8 0,growx,aligny top");
		
		JLabel lblcitem = new JLabel("Custo unitário do item");
		contentPane.add(lblcitem, "cell 9 0,growx,aligny top");
		
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
		contentPane.add(txtnhospede, "cell 0 1,growx,aligny top");
		txtnhospede.setColumns(10);
		
		txtnquarto = new JTextField();
		txtnquarto.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Integer q = 0;
				try {
				    q = Integer.parseInt(txtnquarto.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para o número do quarto");
				    return;
				}
				
			}
		});
		contentPane.add(txtnquarto, "cell 1 1,growx,aligny top");
		txtnquarto.setColumns(10);
		
		txtdconsumo = new JTextField();
		txtdconsumo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float p = 0;
				try {
				    p = Float.parseFloat(txtdconsumo.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para a data");
				    return;
				}
			}
		});
		contentPane.add(txtdconsumo, "cell 3 1,growx,aligny top");
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
		contentPane.add(txtdconsumido, "cell 4 1,growx,aligny bottom");
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
		contentPane.add(txtqconsumido, "cell 8 1,growx,aligny bottom");
		txtqconsumido.setColumns(10);
		
		txtcitem = new JTextField();
		txtcitem.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float p = 0;
				try {
				    p = Float.parseFloat(txtcitem.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para o preço");
				    return;
				}
			}
		});
		contentPane.add(txtcitem, "cell 9 1,growx,aligny bottom");
		txtcitem.setColumns(10);
		
		JLabel lblctitem = new JLabel("Custo total do item");
		contentPane.add(lblctitem, "cell 0 2,growx,aligny top");
		
		txtctitem = new JTextField();
		txtctitem.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float p = 0;
				try {
				    p = Float.parseFloat(txtctitem.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para o preço");
				    return;
				}
			}
		});
		txtctitem.setColumns(10);
		contentPane.add(txtctitem, "cell 0 3,growx,aligny center");
		
		lbltpago = new JLabel("Total pago até o momento");
		contentPane.add(lbltpago, "cell 4 2 3 1,growx,aligny top");
		
		txttpago = new JTextField();
		txttpago.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float p = 0;
				try {
				    p = Float.parseFloat(txttpago.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para o preço");
				    return;
				}
			}
		});
		txttpago.setColumns(10);
		contentPane.add(txttpago, "cell 4 3,growx,aligny center");
		
		lblmetpaga = new JLabel("Método de pagamento");
		contentPane.add(lblmetpaga, "cell 1 2,growx,aligny top");
		
		JComboBox cbmetpag = new JComboBox();
		cbmetpag.setModel(new DefaultComboBoxModel(MetodoPagamento.values()));
		contentPane.add(cbmetpag, "cell 1 3,grow");
		
		lblhora = new JLabel("Hora do consumo");
		contentPane.add(lblhora, "cell 3 2,growx,aligny top");
		
		txthora = new JTextField();
		txthora.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float p = 0;
				try {
				    p = Float.parseFloat(txthora.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para a hora");
				    return;
				}
			}
		});
		txthora.setColumns(10);
		contentPane.add(txthora, "cell 3 3,growx,aligny center");
		
		lblav = new JLabel("Avaliação do serviço");
		contentPane.add(lblav, "cell 8 2,growx,aligny top");
		
		txtav = new JTextField();
		txtav.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				float p = 0;
				try {
				    p = Float.parseFloat(txtav.getText());
				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Digite apenas números para a avaliação");
				    return;
				}
			}
		});
		txtav.setColumns(10);
		contentPane.add(txtav, "cell 8 3,growx,aligny center");
		
		lblfunc = new JLabel("Funcionário que registrou o consumo");
		contentPane.add(lblfunc, "cell 1 4 3 1,alignx center,aligny top");
		
		lblchosp = new JLabel("Comentários do hóspede");
		contentPane.add(lblchosp, "cell 9 2,growx,aligny top");
		
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
		contentPane.add(txtchosp, "cell 9 3,growx,aligny center");
		
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
		contentPane.add(txtfunc, "cell 1 5 3 1,alignx center,aligny top");
		
		lblnitem = new JLabel("Número de itens restantes");
		contentPane.add(lblnitem, "cell 4 4 5 1,alignx center,aligny top");
		
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
		contentPane.add(txtnitem, "cell 6 5 3 1,alignx left,aligny top");
		
		JButton btncadastrar = new JButton("Cadastrar");
		btncadastrar.setBackground(new Color(126, 248, 136));
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
				
				cbmetpag.removeAllItems();
				for (MetodoPagamento metodo : MetodoPagamento.values()){
					cbmetpag.addItem(metodo);
				}
				cbmetpag.updateUI();
				
				
				cadastra.importvar(h);
				LimparCampos();
			}
		});
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimparCampos();
			}
		});
		btnLimpar.setBackground(new Color(145, 255, 255));
		contentPane.add(btnLimpar, "cell 4 6,alignx left,growy");
		contentPane.add(btncadastrar, "cell 6 6 3 1,alignx left,aligny top");
		
		btnFechar = new JButton("Fechar");
		btnFechar.setBackground(new Color(255, 119, 122));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			
			}
		});
		contentPane.add(btnFechar, "cell 1 6 3 1,alignx center,aligny top");
		
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

