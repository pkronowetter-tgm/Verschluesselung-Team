import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import keilholzkronowetter.KeywordCipher;
import keilholzkronowetter.ShiftCipher;
import keilholzkronowetter.SubstitutionCipher;
import keilholzkronowetter.TranspositionCipher;


public class GUI extends JFrame{

	private Container tabpanel;
	private JPanel tabT;
	private JPanel tabK;
	private JPanel tabSub;
	private JPanel tabShift;
	
	private JTextArea textT1;
	private JTextArea textT2;
	private JTextArea textK1;
	private JTextArea textK2;
	private JTextArea textSub1;
	private JTextArea textSub2;
	private JTextArea textShift1;
	private JTextArea textShift2;
	
	private JButton t1;
	private JButton t2;
	private JButton k1;
	private JButton k2;
	private JButton sub1;
	private JButton sub2;
	private JButton shift1;
	private JButton shift2;
	
	private JTextField t;
	private JTextField k;
	private JTextField sub;
	private JTextField shift;
	
	private JLabel tl1;
	private JLabel tl2;
	private JLabel tl3;
	
	private JLabel kl1;
	private JLabel kl2;
	private JLabel kl3;
	
	private JLabel subl1;
	private JLabel subl2;
	private JLabel subl3;
	
	private JLabel shiftl1;
	private JLabel shiftl2;
	private JLabel shiftl3;
	

	public GUI(){
		
		this.setSize(500,500);
		this.tabpanel = new JTabbedPane();
		this.setContentPane(tabpanel);
		
		this.tabT = new JPanel();
		this.tabK = new JPanel();
		this.tabSub = new JPanel();
		this.tabShift = new JPanel();
		
		this.textT1 = new JTextArea();
		this.textT2 = new JTextArea();
		this.textK1 = new JTextArea();
		this.textK2 = new JTextArea();
		this.textSub1 = new JTextArea();
		this.textSub2 = new JTextArea();
		this.textShift1 = new JTextArea();
		this.textShift2 = new JTextArea();
		
		this.t1 = new JButton("Verschlüsseln");
		this.t2 = new JButton("Entschlüsseln");
		this.k1 = new JButton("Verschlüsseln");
		this.k2 = new JButton("Entschlüsseln");
		this.sub1 = new JButton("Verschlüsseln");
		this.sub2 = new JButton("Entschlüsseln");
		this.shift1 = new JButton("Verschlüsseln");
		this.shift2 = new JButton("Entschlüsseln");
		
		
		
		this.tl1 = new JLabel("Entschlüsselter Text: ");
		this.tl2 = new JLabel("Level der Verschlüsselung: ");
		this.tl3 = new JLabel("Verschlüsselter Text: ");
		
		this.kl1 = new JLabel("Entschlüsselter Text");
		this.kl2 = new JLabel("Keyword: ");
		this.kl3 = new JLabel("Verschlüsselter Text: ");
		
		this.subl1 = new JLabel("Entschlüsselter Text");
		this.subl2 = new JLabel("Geheimalphabet: ");
		this.subl3 = new JLabel("Verschlüsselter Text: ");
		
		this.shiftl1 = new JLabel("Entschlüsselter Text");
		this.shiftl2 = new JLabel("Keyword: ");
		this.shiftl3 = new JLabel("Verschlüsselter Text: ");
		
		
		this.t = new JTextField();
		this.k = new JTextField();
		this.sub = new JTextField();
		this.shift = new JTextField();
		
		this.tabT.setLayout(new BoxLayout(tabT,BoxLayout.Y_AXIS));
		this.tabK.setLayout(new BoxLayout(tabK,BoxLayout.Y_AXIS));
		this.tabSub.setLayout(new BoxLayout(tabSub,BoxLayout.Y_AXIS));
		this.tabShift.setLayout(new BoxLayout(tabShift,BoxLayout.Y_AXIS));
		
		this.tabT.add(tl1);
		this.tabT.add(textT1);
		this.tabT.add(tl2);
		this.tabT.add(t);
		this.tabT.add(tl3);
		this.tabT.add(textT2);
		
		this.tabK.add(kl1);
		this.tabK.add(textK1);
		this.tabK.add(kl2);
		this.tabK.add(k);
		this.tabK.add(kl3);
		this.tabK.add(textK2);
		
		this.tabSub.add(subl1);
		this.tabSub.add(textSub1);
		this.tabSub.add(subl2);
		this.tabSub.add(sub);
		this.tabSub.add(subl3);
		this.tabSub.add(textSub2);
		
		this.tabShift.add(shiftl1);
		this.tabShift.add(textShift1);
		this.tabShift.add(shiftl2);
		this.tabShift.add(shift);
		this.tabShift.add(shiftl3);
		this.tabShift.add(textShift2);
		
		
		this.tabT.add(t1);
		this.tabT.add(t2);
		this.tabK.add(k1);
		this.tabK.add(k2);
		this.tabSub.add(sub1);
		this.tabSub.add(sub2);
		this.tabShift.add(shift1);
		this.tabShift.add(shift2);
		
		
		this.tabpanel.add(tabT,"TranspositionCipher");
		this.tabpanel.add(tabK,"KeywordCipher");
		this.tabpanel.add(tabSub,"SubstitutionCipher");
		this.tabpanel.add(tabShift,"ShiftCipher");
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		t1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = textT1.getText();
				TranspositionCipher c = new TranspositionCipher(Integer.parseInt(t.getText()));
				String erg = c.encrypt(text);
				textT2.setText(erg);
				
			}});
		
		t2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = textT2.getText();
				TranspositionCipher c = new TranspositionCipher(Integer.parseInt(t.getText()));
				String erg = c.decrypt(text);
				textT1.setText(erg);
				
			}});
		
		k1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = textK1.getText();
				KeywordCipher c = new KeywordCipher(k.getText());
				String erg = c.encrypt(text);
				textK2.setText(erg);
				
			}});
		
		k2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = textK2.getText();
				KeywordCipher c = new KeywordCipher(k.getText());
				String erg = c.decrypt(text);
				textK1.setText(erg);
				
			}});
		
		sub1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = textSub1.getText();
				SubstitutionCipher s = new SubstitutionCipher(sub.getText());
				String erg = s.encrypt(text);
				textSub2.setText(erg);
				
			}});
		
		sub2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = textSub2.getText();
				SubstitutionCipher s = new SubstitutionCipher(sub.getText());
				String erg = s.decrypt(text);
				textSub1.setText(erg);
				
			}});
		
		shift1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = textShift1.getText();
				ShiftCipher s = new ShiftCipher(Integer.parseInt(shift.getText()));
				String erg = s.encrypt(text);
				textShift2.setText(erg);
				
			}});
		
		shift2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String text = textShift2.getText();
				ShiftCipher s = new ShiftCipher(Integer.parseInt(shift.getText()));
				String erg = s.decrypt(text);
				textShift1.setText(erg);
				
			}});
		
	}

}
