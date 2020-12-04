package com.songan.simple;

/**
 * 翻转整数
 * @author songan
 * @date 2020/12/04
 */

public class ReverseNumber {

    public static int reverse(int x) {

        int rev = 0;
        while (x > 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static void main(String[] args) {
        int reverse = reverse(2134);
        System.out.println("reverse = " + reverse);
    }
}
