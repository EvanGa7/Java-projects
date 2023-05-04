
import javax.swing.*;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.color.*;
import java.awt.event.*;

public class Module12_Assignment1 extends JFrame {

	JButton button1;
	JTextField textField1;
	JTextArea textArea1;
	int buttonClicked;
		
	public static void main(String[] args) {

		new Module12_Assignment1();

	}//end of the method main
	
public Module12_Assignment1() {
		
		this.setSize (400,400);
		
		//this.setLocationRelativeTo(null);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		Dimension dimension = toolkit.getScreenSize();
		
		int xPosition = (dimension.width / 2)-(this.getWidth() / 2);
		int yPosition = (dimension.height / 2)-(this.getHeight() / 2);
		
		this.setLocation(xPosition, yPosition);
		
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Second Frame");
		
		JPanel Panel1 = new JPanel();
		
		JButton Button1 = new JButton("Click Here");
		ListenForButton listenForButton = new ListenForButton();
		Button1.addActionListener(listenForButton);
		
		
		Panel1.add(Button1);
		
		JTextField TextField1 = new JTextField("Type Here", 15);
		Panel1.add(TextField1);
		
		Panel1.add(textArea1);
		
		this.add(Panel1);
		
		this.setVisible (true);
		
	}//end of the method Module12_Gardner_Assignment

private class ListenForButton implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == button1) {
			
			buttonClicked++;
			
			textArea1.append("Button Clicked "+buttonClicked+" Times\n");
			
		}//end of te if statement
		
	}
	
}

}
	
/*public static void main (String args[]) {
		
		new Module12_Gardner_Assignment();
		
		/*
		
		JFrame window = new JFrame();
		window.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		window.setSize (640, 480);
		window.setVisible (true);
		window.setTitle ("First GUI");
	
		Rectangle rect = new Rectangle(5, 10, 300, 100);
		*/
		
	//end of the method main*/
	
	
	/*public Module12_Gardner_Assignment() {
		
		this.setSize (400,400);
		
		//this.setLocationRelativeTo(null);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		Dimension dimension = toolkit.getScreenSize();
		
		int xPosition = (dimension.width / 2)-(this.getWidth() / 2);
		int yPosition = (dimension.height / 2)-(this.getHeight() / 2);
		
		this.setLocation(xPosition, yPosition);
		
		this.setResizable(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My First Frame");
		
		JPanel Panel1 = new JPanel();
		
		JLabel Label1 = new JLabel("Tell Me Something");
		Panel1.add(Label1);
		Label1.setText("New Text");
		Label1.setToolTipText("Doesn't Do Anything");
		
		JButton Button1 = new JButton("send");
		//Button1.setBorderPainted(false);
		//Button1.setContentAreaFilled(false);
		Button1.setText("New Button");
		Button1.setToolTipText("It's A Button");
		Panel1.add(Button1);
		
		JTextField TextField1 = new JTextField("Type Here", 15);
		TextField1.setColumns(10);
		TextField1.setToolTipText("It's A Text Field");
		Panel1.add(TextField1);
		
		JTextArea TextArea1 = new JTextArea("Just A Whole Bunch Of Text", 15, 20);
		TextArea1.setLineWrap(true);
		JScrollPane ScrollWheel1 = new JScrollPane(TextArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		TextArea1.setWrapStyleWord(true);
		int NumberOfLines = TextArea1.getLineCount();
		TextArea1.append("\n\nNumber Of Lines: " + NumberOfLines);
		Panel1.add(TextArea1);
		
		this.add(Panel1);
		
		this.setVisible (true);
		
		TextField1.requestFocus();
		
	//end of the method Module12_Gardner_Assignment
*/

