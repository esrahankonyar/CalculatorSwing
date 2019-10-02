package com.uygulamalar.swing;

import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;



public class HesapMakinesi extends JFrame {

	private JPanel contentPane;
	private JTextField txtHesapAlani;

	ClassLoader cl= this.getClass().getClassLoader();
	URL imageURL   = cl.getResource("Resimler/");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMakinesi frame = new HesapMakinesi();
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
	public HesapMakinesi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setType(Type.UTILITY);
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(HesapMakinesi.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		setTitle("Hesap Makinesi");
		setResizable(false);
		setBackground(new Color(63, 63, 63));
		setBounds(100, 100, 1007, 682);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnDosya = new JMenu("Dosya");
		mnDosya.setIcon(
				new ImageIcon(HesapMakinesi.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		mnDosya.setSelectedIcon(
				new ImageIcon(HesapMakinesi.class.getResource("/javax/swing/plaf/metal/icons/ocean/question.png")));
		menuBar.add(mnDosya);

		JMenuItem mntmk = new JMenuItem("\u00C7\u0131k\u0131\u015F");
		mntmk.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
		mntmk.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,
				InputEvent.CTRL_MASK | InputEvent.ALT_MASK | InputEvent.SHIFT_MASK));
		mnDosya.add(mntmk);
		contentPane = new JPanel();
		contentPane.setToolTipText("Bu hesap makinesi basip seviye hesaplamalar yapmaktad\u0131r.");
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(new Color(29, 29, 29));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtHesapAlani = new JTextField();
		txtHesapAlani.setForeground(Color.WHITE);
		txtHesapAlani.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 137, 0)));
		txtHesapAlani.setFont(new Font("Tahoma", Font.PLAIN, 77));
		txtHesapAlani.setHorizontalAlignment(SwingConstants.RIGHT);
		txtHesapAlani.setBounds(10, 11, 979, 129);
		txtHesapAlani.setBackground(new Color(46, 46, 46));
		contentPane.add(txtHesapAlani);
		txtHesapAlani.setColumns(10);

		JLabel btnM = new JLabel("New label");
		btnM.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/MButonu.png")));
		btnM.setBounds(10, 151, 189, 94);
		contentPane.add(btnM);

		JLabel btnArtiEksi = new JLabel("New label");
		btnArtiEksi.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/Art\u0131Eksi.png")));
		btnArtiEksi.setBounds(10, 245, 189, 94);
		contentPane.add(btnArtiEksi);

		JLabel btnKarekok = new JLabel("New label");
		btnKarekok.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/Karek\u00F6k.png")));
		btnKarekok.setBounds(10, 339, 189, 94);
		contentPane.add(btnKarekok);

		JLabel btnYuzde = new JLabel("New label");
		btnYuzde.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/Y\u00FCzde.png")));
		btnYuzde.setBounds(10, 433, 189, 94);
		contentPane.add(btnYuzde);

		JLabel btnBirBoluX = new JLabel("New label");
		btnBirBoluX.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/BirB\u00F6l\u00FCX.png")));
		btnBirBoluX.setBounds(10, 527, 189, 94);
		contentPane.add(btnBirBoluX);

		JLabel btnCe = new JLabel("New label");
		btnCe.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/Ce.png")));
		btnCe.setBounds(225, 151, 189, 94);
		contentPane.add(btnCe);

		JLabel btn7 = new JLabel("New label");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHesapAlani.setText(txtHesapAlani.getText() + "7");
			}
		});
		btn7.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/7.png")));
		btn7.setBounds(225, 245, 189, 94);
		contentPane.add(btn7);

		JLabel btn4 = new JLabel("New label");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHesapAlani.setText(txtHesapAlani.getText() + "4");
			}
		});
		btn4.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/4.png")));
		btn4.setBounds(225, 339, 189, 94);
		contentPane.add(btn4);

		JLabel btn1 = new JLabel("New label");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHesapAlani.setText(txtHesapAlani.getText() + "1");
			}
		});
		btn1.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/1.png")));
		btn1.setBounds(225, 433, 189, 94);
		contentPane.add(btn1);

		JLabel btn0 = new JLabel("New label");
		btn0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtHesapAlani.setText(txtHesapAlani.getText() + "0");

			}
		});
		btn0.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/0.png")));
		btn0.setBounds(225, 527, 381, 94);
		contentPane.add(btn0);

		JLabel btnC = new JLabel("New label");
		btnC.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/C.png")));
		btnC.setBounds(417, 151, 189, 94);
		contentPane.add(btnC);

		JLabel btn5 = new JLabel("New label");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHesapAlani.setText(txtHesapAlani.getText() + "5");
			}
		});
		btn5.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/5.png")));
		btn5.setBounds(417, 339, 189, 94);
		contentPane.add(btn5);

		JLabel btn2 = new JLabel("New label");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHesapAlani.setText(txtHesapAlani.getText() + "2");
			}
		});
		btn2.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/2.png")));
		btn2.setBounds(417, 433, 189, 94);
		contentPane.add(btn2);

		JLabel btn8 = new JLabel("New label");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHesapAlani.setText(txtHesapAlani.getText() + "8");
			}
		});
		btn8.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/8.png")));
		btn8.setBounds(417, 245, 189, 94);
		contentPane.add(btn8);

		JLabel btnSil = new JLabel("New label");
		btnSil.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHesapAlani.setText(txtHesapAlani.getText().substring(0, txtHesapAlani.getText().length() - 1));
			}
		});
		btnSil.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/sil.png")));
		btnSil.setBounds(608, 151, 189, 94);
		contentPane.add(btnSil);

		JLabel btnBolum = new JLabel("New label");
		btnBolum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHesapAlani.setText(txtHesapAlani.getText() + "/");
			}
		});
		btnBolum.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/B\u00F6l\u00FC.png")));
		btnBolum.setBounds(800, 151, 189, 94);
		contentPane.add(btnBolum);

		JLabel btn9 = new JLabel("New label");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHesapAlani.setText(txtHesapAlani.getText() + "9");
			}
		});
		btn9.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/9.png")));
		btn9.setBounds(608, 245, 189, 94);
		contentPane.add(btn9);

		JLabel btn6 = new JLabel("New label");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHesapAlani.setText(txtHesapAlani.getText() + "6");
			}
		});
		btn6.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/6.png")));
		btn6.setBounds(608, 339, 189, 94);
		contentPane.add(btn6);

		JLabel btn3 = new JLabel("New label");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			//	txtHesapAlani.setText(txtHesapAlani.getText() + "3");
			}
			@Override
			public void mousePressed(MouseEvent e) {
				txtHesapAlani.setText(txtHesapAlani.getText() + "3");
			}
		});
		btn3.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/3.png")));
		btn3.setBounds(608, 433, 189, 94);
		contentPane.add(btn3);

		JLabel btnVirgul = new JLabel("New label");
		btnVirgul.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/Virg\u00FCl.png")));
		btnVirgul.setBounds(608, 527, 189, 94);
		contentPane.add(btnVirgul);

		JLabel btnCarpim = new JLabel("New label");
		btnCarpim.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHesapAlani.setText(txtHesapAlani.getText() + "*");
			}
		});
		btnCarpim.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/\u00C7arp\u0131.png")));
		btnCarpim.setBounds(800, 245, 189, 94);
		contentPane.add(btnCarpim);

		JLabel btnEksi = new JLabel("New label");
		btnEksi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHesapAlani.setText(txtHesapAlani.getText() + "-");
			}
		});
		btnEksi.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/Eksi.png")));
		btnEksi.setBounds(800, 339, 189, 94);
		contentPane.add(btnEksi);

		JLabel btnArti = new JLabel("New label");
		btnArti.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtHesapAlani.setText(txtHesapAlani.getText() + "+");
			}
		});
		btnArti.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/Art\u0131.png")));
		btnArti.setBounds(800, 433, 189, 94);
		contentPane.add(btnArti);

		JLabel btnEsittir = new JLabel("New label");
		btnEsittir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				/*try {

					String txt = txtHesapAlani.getText().toString();
				txt = txt.replaceAll("X", "*");
					ScriptEngineManager sem = new ScriptEngineManager();
					ScriptEngine se = sem.getEngineByName("JavaScript");
					txtHesapAlani.setText(se.eval(txt) + "");

				} catch (Exception e2) {
					BALog.m.mesajYaz("Hata:" + e2.getMessage());
				}*/
				
				Islem islem=new Islem(txtHesapAlani);
				ArrayList sonuc=islem.listeyeAt();
				String snc=(String) sonuc.get(0);
				
				txtHesapAlani.setText(snc);
				
				
			}

			
		});
		btnEsittir.setIcon(new ImageIcon(HesapMakinesi.class.getResource("/resimler/E\u015Fittir.png")));
		btnEsittir.setBounds(800, 527, 189, 94);
		contentPane.add(btnEsittir);
	}
}
