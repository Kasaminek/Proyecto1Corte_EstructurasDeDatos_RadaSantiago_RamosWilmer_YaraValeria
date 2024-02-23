package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CountryPanel extends JPanel implements ItemListener {
	private static final long serialVersionUID = 6400364484951484176L;
	private JLabel backgroundLabel;
	private JLabel mercadoLibre;
	private ImageIcon backgroundLogin;
	JComboBox<String> country;
	private JButton btnEnter;
	private JButton btnExit;
	private final String url = "assets/";
	private String dataF;

	public CountryPanel() {
		setBounds(0, -5, 1280, 720);
		setBackground(Color.BLACK);
		backgroundLabel = new JLabel();
		backgroundLabel.setBounds(0, 0, 1280, 720);
		backgroundLogin = new ImageIcon(url + "Country.png");
		backgroundLogin.setImage(backgroundLogin.getImage().getScaledInstance(backgroundLabel.getWidth(),
				backgroundLabel.getHeight(), Image.SCALE_SMOOTH));
		backgroundLabel.setIcon(backgroundLogin);

		Font customFont = new Font("Arial", Font.PLAIN, 60);
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File(url + "fonts/Harabara-Mais-Demo.otf"))
					.deriveFont(Font.PLAIN, 65);
		} catch (IOException | FontFormatException e) {
			e.printStackTrace();
		}

		mercadoLibre = new JLabel("mercado libre");
		mercadoLibre.setBounds(230, 70, 770, 50);
		mercadoLibre.setForeground(new Color(41, 104, 200));
		mercadoLibre.setHorizontalAlignment(JLabel.CENTER);
		mercadoLibre.setFont(customFont.deriveFont(Font.PLAIN, 55));

		country = new JComboBox<String>();
		country.setBounds(410, 300, 420, 70);
		country.setFont(new Font("Arial", Font.PLAIN, 40));
		country.setBackground(Color.white);
		country.addItem("");
		country.addItem("Argentina");
		country.addItem("Belice");
		country.addItem("Bolivia");
		country.addItem("Chile");
		country.addItem("Costa Rica");
		country.addItem("Colombia");
		country.addItem("Cuba");
		country.addItem("Ecuador");
		country.addItem("El Salvador");
		country.addItem("Guatemala");
		country.addItem("Guinea Ecuatorial");
		country.addItem("Honduras");
		country.addItem("México");
		country.addItem("Nicaragua");
		country.addItem("Panamá");
		country.addItem("Paraguay");
		country.addItem("Perú");
		country.addItem("Puerto Rico");
		country.addItem("República Dominicana");
		country.addItem("Uruguay");
		country.addItem("Venezuela");
		country.addItemListener((ItemListener) this);
		country.setOpaque(false);
		country.setBorder(BorderFactory.createEmptyBorder());

		btnExit = new JButton("", null);
		btnExit.setBounds(72, 592, 131, 56);
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(true);
		btnExit.setToolTipText("Se saldrá del aplicativo.");

		btnEnter = new JButton("", null);
		btnEnter.setBounds(1077, 592, 131, 56);
		btnEnter.setContentAreaFilled(false);
		btnEnter.setBorderPainted(true);
		btnEnter.setToolTipText("Se trabajará en el país seleccionado.");

		add(backgroundLabel);
		backgroundLabel.add(mercadoLibre);
		backgroundLabel.add(country);
		backgroundLabel.add(btnExit);
		backgroundLabel.add(btnEnter);
	}

	public JLabel getBackgroundLabel() {
		return backgroundLabel;
	}

	public void setBackgroundLabel(JLabel backgroundLabel) {
		this.backgroundLabel = backgroundLabel;
	}

	public JLabel getMercadoLibre() {
		return mercadoLibre;
	}

	public void setMercadoLibre(JLabel mercadoLibre) {
		this.mercadoLibre = mercadoLibre;
	}

	public JComboBox<String> getCountry() {
		return country;
	}

	public void setCountry(JComboBox<String> country) {
		this.country = country;
	}

	public JButton getBtnEnter() {
		return btnEnter;
	}

	public void setBtnEnter(JButton btnEnter) {
		this.btnEnter = btnEnter;
	}

	public JButton getBtnExit() {
		return btnExit;
	}

	public void setBtnExit(JButton btnExit) {
		this.btnExit = btnExit;
	}

	public String getDataF() {
		return dataF;
	}

	public void setDataF(String dataF) {
		this.dataF = dataF;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == country) {
			String opcType = (String) country.getSelectedItem();
			setDataF(opcType);
		}
	}
}