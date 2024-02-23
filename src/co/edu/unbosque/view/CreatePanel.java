package co.edu.unbosque.view;

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

public class CreatePanel extends JPanel {

    private static final long serialVersionUID = 1L;
    private JLabel backgroundLabel;
    private JLabel selectedCountry;
    private ImageIcon backgroundSelect;
    private JButton btnCreate;
    private JButton btnRead;
    private JButton btnUpdate;
    private JButton btnDelete;
    private final String url = "assets/";
    private String dataF;

    public CreatePanel() {
        setBounds(0, -5, 1280, 720);
        setBackground(Color.BLACK);
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
