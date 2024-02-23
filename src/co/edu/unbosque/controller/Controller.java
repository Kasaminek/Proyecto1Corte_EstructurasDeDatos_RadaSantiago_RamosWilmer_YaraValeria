package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import co.edu.unbosque.model.PackageDTO;
import co.edu.unbosque.model.persistence.WarehouseDAO;
import co.edu.unbosque.util.CannotBeEmptyException;
import co.edu.unbosque.util.CannotBeNegativeException;
import co.edu.unbosque.util.NonExistentObjectListException;
import co.edu.unbosque.util.NotValidNameException;
import co.edu.unbosque.view.Console;
import co.edu.unbosque.view.MainWindow;

public class Controller implements ActionListener {
	private Console con;
	private WarehouseDAO wDao;
	private MainWindow win;

	public Controller() {
		con = new Console();
		wDao = new WarehouseDAO();
		win = new MainWindow();
		addReaders();
	}

	public void run() {
		win.changeTitle("Selección de país");
		win.setVisible(true);
		PackageDTO temp = new PackageDTO();
		temp.setSerialNumber(6);
		temp.setPackageContent("Delicado");

		PackageDTO temp2 = new PackageDTO();
		temp2.setSerialNumber(8);
		temp2.setPackageContent("Pesado");

		PackageDTO temp3 = new PackageDTO();
		temp3.setSerialNumber(10);
		temp3.setPackageContent("Ligero");

		wDao.create(temp);
		wDao.create(temp2);
		wDao.create(temp3);

		con.printSkip(wDao.show());
		con.printSkip("--------------------------------------------------");

		wDao.delete(0);
		con.printSkip(wDao.show());

		con.printSkip("--------------------------------------------------");
		wDao.update(1, temp);
		con.printSkip(wDao.show());
	}

	public void addReaders() {
		win.getCountryPanel().getBtnExit().addActionListener(this);
		win.getCountryPanel().getBtnExit().setActionCommand("btnExit");

		win.getCountryPanel().getBtnEnter().addActionListener(this);
		win.getCountryPanel().getBtnEnter().setActionCommand("btnEnter");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "btnExit": {
			if (askBeforeMessage("¿Estás seguro de salir?", "Confirmation - Exit")) {
				System.exit(0);
			}
			break;
		}
		case "btnEnter": {
			String country = win.getCountryPanel().getDataF();
			try {
				checkEmptyData(country, "pais");
			} catch (CannotBeEmptyException e1) {
				e1.printStackTrace();
				break;
			}
			win.getCountryPanel().setVisible(false);
			win.getMainPanel().setVisible(true);
			break;
		}
		}
	}

	public boolean askBeforeMessage(String message, String type) {
		int respuesta = JOptionPane.showConfirmDialog(null, message, type, JOptionPane.YES_NO_OPTION);
		if (respuesta == JOptionPane.YES_OPTION) {
			return true;
		} else {
			return false;
		}
	}

	public void errorMessage(String message, String type) {
		JOptionPane.showMessageDialog(null, message, type, JOptionPane.ERROR_MESSAGE);
	}

	public void infoMessage(String message, String type) {
		JOptionPane.showMessageDialog(null, message, type, JOptionPane.INFORMATION_MESSAGE);
	}

	public String currentTime() {
		LocalTime horaActual = LocalTime.now();
		String time = horaActual.getHour() + ":" + horaActual.getMinute();
		return time;
	}

	public void checkName(String name, String data) throws NotValidNameException {
		for (char c : name.toCharArray()) {
			if (!Character.isAlphabetic(c) && !Character.isWhitespace(c)) {
				errorMessage("Ningun " + data + " puede tener numeros o simbolos.", "Error - Name");
				throw new NotValidNameException("Ningun nombre puede tener numeros o simbolos.");
			}
		}
	}

	public void checkEmptyData(String content, String data) throws CannotBeEmptyException {
		if (content == null || content.equals("")) {
			errorMessage("Casilla de " + data + " no puede estar vacia.", "Error - Empty");
			throw new CannotBeEmptyException("Casilla de dato no puede estar vacia.");
		}
	}

	public void checkNumber(String amount, String data, boolean canBeZero) throws CannotBeNegativeException {
		if (canBeZero) {
			if (Long.parseLong(amount) < 0) {
				errorMessage("Esta " + data + " ingresado no puede ser negativo.", "Error - Amount");
				throw new CannotBeNegativeException("Dato ingresado no puede ser negativo.");
			}
		} else {
			if (Long.parseLong(amount) <= 0) {
				errorMessage("Esta " + data + " ingresado no puede ser 0 o un valor menor", "Error - Amount");
				throw new CannotBeNegativeException("Dato ingresado no puede ser negativo.");
			}
		}
	}

	public void checkFormat(String number, String data) throws NumberFormatException {
		try {
			Long.parseLong(number);
		} catch (NumberFormatException e) {
			errorMessage("El formato del " + data + " debe ser numérico.", "Error - Format");
			throw new NumberFormatException("El formato del dato debe ser numérico.");
		}
	}

	public void checkList(int size, String data) throws NonExistentObjectListException {
		if (size <= 0) {
			errorMessage("No hay " + data + " existentes.", "Error - Null");
			throw new NonExistentObjectListException("No hay objetos existentes.");
		}
	}
}