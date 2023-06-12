package org.example;

public class Movie {
    private String[] names = new String[0];
    private final int limit;

    public Movie() {
        this.limit = 5;
    }

    public Movie(int limit) {
        this.limit = limit;
    }

    public void choiceMovie(String name) {
        String[] tmp = new String[names.length + 1];
        System.arraycopy(names, 0, tmp, 0, names.length);
        tmp[tmp.length - 1] = name;
        names = tmp;
    }

    public String[] findAll() {
        int resultLendth;
        if (names.length < limit) {
            resultLendth = names.length;
        } else {
            resultLendth = limit;
        }
        String[] tmp = new String[resultLendth];
        System.arraycopy(names, 0, tmp, 0, tmp.length);
        return tmp;
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