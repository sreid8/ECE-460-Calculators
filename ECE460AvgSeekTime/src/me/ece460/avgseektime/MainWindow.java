package me.ece460.avgseektime;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;

import me.ece460.avgseektime.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField seekRand;
	private JTextField requests;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setTitle("ECE 460 Avg Seek Time Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeekRandom = new JLabel("Seek Random");
		lblSeekRandom.setBounds(10, 11, 73, 14);
		contentPane.add(lblSeekRandom);
		
		seekRand = new JTextField();
		seekRand.setBounds(93, 8, 86, 20);
		contentPane.add(seekRand);
		seekRand.setColumns(10);
		
		JLabel lblRequests = new JLabel("Requests (delimit by comma, no spaces)");
		lblRequests.setBounds(10, 36, 329, 14);
		contentPane.add(lblRequests);
		
		requests = new JTextField();
		requests.setBounds(10, 50, 201, 97);
		contentPane.add(requests);
		requests.setColumns(10);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(246, 137, 35, 14);
		contentPane.add(lblResult);
		
		result = new JTextField();
		result.setBounds(291, 134, 86, 20);
		contentPane.add(result);
		result.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				runIt();
			}
		});
		btnCalculate.setBounds(221, 73, 89, 23);
		contentPane.add(btnCalculate);
		
		
	}
	public void runIt() {
		AvgSeekTimeCalc calc = new AvgSeekTimeCalc(requests.getText());
		result.setText(String.valueOf(calc.calculate(Double.parseDouble(seekRand.getText()))));
	}
}
