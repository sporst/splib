package tv.porst.splib.strings;

/**
 * Contains helper functions for working with strings.
 */
public final class StringHelpers {

	/**
	 * Creates a new string by repeating a given string a number of times.
	 * 
	 * @param string The string to repeat.
	 * @param repeats Number of repeats.
	 * 
	 * @return The new string.
	 */
	public static String repeat(final String string, final int repeats) {

		if (repeats < 0) {
			throw new IllegalArgumentException("Number of repeats can not be null");
		}

		if (repeats == 0) {
			return "";
		}

		final StringBuilder builder = new StringBuilder();

		for (int i = 0; i < repeats; i++) {
			builder.append(string);
		}

		return builder.toString();
	}
}