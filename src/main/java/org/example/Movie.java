package org.example;

public class Movie {
    private String[] names = new String[0];
    private int limit;

    public Movie() {
        this.limit = 5;
    }

    public Movie(int limit) {
        this.limit = limit;
    }

    public void choiceMovie(String name) {
        String[] tmp = new String[names.length + 1];
        for (int i = 0; i < names.length; i++) {
            tmp[i] = names[i];
        }
        tmp[tmp.length - 1] = name;
        names = tmp;
    }

    public String[] findAll() {
        return names;
    }

    public String[] findLast() {
        int resultLendth;
        if (names.length < limit) {
            resultLendth = names.length;
        } else {
            resultLendth = limit;
        }
        String[] tmp = new String[resultLendth];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = names[names.length - 1 - i];
        }
        return tmp;
    }
}