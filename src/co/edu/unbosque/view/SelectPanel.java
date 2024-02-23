package co.edu.unbosque.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SelectPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
    private JLabel backgroundLabel;
    private JLabel selectedCountry;
    private ImageIcon backgroundSelect;
    private JButton btnCreate;
    private JButton btnRead;
    private JButton btnUpdate;
    private JButton btnDelete;
    private CardLayout cardLayout;
    private JPanel cardPanel;
    private final String url = "assets/";
    private String dataF;
    
    public SelectPanel() {
        setBounds(0, -5, 1280, 720);
        setBackground(Color.BLACK);
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        cardPanel.add(createCard("Create"), "Create");
        cardPanel.add(createCard("Read"), "Read");
        cardPanel.add(createCard("Update"), "Update");
        cardPanel.add(createCard("Delete"), "Delete");
        backgroundLabel = new JLabel();
        backgroundLabel.setBounds(0, 0, 1280, 720);
        backgroundSelect = new ImageIcon(url + "Country.png");
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

        btnRead = new JButton("Read");
        btnRead.setBounds(200, 270, 200, 50);
        btnRead.setFont(new Font("Arial", Font.PLAIN, 20));
        btnRead.setBackground(Color.WHITE);

        btnUpdate = new JButton("Update");
        btnUpdate.setBounds(200, 340, 200, 50);
        btnUpdate.setFont(new Font("Arial", Font.PLAIN, 20));
        btnUpdate.setBackground(Color.WHITE);

        btnDelete = new JButton("Delete");
        btnDelete.setBounds(200, 410, 200, 50);
        btnDelete.setFont(new Font("Arial", Font.PLAIN, 20));
        btnDelete.setBackground(Color.WHITE);

        add(backgroundLabel);
        backgroundLabel.add(selectedCountry);
        backgroundLabel.add(btnCreate);
        backgroundLabel.add(btnRead);
        backgroundLabel.add(btnUpdate);
        backgroundLabel.add(btnDelete);
    }
    
    private JPanel createCard(String operation) {
        JPanel card = new JPanel();
        card.setBackground(Color.WHITE);

        JLabel label = new JLabel(operation);
        label.setFont(new Font("Arial", Font.PLAIN, 24));
        card.add(label);
        return card;
    }

    public void showCard(String cardName) {
        cardLayout.show(cardPanel, cardName);  // Muestra la "carta" especificada
    }

    public JButton getBtnCreate() {
        return btnCreate;
    }

    public JButton getBtnRead() {
        return btnRead;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public String getDataF() {
        return dataF;
    }

    public void setDataF(String dataF) {
        this.dataF = dataF;
    }

}
