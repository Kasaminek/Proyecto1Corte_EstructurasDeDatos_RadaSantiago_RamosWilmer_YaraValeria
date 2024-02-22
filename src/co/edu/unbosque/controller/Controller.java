package co.edu.unbosque.controller;

import co.edu.unbosque.model.PackageDTO;
import co.edu.unbosque.model.persistence.WarehouseDAO;
import co.edu.unbosque.view.Console;

public class Controller {
	private Console con;
	private WarehouseDAO wDao;

	public Controller() {
		con = new Console();
		wDao = new WarehouseDAO();
		
	}

	public void run() {
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
}