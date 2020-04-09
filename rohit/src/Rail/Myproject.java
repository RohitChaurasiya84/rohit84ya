package Rail;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Myproject {

	private JFrame frame;
	private JTextField txtTotal;
	private JTextField txtSubTotal;
	private JTextField txtTax;
	private JTextField txtClass;
	private JTextField txtTicket;
	private JTextField txtAdult;
	private JTextField txtChild;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTicketNo;
	private JTextField txtPrice;
	private JTextField txtRoute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Myproject window = new Myproject();
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
	public Myproject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0,1390,840);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(196, 11, 753, 78);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("RAILWAY TRAVELING SYSTEM");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("TICKET TYPE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(130, 143, 143, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdb1 = new JRadioButton("SLEEPER");
		rdb1.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdb1.setBounds(17, 206, 139, 23);
		frame.getContentPane().add(rdb1);
		
		JRadioButton rdb5 = new JRadioButton("RETURN TICKET");
		rdb5.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdb5.setBounds(296, 232, 189, 23);
		frame.getContentPane().add(rdb5);
		
		JRadioButton rdb3 = new JRadioButton("ADULT");
		rdb3.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdb3.setBounds(182, 206, 112, 23);
		frame.getContentPane().add(rdb3);
		
		JRadioButton rdb4 = new JRadioButton("THIRD AC");
		rdb4.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdb4.setBounds(17, 232, 139, 23);
		frame.getContentPane().add(rdb4);
		
		JRadioButton rdb2 = new JRadioButton("ONEWAY TICKET");
		rdb2.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdb2.setBounds(296, 206, 214, 23);
		frame.getContentPane().add(rdb2);
		
		JRadioButton rdb6 = new JRadioButton("CHILD");
		rdb6.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdb6.setBounds(182, 232, 112, 23);
		frame.getContentPane().add(rdb6);
		
		JRadioButton rdb7 = new JRadioButton("SECOND AC");
		rdb7.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdb7.setBounds(17, 263, 157, 23);
		frame.getContentPane().add(rdb7);
		
		JRadioButton rdb8 = new JRadioButton("FIRST AC");
		rdb8.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdb8.setBounds(17, 289, 157, 23);
		frame.getContentPane().add(rdb8);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"DESTINATION", "PATNA", "DELHI", "GWALIOR", "KANPUR", "MUMBAI", "JHANSHI"}));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setBounds(182, 331, 212, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox<String> cmb2 = new JComboBox<String>();
		cmb2.setModel(new DefaultComboBoxModel<String>(new String[] {"SOURCE", "BHOPAL", "PATNA", "KANPUR", "GWALIOR", "DELHI", "JHANSHI"}));
		cmb2.setFont(new Font("Tahoma", Font.BOLD, 20));
		cmb2.setBounds(184, 289, 212, 22);
		frame.getContentPane().add(cmb2);
		
		
		JLabel lblTax = new JLabel("TAX");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTax.setBounds(22, 413, 75, 28);
		frame.getContentPane().add(lblTax);
		
		JLabel lblTotal = new JLabel("TOTAL");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(17, 465, 75, 28);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblSubtotal = new JLabel("SUBTOTAL");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubtotal.setBounds(10, 518, 112, 28);
		frame.getContentPane().add(lblSubtotal);
		
		JButton btnNewButton = new JButton("TOTAL");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				double tax=20.50;
				double Milesk8=750.0;
				double Milesk12=670;
				double Milesk13=540;
				double Milesk14=620;
				double Milesk15=830;
				double Milesk16=405;
				double totalcost,sl=700,sa=1400,fa=2500;
				//============PATNA========================
				//============SLEEPER=======================
				if((rdb1.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*Milesk8)/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SLP");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb1.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*Milesk8)/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb1.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*Milesk8)/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb1.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*Milesk8)/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//===============THIRD AC=================
				else if((rdb4.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*(Milesk8+sl))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb4.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*(Milesk8+sl))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb4.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*(Milesk8+sl))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb4.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*(Milesk8+sl))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//==============SECOND AC===============
				else if((rdb7.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*(Milesk8+sa))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb7.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*(Milesk8+sa))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb7.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*(Milesk8+sa))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb7.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*(Milesk8+sa))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("  SECOND AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//=======FIRST AC==========
				else if((rdb8.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*(Milesk8+fa))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb8.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*(Milesk8+fa))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("  FIRST CLASS");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb8.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*(Milesk8+fa))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb8.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*(Milesk8+fa))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("  FIRST AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//DELHI
				//============SLEEPER=======================
				else if((rdb1.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*Milesk12)/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb1.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*Milesk12)/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb1.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*Milesk12)/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb1.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*Milesk8)/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//===============THIRD AC=================
				else if((rdb4.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*(Milesk12+sl))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb4.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*(Milesk12+sl))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb4.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*(Milesk12+sl))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb4.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*(Milesk12+sl))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//==============SECOND AC===============
				else if((rdb7.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*(Milesk12+sa))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb7.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*(Milesk12+sa))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb7.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*(Milesk12+sa))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   STD");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb7.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*(Milesk12+sa))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   ");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//=======FIRST AC==========
				else if((rdb8.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*(Milesk12+fa))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb8.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*(Milesk12+fa))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb8.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*(Milesk12+fa))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb8.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("DELHI"))
				{
					totalcost=(tax*(Milesk12+fa))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//=====GWALIOR============
				//============SLEEPER=======================
				else if((rdb1.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*Milesk13)/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb1.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*Milesk13)/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb1.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*Milesk13)/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb1.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*Milesk13)/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//===============THIRD AC=================
				else if((rdb4.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*(Milesk13+sl))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb4.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*(Milesk13+sl))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb4.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*(Milesk13+sl))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb4.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*(Milesk13+sl))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//==============SECOND AC===============
				else if((rdb7.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*(Milesk13+sa))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb7.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*(Milesk13+sa))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb7.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("PATNA"))
				{
					totalcost=(tax*(Milesk8+sa))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb7.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*(Milesk13+sa))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//=======FIRST AC==========
				else if((rdb8.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*(Milesk13+fa))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb8.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*(Milesk13+fa))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb8.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*(Milesk13+fa))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb8.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("GWALIOR"))
				{
					totalcost=(tax*(Milesk13+fa))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//===KANPUR=======
				//============SLEEPER=======================
				else if((rdb1.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*Milesk14)/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb1.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*Milesk14)/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb1.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*Milesk14)/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb1.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*Milesk14)/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("  SL");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//===============THIRD AC=================
				else if((rdb4.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+sl))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("  THIRD AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb4.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+sl))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb4.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+sl))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb4.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+sl))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//==============SECOND AC===============
				else if((rdb7.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+sa))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb7.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+sa))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb7.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+sa))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText("    SECOND AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb7.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+sa))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("  SECOND AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//=======FIRST AC==========
				else if((rdb8.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+fa))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb8.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+fa))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb8.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+fa))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("  FIRST AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb8.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+fa))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//=====MUMBAI===========
				//============SLEEPER=======================
				else if((rdb1.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("MUMBAI"))
				{
					totalcost=(tax*Milesk15)/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb1.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("MUMBAI"))
				{
					totalcost=(tax*Milesk15)/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("    SL");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb1.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("MUMBAI"))
				{
					totalcost=(tax*Milesk15)/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("    SL");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("  NIL");
					txtChild.setText("  ONE");
				}
				else if((rdb1.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("MUMBAI"))
				{
					totalcost=(tax*Milesk15)/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("    SL");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("  ONE");
				}
				//===============THIRD AC=================
				else if((rdb4.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("MUMBAI"))
				{
					totalcost=(tax*(Milesk15+sl))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("  THIRD AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb4.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+sl))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb4.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("MUMBAI"))
				{
					totalcost=(tax*(Milesk15+sl))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb4.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("MUMBAI"))
				{
					totalcost=(tax*(Milesk15+sl))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("  ONE");
				}
				//==============SECOND AC===============
				else if((rdb7.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("MUMBAI"))
				{
					totalcost=(tax*(Milesk15+sa))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb7.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+sa))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("  SECOND AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb7.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("MUMBAI"))
				{
					totalcost=(tax*(Milesk15+sa))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("  SECOND AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb7.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("MUMBAI"))
				{
					totalcost=(tax*(Milesk15+sa))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//=======FIRST AC==========
				else if((rdb8.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("MUMBAI"))
				{
					totalcost=(tax*(Milesk15+fa))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("  FIRST AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb8.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("MUMBAI"))
				{
					totalcost=(tax*(Milesk15+fa))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb8.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("MUMBAI"))
				{
					totalcost=(tax*(Milesk15+fa))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("  ONE");
				}
				else if((rdb8.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("MUMBAI"))
				{
					totalcost=(tax*(Milesk15+fa))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NI");
					txtChild.setText("   ONE");
				}
				//=================JHANSHI===============
				//============SLEEPER=======================
				else if((rdb1.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*Milesk16)/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb1.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*Milesk16)/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb1.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*Milesk16)/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("  SL");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb1.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*Milesk16)/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SL");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//===============THIRD AC=================
				else if((rdb4.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*(Milesk16+sl))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb4.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("KANPUR"))
				{
					totalcost=(tax*(Milesk14+sl))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText("	THIRD AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb4.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*(Milesk16+sl))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb4.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*(Milesk16+sl))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   THIRD AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				//==============SECOND AC===============
				else if((rdb7.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*(Milesk16+sa))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb7.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*(Milesk16+sa))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("  SECOND AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb7.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*(Milesk16+sa))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb7.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*(Milesk16+sa))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   SECOND AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("  ONE");
				}
				//=======FIRST AC==========
				else if((rdb8.isSelected()) &&(rdb2.isSelected())&&(rdb3.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*(Milesk16+fa))/100;
					String sTax=String.format("%.2f",totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb8.isSelected()) &&(rdb5.isSelected())&& (rdb3.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*(Milesk16+fa))/100;
					String sTax=String.format("%.2f",2*totalcost);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",2*Milesk8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   ONE");
					txtChild.setText("   NIL");
				}
				else if((rdb8.isSelected()) &&(rdb2.isSelected())&&(rdb6.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*(Milesk16+fa))/100;
					String sTax=String.format("%.2f",totalcost-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",Milesk8-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",Milesk8 + totalcost-200);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   ONEWAY");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}
				else if((rdb8.isSelected()) &&(rdb5.isSelected())&& (rdb6.isSelected()) && comboBox.getSelectedItem().equals("JHANSHI"))
				{
					totalcost=(tax*(Milesk16+fa))/100;
					String sTax=String.format("%.2f",(2*totalcost)-200);
					txtTax.setText(sTax);
					String subTotal=String.format("%.2f",(2*Milesk8)-200);
					txtSubTotal.setText(subTotal);
					String Total=String.format("%.2f",(Milesk8 + totalcost-200)*2);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("   FIRST AC");
					txtTicket.setText("   RETURN");
					txtAdult.setText("   NIL");
					txtChild.setText("   ONE");
				}





			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=====TIME=========
				Calendar timer=Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
				txtTime.setText(tTime.format(timer.getTime()));
				//====DATE=========
				SimpleDateFormat Tdate=new SimpleDateFormat("dd-MMM-yyyy");
				txtDate.setText(Tdate.format(timer.getTime()));

				txtFrom.setText((String) cmb2.getSelectedItem()+" *");
				
				
				//txtTo.setText((String) cmbDestination.getSelectedItem()+ " *");


				//=======RANDOM NUMBER==========
				int num1;
				String q1="";
				num1=1325+(int)(Math.random()*4238);
				q1+=num1 + 1325;
				txtTicketNo.setText(  q1);

				//===========
				txtRoute.setText("  Any");
				txtTo.setText((String) comboBox.getSelectedItem()+" *");
				//txtFrom.setText((String) comboBox_1.getSelectedItem()+" *");






			}
		});
		btnNewButton.setToolTipText("TATAL COST OF TICKET");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(22, 594, 112, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(154, 523, 104, 23);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setColumns(10);
		txtSubTotal.setBounds(154, 472, 104, 23);
		frame.getContentPane().add(txtSubTotal);
		
		txtTax = new JTextField();
		txtTax.setColumns(10);
		txtTax.setBounds(154, 413, 104, 23);
		frame.getContentPane().add(txtTax);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setToolTipText("RESET SYSTEM");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				rdb1.setSelected(false);
				rdb2.setSelected(false);
				rdb3.setSelected(false);
				rdb4.setSelected(false);
				rdb5.setSelected(false);
				rdb6.setSelected(false);
				rdb7.setSelected(false);
				rdb8.setSelected(false);
				txtClass.setText(null);
				txtChild.setText(null);
				txtAdult.setText(null);
				txtTicket.setText(null);
				txtFrom.setText(null);
				txtTo.setText(null);
				txtDate.setText(null);
				txtTime.setText(null);
				txtRoute.setText(null);
				txtTicketNo.setText(null);
				txtPrice.setText(null);
				comboBox.setSelectedItem("DESTINATION");
				cmb2.setSelectedItem("SOURCE");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(172, 594, 112, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setToolTipText("EXIT SYSTEM");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("Exit");
				if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Ticket System",
				JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
				System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(321, 594, 112, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.RED);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(516, 100, 22, 550);
		frame.getContentPane().add(separator);
		
		JLabel lblClass = new JLabel("CLASS");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblClass.setBounds(556, 100, 83, 28);
		frame.getContentPane().add(lblClass);
		
		JLabel lblTicket = new JLabel("TICKET");
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicket.setBounds(693, 100, 95, 28);
		frame.getContentPane().add(lblTicket);
		
		JLabel lblAdult = new JLabel("ADULT");
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdult.setBounds(837, 100, 112, 28);
		frame.getContentPane().add(lblAdult);
		
		JLabel lblChild = new JLabel("CHILD");
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblChild.setBounds(993, 100, 83, 28);
		frame.getContentPane().add(lblChild);
		
		txtClass = new JTextField();
		txtClass.setColumns(10);
		txtClass.setBounds(535, 150, 104, 23);
		frame.getContentPane().add(txtClass);
		
		txtTicket = new JTextField();
		txtTicket.setColumns(10);
		txtTicket.setBounds(684, 150, 104, 23);
		frame.getContentPane().add(txtTicket);
		
		txtAdult = new JTextField();
		txtAdult.setColumns(10);
		txtAdult.setBounds(822, 150, 104, 23);
		frame.getContentPane().add(txtAdult);
		
		txtChild = new JTextField();
		txtChild.setColumns(10);
		txtChild.setBounds(972, 150, 104, 23);
		frame.getContentPane().add(txtChild);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLUE);
		separator_1.setBounds(521, 187, 570, 2);
		frame.getContentPane().add(separator_1);
		
		JLabel lblFrom = new JLabel("FROM");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFrom.setBounds(556, 214, 83, 28);
		frame.getContentPane().add(lblFrom);
		
		JLabel lblTo = new JLabel("TO");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTo.setBounds(563, 270, 55, 28);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("DATE");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDate.setBounds(556, 323, 83, 28);
		frame.getContentPane().add(lblDate);
		
		JLabel lblTime = new JLabel("TIME");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTime.setBounds(556, 375, 83, 28);
		frame.getContentPane().add(lblTime);
		
		txtFrom = new JTextField();
		txtFrom.setColumns(10);
		txtFrom.setBounds(684, 221, 104, 23);
		frame.getContentPane().add(txtFrom);
		
		txtTo = new JTextField();
		txtTo.setColumns(10);
		txtTo.setBounds(684, 277, 104, 23);
		frame.getContentPane().add(txtTo);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(684, 331, 104, 23);
		frame.getContentPane().add(txtDate);
		
		txtTime = new JTextField();
		txtTime.setColumns(10);
		txtTime.setBounds(684, 375, 104, 23);
		frame.getContentPane().add(txtTime);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(837, 187, 28, 343);
		frame.getContentPane().add(separator_2);
		
		JLabel lblTicketNo = new JLabel("TICKET NO.");
		lblTicketNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTicketNo.setBounds(906, 228, 133, 28);
		frame.getContentPane().add(lblTicketNo);
		
		JLabel lblPrice = new JLabel("PRICE");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrice.setBounds(927, 312, 83, 28);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblRoute = new JLabel("ROUTE");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRoute.setBounds(927, 399, 83, 28);
		frame.getContentPane().add(lblRoute);
		
		txtTicketNo = new JTextField();
		txtTicketNo.setColumns(10);
		txtTicketNo.setBounds(906, 275, 104, 23);
		frame.getContentPane().add(txtTicketNo);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(906, 354, 104, 23);
		frame.getContentPane().add(txtPrice);
		
		txtRoute = new JTextField();
		txtRoute.setColumns(10);
		txtRoute.setBounds(906, 442, 104, 23);
		frame.getContentPane().add(txtRoute);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(1091, 187, 11, 343);
		frame.getContentPane().add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(493, 540, 598, -10);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(787, 540, 1, 2);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(521, 531, 570, 10);
		frame.getContentPane().add(separator_6);
		
		
		
		
		
	}

	public void setVisible(boolean b) {
		
	}
}
