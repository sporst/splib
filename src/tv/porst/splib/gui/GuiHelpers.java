package tv.porst.splib.gui;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class GuiHelpers {

	public static String getMonospaceFont() {
		final GraphicsEnvironment localGraphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		final Font[] fonts = localGraphicsEnvironment.getAllFonts();
		for (final Font font : fonts) {
			if (font.getName().equals("Courier New")) {
				return "Courier New";
			}
		}
		return "Monospaced";
	}
}
