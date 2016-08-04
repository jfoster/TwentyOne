package twentyone.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import twentyone.enums.Colours;
import twentyone.enums.Suit;
import twentyone.logic.Card;
import twentyone.logic.Game;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {

	private GamePanel gamePanel;
	private ButtonPanel buttonPanel;

	private Game game;

	public GameFrame() {
		super();
		
		add(gamePanel = new GamePanel(), BorderLayout.CENTER);
		add(buttonPanel = new ButtonPanel(), BorderLayout.SOUTH);

		// set windows title
		setTitle("TwentyOne v1.2");

		// set the x button to close the application.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set a default size for the application window.
		setSize(new Dimension(512, 512));

		// set a minimum size for the application window.
		setMinimumSize(new Dimension(512, 512));

		// center the frame within the primary display.
		setLocationRelativeTo(null);

		// make the frame visible.
		setVisible(true);
	}

	public class GamePanel extends JPanel {

		private Font primaryFont;
		private Font secondaryFont;

		private GamePanel() {

			game = new Game();

			setBackground(Colours.GREEN_900.getColor());
			primaryFont = new Font("SansSerif", Font.BOLD, 16);
			secondaryFont = new Font("SansSerif", Font.PLAIN, 12);
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			drawPanel(g);
		}

		private void drawPanel(Graphics g) {
			g.setFont(primaryFont);
			g.setColor(Color.white);

			g.drawString(game.getMessage(), 10, getSize().height - 10);
			setToolTipText(game.getTooltip());

			g.drawString("Dealer's Cards:", 10, 23);
			g.drawString("Your Cards:", 10, 153);

			g.setFont(secondaryFont);

			if (game.isGameInProgress()) {
				drawCard(g, null, 10, 30);
			} else {
				drawCard(g, game.getDealerHand().getCard(0), 10, 30);
			}

			for (int i = 1; i < game.getDealerHand().getCardCount(); i++) {
				drawCard(g, game.getDealerHand().getCard(i), 10 + i * 90, 30);
			}
			for (int i = 0; i < game.getPlayerHand().getCardCount(); i++) {
				drawCard(g, game.getPlayerHand().getCard(i), 10 + i * 90, 160);
			}
		}

		private void drawCard(Graphics g, Card card, int x, int y) {
			if (card != null) {
				g.setColor(Color.white);
				g.fillRect(x,y,80,100);
				g.setColor(Colours.BLUE_900.getColor());
				g.drawRect(x,y,80,100);
				g.drawRect(x+1,y+1,77,97);
				if (card.getSuit() == Suit.DIAMONDS || card.getSuit() == Suit.HEARTS) {
					g.setColor(Colours.RED_500.getColor());
				} else {
					g.setColor(Colours.BLACK.getColor());
				}
				g.drawString(card.getRankName(), x + 10, y + 30);
				g.drawString("of", x + 10, y + 50);
				g.drawString(card.getSuitName(), x + 10, y + 70);
			} 
			else {
				g.setColor(Colours.BLUE_900.getColor());
				g.fillRect(x,y,80,100);
				g.setColor(Color.white);
				g.drawRect(x+3,y+3,73,93);
				g.drawRect(x+4,y+4,71,91);
			}
		}
	}

	public class ButtonPanel extends JPanel {
		private JButton hitButton, standButton, newButton;

		private ButtonPanel() {
			setBackground(Colours.TEAL_500.getColor());

			add(hitButton = createButton("Hit", null));
			add(standButton = createButton("Stand", null));
			add(newButton = createButton("New Game", null));
		}

		private JButton createButton(String text, String tooltip) {
			JButton button = new JButton();
			button.setText(text);
			button.setToolTipText(tooltip);
			button.addActionListener(new ButtonListener());
			return button;
		}
	}

	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			if (event.getSource().equals(buttonPanel.hitButton)) {
				game.doHit();
			}
			else if (event.getSource().equals(buttonPanel.standButton)) {
				game.doStand();
			}
			else if (event.getSource().equals(buttonPanel.newButton)) {
				game.doNewGame();
			}
			gamePanel.repaint();
		}
	}
}