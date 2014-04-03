package me.ece460.avgdiskservice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import me.ece460.avgdiskservice.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField reqRate;
	private JTextField randPerc;
	private JTextField seqPerc;
	private JTextField blockSize;
	private JTextField avgRunLength;
	private JTextField diskSpeed;
	private JTextField seekRand;
	private JTextField transferRate;
	private JTextField controlTime;
	private JTextField diskRevTime;
	private JTextField pMissRand;
	private JTextField sDR;
	private JTextField sDS1;
	private JTextField lambda;
	private JTextField tRS1;
	private JTextField u1;
	private JTextField sD1;
	private JTextField tRS2;
	private JTextField u2;
	private JTextField sD2;
	private JTextField tRS3;
	private JTextField u3;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JTextField sD3;
	private JLabel lblSdrdPass;
	private JLabel lblSdsndPass;
	private JTextField sDS2;
	private JLabel lblSdsrdPass;
	private JTextField sDS3;

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
		setTitle("ECE 460 Avg Disk Service Time");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Req rate (r/s)");
		lblNewLabel.setBounds(10, 11, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("%rand");
		lblNewLabel_1.setBounds(10, 36, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("%seq");
		lblNewLabel_2.setBounds(10, 61, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Block size (B)");
		lblNewLabel_3.setBounds(10, 86, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Avg Run Length");
		lblNewLabel_4.setBounds(10, 111, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Disk speed (RPM)");
		lblNewLabel_5.setBounds(10, 136, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Seek Rand (ms)");
		lblNewLabel_6.setBounds(10, 161, 86, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Trans rate (MB/s)");
		lblNewLabel_7.setBounds(10, 186, 86, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Control Time (ms)");
		lblNewLabel_8.setBounds(10, 211, 86, 14);
		contentPane.add(lblNewLabel_8);
		
		reqRate = new JTextField();
		reqRate.setText("0");
		reqRate.setBounds(117, 8, 86, 20);
		contentPane.add(reqRate);
		reqRate.setColumns(10);
		
		randPerc = new JTextField();
		randPerc.setText("0");
		randPerc.setBounds(117, 33, 86, 20);
		contentPane.add(randPerc);
		randPerc.setColumns(10);
		
		seqPerc = new JTextField();
		seqPerc.setText("0");
		seqPerc.setBounds(117, 58, 86, 20);
		contentPane.add(seqPerc);
		seqPerc.setColumns(10);
		
		blockSize = new JTextField();
		blockSize.setText("0");
		blockSize.setBounds(117, 83, 86, 20);
		contentPane.add(blockSize);
		blockSize.setColumns(10);
		
		avgRunLength = new JTextField();
		avgRunLength.setText("0");
		avgRunLength.setBounds(117, 108, 86, 20);
		contentPane.add(avgRunLength);
		avgRunLength.setColumns(10);
		
		diskSpeed = new JTextField();
		diskSpeed.setText("0");
		diskSpeed.setBounds(117, 133, 86, 20);
		contentPane.add(diskSpeed);
		diskSpeed.setColumns(10);
		
		seekRand = new JTextField();
		seekRand.setText("0");
		seekRand.setBounds(117, 158, 86, 20);
		contentPane.add(seekRand);
		seekRand.setColumns(10);
		
		transferRate = new JTextField();
		transferRate.setText("0");
		transferRate.setBounds(117, 183, 86, 20);
		contentPane.add(transferRate);
		transferRate.setColumns(10);
		
		controlTime = new JTextField();
		controlTime.setText("0");
		controlTime.setBounds(117, 208, 86, 20);
		contentPane.add(controlTime);
		controlTime.setColumns(10);
		
		diskRevTime = new JTextField();
		diskRevTime.setBounds(443, 8, 86, 20);
		contentPane.add(diskRevTime);
		diskRevTime.setColumns(10);
		
		pMissRand = new JTextField();
		pMissRand.setBounds(443, 33, 86, 20);
		contentPane.add(pMissRand);
		pMissRand.setColumns(10);
		
		sDR = new JTextField();
		sDR.setBounds(443, 58, 86, 20);
		contentPane.add(sDR);
		sDR.setColumns(10);
		
		sDS1 = new JTextField();
		sDS1.setBounds(443, 83, 86, 20);
		contentPane.add(sDS1);
		sDS1.setColumns(10);
		
		lambda = new JTextField();
		lambda.setBounds(443, 108, 86, 20);
		contentPane.add(lambda);
		lambda.setColumns(10);
		
		tRS1 = new JTextField();
		tRS1.setBounds(443, 133, 86, 20);
		contentPane.add(tRS1);
		tRS1.setColumns(10);
		
		u1 = new JTextField();
		u1.setBounds(443, 158, 86, 20);
		contentPane.add(u1);
		u1.setColumns(10);
		
		sD1 = new JTextField();
		sD1.setBounds(443, 183, 86, 20);
		contentPane.add(sD1);
		sD1.setColumns(10);
		
		tRS2 = new JTextField();
		tRS2.setBounds(443, 208, 86, 20);
		contentPane.add(tRS2);
		tRS2.setColumns(10);
		
		u2 = new JTextField();
		u2.setBounds(443, 236, 86, 20);
		contentPane.add(u2);
		u2.setColumns(10);
		
		sD2 = new JTextField();
		sD2.setBounds(443, 298, 86, 20);
		contentPane.add(sD2);
		sD2.setColumns(10);
		
		tRS3 = new JTextField();
		tRS3.setBounds(443, 329, 86, 20);
		contentPane.add(tRS3);
		tRS3.setColumns(10);
		
		u3 = new JTextField();
		u3.setBounds(443, 360, 86, 20);
		contentPane.add(u3);
		u3.setColumns(10);
		
		lblNewLabel_9 = new JLabel("Disk Rev Time");
		lblNewLabel_9.setBounds(323, 11, 110, 14);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Pmiss Rand");
		lblNewLabel_10.setBounds(323, 36, 110, 14);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Sdr");
		lblNewLabel_11.setBounds(323, 61, 110, 14);
		contentPane.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Sds (first pass)");
		lblNewLabel_12.setBounds(323, 86, 110, 14);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("lambda");
		lblNewLabel_13.setBounds(323, 111, 46, 14);
		contentPane.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("Trs (first pass)");
		lblNewLabel_14.setBounds(323, 136, 110, 14);
		contentPane.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("U (first pass)");
		lblNewLabel_15.setBounds(323, 161, 110, 14);
		contentPane.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("Sd (first pass)");
		lblNewLabel_16.setBounds(323, 186, 110, 14);
		contentPane.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("Trs (2nd pass)");
		lblNewLabel_17.setBounds(323, 211, 110, 14);
		contentPane.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("U (2nd pass)");
		lblNewLabel_18.setBounds(323, 242, 110, 14);
		contentPane.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("Sd (2nd pass)");
		lblNewLabel_19.setBounds(323, 298, 110, 14);
		contentPane.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("Trs (3rd pass)");
		lblNewLabel_20.setBounds(323, 332, 110, 14);
		contentPane.add(lblNewLabel_20);
		
		lblNewLabel_21 = new JLabel("U (3rd pass)");
		lblNewLabel_21.setBounds(323, 361, 110, 14);
		contentPane.add(lblNewLabel_21);
		
		sD3 = new JTextField();
		sD3.setBounds(443, 414, 86, 20);
		contentPane.add(sD3);
		sD3.setColumns(10);
		
		lblSdrdPass = new JLabel("Sd (3rd pass) (final)");
		lblSdrdPass.setBounds(323, 417, 110, 14);
		contentPane.add(lblSdrdPass);
		
		lblSdsndPass = new JLabel("Sds (2nd pass)");
		lblSdsndPass.setBounds(323, 267, 110, 14);
		contentPane.add(lblSdsndPass);
		
		sDS2 = new JTextField();
		sDS2.setBounds(443, 267, 86, 20);
		contentPane.add(sDS2);
		sDS2.setColumns(10);
		
		lblSdsrdPass = new JLabel("Sds (3rd pass)");
		lblSdsrdPass.setBounds(323, 386, 110, 14);
		contentPane.add(lblSdsrdPass);
		
		sDS3 = new JTextField();
		sDS3.setBounds(443, 383, 86, 20);
		contentPane.add(sDS3);
		sDS3.setColumns(10);
		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculate();
			}
		});
		btnCalculate.setBounds(7, 242, 89, 23);
		contentPane.add(btnCalculate);
	}
		
		public void calculate() {
			AvgDiskServiceCalc calculator = new AvgDiskServiceCalc(Double.parseDouble(reqRate.getText()), 
					Double.parseDouble(randPerc.getText()), 
					Double.parseDouble(seqPerc.getText()),
					Double.parseDouble(blockSize.getText()),
					Double.parseDouble(avgRunLength.getText()),
					Double.parseDouble(diskSpeed.getText()), 
					Double.parseDouble(seekRand.getText()),
					Double.parseDouble(transferRate.getText()), 
					Double.parseDouble(controlTime.getText()));
			
			diskRevTime.setText(String.valueOf(calculator.calcDiskRevTime()));
			pMissRand.setText(String.valueOf(calculator.calcPMissRand()));
			sDR.setText(String.valueOf(calculator.calcSDR()));
			lambda.setText(String.valueOf(calculator.lambda));
			u1.setText(String.valueOf(calculator.calcU1()));
			tRS1.setText(String.valueOf(calculator.calcTRS1()));
			sDS1.setText(String.valueOf(calculator.calcSDS1()));
			sD1.setText(String.valueOf(calculator.calcSD1()));
			u2.setText(String.valueOf(calculator.calcu2()));
			tRS2.setText(String.valueOf(calculator.calcTRS2()));
			sDS2.setText(String.valueOf(calculator.calcSDS2()));
			sD2.setText(String.valueOf(calculator.calcSD2()));
			u3.setText(String.valueOf(calculator.calcu3()));
			tRS3.setText(String.valueOf(calculator.calcTRS3()));
			sDS3.setText(String.valueOf(calculator.calcSD3()));
			sD3.setText(String.valueOf(calculator.calcSD3()));
		
		}
}
