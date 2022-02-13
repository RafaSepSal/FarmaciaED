package views;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import models.Medicamento;
import models.Ventas;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class FarmaciaView {

	private JFrame frame;
	private JTextField tfNombreMed;
	private JTextField tfFechaIncor;
	private JComboBox<String> cbTipo;
	private JTextField tfTipo;
	private JTextField tfPrecio;
	private JTextField tfCantidad;
	private JTextField tfPpioActivo;
	private JButton btnPedido;
	private JButton btnVenta;
	private JButton btnActualizar;
	private JButton btnVentaDia;
	private JButton btnSalir;
	private JButton btnSiguiente;
	private JButton btnAnterior;
	private int pagina;
	private JFrame frameLogin;
	private ArrayList<Medicamento> medicamentos;
	private JButton btnGuardarAct;
	private JButton btnCancelarAct;
	private JTextField tfPedidoCant;
	private JButton btnConfirPedido;
	private JButton btnIncrementarPedido;
	private JButton btnDisminuirPedido;
	private int modo;
	private JLabel lblTitulo;
	private JLabel lblNombre;
	private JLabel lblPrincipioAct;
	private JLabel lblPrecio;
	private JLabel lblTipo;
	private JLabel lblCantidad;
	private JLabel lblFecha;
	private JLabel lblTextIndica;
	private JLabel lblFondo;

	/**
	 * Crea la aplicaci�n.
	 */
	public FarmaciaView(JFrame loginView, int pagina) {
		this.frameLogin = loginView;
		this.pagina = pagina;
		initialize();
	}

	/**
	 * Inicializa el contenido del Frame.
	 */
	private void initialize() {
		setUIComponents();
		setListeners();
		frame.setVisible(true);
	}
	
	/**
	 * Configura el dise�o del Frame
	 */
	private void setUIComponents() {
		frame = new JFrame();
		frame.setBounds(100, 100, 557, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tfNombreMed = new JTextField();
		tfNombreMed.setFont(new Font("Tahoma", Font.ITALIC, 10));
		tfNombreMed.setBounds(69, 97, 110, 30);
		frame.getContentPane().add(tfNombreMed);
		tfNombreMed.setColumns(10);
		
		tfFechaIncor = new JTextField();
		tfFechaIncor.setFont(new Font("Tahoma", Font.ITALIC, 11));
		tfFechaIncor.setBounds(356, 160, 110, 30);
		frame.getContentPane().add(tfFechaIncor);
		tfFechaIncor.setColumns(10);
		
		tfTipo = new JTextField();
		tfTipo.setFont(new Font("Tahoma", Font.ITALIC, 11));
		tfTipo.setBounds(69, 160, 110, 30);
		frame.getContentPane().add(tfTipo);
		tfTipo.setColumns(10);
		
		tfPrecio = new JTextField();
		tfPrecio.setFont(new Font("Tahoma", Font.ITALIC, 11));
		tfPrecio.setBounds(356, 97, 110, 30);
		frame.getContentPane().add(tfPrecio);
		tfPrecio.setColumns(10);
		
		tfCantidad = new JTextField();
		tfCantidad.setFont(new Font("Tahoma", Font.ITALIC, 11));
		tfCantidad.setBounds(212, 160, 110, 30);
		frame.getContentPane().add(tfCantidad);
		tfCantidad.setColumns(10);
		
		tfPpioActivo = new JTextField();
		tfPpioActivo.setFont(new Font("Tahoma", Font.ITALIC, 10));
		tfPpioActivo.setBounds(212, 97, 110, 30);
		frame.getContentPane().add(tfPpioActivo);
		tfPpioActivo.setColumns(10);
		
		btnPedido = new JButton("Pedido");
		btnPedido.setBackground(Color.WHITE);
		btnPedido.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnPedido.setBounds(55, 239, 130, 30);
		frame.getContentPane().add(btnPedido);
		
		btnVenta = new JButton("Venta");
		btnVenta.setBackground(Color.WHITE);
		btnVenta.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnVenta.setBounds(203, 239, 130, 30);
		frame.getContentPane().add(btnVenta);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBackground(Color.WHITE);
		btnActualizar.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnActualizar.setBounds(350, 239, 130, 30);
		frame.getContentPane().add(btnActualizar);
		
		btnVentaDia = new JButton("Ventas del Dia");
		btnVentaDia.setBackground(Color.WHITE);
		btnVentaDia.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnVentaDia.setBounds(186, 280, 160, 30);
		frame.getContentPane().add(btnVentaDia);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setBounds(10, 11, 65, 23);
		frame.getContentPane().add(btnSalir);
		
		btnAnterior = new JButton("<");
		btnAnterior.setBackground(Color.WHITE);
		btnAnterior.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnAnterior.setBounds(10, 65, 45, 160);
		frame.getContentPane().add(btnAnterior);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.setBackground(Color.WHITE);
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnSiguiente.setBounds(490, 65, 45, 160);
		frame.getContentPane().add(btnSiguiente);
		
		btnGuardarAct = new JButton("Guardar");
		btnGuardarAct.setBackground(Color.WHITE);
		btnGuardarAct.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnGuardarAct.setBounds(286, 239, 110, 30);
		frame.getContentPane().add(btnGuardarAct);
		
		btnCancelarAct = new JButton("Cancelar");
		btnCancelarAct.setBackground(Color.WHITE);
		btnCancelarAct.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnCancelarAct.setBounds(136, 239, 110, 30);
		frame.getContentPane().add(btnCancelarAct);
		
		tfPedidoCant = new JTextField();
		tfPedidoCant.setFont(new Font("Verdana", Font.BOLD, 30));
		tfPedidoCant.setHorizontalAlignment(SwingConstants.CENTER);
		tfPedidoCant.setEditable(false);
		tfPedidoCant.setText("0");
		tfPedidoCant.setBounds(212, 110, 110, 70);
		frame.getContentPane().add(tfPedidoCant);
		tfPedidoCant.setColumns(10);
		
		btnConfirPedido = new JButton("Confirmar");
		btnConfirPedido.setBackground(Color.WHITE);
		btnConfirPedido.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		btnConfirPedido.setBounds(286, 239, 110, 30);
		frame.getContentPane().add(btnConfirPedido);
		
		btnIncrementarPedido = new JButton("+");
		btnIncrementarPedido.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnIncrementarPedido.setBackground(Color.WHITE);
		btnIncrementarPedido.setBounds(79, 110, 90, 70);
		frame.getContentPane().add(btnIncrementarPedido);
		
		btnDisminuirPedido = new JButton("-");
		btnDisminuirPedido.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnDisminuirPedido.setBackground(Color.WHITE);
		btnDisminuirPedido.setBounds(366, 110, 90, 70);
		frame.getContentPane().add(btnDisminuirPedido);
		
		cbTipo = new JComboBox<String>();
		cbTipo.setFont(new Font("Tahoma", Font.ITALIC, 11));
		cbTipo.setBounds(69, 160, 110, 30);
		frame.getContentPane().add(cbTipo);
		
		lblTitulo = new JLabel("Almacen - Farmacia");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Trebuchet MS", Font.BOLD, 32));
		lblTitulo.setBounds(0, 15, 534, 43);
		frame.getContentPane().add(lblTitulo);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNombre.setBounds(69, 76, 110, 23);
		frame.getContentPane().add(lblNombre);
		
		lblPrincipioAct = new JLabel("Principio Act.");
		lblPrincipioAct.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblPrincipioAct.setBounds(212, 76, 110, 23);
		frame.getContentPane().add(lblPrincipioAct);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblPrecio.setBounds(356, 76, 110, 23);
		frame.getContentPane().add(lblPrecio);
		
		lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblTipo.setBounds(69, 138, 110, 23);
		frame.getContentPane().add(lblTipo);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblCantidad.setBounds(212, 138, 110, 23);
		frame.getContentPane().add(lblCantidad);
		
		lblFecha = new JLabel("Fecha Incor.");
		lblFecha.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblFecha.setBounds(356, 138, 110, 23);
		frame.getContentPane().add(lblFecha);
		
		lblTextIndica = new JLabel("Indica a continuaci\u00F3n la cantidad de productos");
		lblTextIndica.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblTextIndica.setHorizontalAlignment(SwingConstants.CENTER);
		lblTextIndica.setBounds(69, 201, 397, 17);
		frame.getContentPane().add(lblTextIndica);
		
		lblFondo = new JLabel("");
		lblFondo.setBounds(0, 0, 555, 321);
		frame.getContentPane().add(lblFondo);
		lblFondo.setIcon(new ImageIcon(FarmaciaView.class.getResource("/img/fondoalmacen.jpg")));
		
		//Inserto los tipos al ComboBox
		cbTipo.addItem("-");
		cbTipo.addItem("Pildoras");
		cbTipo.addItem("Jarabe");
		cbTipo.addItem("Pastillas");
		cbTipo.addItem("Otro");

	}
	
	/**
	 * Configura las acciones de botones y de m�s
	 */
	private void setListeners() {
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int confirmar = JOptionPane.showConfirmDialog(btnSalir,
						"�Est�s seguro de que deseas salir?");
				if (confirmar == 0) { // Confirma salir
					frameLogin.setVisible(true);
					frame.dispose();
				}
			}
		});
		
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		btnPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modo = 1;
			}
		});
		
		btnConfirPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(modo == 1) { //Si el modo es 1 = La funci�n es de Pedido
					int confirmar = JOptionPane.showConfirmDialog(btnGuardarAct,
							"�Est�s seguro de que deseas confirmar el pedido?");
					if (confirmar == 0) { // Confirma el pedido
					}
				} else if (modo == 2) {//Si el modo es 1 = La funci�n es de Venta
					int confirmar = JOptionPane.showConfirmDialog(btnGuardarAct,
							"�Est�s seguro de que deseas confirmar la venta?");
					if (confirmar == 0) { // Confirma la venta
					}
				}
			}
		});
		
		btnIncrementarPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(tfPedidoCant.getText());
				if(modo == 1) { //Modo 1 = Modo Pedidos
					a++;
					tfPedidoCant.setText(String.valueOf(a));
					
				} else if (modo == 2) { //Modo 2 = Modo Ventas
					a++;
					tfPedidoCant.setText(String.valueOf(a));
					if(a == Integer.parseInt(tfCantidad.getText())) { //Si el valor es igual a la cantidad en stock
						btnIncrementarPedido.setEnabled(false);
					}
				}
				
				if(a != 0) { //Si el valor no es 0, se podr� seguir decrementando
					btnDisminuirPedido.setEnabled(true);
				}
			}
		});
		
		btnDisminuirPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(tfPedidoCant.getText());
				if(modo == 1) { //Modo 1 = Modo Pedidos
					if(a != 0) {
						a--;
						tfPedidoCant.setText(String.valueOf(a));
					}
					if (a == 0) { //Si el valor es 0, no se podr� seguir decrementando
						btnDisminuirPedido.setEnabled(false);
					}
				} else if (modo == 2) { //Modo 2 = Modo Ventas
					if(a != 0) {
						a--;
						tfPedidoCant.setText(String.valueOf(a));
						btnIncrementarPedido.setEnabled(true);
					}
					if (a == 0) {
						btnDisminuirPedido.setEnabled(false);
					}
				}
			}
		});
		
		btnVenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modo = 2;
			}
		});
		
		btnVentaDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnVentaDia, "Cantidad ventas totales: " );
			}
		});
	}
}
