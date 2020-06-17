package ex11.view;

import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class TelaPrincipal {


	private JFrame frame;
	private JComponent mainPanel;
	private JTabbedPane tabbedPane;
	private JLabel outputText;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal window = new TelaPrincipal();
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
	public TelaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 605, 414);
		frame.setTitle("Primeira GUI em POO");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		mainPanel = new JPanel(false);
		mainPanel.setBounds(18, 22, 575, 358);
		mainPanel.setLayout(null);
		mainPanel.addMouseListener(new MouseAdapter() {

			private int qtdClicks = 0;

			@Override
			public void mouseClicked(MouseEvent e) {
				qtdClicks++;
				//outputText.setText("clicou no botão do mouse " + qtdClicks  + " vezes");
				outputText.setText("clicou no botão do mouse " + e.getButton());
			}
			
		});
		mainPanel.addMouseMotionListener(new MyMouseAdapter());

		
		frame.getContentPane().add(mainPanel);

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(38, 32, 511, 311);
		mainPanel.add(tabbedPane);
		
		outputText = new JLabel("output:");
		outputText.setBounds(8, 8, 400, 30);
		mainPanel.add(outputText);
		
		ActionListener meuActionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputText.setText("output: clicked on " + e.getActionCommand());
			}
		};
		
		JComponent tab1 = new JPanel(false);
		JLabel text1 = new JLabel("tab1");
		tab1.add(text1);
		JButton button1 = new JButton();
		
		button1.addActionListener(meuActionListener);
		button1.setText("click me");
		tab1.add(button1);
		tabbedPane.add(tab1);
		
		JComponent tab2 = new JPanel(false);
		JLabel text2 = new JLabel("tab2");
		tab2.add(text2);
		JButton button2 = new JButton();
		button2.addActionListener(meuActionListener);
		button2.setText("No, you should click me!");
		tab2.add(button2);
		tabbedPane.add(tab2);

		
		
	}
}
