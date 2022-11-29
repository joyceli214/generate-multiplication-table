package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        if (number >= 1 && number <= 1000)
            return true;
        return false;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        if (start > end)
            return false;
        return true;
    }

    public String generateTable(int start, int end) {
        return null;
    }

    public String generateLine(int start, int row) {
        String str = "";
        for (int i = start; i <= row; i++) {
            str += "  ";
            str += generateSingleExpression(i, row);
        }
        return str.substring(2);
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + multiplicand * multiplier;
    }
}
