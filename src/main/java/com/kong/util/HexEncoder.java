package com.kong.util;

/**
 * Created by Kong on 2018/1/8.
 */
public final class HexEncoder {
    private static final char[] DIGITS_LOWER = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] DIGITS_UPPER = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public HexEncoder() {
    }

    public static char[] encode2char(byte[] data) {
        return encode2char(data, true);
    }

    public static char[] encode2char(byte[] data, boolean toLowerCase) {
        return encode2char(data, toLowerCase ? DIGITS_LOWER : DIGITS_UPPER);
    }

    protected static char[] encode2char(byte[] data, char[] toDigits) {
        int l = data.length;
        char[] out = new char[l << 1];
        int i = 0;

        for(int var5 = 0; i < l; ++i) {
            out[var5++] = toDigits[(240 & data[i]) >>> 4];
            out[var5++] = toDigits[15 & data[i]];
        }

        return out;
    }

    public static String encode(byte b) {
        char[] out = new char[]{DIGITS_UPPER[(240 & b) >>> 4], DIGITS_UPPER[15 & b]};
        return new String(out);
    }

    public static String encode(byte[] data) {
        return encode(data, false);
    }

    public static String encode(byte[] data, boolean toLowerCase) {
        return encode(data, toLowerCase ? DIGITS_LOWER : DIGITS_UPPER);
    }

    protected static String encode(byte[] data, char[] toDigits) {
        return new String(encode2char(data, toDigits));
    }

    protected static byte[] decode(char[] data) {
        int len = data.length;
        if ((len & 1) != 0) {
            throw new RuntimeException("Odd number of characters.");
        } else {
            byte[] out = new byte[len >> 1];
            int i = 0;

            for(int j = 0; j < len; ++i) {
                int f = toDigit(data[j], j) << 4;
                ++j;
                f |= toDigit(data[j], j);
                ++j;
                out[i] = (byte)(f & 255);
            }

            return out;
        }
    }

    public static byte[] decode(String hexStr) {
        return decode(hexStr.toCharArray());
    }

    protected static int toDigit(char ch, int index) {
        int digit = Character.digit(ch, 16);
        if (digit == -1) {
            throw new RuntimeException("Illegal hexadecimal character " + ch + " at index " + index);
        } else {
            return digit;
        }
    }

}
