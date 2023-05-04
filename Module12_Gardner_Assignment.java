///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is a small but important portion of code that declares all of the imports for the program to work as expected

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.color.*;
import java.awt.event.*;

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that declares the intial class as well as implements an action listener if any events are to occur in the panel
//while also delcaring the checkboxes and frame that will be used throughout the program

public class Module12_Gardner_Assignment implements ActionListener {

	JCheckBox CheckBox1, CheckBox2, CheckBox3, CheckBox4;

	JFrame Frame;
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that is main method that prints out and runs the code especially the constructor for the class that has
//the interface coded within it
	
	public static void main (String args[]) {
		
		new Module12_Gardner_Assignment();
		
	}//end of the method main
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
//This is the portion of the code creating a initial frame for the interface in which all main portions of the interface are being added to the frame
//by adding the menu bar and the exit application of the graphics from the GraphicsForMyPanel class that creates that panel
	
	public Module12_Gardner_Assignment() {

		GraphicsForMyPanel PanelForGraphics = new GraphicsForMyPanel();

		
		JFrame.setDefaultLookAndFeelDecorated(true);

		JFrame Frame1 = new JFrame("We build it for you");

		Frame1.setSize(950, 600);

		Frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Frame1.setVisible(true);

		
		JMenuBar MenuBar1 = new JMenuBar();

		JMenu Menu = new JMenu("Menu");

		JMenuItem MenuOption1 = new JMenuItem("Exit The Program");

		
		Menu.add(MenuOption1);

		MenuBar1.add(Menu);

		Frame1.setJMenuBar(MenuBar1);

		
		MenuOption1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Closing The Application As Requested");

				Frame1.dispose();

			}//end of the method actionPreformed

		});//end of the ActionListener
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that begins by setting up the three panels that will be used for the three seperate elements of the interface being
//created for this porgram and then splitting it into a tabbed pain so you can move accross each tab

		JPanel Panel1 = new JPanel();

		JPanel Panel2 = new JPanel();

		JPanel Panel3 = new JPanel();

		
		JTabbedPane TabbedPanel = new JTabbedPane();

		TabbedPanel.setBounds(100, 100, 300, 300);
		

		JButton Button1 = new JButton("Button One");

			Button1.setBounds(50, 100, 95, 30);

		JButton Button2 = new JButton("Button Two");

			Button2.setBounds(100, 100, 95, 30);

				
		Panel1.add(Button1);

		Panel1.add(Button2);
			
			
		Button1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "The First Button Was Pressed");

			}//end of the method actionPreformed

		});//end of the ActionListener
			

		Button2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "The Second Button Was Pressed");

			}//end of the method actionPreformed

		});//end of the ActionListener
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code for the second tab in which radio buttons are used and it can determine which button is pressed
//this is also where all of the buttons are added on to the panel for the second tab

		JRadioButton RadioButton1, RadioButton2, RadioButton3, RadioButton4, RadioButton5;

		RadioButton1 = new JRadioButton("One");

			RadioButton1.setBounds(100, 50, 100, 30);

		RadioButton2 = new JRadioButton("Two");

			RadioButton2.setBounds(100, 100, 100, 30);

		RadioButton3 = new JRadioButton("Three");

			RadioButton3.setBounds(100, 100, 100, 30);

		RadioButton4 = new JRadioButton("Four");

			RadioButton4.setBounds(100, 100, 100, 30);

		RadioButton5 = new JRadioButton("Five");

			RadioButton5.setBounds(100, 100, 100, 30);

			
		ButtonGroup ButtonGroupTogether = new ButtonGroup();

			ButtonGroupTogether.add(RadioButton1);

			ButtonGroupTogether.add(RadioButton2);

			ButtonGroupTogether.add(RadioButton3);

			ButtonGroupTogether.add(RadioButton4);

			ButtonGroupTogether.add(RadioButton5);
		

		Panel2.add(RadioButton1);

		Panel2.add(RadioButton2);

		Panel2.add(RadioButton3);

		Panel2.add(RadioButton4);

		Panel2.add(RadioButton4);


		RadioButton1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "The First Button Was Pressed");

			}//end of the method actionPreformed

		});//end of the ActionListener
			

		RadioButton2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "The Second Button Was Pressed");

			}//end of the method actionPreformed

		});//end of the ActionListener
	
		RadioButton3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "The Third Button Was Pressed");

			}//end of the method actionPreformed

		});//end of the ActionListener

		RadioButton4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "The Fourth Button Was Pressed");

			}//end of the method actionPreformed
			
		});//end of the ActionListener

		RadioButton5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "The Fifth Button Was Pressed");

			}//end of the method actionPreformed

		});//end of the ActionListener
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that declares the checkboxes for the third tab and makes sure to implement the action listener for the event if
//the check box is clicked and displayed

		CheckBox1 = new JCheckBox("One");

			CheckBox1.setBounds(100, 100, 150, 20);

		CheckBox2 = new JCheckBox("Two");

			CheckBox2.setBounds(100, 150, 150, 20);

		CheckBox3 = new JCheckBox("Three");

			CheckBox3.setBounds(100, 200, 150, 20);

		CheckBox4 = new JCheckBox("Four");

			CheckBox4.setBounds(100, 250, 150, 20);


		CheckBox1.addActionListener(this);

		CheckBox2.addActionListener(this);

		CheckBox3.addActionListener(this);

		CheckBox4.addActionListener(this);


		Panel3.add(CheckBox1);

		Panel3.add(CheckBox2);

		Panel3.add(CheckBox3);

		Panel3.add(CheckBox4);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
