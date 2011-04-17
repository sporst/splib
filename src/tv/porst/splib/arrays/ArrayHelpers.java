package tv.porst.splib.arrays;

/**
 * Contains helper functions for working with arrays.
 */
public final class ArrayHelpers {

	/**
	 * Removes data from a byte array.
	 * 
	 * @param data The input byte array.
	 * @param startOffset The start offset of the data to remove.
	 * @param length Length in bytes of the data to remove.
	 * 
	 * @return The new array without the removed data.
	 */
	public static byte[] removeData(final byte[] data, final int startOffset, final int length) {
		final byte[] newData = new byte[data.length - length];

		System.arraycopy(data, 0, newData, 0, startOffset);
		System.arraycopy(data, startOffset + length, newData, startOffset, data.length - startOffset - length);

		return newData;
	}

	/**
	 * Replaces data in a byte array.
	 * 
	 * @param data The input byte array.
	 * @param startOffset The start offset of the data to change.
	 * @param length The length in bytes of the data to change.
	 * @param replacementValue The new value for each byte in the replacement range.
	 * 
	 * @return The new array with the replaced data.
	 */
	public static byte[] replaceData(final byte[] data, final int startOffset, final int length, final byte replacementValue) {
		final byte[] newData = data.clone();

		for (int i=startOffset;i<startOffset+length;i++) {
			newData[i] = replacementValue;
		}

		return newData;
	}
}