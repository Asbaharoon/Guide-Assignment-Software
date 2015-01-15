import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.*;

public class Parameters {

	private JFrame ParameterFrame;
	private BoxLayout yPanel;
	private JPanel HeadingPanel;
	private JPanel weightPanel;
	private JLabel parameterHeading;
	private JPanel middlePanel;
	private JPanel topPanel;
	private JPanel[] fieldPanels;
	private JLabel[] headings;
	private JTextField[] numText;
	private BoxLayout[] xPanel;
	private JButton save;
	
	public void construct(){
		ParameterFrame = new JFrame("Parameter Weighting");
		
		HeadingPanel = new JPanel();
		HeadingPanel.setPreferredSize(new Dimension(600, 50));
		
		parameterHeading = new JLabel("Parameter Weighting");
		parameterHeading.setFont(new Font("Serif", Font.PLAIN, 30));
		Font font = parameterHeading.getFont();
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		parameterHeading.setFont(font.deriveFont(attributes));
		
		HeadingPanel.add(parameterHeading, BorderLayout.CENTER);
		ParameterFrame.add(HeadingPanel, BorderLayout.NORTH);
		
		weightPanel = new JPanel();
		weightPanel.setPreferredSize(new Dimension(600,340));
		
		middlePanel = new JPanel();
		middlePanel.setPreferredSize(new Dimension(300, 340));
		
		topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(300,400));
		
		middlePanel.add(topPanel, BorderLayout.NORTH);
		weightPanel.add(middlePanel, BorderLayout.CENTER);
		
		yPanel = new BoxLayout(topPanel, BoxLayout.Y_AXIS);
		
		fieldPanels = new JPanel[10];
		headings = new JLabel[9];
		numText = new JTextField[9];
		xPanel = new BoxLayout[9];
		
		for(int a = 0; a < 9; a++){
			fieldPanels[a] = new JPanel();
			fieldPanels[a].setPreferredSize(new Dimension(290,25));
			headings[a] = new JLabel();
			headings[a].setPreferredSize(new Dimension(230,23));
			numText[a] = new JTextField();
			numText[a].setPreferredSize(new Dimension(50, 23));
			xPanel[a] = new BoxLayout(fieldPanels[a], BoxLayout.X_AXIS);
			fieldPanels[a].add(headings[a]);
			fieldPanels[a].add(numText[a]);
			topPanel.add(fieldPanels[a]);
		}
		
		headings[0].setText("Gender:"); // 2
		headings[1].setText("Grade:"); // 4
		headings[2].setText("Residence:"); // 2
		headings[3].setText("Academic Interest:"); // 5 
		headings[4].setText("Fall Sport:"); // 6
		headings[5].setText("Winter Sport:"); // 6
		headings[6].setText("Spring Sport:"); // 9
		headings[7].setText("Club 1:"); // 7
		headings[8].setText("Club 2:"); // 7
		
		fieldPanels[9] = new JPanel();
		fieldPanels[9].setPreferredSize(new Dimension(290,40));
		save = new JButton("Save");
		fieldPanels[9].add(save, BorderLayout.CENTER);
		topPanel.add(fieldPanels[9]);
		
		class BtnListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
				try{
				File Parameters = new File("ParameterWeights.txt");
				FileWriter Parameterwriter = new FileWriter(Parameters, false);
				PrintWriter ParameterPW = new PrintWriter(Parameterwriter);
				
				for(int c = 0; c < 9; c++){
					ParameterPW.print(numText[c].getText() + " ");
				}
				ParameterPW.close();
				}
				catch(IOException l){
					System.out.println(l.getMessage());
				}
			}
		}
		
		BtnListener getWeights = new BtnListener();
		save.addActionListener(getWeights);
		
		ParameterFrame.add(weightPanel, BorderLayout.SOUTH);
		
		ParameterFrame.setSize(600,400);
		ParameterFrame.setResizable(false);
		ParameterFrame.setVisible(true);
	}
}
