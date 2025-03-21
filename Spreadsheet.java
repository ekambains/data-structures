//LeetCode 3484

import java.util.HashMap;

public class Spreadsheet {
    HashMap<String, Integer> map;
    
    public Spreadsheet(int rows) {
        map = new HashMap<>();
    }
    
    public void setCell(String cell, int value) {
        map.put(cell, value);
    }
    
    public void resetCell(String cell) {
        map.put(cell, 0);
    }
    
    public int getValue(String formula) {
        int i = 2;
        while(formula.charAt(i) != '+') {
            i++;
        }
        String x = formula.substring(1, i);
        String y = formula.substring(i + 1, formula.length());
        int X = 0;
        int Y = 0;
        if(Character.isDigit(x.charAt(0))) {
            X = Integer.parseInt(x);
        }
        else {
            X = (map.containsKey(x)) ? map.get(x) : 0;
        }
        if(Character.isDigit(y.charAt(0))) {
            Y = Integer.parseInt(y);
        }
        else {
            Y = (map.containsKey(y)) ? map.get(y) : 0;
        }
        return X + Y;
    }
}