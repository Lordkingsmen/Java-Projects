import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.jface.resource.LocalResourceManager;
import org.eclipse.jface.resource.JFaceResources;

import java.io.IOException;
import java.util.Arrays;

import javax.swing.JWindow;

import org.eclipse.jface.resource.ColorDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.widgets.Label;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.widgets.Text;

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
		table.setBounds(0, 0, 1080, 405);
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
		tableItem.setText("Candidate A");
		
		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setText("");
		
		TableItem tableItem_2 = new TableItem(table, SWT.NONE);
		tableItem_2.setText("");
		
		TableItem tableItem_3 = new TableItem(table, SWT.NONE);
		tableItem_3.setText("");
		
		TableItem tableItem_4 = new TableItem(table, SWT.NONE);
		tableItem_4.setText("");
		
		TableItem tableItem_5 = new TableItem(table, SWT.NONE);
		tableItem_5.setText("Candidate B");
		
		TableItem tableItem_6 = new TableItem(table, SWT.NONE);
		tableItem_6.setText("");
		
		TableItem tableItem_7 = new TableItem(table, SWT.NONE);
		tableItem_7.setText("");
		
		TableItem tableItem_8 = new TableItem(table, SWT.NONE);
		tableItem_8.setText("");
		
		TableItem tableItem_9 = new TableItem(table, SWT.NONE);
		tableItem_9.setText("");
		
		TableItem tableItem_10 = new TableItem(table, SWT.NONE);
		tableItem_10.setText("Candidate C");
		
		TableItem tableItem_11 = new TableItem(table, SWT.NONE);
		tableItem_11.setText("");
		
		TableItem tableItem_13 = new TableItem(table, SWT.NONE);
		tableItem_13.setText(new String[] {});
		
		TableItem tableItem_14 = new TableItem(table, SWT.NONE);
		tableItem_14.setText("");
		
		TableItem tableItem_15 = new TableItem(table, SWT.NONE);
		tableItem_15.setText("Candidate D");
		
		TableItem tableItem_16 = new TableItem(table, SWT.NONE);
		tableItem_16.setText("");
		
		TableItem tableItem_17 = new TableItem(table, SWT.NONE);
		tableItem_17.setText("");
		
		TableItem tableItem_18 = new TableItem(table, SWT.NONE);
		tableItem_18.setText("");
		
		TableItem tableItem_19 = new TableItem(table, SWT.NONE);
		tableItem_19.setText("");
		
		TableCursor tableCursor = new TableCursor(table, SWT.NONE);
	}
	private void createResourceManager() {
		localResourceManager = new LocalResourceManager(JFaceResources.getResources(),this);
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents sub-classing of SWT components
	}
}
