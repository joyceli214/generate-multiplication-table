package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return isValid(start, end) ? generateTable(start, end) : null;
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        String str = "";
        for (int i = start; i <= end; i++) {
            str += generateLine(start, i);
            if (i != end)
                str += System.lineSeparator();
        }
        return str;
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
