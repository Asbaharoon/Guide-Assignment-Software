import javax.swing.*;

import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;

public class GuideReplacement {

	private JFrame replacementFrame;
	private JPanel topPanel;
	private JPanel bottomPanel;
	private VisitorObject[] visitors;
	
	public void construct(String visitorName){
		
		replacementFrame = new JFrame("Replacement Guide");
		
		JPanel window = new JPanel();
		window.setPreferredSize(new Dimension(500,450));
		replacementFrame.add(window);
		
		JPanel topHeadingPanel = new JPanel();
		topHeadingPanel.setPreferredSize(new Dimension(500,50));
		
		JLabel topHeading = new JLabel("Replacement Guides");
		topHeading.setFont(new Font("Serif", Font.PLAIN, 30));
		Font topfont = topHeading.getFont();
		Map topattributes = topfont.getAttributes();
		topattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		topHeading.setFont(topfont.deriveFont(topattributes));
		topHeadingPanel.add(topHeading, BorderLayout.CENTER);
		window.add(topHeadingPanel, BorderLayout.NORTH);
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(500, 395));
		window.add(bottomPanel, BorderLayout.SOUTH);
		
		BoxLayout xBottom = new BoxLayout(bottomPanel, BoxLayout.X_AXIS);
		
		
		JPanel left = new JPanel();
		left.setPreferredSize(new Dimension(245,390));
		bottomPanel.add(left);
		BoxLayout yLeft = new BoxLayout(left, BoxLayout.Y_AXIS);
		
		JPanel topLeft = new JPanel();
		topLeft.setPreferredSize(new Dimension(245,30));
		JLabel leftHead = new JLabel("Assigned Guides");
		leftHead.setFont(new Font("Serif", Font.PLAIN, 20));
		Font leftfont = leftHead.getFont();
		Map leftattributes = leftfont.getAttributes();
		leftattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		leftHead.setFont(leftfont.deriveFont(leftattributes));
		topLeft.add(leftHead, BorderLayout.CENTER);
		left.add(topLeft, BorderLayout.NORTH);
		
		JPanel leftNamePanel = new JPanel();
		leftNamePanel.setPreferredSize(new Dimension(240, 350));
		JLabel[] leftNameLabel = new JLabel[20];
		for(int a = 0; a < 20; a++){
			leftNameLabel[a] = new JLabel();
			leftNameLabel[a].setPreferredSize(new Dimension(230, 25));
			leftNamePanel.add(leftNameLabel[a]);
		}
		BoxLayout leftNameBox = new BoxLayout(leftNamePanel, BoxLayout.Y_AXIS);
		
		String guide1 = "Upper_12  (27)";
		leftNameLabel[0].setText(guide1);
		leftNameLabel[0].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide2 = "Upper_3  (24)";
		leftNameLabel[1].setText(guide2);
		leftNameLabel[1].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide3 = "Upper_7  (22)";
		leftNameLabel[2].setText(guide3);
		leftNameLabel[2].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide4 = "Upper_19  (16)";
		leftNameLabel[3].setText(guide4);
		leftNameLabel[3].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide5 = "Upper_27  (16)";
		leftNameLabel[4].setText(guide5);
		leftNameLabel[4].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide6 = "Lower_33  (15)";
		leftNameLabel[5].setText(guide6);
		leftNameLabel[5].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide7 = "Senior_41  (13)";
		leftNameLabel[6].setText(guide7);
		leftNameLabel[6].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide8 = "Upper_21  (13)";
		leftNameLabel[7].setText(guide8);
		leftNameLabel[7].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide9 = "Upper_46  (10)";
		leftNameLabel[8].setText(guide9);
		leftNameLabel[8].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide10 = "Prep_37  (9)";
		leftNameLabel[9].setText(guide10);
		leftNameLabel[9].setHorizontalAlignment(SwingConstants.CENTER);
		
		left.add(leftNamePanel);
		
		JPanel right = new JPanel();
		right.setPreferredSize(new Dimension(245,390));
		bottomPanel.add(right);
		BoxLayout yRight = new BoxLayout(right, BoxLayout.Y_AXIS);
		
		JPanel topRight = new JPanel();
		topRight.setPreferredSize(new Dimension(245,30));
		JLabel RightHead = new JLabel("Unassigned Guides");
		RightHead.setFont(new Font("Serif", Font.PLAIN, 20));
		Font Rightfont = RightHead.getFont();
		Map Rightattributes = Rightfont.getAttributes();
		Rightattributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		RightHead.setFont(Rightfont.deriveFont(Rightattributes));
		topRight.add(RightHead, BorderLayout.CENTER);
		right.add(topRight, BorderLayout.NORTH);
		
		JPanel rightNamePanel = new JPanel();
		rightNamePanel.setPreferredSize(new Dimension(240, 350));
		JLabel[] rightNameLabel = new JLabel[20];
		for(int a = 0; a < 20; a++){
			rightNameLabel[a] = new JLabel();
			rightNameLabel[a].setPreferredSize(new Dimension(230, 25));
			rightNamePanel.add(rightNameLabel[a]);
		}
		BoxLayout rightNameBox = new BoxLayout(rightNamePanel, BoxLayout.Y_AXIS);
		
		String guide11 = "Upper_43  (21)";
		rightNameLabel[0].setText(guide11);
		rightNameLabel[0].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide12 = "Senior_22  (20)";
		rightNameLabel[1].setText(guide12);
		rightNameLabel[1].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide13 = "Lower_15  (17)";
		rightNameLabel[2].setText(guide13);
		rightNameLabel[2].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide14 = "Lower_29  (17)";
		rightNameLabel[3].setText(guide14);
		rightNameLabel[3].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide15 = "Prep_33  (14)";
		rightNameLabel[4].setText(guide15);
		rightNameLabel[4].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide16 = "Upper_36  (11)";
		rightNameLabel[5].setText(guide16);
		rightNameLabel[5].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide17 = "Prep_6  (10)";
		rightNameLabel[6].setText(guide17);
		rightNameLabel[6].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide18 = "Upper_49 (6)";
		rightNameLabel[7].setText(guide18);
		rightNameLabel[7].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide19 = "Prep_14  (6)";
		rightNameLabel[8].setText(guide19);
		rightNameLabel[8].setHorizontalAlignment(SwingConstants.CENTER);
		
		String guide20 = "Senior_1  (6)";
		rightNameLabel[9].setText(guide20);
		rightNameLabel[9].setHorizontalAlignment(SwingConstants.CENTER);
		
		right.add(rightNamePanel);
		
		replacementFrame.setSize(500,450);
		replacementFrame.setResizable(false);
		replacementFrame.setVisible(true);
		
		
	}
	
}
