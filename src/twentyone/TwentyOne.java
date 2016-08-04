package twentyone;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import twentyone.gui.GameFrame;

public class TwentyOne {

	public static void main(String[] args) {
		
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				System.out.println("Loading TwentyOne GUI");
				new GameFrame();
			}
		});
	}
}