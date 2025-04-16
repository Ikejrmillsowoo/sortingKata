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
        return "";
    }
}
