package com.bottle.ui.components.player.sub;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ReturnMoneyDialog extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	public static void main(String[] args) {
		try {
			ReturnMoneyDialog dialog = new ReturnMoneyDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ReturnMoneyDialog() {
		this.setModal(true);
		setUndecorated(true);
		setBounds(100, 100, 450, 150);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
				
		//setTitle("\u8FD4\u5229\u5230\u4E91\u8D26\u6237");
		
		contentPanel.setBounds(0, 0, 450, 150);
		contentPanel.setBorder(BorderFactory.createLineBorder(Color.RED, 5));

		getContentPane().setLayout(null);
		
		//contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u624B\u673A\u53F7");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(28, 11, 132, 45);
			contentPanel.add(lblNewLabel);
		}
		
		textField = new JTextField();
		textField.setBounds(170, 17, 167, 33);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JButton okButton = new JButton("ȷ��");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		okButton.setBounds(94, 355, 82, 23);
		okButton.setActionCommand("OK");
		contentPanel.add(okButton);
		getRootPane().setDefaultButton(okButton);
		
		JButton cancelButton = new JButton("\u53D6\u6D88");
		cancelButton.setBounds(236, 355, 65, 23);
		cancelButton.setActionCommand("Cancel");
		contentPanel.add(cancelButton);				
	}
}
