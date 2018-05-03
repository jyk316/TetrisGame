package tetris;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

public class Frame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable waitTable;
	private StartButton startButton;
	private JPanel panel; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 580);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(5, 0, 5, 0));
		setJMenuBar(menuBar);

		JMenu option = new JMenu("옵션");
		menuBar.add(option);

		JMenuItem scoreLookup = new JMenuItem("기록");
		option.add(scoreLookup);

		JMenu thema = new JMenu("테마");
		option.add(thema);

		JCheckBoxMenuItem thema_Black = new JCheckBoxMenuItem("Black");
		thema.add(thema_Black);
		thema_Black.addItemListener(new ItemListener() { // 테마 변경 무명클래스

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO 자동 생성된 메소드 스텁
				if(thema_Black.isSelected()) {
					System.out.println("테마 ->블랙");
					table.setBackground(Color.WHITE);
					waitTable.setBackground(Color.WHITE);
					panel.setBackground(Color.black);
					contentPane.setForeground(Color.black);
					startButton.setBackground(Color.RED);
				}
				else {
					System.out.println("테마 ->화이트");
					table.setBackground(Color.black);
					waitTable.setBackground(Color.black);
					panel.setBackground(Color.white);
					contentPane.setForeground(Color.white);
					startButton.setBackground(Color.darkGray);
				}
			}
		});

		JMenuItem exit = new JMenuItem("끝내기");
		option.add(exit);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 자동 생성된 메소드 스텁
				if(e.getSource()==exit) 
					System.exit(0);
			}
		});
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		contentPane.add(panel, BorderLayout.CENTER);

		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setBackground(Color.BLACK);
		table.setBorder(new MatteBorder(2, 2, 2, 2, (Color) Color.DARK_GRAY));
		table.setEnabled(false);
		table.setBounds(102, 10, 220, 480);
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null, null, null, null, null},
				},
				new String[] {
						"", "", "", "", "", "", "", "", "", "", "", ""
				}
				));
		//		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		//		table.getColumnModel().getColumn(1).setPreferredWidth(15);
		//		table.getColumnModel().getColumn(2).setPreferredWidth(15);
		//		table.getColumnModel().getColumn(3).setPreferredWidth(15);
		//		table.getColumnModel().getColumn(4).setPreferredWidth(15);
		//		table.getColumnModel().getColumn(5).setPreferredWidth(15);
		//		table.getColumnModel().getColumn(6).setPreferredWidth(15);
		//		table.getColumnModel().getColumn(7).setPreferredWidth(15);
		//		table.getColumnModel().getColumn(8).setPreferredWidth(15);
		//		table.getColumnModel().getColumn(9).setPreferredWidth(15);
		//		table.getColumnModel().getColumn(10).setPreferredWidth(15);
		//		table.getColumnModel().getColumn(11).setPreferredWidth(15);
		panel.setLayout(null);
		panel.add(table);

		waitTable = new JTable();
		waitTable.setBackground(Color.BLACK);
		waitTable.setEnabled(false);
		waitTable.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		waitTable.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
					{null, null, null, null},
				},
				new String[] {
						"New column", "New column", "New column", "New column"
				}
				));
		waitTable.getColumnModel().getColumn(0).setPreferredWidth(15);
		waitTable.getColumnModel().getColumn(1).setPreferredWidth(15);
		waitTable.getColumnModel().getColumn(2).setPreferredWidth(15);
		waitTable.getColumnModel().getColumn(3).setPreferredWidth(15);
		waitTable.setBounds(387, 10, 70, 64);
		panel.add(waitTable);

		startButton = new StartButton("\uAC8C\uC784\uC2DC\uC791");
		startButton.setFont(new Font("돋움체", Font.BOLD, 13));
		startButton.setForeground(UIManager.getColor("Button.darkShadow"));
		startButton.setBackground(Color.DARK_GRAY);
		startButton.setBounds(360, 328, 97, 51);
		panel.add(startButton);

		JTextArea currentScore = new JTextArea();
		currentScore.setText("0");
		currentScore.setFont(currentScore.getFont().deriveFont(currentScore.getFont().getStyle() | Font.BOLD | Font.ITALIC));
		currentScore.setEnabled(false);
		currentScore.setEditable(false);
		currentScore.setBounds(360, 247, 97, 24);
		panel.add(currentScore);
	}
}
