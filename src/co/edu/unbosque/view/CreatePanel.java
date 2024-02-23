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

public class CreatePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel backgroundLabel;
	private JLabel selectedCountry;
	private ImageIcon backgroundSelect;
	private JButton btnCreate;
	private JButton btnSearch;
	private JTextField id;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JButton btnBack;
	private JButton btnExit;
	private final String url = "assets/";

	public CreatePanel() {
		setBounds(0, -5, 1280, 720);
		setBackground(Color.BLACK);
		backgroundLabel = new JLabel();
		backgroundLabel.setBounds(0, 0, 1280, 720);
		backgroundSelect = new ImageIcon(url + "Create.png");
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

		btnCreate = new JButton("Create");
		btnCreate.setBounds(200, 200, 200, 50);
		btnCreate.setFont(new Font("Arial", Font.PLAIN, 20));
		btnCreate.setBackground(Color.WHITE);

		btnSearch = new JButton("Search");
		btnSearch.setBounds(200, 270, 200, 50);
		btnSearch.setFont(new Font("Arial", Font.PLAIN, 20));
		btnSearch.setBackground(Color.WHITE);

		id = new JTextField();
		id.setHorizontalAlignment(JTextField.CENTER);
		id.setBounds(210, 396, 150, 50);
		id.setEditable(true);
		id.setEnabled(true);
		id.setOpaque(false);
		id.setFont(customFont.deriveFont(Font.PLAIN, 22));
		id.setBackground(new Color(61, 146, 171));
		id.setBorder(BorderFactory.createEmptyBorder());

		btnUpdate = new JButton("Update");
		btnUpdate.setBounds(200, 340, 200, 50);
		btnUpdate.setFont(new Font("Arial", Font.PLAIN, 20));
		btnUpdate.setBackground(Color.WHITE);

		btnDelete = new JButton("Delete");
		btnDelete.setBounds(200, 410, 200, 50);
		btnDelete.setFont(new Font("Arial", Font.PLAIN, 20));
		btnDelete.setBackground(Color.WHITE);

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

		add(backgroundLabel);
		backgroundLabel.add(selectedCountry);
		backgroundLabel.add(btnCreate);
		backgroundLabel.add(btnSearch);
		backgroundLabel.add(id);
		backgroundLabel.add(btnUpdate);
		backgroundLabel.add(btnDelete);
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

	public JButton getBtnCreate() {
		return btnCreate;
	}

	public void setBtnCreate(JButton btnCreate) {
		this.btnCreate = btnCreate;
	}

	public JButton getBtnSearch() {
		return btnSearch;
	}

	public void setBtnSearch(JButton btnSearch) {
		this.btnSearch = btnSearch;
	}

	public JTextField getId() {
		return id;
	}

	public void setId(JTextField id) {
		this.id = id;
	}

	public JButton getBtnUpdate() {
		return btnUpdate;
	}

	public void setBtnUpdate(JButton btnUpdate) {
		this.btnUpdate = btnUpdate;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
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