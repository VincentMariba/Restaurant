package Kfc_S;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;

public class Kfc {

	private JFrame frame;
	private JTextField txtChickenBurger;
	private JTextField txtChickenBurgerMeal;
	private JTextField txtCheeseBurger;
	private JTextField txtQty;
	private JTextField txtCurrencyConverter;
	private JTextField txtDisplay;
	private JTextField lblCostDrinks;
	private JTextField lblCostMeal;
	private JTextField lblCostDelivery;
	private JTextField lblTotal;
	private JTextField lblSubTotal;
	private JTextField lblTax;
	protected JLabel lblCurrencyConverter;
	
	public static double Nigerian_Naria = 302.92;
	public static double US_Dollar = 1.52;
	public static double Kenyan_Shilling = 156.12;
	public static double Brazilian_Real = 5.86;
	public static double Canadian_Dollar = 2.03;
	public static double Indian_Rupee = 100.68;
	public static double Philippine_Peso = 71.74;
	public static double Indonesiah_Rupiah = 20746.74;
	
	public static double iChickenBurgerPrice = 15.39;
	public static double iChickenBurgerMealPrice = 20.39; 
	public static double iCheeseBurgerPrice = 25.39;
	
	static double Firstnum;
	static double Secondnum;
	static double result;
	static String operations;
	static  String answer;
	
	public void Cost()
	   {
        //Calculating the cost of the items
		double ChickenBurger = Double.parseDouble(txtChickenBurger.getText()); 
		double Burger;
		Burger = (ChickenBurger * iChickenBurgerPrice);
		String pMeal = String.format("%.2f", Burger);
		lblCostMeal.setText(pMeal);
		
		double ChickenBurgerMeal = Double.parseDouble(txtChickenBurgerMeal.getText());
		double BurgerMeal;
		BurgerMeal = (ChickenBurgerMeal * iChickenBurgerMealPrice);
		String cbMeal = String.format("%.2f",BurgerMeal + Burger);
		lblCostMeal.setText(cbMeal);
		
		double CheeseBurger = Double.parseDouble(txtCheeseBurger.getText());
		double CheeseBurgerMeal;
		CheeseBurgerMeal = (CheeseBurger * iCheeseBurgerPrice);
		String CheeseMeal = String.format("%.2f",CheeseBurgerMeal +BurgerMeal + Burger);
		lblCostMeal.setText(CheeseMeal);
	   }
	
	public void Total()
	   {
	       
	   }
	
