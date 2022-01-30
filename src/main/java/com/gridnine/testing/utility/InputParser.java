package com.gridnine.testing.utility;

public class InputParser {
    public static int[] ParseInput(String input) {
        String[] filterIDstring = input.split(" ");
        int[] filterID = new int[filterIDstring.length];
        for (int i = 0; i < filterID.length; i++) {
            try {filterID[i] = Integer.parseInt(filterIDstring[i]);}
            catch (NumberFormatException e) {System.out.println("Неправильный формат запроса\n");}
        }
        return filterID;
    }
}
