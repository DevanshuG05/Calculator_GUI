package personalCalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Calc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField display;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JButton btnNewButton_15;
	private JButton btnNewButton_16;
	private JButton btnNewButton_17;
	private JButton btnNewButton_18;
	private JButton btnNewButton_19;
	private JTextField NONE;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
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
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		display = new JTextField();
		
		display.setBounds(42, 25, 176, 30);
		contentPane.add(display);
		display.setColumns(10);
		
		NONE = new JTextField();
		NONE.setBackground(new Color(152, 251, 152));
		
		NONE.setBounds(259, 25, 134, 30);
		contentPane.add(NONE);
		NONE.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(42, 66, 351, 188);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 4, 5, 5));
		
		btnNewButton = new JButton("A/C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("");
				NONE.setText("");
			}
		});
		panel.add(btnNewButton);
		
		btnNewButton_1 = new JButton("%");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
			    display.setText(display.getText() + value);
			}
		});
		panel.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Bakspc");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

		        // Backspace only for input field
		        String text = display.getText();
		        if (text.length() > 0) {
		            display.setText(text.substring(0, text.length() - 1));
		        }

		        // Optional: clear result when editing input
		        NONE.setText("");
		    }
		});
		panel.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("1");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("2");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("3");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("x");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_7);
		
		btnNewButton_9 = new JButton("4");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_9);
		
		btnNewButton_8 = new JButton("5");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_8);
		
		btnNewButton_10 = new JButton("6");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("+");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("7");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("8");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("9");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_14);
		
		btnNewButton_15 = new JButton("-");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_15);
		
		btnNewButton_16 = new JButton("x^y");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText() + "^");
			}
		});
		panel.add(btnNewButton_16);
		
		btnNewButton_17 = new JButton("0");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_17);
		
		btnNewButton_18 = new JButton(".");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = ((JButton) e.getSource()).getText();
				display.setText(display.getText()+value); 
			}
		});
		panel.add(btnNewButton_18);
		
		btnNewButton_19 = new JButton("=");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateResult();
			}
		});
		panel.add(btnNewButton_19);
		
		lblNewLabel = new JLabel("=");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(237, 25, 24, 30);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("MY CALCULATOR");
		lblNewLabel_1.setFont(new Font("Segoe UI Black", Font.BOLD, 16));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBackground(new Color(255, 255, 224));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(155, 0, 149, 22);
		contentPane.add(lblNewLabel_1);

	}
	private void calculateResult() {
		String expression = display.getText();
        expression = expression.replace("x", "*");

        double result = 0;
        
        if (!expression.contains("+") &&
                !expression.contains("-") &&
                !expression.contains("*") &&
                !expression.contains("/") &&
                !expression.contains("%") &&
                !expression.contains("^")) {

                NONE.setText(expression);
                return;
            }

        if (expression.contains("+")) {
            String[] parts = expression.split("\\+");
            result = Double.parseDouble(parts[0]) + Double.parseDouble(parts[1]);
        }
        else if (expression.contains("-")) {
            String[] parts = expression.split("\\-");
            result = Double.parseDouble(parts[0]) - Double.parseDouble(parts[1]);
        }
        else if (expression.contains("*")) {
            String[] parts = expression.split("\\*");
            result = Double.parseDouble(parts[0]) * Double.parseDouble(parts[1]);
        }
        else if (expression.contains("/")) {
            String[] parts = expression.split("\\/");
            result = Double.parseDouble(parts[0]) / Double.parseDouble(parts[1]);
        }
        else if (expression.contains("%")) {
        	String[] parts = expression.split("\\%");

            if (parts.length == 2) {
                double percent = Double.parseDouble(parts[0]);
                double number = Double.parseDouble(parts[1]);

                // Percentage calculation
                result = (percent * number) / 100.0;
            } else {
                NONE.setText("Error");
                return;
            }
        }
        else if (expression.contains("^")) {
            String[] parts = expression.split("\\^");
            result = Math.pow(
                    Double.parseDouble(parts[0]),
                    Double.parseDouble(parts[1])
            );
        }

        NONE.setText(String.valueOf(result));
    }
}