//This is the portion of the code that ends the constructor class for the program and creates the tabs for the interfaces whikle also splitting 
//the frame for the graphics and each panel

		TabbedPanel.add("Tab1", Panel1);

		TabbedPanel.add("Tab2", Panel2);

		TabbedPanel.add("Tab3", Panel3);


		JSplitPane SplitPanel = new

				JSplitPane(JSplitPane.HORIZONTAL_SPLIT, TabbedPanel, PanelForGraphics);


		Frame1.add(SplitPanel);

		Frame1.setVisible(true);

	}//end of the constructor method Module12_Gardner_Assignment

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that acts as the event listerner for the interface on panel three where it decides which boxes have been checked
//so that it may notify the user to what box or box is checked
	
		@Override
		public void actionPerformed (ActionEvent e) {

		boolean Check1 = false;
		
		boolean Check2 = false;

		boolean Check3 = false;
		
		boolean Check4 = false;

		String StringOfText = "";
		

		if (CheckBox1.isSelected()) {

			Check1 = true;

			StringOfText += " One";

		}//end of if statement

		if (CheckBox2.isSelected()) {

			Check2 = true;

			StringOfText += " Two";

		}//end of if statement

		if (CheckBox3.isSelected()) {

			Check3 = true;

			StringOfText += " Three";

		}//end of if statement

		if (CheckBox4.isSelected()) {

			Check4 = true;

			StringOfText += " Four";

		}//end of if statement


		if (Check1 && Check2 && Check3 && Check4) {

			JOptionPane.showMessageDialog(null, "All Ckeck Boxes Have Been Selected");

		}//end of if statement
			
		else {

			JOptionPane.showMessageDialog(null, "The Boxes Selected Are: " + StringOfText);

		}//end of the else statement

	}//This is the end of the method actionPreformed 
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that ends the class Module12_Gardner_Assignment which coded many different elements within the class so that
//they can preform the action specified within the prompt
		
}//end of the class Module12_Gardner_Assignment

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that implements the graphics for the elements visualized in the interface such as the shapes in the advanced GUI

class GraphicsForMyPanel extends JPanel {

	public void paint(Graphics Graphics) {

		Graphics.setColor(Color.BLACK);

		Graphics.drawString("My Advanced GUI For My Interface",175,40);  

		setBackground(Color.PINK);
	
		Graphics.setColor(Color.RED);

		Graphics.fillRect(150, 70,200, 160);  

		Graphics.setColor(Color.ORANGE);

		Graphics.fillOval(400, 100, 100, 100);

		Graphics.setColor(Color.BLUE);

		Graphics.fillOval(230,300,300, 200);

		Graphics.setColor(Color.WHITE);

		Graphics.fillPolygon(new int[] {35, 10, 60},

			new int[] {150, 200, 200}, 3);

		Graphics.setColor(Color.BLACK);

		Graphics.fillRect(20, 350, 80, 80);

		Graphics.setColor(Color.YELLOW);

			int [ ] x = {20, 35, 50, 65, 80, 95};

			int [ ] y = {60, 105, 105, 110, 95, 95};

		Graphics.fillPolygon(x, y, 6);

	}//end of the method
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//This is the portion of the code that ends the class GraphicsForMyPanel which implements the graphics for the elements visualized in the interface
	
}//end of the class GraphicsForMyPanel

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////