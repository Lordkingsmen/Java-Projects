import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.resource.JFaceResources;

import javax.swing.JWindow;

import org.eclipse.jface.resource.ColorDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;

public class Interface extends Composite {
	private Table table;
	private LocalResourceManager localResourceManager;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public Interface(Composite parent, int style) {
		super(parent, style);
		createResourceManager();
		setBackground((Color) localResourceManager.create(ColorDescriptor.createFrom(new RGB(0, 0, 0))));
		
		table = new Table(this, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(0, 0, 1080, 720);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("New Column");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(100);
		tblclmnNewColumn_1.setText("New Column");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_2.setWidth(100);
		tblclmnNewColumn_2.setText("New Column");
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText("New TableItem");
		
		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setText("New TableItem");
		
		TableItem tableItem_2 = new TableItem(table, SWT.NONE);
		tableItem_2.setText("New TableItem");
		
		TableItem tableItem_3 = new TableItem(table, SWT.NONE);
		tableItem_3.setText("New TableItem");
		
		TableItem tableItem_4 = new TableItem(table, SWT.NONE);
		tableItem_4.setText("New TableItem");
		
		TableItem tableItem_5 = new TableItem(table, SWT.NONE);
		tableItem_5.setText("New TableItem");
		
		TableItem tableItem_6 = new TableItem(table, SWT.NONE);
		tableItem_6.setText("New TableItem");
		
		TableItem tableItem_7 = new TableItem(table, SWT.NONE);
		tableItem_7.setText("New TableItem");
		
		TableItem tableItem_8 = new TableItem(table, SWT.NONE);
		tableItem_8.setText("New TableItem");
		
		TableItem tableItem_9 = new TableItem(table, SWT.NONE);
		tableItem_9.setText("New TableItem");
		
		TableItem tableItem_10 = new TableItem(table, SWT.NONE);
		tableItem_10.setText("New TableItem");
		
		TableItem tableItem_11 = new TableItem(table, SWT.NONE);
		tableItem_11.setText("New TableItem");
		
		TableItem tableItem_12 = new TableItem(table, SWT.NONE);
		tableItem_12.setText("New TableItem");
		
		TableItem tableItem_13 = new TableItem(table, SWT.NONE);
		tableItem_13.setText("New TableItem");
		
		TableItem tableItem_14 = new TableItem(table, SWT.NONE);
		tableItem_14.setText("New TableItem");
		
		TableItem tableItem_15 = new TableItem(table, SWT.NONE);
		tableItem_15.setText("New TableItem");
		
		TableItem tableItem_16 = new TableItem(table, SWT.NONE);
		tableItem_16.setText("New TableItem");
		
		TableItem tableItem_17 = new TableItem(table, SWT.NONE);
		tableItem_17.setText("New TableItem");
		
		TableItem tableItem_18 = new TableItem(table, SWT.NONE);
		tableItem_18.setText("New TableItem");
		
		TableItem tableItem_19 = new TableItem(table, SWT.NONE);
		tableItem_19.setText("New TableItem");
		
		TableItem tableItem_20 = new TableItem(table, SWT.NONE);
		tableItem_20.setText("New TableItem");
		
		TableItem tableItem_21 = new TableItem(table, SWT.NONE);
		tableItem_21.setText("New TableItem");
		
		TableItem tableItem_22 = new TableItem(table, SWT.NONE);
		tableItem_22.setText("New TableItem");
		
		TableItem tableItem_23 = new TableItem(table, SWT.NONE);
		tableItem_23.setText("New TableItem");
		
		TableItem tableItem_24 = new TableItem(table, SWT.NONE);
		tableItem_24.setText("New TableItem");
	}
	private void createResourceManager() {
		localResourceManager = new LocalResourceManager(JFaceResources.getResources(),this);
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}
}
