package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpdatePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel backgroundLabel;
	private JLabel selectedCountry;
	private ImageIcon backgroundSelect;
	private JTextField idSerialNumber;
	private JTextField idContentType;
	private JTextField id;
	private JTextField idIssuerName;
	private JTextField idReceiverName;
	private JButton btnBack;
	private JButton btnExit;
	private final String url = "assets/";
	private JButton btnUpdate;

	public UpdatePanel() {
		setBounds(0, -5, 1280, 720);
		setBackground(Color.BLACK);
		backgroundLabel = new JLabel();
		backgroundLabel.setBounds(0, 0, 1280, 720);
		backgroundSelect = new ImageIcon(url + "Update.png");
		backgroundSelect.setImage(backgroundSelect.getImage().getScaledInstance(backgroundLabel.getWidth(),
				backgroundLabel.getHeight(), Image.SCALE_SMOOTH));
		backgroundLabel.setIcon(backgroundSelect);

		Font customFont = new Font("Arial", Font.PLAIN, 60);
		try {
			customFont = Font.createFont(Font.TRUETYPE_FONT, new File(url + "fonts/Harabara-Mais-Demo.otf"))
					.deriveFont(Font.PLAIN, 65);
		} catch (IOException | FontFormatException e) {
			e.printStackTrace();
		}

		selectedCountry = new JLabel("Sucursal");
		selectedCountry.setBounds(230, 70, 770, 50);
		selectedCountry.setForeground(new Color(41, 104, 200));
		selectedCountry.setHorizontalAlignment(JLabel.CENTER);
		selectedCountry.setFont(customFont.deriveFont(Font.PLAIN, 55));

		idSerialNumber = new JTextField();
		idSerialNumber.setEditable(true);
		idSerialNumber.setEnabled(true);
		idSerialNumber.setOpaque(false);
		idSerialNumber.setBounds(585, 225, 330, 50);
		idSerialNumber.setFont(new Font("Arial", Font.PLAIN, 20));
		idSerialNumber.setBackground(Color.WHITE);
		idSerialNumber.setBorder(BorderFactory.createEmptyBorder());

		idContentType = new JTextField();
		idContentType.setEditable(true);
		idContentType.setEnabled(true);
		idContentType.setOpaque(true);
		idContentType.setBounds(615, 295, 325, 50);
		idContentType.setFont(new Font("Arial", Font.PLAIN, 20));
		idContentType.setBackground(Color.WHITE);
		idContentType.setBorder(BorderFactory.createEmptyBorder());

		id = new JTextField();
		id.setHorizontalAlignment(JTextField.CENTER);
		id.setBounds(555, 365, 150, 50);
		id.setEditable(true);
		id.setEnabled(true);
		id.setOpaque(false);
		id.setFont(customFont.deriveFont(Font.PLAIN, 22));
		id.setBackground(new Color(61, 146, 171));
		id.setBorder(BorderFactory.createEmptyBorder());

		idIssuerName = new JTextField();
		idIssuerName.setEditable(true);
		idIssuerName.setEnabled(true);
		idIssuerName.setOpaque(true);
		idIssuerName.setBounds(606, 433, 325, 50);
		idIssuerName.setFont(new Font("Arial", Font.PLAIN, 20));
		idIssuerName.setBackground(Color.WHITE);
		idIssuerName.setBorder(BorderFactory.createEmptyBorder());

		idReceiverName = new JTextField();
		idReceiverName.setBounds(555, 503, 320, 50);
		idReceiverName.setEditable(true);
		idReceiverName.setEnabled(true);
		idReceiverName.setOpaque(true);
		idReceiverName.setFont(new Font("Arial", Font.PLAIN, 20));
		idReceiverName.setBackground(Color.WHITE);

		btnExit = new JButton("", null);
		btnExit.setBounds(72, 592, 131, 56);
		btnExit.setContentAreaFilled(false);
		btnExit.setBorderPainted(true);
		btnExit.setToolTipText("Se saldrá del aplicativo.");

		btnBack = new JButton("", null);
		btnBack.setBounds(1077, 592, 131, 56);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(true);
		btnBack.setToolTipText("Se volverá a la selección de país.");
		
		btnUpdate = new JButton();
		btnBack.setBounds(575, 592, 131, 56);
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(true);
		btnBack.setToolTipText("Se actualizara el objeto seleccionado anteriormente.");
		
		

		add(backgroundLabel);
		backgroundLabel.add(selectedCountry);
		backgroundLabel.add(idSerialNumber);
		backgroundLabel.add(idContentType);
		backgroundLabel.add(id);
		backgroundLabel.add(idIssuerName);
		backgroundLabel.add(idReceiverName);
		backgroundLabel.add(btnExit);
		backgroundLabel.add(btnBack);
	}

	public JLabel getBackgroundLabel() {
		return backgroundLabel;
	}

	public void setBackgroundLabel(JLabel backgroundLabel) {
		this.backgroundLabel = backgroundLabel;
	}

	public JLabel getSelectedCountry() {
		return selectedCountry;
	}

	public void setSelectedCountry(JLabel selectedCountry) {
		this.selectedCountry = selectedCountry;
	}

	public ImageIcon getBackgroundSelect() {
		return backgroundSelect;
	}

	public void setBackgroundSelect(ImageIcon backgroundSelect) {
		this.backgroundSelect = backgroundSelect;
	}

	public JTextField getIdSerialNumber() {
		return idSerialNumber;
	}

	public void setIdSerialNumber(JTextField idSerialNumber) {
		this.idSerialNumber = idSerialNumber;
	}

	public JTextField getIdContentType() {
		return idContentType;
	}

	public void setIdContentType(JTextField idContentType) {
		this.idContentType = idContentType;
	}

	public JTextField getId() {
		return id;
	}

	public void setId(JTextField id) {
		this.id = id;
	}

	public JTextField getIdIssuerName() {
		return idIssuerName;
	}

	public void setIdIssuerName(JTextField idIssuerName) {
		this.idIssuerName = idIssuerName;
	}

	public JTextField getIdReceiverName() {
		return idReceiverName;
	}

	public void setIdReceiverName(JTextField idReceiverName) {
		this.idReceiverName = idReceiverName;
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public void setBtnBack(JButton btnBack) {
		this.btnBack = btnBack;
	}

	public JButton getBtnExit() {
		return btnExit;
	}

	public void setBtnExit(JButton btnExit) {
		this.btnExit = btnExit;
	}
}