	public void Rest_form()
	   {
	       
	   }
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kfc window = new Kfc();
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
	public Kfc() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void Rest_forma()
	   {
	       
	   }
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 955, 636);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel.setBounds(10, 61, 344, 256);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblChickenBurger = new JLabel("Chicken Burger");
		lblChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblChickenBurger.setBounds(10, 28, 169, 25);
		panel.add(lblChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblChickenBurgerMeal.setBounds(10, 64, 169, 25);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCheeseBurger.setBounds(10, 94, 169, 25);
		panel.add(lblCheeseBurger);
		
		txtChickenBurger = new JTextField();
		txtChickenBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		txtChickenBurger.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtChickenBurger.setBounds(181, 32, 150, 20);
		panel.add(txtChickenBurger);
		txtChickenBurger.setColumns(10);
		
		txtChickenBurgerMeal = new JTextField();
		txtChickenBurgerMeal.setToolTipText("");
		txtChickenBurgerMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtChickenBurgerMeal.setColumns(10);
		txtChickenBurgerMeal.setBounds(181, 64, 150, 20);
		panel.add(txtChickenBurgerMeal);
		
		txtCheeseBurger = new JTextField();
		txtCheeseBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCheeseBurger.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtCheeseBurger.setColumns(10);
		txtCheeseBurger.setBounds(181, 98, 150, 20);
		panel.add(txtCheeseBurger);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDrink.setBounds(10, 158, 135, 25);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQty.setBounds(181, 158, 150, 25);
		panel.add(lblQty);
		
		JCheckBox chkTax = new JCheckBox("Tax");
		chkTax.setFont(new Font("Tahoma", Font.BOLD, 15));
		chkTax.setBounds(177, 213, 85, 23);
		panel.add(chkTax);
		
		JCheckBox chkHomeDelivery = new JCheckBox("Home Delivery");
		chkHomeDelivery.setFont(new Font("Tahoma", Font.BOLD, 15));
		chkHomeDelivery.setBounds(6, 213, 150, 23);
		panel.add(chkHomeDelivery);
		
		JComboBox<String> cmbDrink = new JComboBox<>();
		cmbDrink.setModel(new DefaultComboBoxModel<String>(new String[] {"Select a drink", "Apple juice", "Tea", "Cola", "Coke", "Coffee", "Ice Tea", "Ice Coffee", "Orange"}));
		cmbDrink.setBounds(10, 182, 150, 20);
		panel.add(cmbDrink);
		
		txtQty = new JTextField();
		txtQty.setHorizontalAlignment(SwingConstants.RIGHT);
		txtQty.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtQty.setColumns(10);
		txtQty.setBounds(181, 182, 150, 20);
		panel.add(txtQty);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 145, 321, 2);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(588, 61, 341, 447);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 321, 425);
		panel_1.add(tabbedPane);
		
		JPanel txtReceipts = new JPanel();
		tabbedPane.addTab("Receipt", null, txtReceipts, null);
		txtReceipts.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 296, 375);
		txtReceipts.add(textArea);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_8, null);
		panel_8.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtDisplay.setColumns(10);
		txtDisplay.setBounds(50, 31, 212, 52);
		panel_8.add(txtDisplay);
		
		JButton btnBack = new JButton("<");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				
				if(txtDisplay.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
							strB.deleteCharAt(txtDisplay.getText().length() - 1);
							backspace = strB.toString();
							txtDisplay.setText(backspace);
					
				}
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnBack.setBackground(SystemColor.menu);
		btnBack.setBounds(50, 115, 52, 39);
		panel_8.add(btnBack);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumer = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumer);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn7.setBackground(SystemColor.menu);
		btn7.setBounds(50, 165, 52, 39);
		panel_8.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumer = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNumer);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn4.setBackground(SystemColor.menu);
		btn4.setBounds(50, 215, 52, 39);
		panel_8.add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumer = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNumer);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn1.setBackground(SystemColor.menu);
		btn1.setBounds(50, 265, 52, 39);
		panel_8.add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumer = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNumer);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn0.setBackground(SystemColor.menu);
		btn0.setBounds(50, 311, 52, 39);
		panel_8.add(btn0);
		
		JButton btnComma = new JButton(".");
		btnComma.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnComma.setBackground(SystemColor.menu);
		btnComma.setBounds(103, 311, 52, 39);
		panel_8.add(btnComma);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumer = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNumer);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn2.setBackground(SystemColor.menu);
		btn2.setBounds(103, 265, 52, 39);
		panel_8.add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumer = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNumer);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn5.setBackground(SystemColor.menu);
		btn5.setBounds(103, 215, 52, 39);
		panel_8.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumer = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNumer);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn8.setBackground(SystemColor.menu);
		btn8.setBounds(103, 165, 52, 39);
		panel_8.add(btn8);
		
		JButton btnClear = new JButton("c");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.setBackground(SystemColor.menu);
		btnClear.setBounds(103, 115, 52, 39);
		panel_8.add(btnClear);   
		
		JButton btnPlusMinus = new JButton("+-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(txtDisplay.getText());
				ops = ops * (-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPlusMinus.setBackground(SystemColor.menu);
		btnPlusMinus.setBounds(157, 311, 52, 39);
		panel_8.add(btnPlusMinus);
		
		JButton btnEqual = new JButton("= ");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				Secondnum = Double.parseDouble(txtDisplay.getText());
				
				if (operations == "+")
				{
					result = Firstnum + Secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "-")
				{
					result = Firstnum - Secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "/")
				{
					result = Firstnum / Secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "*")
				{
					result = Firstnum * Secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if (operations == "%")
				{
					result = Firstnum % Secondnum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnEqual.setBackground(SystemColor.menu);
		btnEqual.setBounds(210, 311, 52, 39);
		panel_8.add(btnEqual);
		
		JButton btnMultiple = new JButton("*");
		btnMultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMultiple.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMultiple.setBackground(SystemColor.menu);
		btnMultiple.setBounds(210, 265, 52, 39);
		panel_8.add(btnMultiple);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumer = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNumer);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn3.setBackground(SystemColor.menu);
		btn3.setBounds(157, 265, 52, 39);
		panel_8.add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumer = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNumer);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn6.setBackground(SystemColor.menu);
		btn6.setBounds(157, 215, 52, 39);
		panel_8.add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnMinus.setBackground(SystemColor.menu);
		btnMinus.setBounds(210, 215, 52, 39);
		panel_8.add(btnMinus);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDivide.setBackground(SystemColor.menu);
		btnDivide.setBounds(210, 165, 52, 39);
		panel_8.add(btnDivide);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumer = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNumer);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 11));
		btn9.setBackground(SystemColor.menu);
		btn9.setBounds(157, 165, 52, 39);
		panel_8.add(btn9);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPercentage.setBackground(SystemColor.menu);
		btnPercentage.setBounds(157, 115, 52, 39);
		panel_8.add(btnPercentage);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPlus.setBackground(SystemColor.menu);
		btnPlus.setBounds(210, 115, 52, 39);
		panel_8.add(btnPlus);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.setBounds(364, 61, 214, 256);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(107, 8, 0, 0);
		panel_2.add(label);
		
		JComboBox<String> cmbCurrencyConverter = new JComboBox<>();
		cmbCurrencyConverter.setModel(new DefaultComboBoxModel<String>(new String[] {"Choose One", "USA", "Nigeria", "Kenyan", "Canada", "Brazil", "Indonesia", "Philippine"}));
		cmbCurrencyConverter.setBounds(10, 45, 194, 20);
		panel_2.add(cmbCurrencyConverter);
		
		JLabel label_5 = new JLabel("Currency Converter");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(10, 8, 194, 25);
		panel_2.add(label_5);
		
		txtCurrencyConverter = new JTextField();
		txtCurrencyConverter.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtCurrencyConverter.setColumns(10);
		txtCurrencyConverter.setBounds(10, 99, 194, 20);
		panel_2.add(txtCurrencyConverter);
		
		JLabel lblCurrencyConverter = new JLabel("");
		lblCurrencyConverter.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCurrencyConverter.setForeground(Color.BLACK);
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCurrencyConverter.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		lblCurrencyConverter.setBackground(Color.RED);
		lblCurrencyConverter.setBounds(10, 145, 194, 18);
		panel_2.add(lblCurrencyConverter);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			double British_Pound = Double.parseDouble(txtCurrencyConverter.getText());
			
			if(cmbCurrencyConverter.getSelectedItem().equals("Nigeria"))
			{
				String cConvert1 = String.format("N %.2f", British_Pound * Nigerian_Naria);
				lblCurrencyConverter.setText(cConvert1);
			}
			
			if(cmbCurrencyConverter.getSelectedItem().equals("USA"))
			{
				String cConvert2 = String.format("$ %.2f", British_Pound * US_Dollar);
				lblCurrencyConverter.setText(cConvert2);
			}
			
			
			if(cmbCurrencyConverter.getSelectedItem().equals("Kenyan"))
			{
				String cConvert3 = String.format("KS %.2f", British_Pound * Kenyan_Shilling);
				lblCurrencyConverter.setText(cConvert3);
			}
			
			
			if(cmbCurrencyConverter.getSelectedItem().equals("Brazil"))
			{
				String cConvert4 = String.format("Bra %.2f", British_Pound * Brazilian_Real);
				lblCurrencyConverter.setText(cConvert4);
			}
			
			if(cmbCurrencyConverter.getSelectedItem().equals("Canada"))
			{
				String cConvert5 = String.format("C$ %.2f", British_Pound * Canadian_Dollar);
				lblCurrencyConverter.setText(cConvert5);
			}
			
			if(cmbCurrencyConverter.getSelectedItem().equals("Philippine"))
			{
				String cConvert6 = String.format("PHP %.2f", British_Pound * Philippine_Peso);
				lblCurrencyConverter.setText(cConvert6);
			}
			
			if(cmbCurrencyConverter.getSelectedItem().equals("Indonesia"))
			{
				String cConvert7 = String.format("INR %.2f", British_Pound * Indonesiah_Rupiah);
				lblCurrencyConverter.setText(cConvert7);
			}
			}
		});
		btnConverter.setBackground(UIManager.getColor("Button.background"));
		btnConverter.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConverter.setBounds(10, 204, 89, 23);
		panel_2.add(btnConverter);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmbCurrencyConverter.setSelectedItem("Choose One...");
				lblCurrencyConverter.setText(null);
				txtCurrencyConverter.setText(null);
			}
			
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClose.setBounds(115, 204, 89, 23);
		panel_2.add(btnClose);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setBounds(10, 194, -682, -125);
		panel_2.add(horizontalGlue);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 519, 919, 68);
		frame.getContentPane().add(panel_3);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setLayout(null);
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double cTotal1 = Double.parseDouble(lblCostMeal.getText());
				double cTotal2 = Double.parseDouble(lblCostDelivery.getText());
				double cTotal3 = Double.parseDouble(lblCostDrinks.getText());
				double AllTotal = (cTotal1 + cTotal2 + cTotal3)/100;
				
				if(chkTax.isSelected())
				{
					String iTotal = String.format("%.2f", AllTotal);
					lblTax.setText(iTotal);
				}
				
				
				//-----------------------------------Total--------------------------------
				
				double Drinks = Double.parseDouble(txtQty.getText());
				double Tea = 10.39 * Drinks;
				double Ice_Tea = 11.39 * Drinks;
				double Coffee = 12.39 * Drinks;
				double Ice_Coffee = 14.39 * Drinks;
				double Cola = 16.39 * Drinks;
				double Coke = 7.39 * Drinks;
				double Orange = 8.39 * Drinks;
				double Apple_justice = 15.39 * Drinks;
				
				double iChickenBurgerPrice = 15.39;
				double iChickenBurgerMealPrice = 20.39;
				double iCheeseBurgerPrice = 25.39;
				
				double cTotal4 = Double.parseDouble(lblTax.getText());
				
				double SubTotal = ((cTotal1 + cTotal2 + cTotal3) - (cTotal4));
				String iSubTotal = String.format("%.2f", SubTotal);
				lblSubTotal.setText(iSubTotal);
				
				double iAllTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
				String iTotal = String.format("%.2f", iAllTotal);
				lblTotal.setText(iTotal);
				
				String iTaxTotal = String.format("%.2f", cTotal4);
				lblTax.setText(iTaxTotal);
				
				Date date = new Date();
				
				textArea.setText(textArea.getText() + "                                         \n");
				textArea.setText(textArea.getText() + "                   KFC Restaurant\n");
				textArea.setText(textArea.getText() + "                Rosebank Johannesburg\n");
				textArea.setText(textArea.getText() + "                                         \n");
				textArea.setText(textArea.getText() + "Date : " + date + "\n");
				textArea.setText(textArea.getText() + "                                         \n");
				textArea.setText(textArea.getText() + "Receipt #: 042586\n");
				textArea.setText(textArea.getText() + "                                         \n");
				
				textArea.setText(textArea.getText() + "Chicken Burger : " + txtChickenBurger.getText() + " * " + iChickenBurgerPrice +"\n");
				textArea.setText(textArea.getText() + "Chicken Burger Meal : " + txtChickenBurgerMeal.getText() + " * " + iChickenBurgerMealPrice +"\n");
				textArea.setText(textArea.getText() + "Bacon & Cheese Burger : " + txtCheeseBurger.getText() + " * " + iCheeseBurgerPrice +"\n"); 
				
				
				if(cmbDrink.getSelectedItem().equals("Apple juice"))
				{
					String cApple_Juice = String.format("%.2f", Apple_justice);
					lblCostDrinks.setText(cApple_Juice);
					textArea.setText(textArea.getText() + "Drinks : " + txtQty.getText() + " * " + Apple_justice + "\n");
				}
				
			    if(cmbDrink.getSelectedItem().equals("Coke"))
				{
					String cCoke = String.format("%.2f", Coke);
					lblCostDrinks.setText(cCoke);
					textArea.setText(textArea.getText() + "Drinks : " + txtQty.getText() + " * " + Coke + "\n");
				}
				
			    if(cmbDrink.getSelectedItem().equals("Cola"))
				{
					String cCola = String.format("%.2f", Cola);
					lblCostDrinks.setText(cCola);
					textArea.setText(textArea.getText() + "Drinks : " + txtQty.getText() + " * " + Cola + "\n");
				}
				
			    if(cmbDrink.getSelectedItem().equals("Ice Coffee"))
				{
					String cIce_Coffee = String.format("%.2f", Ice_Coffee);
					lblCostDrinks.setText(cIce_Coffee);
					textArea.setText(textArea.getText() + "Drinks : " + txtQty.getText() + " * " + Ice_Coffee + "\n");
				}
				
			    if(cmbDrink.getSelectedItem().equals("Ice Tea"))
				{
					String cIce_Tea = String.format("%.2f", Ice_Tea);
					lblCostDrinks.setText(cIce_Tea);
					textArea.setText(textArea.getText() + "Drinks : " + txtQty.getText() + " * " + Ice_Tea + "\n");
				}
				
			    if(cmbDrink.getSelectedItem().equals("Tea"))
				{
					String cTea = String.format("%.2f", Tea);
					lblCostDrinks.setText(cTea);
					textArea.setText(textArea.getText() + "Drinks : " + txtQty.getText() + " * " + Tea + "\n");
				}
				
			    if(cmbDrink.getSelectedItem().equals("Orange"))
				{
					String cOrange = String.format("%.2f", Orange);
					lblCostDrinks.setText(cOrange);
					textArea.setText(textArea.getText() + "Drinks : " + txtQty.getText() + " * " + Orange + "\n");
				}
				
				if(cmbDrink.getSelectedItem().equals("Coffee"))
				{
					String cOrange = String.format("%.2f", Coffee);
					lblCostDrinks.setText(cOrange);
					textArea.setText(textArea.getText() + "Drinks : " + txtQty.getText() + " * " + Coffee + "\n");
				}
				
				if(cmbDrink.getSelectedItem().equals("Select a drink"))
				{
					lblCostDrinks.setText("0.00");
					textArea.setText(textArea.getText() + "Drinks : " + txtQty.getText() + "* 0" + "\n");
				}
				
				
				textArea.setText(textArea.getText() + "                                         \n");
				textArea.setText(textArea.getText() + "Cost of Drinks : " + lblCostDrinks.getText() + "\n");
				textArea.setText(textArea.getText() + "Cost of Meal : " + lblCostMeal.getText() + "\n");
				textArea.setText(textArea.getText() + "Cost of Delivery : " + lblCostDelivery.getText() + "\n");
				textArea.setText(textArea.getText() + "                                         \n");
				textArea.setText(textArea.getText() + "Sub Total : " + iSubTotal + "\n");
				textArea.setText(textArea.getText() + "Sale Tax : " + iTaxTotal + "\n");
				textArea.setText(textArea.getText() + "Total : " + iTotal + "\n");
				textArea.setText(textArea.getText() + "                                         \n");
				textArea.setText(textArea.getText() + "                   THANK YOU\n");
				
			}
		});
		btnReceipt.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReceipt.setBounds(622, 22, 89, 23);
		panel_3.add(btnReceipt);
		
		//Exiting the form
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(820, 22, 89, 23);
		panel_3.add(btnExit);
		
		//Reseting the form or Clearing the form
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCostDrinks.setText(null);
				lblCostMeal.setText(null);
				lblCostDelivery.setText(null);
				lblTax.setText(null);
				lblSubTotal.setText(null);
				lblTotal.setText(null);
				lblCurrencyConverter.setText(null);
				txtChickenBurger.setText(null);
				txtChickenBurgerMeal.setText(null);
				txtCheeseBurger.setText(null);
				txtQty.setText(null);
				txtCurrencyConverter.setText(null);
				cmbDrink.setSelectedItem("Select a drink");
				cmbCurrencyConverter.setSelectedItem("Choose One...");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.setBounds(721, 22, 89, 23);
		panel_3.add(btnReset);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
				
				//Calling method Cost
				Cost();
				
				//-----------------------------------Home Delivery--------------------------------
				double iDelivery = 5.39;
				if(chkHomeDelivery.isSelected())
				{
					String pDelivery = String.format("%.2f", iDelivery);
					lblCostDelivery.setText(pDelivery);
				}
				else
				{
					lblCostDelivery.setText("0.00");
				}
				
				//-----------------------------------Drinks--------------------------------
				double Drinks = Double.parseDouble(txtQty.getText());
				double Tea = 10.39 * Drinks;
				double Ice_Tea = 11.39 * Drinks;
				double Coffee = 12.39 * Drinks;
				double Ice_Coffee = 14.39 * Drinks;
				double Cola = 16.39 * Drinks;
				double Coke = 7.39 * Drinks;
				double Orange = 8.39 * Drinks;
				double Apple_justice = 15.39 * Drinks;
				
				if(cmbDrink.getSelectedItem().equals("Apple juice"))
				{
					String cApple_Juice = String.format("%.2f", Apple_justice);
					lblCostDrinks.setText(cApple_Juice);
				}
				
			    if(cmbDrink.getSelectedItem().equals("Coke"))
				{
					String cCoke = String.format("%.2f", Coke);
					lblCostDrinks.setText(cCoke);
				}
				
			    if(cmbDrink.getSelectedItem().equals("Cola"))
				{
					String cCola = String.format("%.2f", Cola);
					lblCostDrinks.setText(cCola);
				}
				
			    if(cmbDrink.getSelectedItem().equals("Ice Coffee"))
				{
					String cIce_Coffee = String.format("%.2f", Ice_Coffee);
					lblCostDrinks.setText(cIce_Coffee);
				}
				
			    if(cmbDrink.getSelectedItem().equals("Ice Tea"))
				{
					String cIce_Tea = String.format("%.2f", Ice_Tea);
					lblCostDrinks.setText(cIce_Tea);
				}
				
			    if(cmbDrink.getSelectedItem().equals("Tea"))
				{
					String cTea = String.format("%.2f", Tea);
					lblCostDrinks.setText(cTea);
				}
				
			    if(cmbDrink.getSelectedItem().equals("Orange"))
				{
					String cOrange = String.format("%.2f", Orange);
					lblCostDrinks.setText(cOrange);
				}
				
				if(cmbDrink.getSelectedItem().equals("Coffee"))
				{
					String cOrange = String.format("%.2f", Coffee);
					lblCostDrinks.setText(cOrange);
				}
				
				if(cmbDrink.getSelectedItem().equals("Select a drink"))
				{
					lblCostDrinks.setText("0.00");
				}
				
				//-----------------------------------Tax Rate--------------------------------
				double cTotal1 = Double.parseDouble(lblCostMeal.getText());
				double cTotal2 = Double.parseDouble(lblCostDelivery.getText());
				double cTotal3 = Double.parseDouble(lblCostDrinks.getText());
				double AllTotal = (cTotal1 + cTotal2 + cTotal3)/100;
				double cTotal4 = 0;
				if(chkTax.isSelected())
				{
					String iTotalTax = String.format("%.2f", AllTotal);
					lblTax.setText(iTotalTax);
					cTotal4 = Double.parseDouble(lblTax.getText());
				}
				
				
				//-----------------------------------Total--------------------------------
				double SubTotal = ((cTotal1 + cTotal2 + cTotal3) - (cTotal4));
				String iSubTotal = String.format("%.2f", SubTotal);
				lblSubTotal.setText(iSubTotal);
				
				double iAllTotal = (SubTotal + cTotal4);
				String iTotal = String.format("%.2f", iAllTotal);
				lblTotal.setText(iTotal);
				
				String iTaxTotal = String.format("%.2f", cTotal4);
				lblTax.setText(iTaxTotal);
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnTotal.setBounds(523, 22, 89, 23);
		panel_3.add(btnTotal);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.menu);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_4.setBounds(364, 328, 214, 180);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label_9 = new JLabel("Tax"); 
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(10, 44, 72, 25);
		panel_4.add(label_9);
		
		JLabel label_10 = new JLabel("Sub Total");
		label_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_10.setBounds(10, 77, 72, 25);
		panel_4.add(label_10);
		
		JLabel label_11 = new JLabel("Total");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_11.setBounds(10, 111, 46, 25);
		panel_4.add(label_11);
		
		lblTotal = new JTextField();
		lblTotal.setBackground(SystemColor.menu);
		lblTotal.setForeground(Color.BLACK);
		lblTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTotal.setEditable(false);
		lblTotal.setColumns(10);
		lblTotal.setBounds(92, 116, 112, 20);
		lblTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_4.add(lblTotal);
		
		lblSubTotal = new JTextField();
		lblSubTotal.setBackground(SystemColor.menu);
		lblSubTotal.setForeground(Color.BLACK);
		lblSubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSubTotal.setEditable(false);
		lblSubTotal.setColumns(10);
		lblSubTotal.setBounds(92, 82, 112, 20);
		lblSubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_4.add(lblSubTotal);
		
		lblTax = new JTextField();
		lblTax.setBackground(SystemColor.menu);
		lblTax.setForeground(Color.BLACK);
		lblTax.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTax.setEditable(false);
		lblTax.setColumns(10);
		lblTax.setBounds(92, 47, 112, 20);
		lblTax.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_4.add(lblTax);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.menu);
		panel_5.setForeground(Color.BLACK);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_5.setBounds(10, 328, 344, 180);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCostOfDelivery.setBounds(10, 113, 169, 25);
		panel_5.add(lblCostOfDelivery);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCostOfMeal.setBounds(10, 79, 169, 25);
		panel_5.add(lblCostOfMeal);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCostOfDrinks.setBounds(10, 47, 169, 25);
		panel_5.add(lblCostOfDrinks);
		
		lblCostDrinks = new JTextField();
		lblCostDrinks.setForeground(Color.BLACK);
		lblCostDrinks.setBackground(SystemColor.menu);
		lblCostDrinks.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostDrinks.setEditable(false);
		lblCostDrinks.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCostDrinks.setColumns(10);
		lblCostDrinks.setBounds(184, 48, 150, 20);
		lblCostDrinks.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_5.add(lblCostDrinks);
		
		lblCostMeal = new JTextField();
		lblCostMeal.setForeground(Color.BLACK);
		lblCostMeal.setBackground(SystemColor.menu);
		lblCostMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostMeal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCostMeal.setEditable(false);
		lblCostMeal.setColumns(10);
		lblCostMeal.setBounds(184, 83, 150, 20);
		lblCostMeal.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		panel_5.add(lblCostMeal);
		
		lblCostDelivery = new JTextField();
		lblCostDelivery.setForeground(Color.BLACK);
		lblCostDelivery.setBackground(SystemColor.menu);
		lblCostDelivery.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCostDelivery.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCostDelivery.setEditable(false);
		lblCostDelivery.setColumns(10);
		lblCostDelivery.setBounds(184, 117, 150, 20);
		lblCostDelivery.setBorder(new LineBorder(new Color(0, 0, 0), 1));
		
		panel_5.add(lblCostDelivery);
		
		JLabel lblKfcRestaurantManagement = new JLabel("KFC Restaurant Management System");
		lblKfcRestaurantManagement.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblKfcRestaurantManagement.setBounds(70, 11, 568, 45);
		frame.getContentPane().add(lblKfcRestaurantManagement);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mmariba\\Downloads\\KFC_logo.png"));
		lblNewLabel.setBounds(10, 11, 50, 45);
		frame.getContentPane().add(lblNewLabel);
	}
}
