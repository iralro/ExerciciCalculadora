import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Calculadora {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Calculadora window = new Calculadora();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(479, 505);
		shell.setText("Calculadora");
		
		Button btnNum1 = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setBounds(29, 212, 56, 36);
		btnNewButton.setText("7");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.setBounds(91, 212, 56, 36);
		btnNewButton_1.setText("8");
		
		Button button = new Button(shell, SWT.NONE);
		button.setBounds(153, 212, 59, 36);
		button.setText("9");
		
		Button btnNewButton_2 = new Button(shell, SWT.NONE);
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_2.setText("4");
		btnNewButton_2.setBounds(29, 260, 56, 36);
		
		Button btnNewButton_1_1 = new Button(shell, SWT.NONE);
		btnNewButton_1_1.setText("5");
		btnNewButton_1_1.setBounds(91, 260, 56, 36);
		
		Button button_1 = new Button(shell, SWT.NONE);
		button_1.setText("6");
		button_1.setBounds(153, 260, 59, 36);
		
		Button btnNewButton_2_1 = new Button(shell, SWT.NONE);
		btnNewButton_2_1.setText("1");
		btnNewButton_2_1.setBounds(29, 302, 56, 36);
		
		Button btnNewButton_1_1_1 = new Button(shell, SWT.NONE);
		btnNewButton_1_1_1.setText("2");
		btnNewButton_1_1_1.setBounds(91, 302, 56, 36);
		
		Button button_1_1 = new Button(shell, SWT.NONE);
		button_1_1.setText("3");
		button_1_1.setBounds(153, 302, 59, 36);
		
		Button btnNewButton_2_1_1 = new Button(shell, SWT.NONE);
		btnNewButton_2_1_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_2_1_1.setText("0");
		btnNewButton_2_1_1.setBounds(29, 344, 56, 50);
		
		Button btnNewButton_3 = new Button(shell, SWT.NONE);
		btnNewButton_3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_3.setBounds(91, 344, 121, 50);
		btnNewButton_3.setText("=");
		
		Button button_2 = new Button(shell, SWT.NONE);
		button_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_2.setText("/");
		button_2.setBounds(218, 212, 59, 42);
		
		Button button_1_2 = new Button(shell, SWT.NONE);
		button_1_2.setText("*");
		button_1_2.setBounds(218, 260, 59, 42);
		
		Button button_1_1_1 = new Button(shell, SWT.NONE);
		button_1_1_1.setText("+");
		button_1_1_1.setBounds(218, 309, 59, 43);
		
		Button button_1_1_1_1 = new Button(shell, SWT.NONE);
		button_1_1_1_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_1_1_1_1.setText("-");
		button_1_1_1_1.setBounds(218, 358, 59, 36);

	}
}
