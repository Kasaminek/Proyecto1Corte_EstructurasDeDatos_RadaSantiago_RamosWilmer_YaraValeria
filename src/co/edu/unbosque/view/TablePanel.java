package co.edu.unbosque.view;

import javax.swing.table.AbstractTableModel;

public class TablePanel extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	private String[][] data;
	private String[] columnNames;

	public TablePanel(String[][] data, String[] columnNames) {
		this.data = data;
		this.columnNames = columnNames;
	}

	public void setData(String[][] data) {
		this.data = data;
	}

	public void setColumnNames(String[] columnNames) {
		this.columnNames = columnNames;
	}

	@Override
	public int getRowCount() {
		return data.length;
	}

	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		return data[rowIndex][columnIndex];
	}

	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}
}