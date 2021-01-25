package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatisticsService service = new StatisticsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverage() {
        StatisticsService service = new StatisticsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateFindMax(){
        StatisticsService service = new StatisticsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.findMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateFindMin(){
        StatisticsService service = new StatisticsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.findMin(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateBelowAverage(){
        StatisticsService service = new StatisticsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateBelowAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAboveAverage(){
        StatisticsService service = new StatisticsService();
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calculateAboveAverage(purchases);
        assertEquals(expected, actual);
    }
}