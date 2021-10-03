import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener 
	{
	boolean isOperatorClicked=false;
	String oldval,newval;
	float oldvalf,newvalf;
	
	JFrame jf;
	JLabel displaylabel;
	
	JButton sevenbutton,fourbutton,onebutton,dotbutton;
	JButton eightbutton,fivebutton,twobutton,zerobutton;
	JButton ninebutton,sixbutton,threebutton,equalbutton;
	JButton multibutton,addbutton,divbutton,subbutton,clrbutton;
	
	public Calculator() {
		
		
		
		jf=new JFrame("TEKSPY CALCULATOR");
		jf.setLayout(null);
		jf.setBackground(Color.BLUE);
		
		jf.setSize(600, 600);
		jf.setLocation(600, 300);
		
		
		displaylabel=new JLabel();
		displaylabel.setBounds(30, 20, 540, 40);
		displaylabel.setBackground(Color.black);
		displaylabel.setOpaque(true);
		displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displaylabel.setForeground(Color.white);
		jf.add(displaylabel);
		
		sevenbutton=new JButton("7");
		sevenbutton.setBounds(30, 130, 80, 80);
		sevenbutton.addActionListener(this);
		sevenbutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		sevenbutton.setBackground(Color.black);
		sevenbutton.setForeground(Color.white);
		jf.add(sevenbutton);
		
		
		eightbutton=new JButton("8");
		eightbutton.setBounds(130, 130, 80, 80);
		eightbutton.addActionListener(this);
		eightbutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		eightbutton.setBackground(Color.black);
		eightbutton.setForeground(Color.white);
		jf.add(eightbutton);
		
		ninebutton=new JButton("9");
		ninebutton.setBounds(230, 130, 80, 80);
		ninebutton.addActionListener(this);
		ninebutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		ninebutton.setBackground(Color.black);
		ninebutton.setForeground(Color.white);
		jf.add(ninebutton);
		
		fourbutton=new JButton("4");
		fourbutton.setBounds(30, 230, 80, 80);
		fourbutton.addActionListener(this);
		fourbutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		fourbutton.setBackground(Color.black);
		fourbutton.setForeground(Color.white);
		jf.add(fourbutton);
		
		fivebutton=new JButton("5");
		fivebutton.setBounds(130, 230, 80, 80);
		fivebutton.addActionListener(this);
		fivebutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		fivebutton.setBackground(Color.black);
		fivebutton.setForeground(Color.white);
		jf.add(fivebutton);
		
		sixbutton=new JButton("6");
		sixbutton.setBounds(230, 230, 80, 80);
		sixbutton.addActionListener(this);
		sixbutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		sixbutton.setBackground(Color.black);
		sixbutton.setForeground(Color.white);
		jf.add(sixbutton);
		
		
		onebutton=new JButton("1");
		onebutton.setBounds(30, 330, 80, 80);
		onebutton.addActionListener(this);
		onebutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		onebutton.setBackground(Color.black);
		onebutton.setForeground(Color.white);
		jf.add(onebutton);
		
		twobutton=new JButton("2");
		twobutton.setBounds(130, 330, 80, 80);
		twobutton.addActionListener(this);
		twobutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		twobutton.setBackground(Color.black);
		twobutton.setForeground(Color.white);
		jf.add(twobutton);
		
		threebutton=new JButton("3");
		threebutton.setBounds(230, 330, 80, 80);
		threebutton.addActionListener(this);
		threebutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		threebutton.setBackground(Color.black);
		threebutton.setForeground(Color.white);
		jf.add(threebutton);
		
		dotbutton=new JButton(".");
		dotbutton.setBounds(30, 430, 80, 80);
		dotbutton.addActionListener(this);
		dotbutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		dotbutton.setBackground(Color.black);
		dotbutton.setForeground(Color.white);
		jf.add(dotbutton);
		
		zerobutton=new JButton("0");
		zerobutton.setBounds(130, 430, 80, 80);
		zerobutton.addActionListener(this);
		zerobutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		zerobutton.setBackground(Color.black);
		zerobutton.setForeground(Color.white);
		jf.add(zerobutton);
		
		equalbutton=new JButton("=");
		equalbutton.setBounds(230, 430, 80, 80);
		equalbutton.addActionListener(this);
		equalbutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		equalbutton.setBackground(Color.black);
		equalbutton.setForeground(Color.white);
		jf.add(equalbutton);
		
		
		divbutton=new JButton("/");
		divbutton.setBounds(330, 130, 80, 80);
		divbutton.addActionListener(this);
		divbutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		divbutton.setBackground(Color.black);
		divbutton.setForeground(Color.white);
		jf.add(divbutton);
		
		multibutton=new JButton("*");
		multibutton.setBounds(330, 230, 80, 80);
		multibutton.addActionListener(this);
		multibutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		multibutton.setBackground(Color.black);
		multibutton.setForeground(Color.white);
		jf.add(multibutton);
		
		subbutton=new JButton("-");
		subbutton.setBounds(330, 330, 80, 80);
		subbutton.addActionListener(this);
		subbutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		subbutton.setBackground(Color.black);
		subbutton.setForeground(Color.white);
		jf.add(subbutton);
		
		addbutton=new JButton("+");
		addbutton.setBounds(330, 430, 80, 80);
		addbutton.addActionListener(this);
		addbutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		addbutton.setBackground(Color.black);
		addbutton.setForeground(Color.white);
		jf.add(addbutton);
		
		clrbutton=new JButton("C");
		clrbutton.setBounds(430, 430, 80, 80);
		clrbutton.addActionListener(this);
		clrbutton.setFont(new Font("ARIAL",Font.PLAIN , 40));
		clrbutton.setBackground(Color.black);
		clrbutton.setForeground(Color.white);
		jf.add(clrbutton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Calculator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==sevenbutton) {
			if (isOperatorClicked) {
				displaylabel.setText("7");
				isOperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"7");
			}
			
		}else if(e.getSource()==eightbutton){
			if (isOperatorClicked) {
				displaylabel.setText("8");
				isOperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"8");
			}
			
			}else if (e.getSource()==ninebutton) {
				if (isOperatorClicked) {
					displaylabel.setText("9");
					isOperatorClicked=false;
				}else {
					displaylabel.setText(displaylabel.getText()+"9");
				}
				
				}else if (e.getSource()==fourbutton) {
					if (isOperatorClicked) {
						displaylabel.setText("4");
						isOperatorClicked=false;
					}else {
					displaylabel.setText(displaylabel.getText()+"4");
					}
					
					}else if (e.getSource()==fivebutton) {
						if (isOperatorClicked) {
							displaylabel.setText("5");
							isOperatorClicked=false;
						}else {
						displaylabel.setText(displaylabel.getText()+"5");
						}
				
						}else if (e.getSource()==sixbutton) {
							if (isOperatorClicked) {
								displaylabel.setText("6");
								isOperatorClicked=false;
							}else {
							displaylabel.setText(displaylabel.getText()+"6");
							}
							
		}else if (e.getSource()==onebutton) {
			if (isOperatorClicked) {
				displaylabel.setText("1");
				isOperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"1");
			}
					
		}else if (e.getSource()==twobutton) {
			if (isOperatorClicked) {
				displaylabel.setText("2");
				isOperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"2");
			}
			
		}else if (e.getSource()==threebutton) {
			if (isOperatorClicked) {
				displaylabel.setText("3");
				isOperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"3");
			}
			
		}else if (e.getSource()==dotbutton) {
			if (isOperatorClicked) {
				displaylabel.setText(",");
				isOperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+".");
		}
		}else if (e.getSource()==zerobutton) {
			if (isOperatorClicked) {
				displaylabel.setText("0");
				isOperatorClicked=false;
			}else {
			displaylabel.setText(displaylabel.getText()+"0");
			}
			
		}else if (e.getSource()==equalbutton) {
			 newval=displaylabel.getText();
			 
			  oldvalf=Float.parseFloat(oldval);
			  newvalf=Float.parseFloat(newval);
			 
			  
			  
			  
			
			
			
		}else if(e.getSource()==multibutton) {
			oldval=displaylabel.getText();
			isOperatorClicked=true;
			
			 float result=oldvalf*newvalf;
			  displaylabel.setText(result+"");
			
		}else if (e.getSource()==divbutton) {
			oldval=displaylabel.getText();
			isOperatorClicked=true;
			
			 float result=oldvalf/newvalf;
			  displaylabel.setText(result+"");
			
			
		}else if (e.getSource()==addbutton) {
			oldval=displaylabel.getText();
			isOperatorClicked=true;
			
		}else if (e.getSource()==subbutton) {
			oldval=displaylabel.getText();
			isOperatorClicked=true;
			
		}else if (e.getSource()==addbutton) {
			oldval=displaylabel.getText();
			isOperatorClicked=true;
			
		}else if (e.getSource()==clrbutton) {
			displaylabel.setText("");
		}
		
		
		
		
	}
}
