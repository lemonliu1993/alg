package com.lemon.daily.t100;

/**
 * Created by lemoon on 2023/2/3 21:42
 */
public class L006_zigzag_conversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }
        int index = 0;
        while (index < s.length()) {
            for (int i = 0; i < numRows; i++) {
                if (index < s.length()) {
                    sbs[i].append(s.charAt(index));
                }
                index++;
            }
            for (int i = numRows - 2; i >= 1; i--) {
                if (index < s.length()) {
                    sbs[i].append(s.charAt(index));
                }
                index++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(sbs[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String paypalishiring = new L006_zigzag_conversion().convert("PAYPALISHIRING", 4);
        System.out.println(paypalishiring);

        //PINALSIGYAHRPI
        //PINALSIGYAHRPI
    }
}
