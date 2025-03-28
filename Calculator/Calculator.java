package calculator;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

public class calculator implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2,10);
	
	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");
	JButton button3 = new JButton("3");
	JButton button4 = new JButton("4");
	JButton button5 = new JButton("5");
	JButton button6 = new JButton("6");
	JButton button7 = new JButton("7");
	JButton button8 = new JButton("8");
	JButton button9 = new JButton("9");
	JButton button0 = new JButton("0");
	
	JButton button_add = new JButton("+");
	JButton button_subt = new JButton("-");
	JButton button_mult = new JButton("*");
	JButton button_div = new JButton("/");
	JButton button_clear = new JButton("c");
	JButton button_dot = new JButton(".");
	JButton button_equal = new JButton("=");
	
	double number1, number2, result;
	int addc=0,multc=0,divc=0,subtc=0;
	
	public calculator() {
		frame.setSize(360,440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Calculator");
		
		//frame.setResizable(false);
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		Border border = BorderFactory.createLineBorder(Color.BLUE,4);
		
		panel.add(textarea);
		
		textarea.setBackground(Color.BLACK);
		Border tborder = BorderFactory.createLineBorder(Color.BLUE,3);
		textarea.setBorder(tborder);
		Font font = new Font("arial", Font.BOLD,33);
		textarea.setFont(font);
		textarea.setForeground(Color.WHITE);
		
		textarea.setPreferredSize(new Dimension(2,10));
		textarea.setLineWrap(true);
		
		button1.setPreferredSize(new Dimension(80, 60));
		button1.setBackground(Color.BLUE);
		button1.setForeground(Color.WHITE);
		
		button2.setPreferredSize(new Dimension(80, 60));
		button2.setBackground(Color.BLUE);
		button2.setForeground(Color.WHITE);
		
		button3.setPreferredSize(new Dimension(80, 60));
		button3.setBackground(Color.BLUE);
		button3.setForeground(Color.WHITE);
		
		button4.setPreferredSize(new Dimension(80, 60));
		button4.setBackground(Color.BLUE);
		button4.setForeground(Color.WHITE);
		
		button5.setPreferredSize(new Dimension(80, 60));
		button5.setBackground(Color.BLUE);
		button5.setForeground(Color.WHITE);
		
		button6.setPreferredSize(new Dimension(80, 60));
		button6.setBackground(Color.BLUE);
		button6.setForeground(Color.WHITE);
		
		button7.setPreferredSize(new Dimension(80, 60));
		button7.setBackground(Color.BLUE);
		button7.setForeground(Color.WHITE);
		
		button8.setPreferredSize(new Dimension(80, 60));
		button8.setBackground(Color.BLUE);
		button8.setForeground(Color.WHITE);
		
		button9.setPreferredSize(new Dimension(80, 60));
		button9.setBackground(Color.BLUE);
		button9.setForeground(Color.WHITE);
		
		button0.setPreferredSize(new Dimension(80, 60));
		button0.setBackground(Color.BLUE);
		button0.setForeground(Color.WHITE);
		
		button_add.setPreferredSize(new Dimension(80, 60));
		button_add.setBackground(Color.BLUE);
		button_add.setForeground(Color.WHITE);
		
		button_subt.setPreferredSize(new Dimension(80, 60));
		button_subt.setBackground(Color.BLUE);
		button_subt.setForeground(Color.WHITE);
		
		button_mult.setPreferredSize(new Dimension(80, 60));
		button_mult.setBackground(Color.BLUE);
		button_mult.setForeground(Color.WHITE);
		
		button_div.setPreferredSize(new Dimension(80, 60));
		button_div.setBackground(Color.BLUE);
		button_div.setForeground(Color.WHITE);
		
		button_clear.setPreferredSize(new Dimension(80, 60));
		button_clear.setBackground(Color.BLUE);
		button_clear.setForeground(Color.WHITE);
		
		button_dot.setPreferredSize(new Dimension(80, 60));
		button_dot.setBackground(Color.BLUE);
		button_dot.setForeground(Color.WHITE);
		
		button_equal.setPreferredSize(new Dimension(170, 40));
		button_equal.setBackground(Color.BLUE);
		button_equal.setForeground(Color.WHITE);
		
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button_mult);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button_div);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button_subt);
		panel.add(button0);
		panel.add(button_dot);
		panel.add(button_clear);
		panel.add(button_add);
		panel.add(button_equal);
		
			
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		button0.addActionListener(this);
		button_add.addActionListener(this);
		button_subt.addActionListener(this);
		button_mult.addActionListener(this);
		button_div.addActionListener(this);
		button_clear.addActionListener(this);
		button_dot.addActionListener(this);
		button_equal.addActionListener(this);

	}
	
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		if(source == button_clear) {
			number1=0.0;
			number2=0.0;
			textarea.setText("");
		}
		
		if(source == button1) {
			textarea.append("1");
		}
		
		if(source == button2) {
			textarea.append("2");
		}
		
		if(source == button3) {
			textarea.append("3");
		}
		
		if(source == button4) {
			textarea.append("4");
		}
		
		if(source == button5) {
			textarea.append("5");
		}
		
		if(source == button6) {
			textarea.append("6");
		}
		
		if(source == button7) {
			textarea.append("7");
		}
		
		if(source == button8) {
			textarea.append("8");
		}
		
		if(source == button9) {
			textarea.append("9");
		}
		
		if(source == button0) {
			textarea.append("0");
		}
		
		if(source == button_dot) {
			textarea.append(".");
		}
		
		if(source == button_add) {
			number1=number_reader();
			textarea.setText("");
			addc=1;
			divc=0;
			subtc=0;
			multc=0;
		}
		
		if(source == button_subt) {
			number1=number_reader();
			textarea.setText("");
			addc=0;
			divc=0;
			subtc=1;
			multc=0;		}
		
		if(source == button_mult) {
			number1=number_reader();
			textarea.setText("");
			addc=0;
			divc=0;
			subtc=0;
			multc=1;		}
		
		if(source == button_div) {
			number1=number_reader();
			textarea.setText("");
			addc=0;
			divc=1;
			subtc=0;
			multc=0;		
			}
		
		if(source == button_equal) {
			number2=number_reader();
			if(addc > 0) {
				result = number1 + number2;
				textarea.setText(Double.toString(result));
			}
			if(subtc > 0) {
				result = number1 - number2;
				textarea.setText(Double.toString(result));
			}
			if(multc > 0) {
				result = number1 * number2;
				textarea.setText(Double.toString(result));
			}
			if(divc > 0) {
				result = number1 / number2;
				textarea.setText(Double.toString(result));
			}
		}
	}
	public double number_reader() {
		double num1;
		String s;
		s = textarea.getText();
		num1 = Double.valueOf(s);
		return num1;
	}
}
