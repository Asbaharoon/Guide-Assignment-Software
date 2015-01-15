import java.awt.*;
import java.awt.font.TextAttribute;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.*;


public class MatchStats {

	private JFrame matchFrame;
	
	public void construct(){
		matchFrame = new JFrame("Match Statistics");
		
		JPanel window = new JPanel();
		window.setPreferredSize(new Dimension(1100,800));
		matchFrame.add(window);
		
		BoxLayout yWindow = new BoxLayout(window, BoxLayout.Y_AXIS);
		
		
		JPanel weekPanel = new JPanel();
		weekPanel.setPreferredSize(new Dimension(1100,50));
		window.add(weekPanel);
		
		ArrayList<ArrayList<String>> both = new ArrayList<ArrayList<String>>();
		
		MatchFileData matchfiledata = new MatchFileData();
		both = matchfiledata.Read();
		
		ArrayList<String> percents = new ArrayList<String>(both.get(0));
		ArrayList<String> parameters = new ArrayList<String>(both.get(1));
		
		JLabel week = new JLabel("Week of: " + percents.get(0));
		week.setFont(new Font("Serif", Font.PLAIN, 30));
		Font font1 = week.getFont();
		Map attributes1 = font1.getAttributes();
		attributes1.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		week.setFont(font1.deriveFont(attributes1));
		weekPanel.add(week, BorderLayout.CENTER);
		
		JPanel paramHead = new JPanel();
		paramHead.setPreferredSize(new Dimension(1100,30));
		window.add(paramHead);
		JLabel param = new JLabel("Parameters Used");
		param.setFont(new Font("Serif", Font.PLAIN, 20));
		Font paramfont = param.getFont();
		Map paramattributes = paramfont.getAttributes();
		paramattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		param.setFont(paramfont.deriveFont(paramattributes));
		paramHead.add(param, BorderLayout.CENTER);
		
		JPanel paramNums = new JPanel();
		paramNums.setPreferredSize(new Dimension(1100,75));
		window.add(paramNums);
		BoxLayout xparamNums = new BoxLayout(paramNums, BoxLayout.X_AXIS);
		JPanel[] paramBox = new JPanel[9];
		BoxLayout[] yParamBox = new BoxLayout[9];
		
		for(int r = 0; r < 9; r++){
			paramBox[r] = new JPanel();
			paramBox[r].setPreferredSize(new Dimension(115,75));
			yParamBox[r] = new BoxLayout(paramBox[r], BoxLayout.Y_AXIS);
			paramNums.add(paramBox[r]);
		}
		
		JLabel gender = new JLabel("Gender");
		gender.setPreferredSize(new Dimension(115,45));
		gender.setHorizontalAlignment(SwingConstants.CENTER);
		Font genderfont = gender.getFont();
		Map genderattributes = genderfont.getAttributes();
		genderattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		gender.setFont(genderfont.deriveFont(genderattributes));
		paramBox[0].add(gender);
		
		
		JLabel grade = new JLabel("Grade");
		grade.setPreferredSize(new Dimension(115,45));
		grade.setHorizontalAlignment(SwingConstants.CENTER);
		Font gradefont = grade.getFont();
		Map gradeattributes = gradefont.getAttributes();
		gradeattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		grade.setFont(gradefont.deriveFont(gradeattributes));
		paramBox[1].add(grade);
		
		JLabel residence = new JLabel("Residence");
		residence.setPreferredSize(new Dimension(115,45));
		residence.setHorizontalAlignment(SwingConstants.CENTER);
		Font residencefont = residence.getFont();
		Map residenceattributes = residencefont.getAttributes();
		residenceattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		residence.setFont(residencefont.deriveFont(residenceattributes));
		paramBox[2].add(residence);
		
		JLabel academic = new JLabel("Academic Interest");
		academic.setPreferredSize(new Dimension(115,45));
		academic.setHorizontalAlignment(SwingConstants.CENTER);
		Font academicfont = academic.getFont();
		Map academicattributes = academicfont.getAttributes();
		academicattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		academic.setFont(academicfont.deriveFont(academicattributes));
		paramBox[3].add(academic);
		
		JLabel fall = new JLabel("Fall Sport");
		fall.setPreferredSize(new Dimension(115,45));
		fall.setHorizontalAlignment(SwingConstants.CENTER);
		Font fallfont = fall.getFont();
		Map fallattributes = fallfont.getAttributes();
		fallattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		fall.setFont(fallfont.deriveFont(fallattributes));
		paramBox[4].add(fall);
		
		JLabel winter = new JLabel("Winter Sport");
		winter.setPreferredSize(new Dimension(115,45));
		winter.setHorizontalAlignment(SwingConstants.CENTER);
		Font winterfont = winter.getFont();
		Map winterattributes = winterfont.getAttributes();
		winterattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		winter.setFont(winterfont.deriveFont(winterattributes));
		paramBox[5].add(winter);
		
		JLabel spring = new JLabel("Spring Sport");
		spring.setPreferredSize(new Dimension(115,45));
		spring.setHorizontalAlignment(SwingConstants.CENTER);
		Font springfont = spring.getFont();
		Map springattributes = springfont.getAttributes();
		springattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		spring.setFont(springfont.deriveFont(springattributes));
		paramBox[6].add(spring);
		
		JLabel club1 = new JLabel("Club 1");
		club1.setPreferredSize(new Dimension(115,45));
		club1.setHorizontalAlignment(SwingConstants.CENTER);
		Font club1font = club1.getFont();
		Map club1attributes = club1font.getAttributes();
		club1attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		club1.setFont(club1font.deriveFont(club1attributes));
		paramBox[7].add(club1);
		
		JLabel club2 = new JLabel("Club 2");
		club2.setPreferredSize(new Dimension(115,45));
		club2.setHorizontalAlignment(SwingConstants.CENTER);
		Font club2font = club2.getFont();
		Map club2attributes = club2font.getAttributes();
		club2attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		club2.setFont(club2font.deriveFont(club2attributes));
		paramBox[8].add(club2);
		
		JLabel[] labelPerc = new JLabel[9];
		
		for(int b = 0; b < 9; b++){
			labelPerc[b] = new JLabel();
			labelPerc[b].setPreferredSize(new Dimension(115,20));
			labelPerc[b].setText(parameters.get(b));
			labelPerc[b].setHorizontalAlignment(SwingConstants.CENTER);
			paramBox[b].add(labelPerc[b]);
		}
		
		JPanel spacer = new JPanel();
		spacer.setPreferredSize(new Dimension(1100, 30));
		window.add(spacer);
		
		JPanel percentPanel = new JPanel();
		percentPanel.setPreferredSize(new Dimension(1100,570));
		
		JPanel topPercentPanel = new JPanel();
		topPercentPanel.setPreferredSize(new Dimension(1100,30));
		JLabel topPercentHeading = new JLabel("Matching Statistics");
		topPercentHeading.setFont(new Font("Serif", Font.PLAIN, 20));
		Font topfont = topPercentHeading.getFont();
		Map topattributes = topfont.getAttributes();
		topattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		topPercentHeading.setFont(topfont.deriveFont(topattributes));
		topPercentPanel.add(topPercentHeading, BorderLayout.CENTER);
		percentPanel.add(topPercentPanel, BorderLayout.NORTH);
		
		JPanel bottomPercentPanel = new JPanel();
		bottomPercentPanel.setPreferredSize(new Dimension(1100,530));
		JPanel yPercentPanel = new JPanel();
		yPercentPanel.setPreferredSize(new Dimension(300,550));
		BoxLayout y = new BoxLayout(yPercentPanel, BoxLayout.Y_AXIS);
		bottomPercentPanel.add(yPercentPanel, BorderLayout.CENTER);
		JPanel[] percentBox = new JPanel[10];
		BoxLayout[] xPercent = new BoxLayout[10];
		
		for(int c = 0; c < 10; c++){
			percentBox[c] = new JPanel();
			percentBox[c].setPreferredSize(new Dimension(296,30));
			xPercent[c] = new BoxLayout(percentBox[c], BoxLayout.X_AXIS);
		}
		
		JLabel genderPerc = new JLabel("Gender:");
		genderPerc.setPreferredSize(new Dimension(230,30));
		percentBox[0].add(genderPerc);
		JLabel gradePerc = new JLabel("Grade:");
		gradePerc.setPreferredSize(new Dimension(230,30));
		percentBox[1].add(gradePerc);
		JLabel residencePerc = new JLabel("Residence:");
		residencePerc.setPreferredSize(new Dimension(230,30));
		percentBox[2].add(residencePerc);
		JLabel academicPerc = new JLabel("Academic Interest:");
		academicPerc.setPreferredSize(new Dimension(230,30));
		percentBox[3].add(academicPerc);
		JLabel fallPerc = new JLabel("Fall Sport:");
		fallPerc.setPreferredSize(new Dimension(230,30));
		percentBox[4].add(fallPerc);
		JLabel winterPerc = new JLabel("Winter Sport:");
		winterPerc.setPreferredSize(new Dimension(230,30));
		percentBox[5].add(winterPerc);
		JLabel springPerc = new JLabel("Spring Sport:");
		springPerc.setPreferredSize(new Dimension(230,30));
		percentBox[6].add(springPerc);
		JLabel club1Perc = new JLabel("Club 1:");
		club1Perc.setPreferredSize(new Dimension(230,30));
		percentBox[7].add(club1Perc);
		JLabel club2Perc = new JLabel("Club 2:");
		club2Perc.setPreferredSize(new Dimension(230,30));
		percentBox[8].add(club2Perc);
		JLabel total = new JLabel("Matches Per Visitor:");
		total.setPreferredSize(new Dimension(230,30));
		Font newLabelFont=new Font(total.getFont().getName(),Font.BOLD,total.getFont().getSize());  
		total.setFont(newLabelFont);  
		percentBox[9].add(total);
		
		
		for(int d = 0; d < 10; d++){
			yPercentPanel.add(percentBox[d]);
		}
		
		JLabel gen = new JLabel();
		gen.setPreferredSize(new Dimension(50,30));
		gen.setText(percents.get(1) + "%");
		percentBox[0].add(gen);
		
		JLabel grad = new JLabel();
		grad.setPreferredSize(new Dimension(50,30));
		grad.setText(percents.get(2) + "%");
		percentBox[1].add(grad);
		
		JLabel res = new JLabel();
		res.setPreferredSize(new Dimension(50,30));
		res.setText(percents.get(9) + "%");
		percentBox[2].add(res);
		
		JLabel acad = new JLabel();
		acad.setPreferredSize(new Dimension(50,30));
		acad.setText(percents.get(3) + "%");
		percentBox[3].add(acad);
		
		JLabel fal = new JLabel();
		fal.setPreferredSize(new Dimension(50,30));
		fal.setText(percents.get(4) + "%");
		percentBox[4].add(fal);
		
		JLabel win = new JLabel();
		win.setPreferredSize(new Dimension(50,30));
		win.setText(percents.get(5) + "%");
		percentBox[5].add(win);
		
		JLabel spr = new JLabel();
		spr.setPreferredSize(new Dimension(50,30));
		spr.setText(percents.get(6) + "%");
		percentBox[6].add(spr);
		
		JLabel cl1 = new JLabel();
		cl1.setPreferredSize(new Dimension(50,30));
		cl1.setText(percents.get(7) + "%");
		percentBox[7].add(cl1);
		
		JLabel cl2 = new JLabel();
		cl2.setPreferredSize(new Dimension(50,30));
		cl2.setText(percents.get(8) + "%");
		percentBox[8].add(cl2);
		
		JLabel totalLabel = new JLabel();
		totalLabel.setPreferredSize(new Dimension(50,30));
		totalLabel.setText(percents.get(10));
		Font totalLabelFont=new Font(totalLabel.getFont().getName(),Font.BOLD,totalLabel.getFont().getSize());  
		totalLabel.setFont(totalLabelFont);  
		percentBox[9].add(totalLabel);
		
		percentPanel.add(bottomPercentPanel, BorderLayout.SOUTH);
		
		window.add(percentPanel);
		
		
		matchFrame.setSize(1100,800);
		matchFrame.setResizable(false);
		matchFrame.setVisible(true);
		
	}
	
}
