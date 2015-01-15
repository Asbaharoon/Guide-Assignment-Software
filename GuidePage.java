import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class GuidePage {
	private JFrame GuideWindow;
	private JPanel GuidePanel;
	private ArrayList<ArrayList<ArrayList<String>>> allGuides;
	private ArrayList<ArrayList<String>> Preps;
	private ArrayList<ArrayList<String>> Lowers;
	private ArrayList<ArrayList<String>> Uppers;
	private ArrayList<ArrayList<String>> Seniors;
	private JButton guideButton;
	private String Grade;
	private int index;
	private GridLayout[] guideLayout;

	public void construct(){
		GuideWindow = new JFrame("Guide Window");
		
		JPanel topGuidePanel = new JPanel();
		topGuidePanel.setPreferredSize(new Dimension(1400,50));
		GuideWindow.add(topGuidePanel, BorderLayout.NORTH);
		
		JLabel topLabel = new JLabel("Guide Window");
		topLabel.setFont(new Font("Serif", Font.PLAIN, 30));
		Font font = topLabel.getFont();
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		topLabel.setFont(font.deriveFont(attributes));
		topGuidePanel.add(topLabel, BorderLayout.CENTER);
		
		JPanel bottomGuidePanel = new JPanel();
		bottomGuidePanel.setPreferredSize(new Dimension(1400, 900));
		GuideWindow.add(bottomGuidePanel, BorderLayout.SOUTH);
		
		BoxLayout xbottomGuidePanel = new BoxLayout(bottomGuidePanel, BoxLayout.X_AXIS);
		
		JScrollPane scroll;
		scroll = new JScrollPane(bottomGuidePanel);
		scroll.setPreferredSize(new Dimension(1400,760));
		GuideWindow.add(scroll);
		
		JPanel[] yearPanel = new JPanel[4];
		BoxLayout[] yYearPanel = new BoxLayout[4];
		JPanel[] buttonPanel = new JPanel[4];
		GridLayout[] guideLayout = new GridLayout[4];
		
		for(int a = 0; a < 4; a++){
			yearPanel[a] = new JPanel();
			yearPanel[a].setPreferredSize(new Dimension(342, 900));
			yearPanel[a].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			yYearPanel[a] = new BoxLayout(yearPanel[a], BoxLayout.Y_AXIS);
			buttonPanel[a] = new JPanel();
			buttonPanel[a].setPreferredSize(new Dimension(335,890));
			guideLayout[a] = new GridLayout(0,3);
			bottomGuidePanel.add(yearPanel[a]);
		}
		
		JPanel prepLabelPanel = new JPanel();
		prepLabelPanel.setPreferredSize(new Dimension(335, 40));
		prepLabelPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JLabel prep = new JLabel("Prep");
		prep.setFont(new Font("Serif", Font.PLAIN, 25));
		Font prepfont = prep.getFont();
		Map prepattributes = prepfont.getAttributes();
		prepattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		prep.setFont(prepfont.deriveFont(prepattributes));
		prepLabelPanel.add(prep, BorderLayout.CENTER);
		yearPanel[0].add(prepLabelPanel);
		yearPanel[0].add(buttonPanel[0]);
		
		JPanel lowerLabelPanel = new JPanel();
		lowerLabelPanel.setPreferredSize(new Dimension(335, 40));
		lowerLabelPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JLabel lower = new JLabel("Lower");
		lower.setFont(new Font("Serif", Font.PLAIN, 25));
		Font lowerfont = lower.getFont();
		Map lowerattributes = lowerfont.getAttributes();
		lowerattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lower.setFont(lowerfont.deriveFont(lowerattributes));
		lowerLabelPanel.add(lower, BorderLayout.CENTER);
		yearPanel[1].add(lowerLabelPanel);
		yearPanel[1].add(buttonPanel[1]);
		
		JPanel upperLabelPanel = new JPanel();
		upperLabelPanel.setPreferredSize(new Dimension(335, 40));
		upperLabelPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JLabel upper = new JLabel("Upper");
		upper.setFont(new Font("Serif", Font.PLAIN, 25));
		Font upperfont = upper.getFont();
		Map upperattributes = upperfont.getAttributes();
		upperattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		upper.setFont(upperfont.deriveFont(upperattributes));
		upperLabelPanel.add(upper, BorderLayout.CENTER);
		yearPanel[2].add(upperLabelPanel);
		yearPanel[2].add(buttonPanel[2]);
		
		JPanel seniorLabelPanel = new JPanel();
		seniorLabelPanel.setPreferredSize(new Dimension(335, 40));
		seniorLabelPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JLabel senior = new JLabel("Senior");
		senior.setFont(new Font("Serif", Font.PLAIN, 25));
		Font seniorfont = senior.getFont();
		Map seniorattributes = seniorfont.getAttributes();
		seniorattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		senior.setFont(seniorfont.deriveFont(seniorattributes));
		seniorLabelPanel.add(senior, BorderLayout.CENTER);
		yearPanel[3].add(seniorLabelPanel);
		yearPanel[3].add(buttonPanel[3]);
		
		GuideFileData guidefiledata = new GuideFileData();
		allGuides = guidefiledata.Read();
		
		Preps = allGuides.get(0);
		Lowers = allGuides.get(1);
		Uppers = allGuides.get(2);
		Seniors = allGuides.get(3);
		
		// Prep Buttons
		JButton[] prepButton = new JButton[Preps.size()];
		
		for(int r = 0; r < Preps.size(); r++){
		prepButton[r] = new JButton();
		prepButton[r].setPreferredSize(new Dimension(106,25));
		prepButton[r].setText(Preps.get(r).get(0));
		buttonPanel[0].add(prepButton[r]);
		}
		
		JButton[] lowerButton = new JButton[Lowers.size()];
		
		for(int r = 0; r < Lowers.size(); r++){
		lowerButton[r] = new JButton();
		lowerButton[r].setPreferredSize(new Dimension(106,25));
		lowerButton[r].setText(Lowers.get(r).get(0));
		buttonPanel[1].add(lowerButton[r]);
		}
		
		JButton[] upperButton = new JButton[Uppers.size()];
		
		for(int r = 0; r < Uppers.size(); r++){
		upperButton[r] = new JButton();
		upperButton[r].setPreferredSize(new Dimension(106,25));
		upperButton[r].setText(Uppers.get(r).get(0));
		buttonPanel[2].add(upperButton[r]);
		}
		
		JButton[] seniorButton = new JButton[Seniors.size()];
		
		for(int r = 0; r < Seniors.size(); r++){
		seniorButton[r] = new JButton();
		seniorButton[r].setPreferredSize(new Dimension(106,25));
		seniorButton[r].setText(Seniors.get(r).get(0));
		buttonPanel[3].add(seniorButton[r]);
		}
		
		class GuideListener implements ActionListener{
			public void actionPerformed(ActionEvent f){
				guideButton = (JButton)f.getSource();
				String buttonText = guideButton.getText();
				
				// find applicant with corresponding name
				
				for(int a = 0; a < 4; a++){
					if(a == 0){
						for(int b = 0; b < Preps.size(); b++){
								if(Preps.get(b).get(0).equals(buttonText)){
									Grade = "Prep";
									index = b;
								}
							}
						}
					else if(a == 1){
						for(int b = 0; b < Lowers.size(); b++){
								if(Lowers.get(b).get(0).equals(buttonText)){
									Grade = "Lower";
									index = b;
								}
							}
						}
					else if(a == 2){
						for(int b = 0; b < Uppers.size(); b++){
							if(Uppers.get(b).get(0).equals(buttonText)){
									Grade = "Upper";
									index = b;
								}
							}
						}
					else if(a == 3){
						for(int b = 0; b < Seniors.size(); b++){
								if(Seniors.get(b).get(0).equals(buttonText)){
									Grade = "Senior";
									index = b;
								}
							}
						}
					}
				Guide guide = new Guide();
				guide.construct(Grade, index);
			}
		}
		GuideListener guidelistener = new GuideListener();
		
		for(int c = 0; c < Preps.size(); c++){
			prepButton[c].addActionListener(guidelistener);
		}
		for(int c = 0; c < Lowers.size(); c++){
			lowerButton[c].addActionListener(guidelistener);
		}
		for(int c = 0; c < Uppers.size(); c++){
			upperButton[c].addActionListener(guidelistener);
		}
		for(int c = 0; c < Seniors.size(); c++){
			seniorButton[c].addActionListener(guidelistener);
		}
	
		
		GuideWindow.setSize(1420,835);
		GuideWindow.setResizable(false);
		GuideWindow.setVisible(true);
	}
}
