package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmTest {
    @Test

    public void MovieTestAll() {
        Movie manager = new Movie();
        manager.choiceMovie("Bloodshot");
        manager.choiceMovie("Forward");
        manager.choiceMovie("Wednesday");
        manager.choiceMovie("Island");
        manager.choiceMovie("KikoRiki");
        String[] expected = {"Bloodshot", "Forward", "Wednesday", "Island", "KikoRiki"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestAllmax() {
        Movie manager = new Movie();
        manager.choiceMovie("Bloodshot");
        manager.choiceMovie("Forward");
        manager.choiceMovie("Wednesday");
        manager.choiceMovie("Island");
        manager.choiceMovie("KikoRiki");
        manager.choiceMovie("It");
        manager.choiceMovie("Kino");
        String[] expected = {"Bloodshot", "Forward", "Wednesday", "Island", "KikoRiki"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestAllmin() {
        Movie manager = new Movie();
        manager.choiceMovie("Bloodshot");
        manager.choiceMovie("Forward");
        manager.choiceMovie("Wednesday");
        String[] expected = {"Bloodshot", "Forward", "Wednesday"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void MovieTestParametrAll() {
        Movie manager = new Movie(3);
        manager.choiceMovie("Bloodshot");
        manager.choiceMovie("Forward");
        manager.choiceMovie("Wednesday");
        String[] expected = {"Bloodshot", "Forward", "Wednesday"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void MovieTestParamrtrAllLess() {
        Movie manager = new Movie(7);
        manager.choiceMovie("Bloodshot");
        manager.choiceMovie("Forward");
        manager.choiceMovie("Wednesday");
        manager.choiceMovie("Island");
        manager.choiceMovie("KikoRiki");
        manager.choiceMovie("It");
        String[] expected = {"Bloodshot", "Forward", "Wednesday", "Island", "KikoRiki", "It"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestLast() {
        Movie manager = new Movie();
        manager.choiceMovie("Bloodshot");
        manager.choiceMovie("Forward");
        manager.choiceMovie("Wednesday");
        manager.choiceMovie("Island");
        manager.choiceMovie("KikoRiki");
        String[] expected = {"KikoRiki", "Island", "Wednesday", "Forward", "Bloodshot"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestLastmin() {
        Movie manager = new Movie();
        manager.choiceMovie("Bloodshot");
        manager.choiceMovie("Forward");
        manager.choiceMovie("Wednesday");
        String[] expected = {"Wednesday", "Forward", "Bloodshot"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestLastmax() {
        Movie manager = new Movie();
        manager.choiceMovie("Bloodshot");
        manager.choiceMovie("Forward");
        manager.choiceMovie("Wednesday");
        manager.choiceMovie("Island");
        manager.choiceMovie("KikoRiki");
        manager.choiceMovie("It");
        manager.choiceMovie("Kino");
        String[] expected = {"Kino", "It", "KikoRiki", "Island", "Wednesday"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestParametrsLast() {
        Movie manager = new Movie(2);
        manager.choiceMovie("Bloodshot");
        manager.choiceMovie("Forward");
        String[] expected = {"Forward", "Bloodshot"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestParametrLastmax() {
        Movie manager = new Movie(7);
        manager.choiceMovie("Bloodshot");
        manager.choiceMovie("Forward");
        manager.choiceMovie("Wednesday");
        manager.choiceMovie("Island");
        manager.choiceMovie("KikoRiki");
        manager.choiceMovie("It");
        manager.choiceMovie("Kino");
        String[] expected = {"Kino", "It", "KikoRiki", "Island", "Wednesday", "Forward", "Bloodshot"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestParametrLastlimit() {
        Movie manager = new Movie(7);
        manager.choiceMovie("Bloodshot");
        manager.choiceMovie("Forward");
        manager.choiceMovie("Wednesday");
        manager.choiceMovie("Island");
        manager.choiceMovie("KikoRiki");
        String[] expected = {"KikoRiki", "Island", "Wednesday", "Forward", "Bloodshot"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MovieTestParametrLastmin() {
        Movie manager = new Movie(5);
        manager.choiceMovie("Bloodshot");
        manager.choiceMovie("Forward");
        manager.choiceMovie("Wednesday");
        manager.choiceMovie("Island");
        manager.choiceMovie("KikoRiki");
        manager.choiceMovie("It");
        manager.choiceMovie("Kino");
        String[] expected = {"Kino", "It", "KikoRiki", "Island", "Wednesday"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}

