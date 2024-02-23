package co.edu.unbosque.view;

import javax.swing.JFrame;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = 1865397045744303071L;
	private CountryPanel countryPanel;
	private MainPanel mainPanel;
	private CreatePanel createPanel;
	private SelectPanel selectPanel;
	private String countryName;

	public MainWindow() {
		setBounds(0, 0, 1280, 750);
		setTitle("Default");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		countryPanel = new CountryPanel();
		mainPanel = new MainPanel();
		createPanel = new CreatePanel();
		selectPanel = new SelectPanel();
		
		countryPanel.setVisible(true);
		mainPanel.setVisible(false);
		selectPanel.setVisible(true);
		createPanel.setVisible(false);
		
		add(countryPanel);
		add(mainPanel);
		add(selectPanel);
		add(createPanel);
	}

	public CountryPanel getCountryPanel() {
		return countryPanel;
	}

	public void setCountryPanel(CountryPanel countryPanel) {
		this.countryPanel = countryPanel;
	}

	public MainPanel getMainPanel() {
		return mainPanel;
	}

	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}

	public CreatePanel getCreatePanel() {
		return createPanel;
	}

	public void setCreatePanel(CreatePanel createPanel) {
		this.createPanel = createPanel;
	}
	
	public SelectPanel getSelectPanel() {
		return selectPanel;
	}
	
	public void setSelectPanel(SelectPanel selectPanel) {
		this.selectPanel = selectPanel;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void changeTitle(String change) {
		setTitle(this.countryName + " - " + change);
	}

	public void changeSize(int wide, int heigth) {
		setBounds(0, 0, wide, heigth);
	}
}