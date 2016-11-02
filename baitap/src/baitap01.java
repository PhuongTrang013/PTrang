import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class baitap01 extends JFrame {
	
public baitap01(){
	setSize(400,300);
	setLayout(null);
	setTitle("BT");
	
	
	
	setLayout(new FlowLayout());
	for(int i =0; i<=20; i++){
		add(new JButton(String.valueOf(i)));
		
	}
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		baitap01 wMain = new baitap01();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

}
