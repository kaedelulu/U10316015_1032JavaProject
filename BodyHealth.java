import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
 
public  class  BodyHealth extends JFrame{
	JPanel panel1 = new JPanel();
	JPanel result = new JPanel();
	JTextField bmi = new JTextField(8);
	JTextField bmr = new JTextField(8);
	JTextField text_H = new JTextField(3);
	JTextField text_W = new JTextField(3);
	JTextField text_A = new JTextField(3);
	JButton female = new JButton("Female");
	JButton male = new JButton("Male");
	//Create constructor
	public BodyHealth(){
		panel1.setLayout(new GridLayout(4, 2));
		panel1.add(new JLabel("Height(M):"));
		panel1.add(text_H);
		panel1.add(new JLabel("Weight(KG):"));
		panel1.add(text_W);
		panel1.add(new JLabel("Age:"));
		panel1.add(text_A);
		panel1.add(female);
		panel1.add(male);
		
		panel1.setBorder(new TitledBorder("Data"));		
		panel1.setBackground(new Color(210,224,251));
		
		result.setLayout(new GridLayout(2,2));
		result.add(new JLabel("BMI( kg/m^2 ) :"));
		result.add(bmi);
		result.add(new JLabel("BMR :"));
		result.add(bmr);
		
		result.setBorder(new TitledBorder("Result"));
		result.setBackground(new Color(251,221,191));
		
		add(panel1,BorderLayout.NORTH);
		add(result,BorderLayout.CENTER);
		
	}
	
	public static void main (String[] args){
		JFrame frame = new BodyHealth();
		frame.setTitle("Body Health Helper");//set title
		frame.setSize(400,275);//set size
		frame.setLocationRelativeTo(null); // Center the frame
		//terminate when the frame is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//set visible
		frame.setResizable(false);//cannot change size
	}
}
