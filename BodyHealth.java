import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import java.text.DecimalFormat;
 
public  class  BodyHealth extends JFrame{
	JPanel panel1 = new JPanel();
	JPanel result = new JPanel();
	JTextField bmi = new JTextField(8);
	JTextField bmr = new JTextField(8);
	JTextField ree = new JTextField(8);
	JTextField text_H = new JTextField(3);
	JTextField text_W = new JTextField(3);
	JTextField text_A = new JTextField(3);
	JButton female = new JButton("Female");
	JButton male = new JButton("Male");
	JButton clear = new JButton("Clear");
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
		result.add(new JLabel("REE :"));
		result.add(ree);
		result.add(new JLabel(""));
		result.add(clear);
		
		result.setBorder(new TitledBorder("Result"));
		result.setBackground(new Color(251,221,191));
		
		add(panel1,BorderLayout.NORTH);
		add(result,BorderLayout.CENTER);
		
		female.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				DecimalFormat df=new DecimalFormat("#.##");
				double data_height = Double.parseDouble(text_H.getText());
				double data_weight = Double.parseDouble(text_W.getText());
				double data_age = Double.parseDouble(text_A.getText());
				double result_bmi = data_weight / ( data_height * data_height );
				double result_bmr = ( 9.6 * data_weight ) + ( 1.8 * data_height )-( 4.7 * data_age ) + 655;
				double result_ree = ( 10 * data_weight ) + ( 6.25 * data_height ) - ( 5 * data_age ) - 161;
				
				if( result_bmi < 18.5 ){
					JFrame frame2 = new JFrame();
					frame2.setTitle("BMI");
					frame2.add(new JLabel("輕體重"));
					frame2.setSize(300,100);
					frame2.setLocationRelativeTo(null);
					frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame2.setVisible(true);
				}
				else if( result_bmi >= 18.5 && result_bmi < 24 ){
					JFrame frame2 = new JFrame();
					frame2.setTitle("BMI");
					frame2.add(new JLabel("正常體重"));
					frame2.setSize(300,100);
					frame2.setLocationRelativeTo(null);
					frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame2.setVisible(true);
				}
				else if( result_bmi >= 24 && result_bmi < 27 ){
					JFrame frame2 = new JFrame();
					frame2.setTitle("BMI");
					frame2.add(new JLabel("超重"));
					frame2.setSize(300,100);
					frame2.setLocationRelativeTo(null);
					frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame2.setVisible(true);
				}
				else if( result_bmi >= 27 && result_bmi < 30 ){
					JFrame frame2 = new JFrame();
					frame2.setTitle("BMI");
					frame2.add(new JLabel("輕度肥胖"));
					frame2.setSize(300,100);
					frame2.setLocationRelativeTo(null);
					frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame2.setVisible(true);
				}
				else if( result_bmi >= 30 && result_bmi < 35 ){
					JFrame frame2 = new JFrame();
					frame2.setTitle("BMI");
					frame2.add(new JLabel("中度肥胖"));
					frame2.setSize(300,100);
					frame2.setLocationRelativeTo(null);
					frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame2.setVisible(true);
				}
				else if( result_bmi >= 35 ){
					JFrame frame2 = new JFrame();
					frame2.setTitle("BMI");
					frame2.add(new JLabel("重度肥胖"));
					frame2.setSize(300,100);
					frame2.setLocationRelativeTo(null);
					frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame2.setVisible(true);
				}
				
				bmi.setText(df.format(result_bmi));
				bmr.setText(df.format(result_bmr));
				ree.setText(df.format(result_ree));
			}
		});
		
		male.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				DecimalFormat df=new DecimalFormat("#.##");
				double data_height = Double.parseDouble(text_H.getText());
				double data_weight = Double.parseDouble(text_W.getText());
				double data_age = Double.parseDouble(text_A.getText());
				double result_bmi =  data_weight / ( data_height * data_height );
				double result_bmr = ( 13.7 * data_weight )+( 5.0 * data_height )-( 6.8 * data_age ) + 66;
				double result_ree = ( 10 * data_weight ) + ( 6.25 * data_height ) - ( 5 * data_age ) + 5;
				
				if( result_bmi < 18.5 ){
					JFrame frame2 = new JFrame();
					frame2.setTitle("BMI");
					frame2.add(new JLabel("輕體重"));
					frame2.setSize(300,100);
					frame2.setLocationRelativeTo(null);
					frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame2.setVisible(true);
				}
				else if( result_bmi >= 18.5 && result_bmi < 24 ){
					JFrame frame2 = new JFrame();
					frame2.setTitle("BMI");
					frame2.add(new JLabel("正常體重"));
					frame2.setSize(300,100);
					frame2.setLocationRelativeTo(null);
					frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame2.setVisible(true);
				}
				else if( result_bmi >= 24 && result_bmi < 27 ){
					JFrame frame2 = new JFrame();
					frame2.setTitle("BMI");
					frame2.add(new JLabel("超重"));
					frame2.setSize(300,100);
					frame2.setLocationRelativeTo(null);
					frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame2.setVisible(true);
				}
				else if( result_bmi >= 27 && result_bmi < 30 ){
					JFrame frame2 = new JFrame();
					frame2.setTitle("BMI");
					frame2.add(new JLabel("輕度肥胖"));
					frame2.setSize(300,100);
					frame2.setLocationRelativeTo(null);
					frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame2.setVisible(true);
				}
				else if( result_bmi >= 30 && result_bmi < 35 ){
					JFrame frame2 = new JFrame();
					frame2.setTitle("BMI");
					frame2.add(new JLabel("中度肥胖"));
					frame2.setSize(300,100);
					frame2.setLocationRelativeTo(null);
					frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame2.setVisible(true);
				}
				else if( result_bmi >= 35 ){
					JFrame frame2 = new JFrame();
					frame2.setTitle("BMI");
					frame2.add(new JLabel("重度肥胖"));
					frame2.setSize(300,100);
					frame2.setLocationRelativeTo(null);
					frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					frame2.setVisible(true);
				}
				
				bmi.setText(df.format(result_bmi));
				bmr.setText(df.format(result_bmr));
				ree.setText(df.format(result_ree));
			}
		});
		
		clear.addActionListener(new ActionListener(){
			@Override//when press clear, it would clear all things.
			public void actionPerformed(ActionEvent e){
				//clear JTextField
				text_H.setText(null);
				text_W.setText(null);
				text_A.setText(null);
				bmi.setText(null);
			    bmr.setText(null);
				ree.setText(null);
			}
		});
		
	}
	
	public static void main (String[] args){
		JFrame frame = new BodyHealth();
		frame.setTitle("Body Health Helper");
		frame.setSize(400,275);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		
		JFrame frame1 = new JFrame();
		frame1.setTitle("Information");
		frame1.setLayout(new GridLayout(4, 2));
		frame1.add(new JLabel("身體質量指數 ( Body Mass Index 簡稱 BMI )"));
		frame1.add(new JLabel("基礎代謝率(BMR)：我們在安靜狀態下(通常為靜臥狀態)消耗的最低熱量，人的其他活動都建立在這個基礎上。"));
		frame1.add(new JLabel("靜態能量消耗值(Resting Energy Expenditure，簡稱REE)：是指一般人所需的最小熱能需求量。"));
		frame1.pack();
		frame1.setLocationRelativeTo(null);
		frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame1.setVisible(true);
	}
}
