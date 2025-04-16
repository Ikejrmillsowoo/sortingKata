package com.zipcode;

public class SortingCharacters {
    private String stringToSort;

    public SortingCharacters(String stringToSort) {
        this.stringToSort = stringToSort;
    }

    public SortingCharacters() {
    }

    public String verifyString(String string) {
        String newStringToSort = string.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return newStringToSort;
    }


    public String sortString() {
        String solution = "";
        String sortThisString = verifyString(this.stringToSort);

        char[] charToSort = sortThisString.toCharArray();
        for (int j = 97; j < 123; j++){
            for (int i = 0; i < charToSort.length; i++) {
                if ((int) charToSort[i] == j) {
                    solution = solution.concat(String.valueOf(charToSort[i]));
                }
            }
        }
        return solution;
    }
}
