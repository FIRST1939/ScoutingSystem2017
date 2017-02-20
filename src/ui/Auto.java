package ui;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import buildingBlocks.RobotNumber;
import buildingBlocks.RobotPanel;
import buildingBlocks.ScoreField;
import buildingBlocks.ScoreLabel;

/**
 * This class governs all the teleoperated interface and data.
 * @author Grayson Spidle
 *
 */
public class Auto extends RobotPanel {
	
	private static final long serialVersionUID = -8832379680749996395L;

	public Font nameFont = new Font("Tahoma", Font.BOLD, 15);
	public Font scoreLabelFont = new Font("Roboto", Font.PLAIN, 15);
	public Font scoreFieldFont = new Font("Roboto", Font.PLAIN, 15);
	
	public ScoreField lowGoalField;
	public ScoreField highGoalField;
	public ScoreField gearField;
	public ScoreField totalPointsField;
	public ScoreField blocksField;
	
	public ScoreField lowGoalAttempts;
	public ScoreField highGoalAttempts;
	public ScoreField gearAttempts;
	public ScoreField baselineAttempts;
	
	public RobotNumber name = new RobotNumber();
	public ScoreLabel lowGoalLabel;
	public ScoreLabel highGoalLabel;
	public ScoreLabel gearLabel;
	public ScoreLabel totalPointsLabel;
	
	public ScoreLabel blocksLabel;
	public ScoreField climbingField;
	public ScoreLabel climbLabel;
	public JLabel DeadBotLabel;
	public ScoreField deadBotField;
	private JLabel lblMatch;
	private JTextField matchField;
	
	/**
	 * The constructor.
	 * @param robotNumber The team number.
	 * @param teamColor The team color.
	 */
	public Auto(String robotNumber, Color teamColor) {
		super();
		this.setBorder(new LineBorder(new Color(0, 0, 0)));
		this.setBackground(teamColor);
		this.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("84px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("84px:grow"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("84px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("84px"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("84px:grow"),
				FormSpecs.LABEL_COMPONENT_GAP_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				RowSpec.decode("20px"),
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		name = new RobotNumber(robotNumber);
		name.setSize(this.getWidth(), 14);
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setFont(nameFont);
		this.add(name, "2, 2, 9, 1, center, fill");
		
		lowGoalLabel = new ScoreLabel("Low Goal");
		lowGoalLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lowGoalLabel.setFont(scoreLabelFont);
		this.add(lowGoalLabel, "2, 6, fill, center");
		
		lblMatch = new JLabel("Match");
		lblMatch.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblMatch, "8, 6, right, default");
		
		matchField = new JTextField();
		matchField.setText("0");
		add(matchField, "10, 6, fill, default");
		matchField.setColumns(10);
		
		highGoalLabel = new ScoreLabel("High Goal");
		highGoalLabel.setHorizontalAlignment(SwingConstants.LEFT);
		highGoalLabel.setFont(scoreLabelFont);
		this.add(highGoalLabel, "2, 8, fill, center");
		
		gearLabel = new ScoreLabel("Gears");
		gearLabel.setHorizontalAlignment(SwingConstants.LEFT);
		gearLabel.setFont(scoreLabelFont);
		this.add(gearLabel, "2, 10, fill, center");
		
		lowGoalField = new ScoreField();
		lowGoalField.setHorizontalAlignment(SwingConstants.RIGHT);
		lowGoalField.setFont(scoreFieldFont);
		lowGoalField.setText("0");
		lowGoalField.setName("lowGoalField");
		lowGoalField.setEditable(false);
		this.add(lowGoalField, "4, 6, fill, fill");
		lowGoalField.setColumns(10);
		
		lowGoalAttempts = new ScoreField();
		lowGoalAttempts.setHorizontalAlignment(SwingConstants.RIGHT);
		lowGoalAttempts.setFont(scoreFieldFont);
		lowGoalAttempts.setText("0");
		lowGoalAttempts.setEditable(false);
		this.add(lowGoalAttempts, "6, 6, fill, fill");
		lowGoalAttempts.setColumns(10);
		
		highGoalField = new ScoreField();
		highGoalField.setFont(scoreFieldFont);
		highGoalField.setText("0");
		highGoalField.setName("highGoalField");
		highGoalField.setHorizontalAlignment(SwingConstants.RIGHT);
		highGoalField.setEditable(false);
		this.add(highGoalField, "4, 8, fill, fill");
		highGoalField.setColumns(10);
		
		highGoalAttempts = new ScoreField();
		highGoalAttempts.setHorizontalAlignment(SwingConstants.RIGHT);
		highGoalAttempts.setFont(scoreFieldFont);
		highGoalAttempts.setText("0");
		highGoalAttempts.setEditable(false);
		this.add(highGoalAttempts, "6, 8, fill, fill");
		highGoalAttempts.setColumns(10);
		
		gearField = new ScoreField();
		gearField.setEditable(false);
		gearField.setHorizontalAlignment(SwingConstants.RIGHT);
		gearField.setFont(scoreFieldFont);
		gearField.setText("0");
		gearField.setName("gearField");
		this.add(gearField, "4, 10, fill, fill");
		gearField.setColumns(10);
		
		gearAttempts = new ScoreField();
		gearAttempts.setHorizontalAlignment(SwingConstants.RIGHT);
		gearAttempts.setFont(scoreFieldFont);
		gearAttempts.setText("0");
		gearAttempts.setEditable(false);
		this.add(gearAttempts, "6, 10, fill, fill");
		gearAttempts.setColumns(10);
		
		blocksLabel = new ScoreLabel("Blocks");
		blocksLabel.setHorizontalAlignment(SwingConstants.LEFT);
		blocksLabel.setFont(scoreLabelFont);
		this.add(blocksLabel, "2, 12, fill, center");
		
		blocksField = new ScoreField();
		blocksField.setEditable(false);
		blocksField.setText("0");
		blocksField.setHorizontalAlignment(SwingConstants.RIGHT);
		blocksField.setFont(scoreFieldFont);
		this.add(blocksField, "4, 12, fill, fill");
		blocksField.setColumns(10);
		
		climbLabel = new ScoreLabel("Climbing");
		climbLabel.setText("Climbing");
		climbLabel.setHorizontalAlignment(SwingConstants.LEFT);
		climbLabel.setFont(scoreLabelFont);
		add(climbLabel, "2, 14, left, default");
		
		climbingField = new ScoreField();
		climbingField.setText("false");
		climbingField.setHorizontalAlignment(SwingConstants.RIGHT);
		climbingField.setFont(scoreLabelFont);
		climbingField.setEditable(false);
		climbingField.setColumns(10);
		add(climbingField, "4, 14, fill, default");
		
		DeadBotLabel = new ScoreLabel("Dead Bot");
		DeadBotLabel.setFont(new Font("Dialog", Font.PLAIN, 15));
		add(DeadBotLabel, "2, 16, left, default");
		
		deadBotField = new ScoreField();
		deadBotField.setText("false");
		deadBotField.setHorizontalAlignment(SwingConstants.RIGHT);
		deadBotField.setFont(new Font("Dialog", Font.PLAIN, 15));
		deadBotField.setEditable(false);
		deadBotField.setColumns(10);
		add(deadBotField, "4, 16, fill, top");
		
	}
}