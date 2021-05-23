import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
class SButton extends JButton
{
	private static final long serialVersionUID = 1L;
	Color DB = new Color(0x8B,0x00,0x00);
	Color LB = new Color(0xAD,0xD8, 0xE6);
	public SButton(String action, String command)
	{
		super(action);
		this.setBackground(LB);
		this.setForeground(DB);
		this.setBorder(BorderFactory.createBevelBorder(0, DB, DB));
		this.setActionCommand(command);
	}
	public Dimension getPreferredSize()
	{
		return new Dimension(130,30);
	}
}