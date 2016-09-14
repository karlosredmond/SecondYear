package Lab7;

import java.awt.* ;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.* ;

public class MenuSwing extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private CurrSwing currency ;
	private CalcSwing calc ;
	private MultiTool multi ; 
	private JMenuBar menuBar ;
	private JMenu menu ;
	private JMenuItem calculator,curr,mTool ;

	public MenuSwing() {
		// TODO Auto-generated constructor stub
		calc = new CalcSwing() ;
		currency = new CurrSwing() ;
		multi = new MultiTool() ;
		menuBar = new JMenuBar() ;
		menu = new JMenu("File") ;
		calculator = new JMenuItem("Calculator") ;
		curr = new JMenuItem("Currency Converter") ;
		mTool = new JMenuItem("Multitool") ;
		calculator.addActionListener(this);
		curr.addActionListener(this);
		mTool.addActionListener(this);
		menu.add(calculator) ;
		menu.add(curr) ;
		menu.add(mTool) ;
		menuBar.add(menu) ;
		Container contentPane = getContentPane() ;
		add(menuBar) ;
		addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		           System.exit(0);}});	

	}
public static void main(String[]args){
		MenuSwing m = new MenuSwing() ;
		m.setVisible(true) ;
		m.pack() ;
	}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	super.setVisible(false) ;
	if(e.getSource() == calculator){
		calc.add(menuBar,"North") ;
		multi.setVisible(false) ;
		currency.setVisible(false) ;
		calc.setVisible(true) ;
		}
	else if(e.getSource() == curr){
		currency.add(menuBar,"North") ;
		currency.pack();
		calc.setVisible(false) ;
		multi.setVisible(false);
		currency.setVisible(true) ;
		}
	else if(e.getSource() == mTool){
		multi.add(menuBar,"North") ;
		multi.pack();
		calc.setVisible(false) ;
		currency.setVisible(false) ;
		multi.setVisible(true) ;
		}
	
}

}
