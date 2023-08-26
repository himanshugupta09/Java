import javax.swing.*;

class LabelExample
{
	public static void main(String args[])
	{
		JFrame f = new JFrame("Label Example");
		JLabel l1,l2;
		l1 = new JLabel("First");
		l1.setBounds(50,50,100,30);
		l2 = new JLabel("Second");
		l2.setBounds(50,100,100,30);
		f.add(l1);
		f.add(l2);
		f.setSize(30,30);
		f.setLayout(null);
		f.setVisible(true);
	}
}