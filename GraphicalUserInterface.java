import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class GraphicalUserInterface extends JFrame {
	
}

class Menu extends JFrame {
	
	private JButton startButton = new JButton("Start Game");
	private JButton infoButton = new  JButton("Info");
	private JButton quitButton = new JButton("Quit");
	
	public Menu() {
		
		JPanel menuPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(200, 300);
		
		menuPanel.add(startButton);
		menuPanel.add(infoButton);
		menuPanel.add(quitButton);
		
		this.add(menuPanel);
		
	}
	
	private void addStartListener(ActionListener listenForStart) {
		startButton.addActionListener(listenForStart);
	}
	
	private void addInfoListener(ActionListener listenForInfo) {
		infoButton.addActionListener(listenForInfo);
	}
	
	private void addQuitListener(ActionListener listenForQuit) {
		quitButton.addActionListener(listenForQuit);
	}
}