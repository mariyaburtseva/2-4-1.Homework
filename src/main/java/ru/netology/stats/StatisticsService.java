package ru.netology.stats;

public class StatisticsService {
    public int calculateSum(int[] values) {
        int month = 0;
        for (int value : values) {
            month += value;
        }
        return month;
    }
// Цикл для перебора всех purchases и подсчета СУММЫ

    public int calculateAverage(int[] values) {
        int month = this.calculateSum(values);
        return month / values.length;
    }
// Цикл для перебора всех purchases и подсчета СРЕДНЕГО ЗНАЧЕНИЯ

    public int findMax(int[] values) {
        int currentMax = 0;
        int currentMaxIndex = 0;
        int month = 0;
        for (int value : values) {
            if (value > currentMax) {
                currentMax = value;
                currentMaxIndex = month;
            }
            month++;
        }
        return currentMaxIndex;
    }
// Цикл для перебора всех purchases и вывода ПИКА продаж

    public int findMin(int[] values) {
        int month = 1;
        int currentMin = values[0];
            for (int i = 1; i < values.length; i++) {
            if (values[i] <= currentMin) {
                month = i + 1;
            }
        }
        return month;
    }
// Цикл для перебора всех purchases и вывода МИНИМУМА продаж (иной способот пика)

    public int calculateBelowAverage(int[] values) {
        int monthAmount = 0;
        int sum = 0;
        for (int monthValue : values ){
            sum +=monthValue;
        }
        for (int monthValue : values){
            if (monthValue < this.calculateAverage(values)){
            monthAmount += 1;
        }
    }
        return monthAmount;
//Кол-во месяцев, в которых продажи были ниже среднего
}

    public int calculateAboveAverage(int[] values) {
        int monthAmount = 0;
        int sum = 0;
        for (int monthValue : values ){
            sum +=monthValue;
        }
        for (int monthValue : values){
            if (monthValue > this.calculateAverage(values)){
                monthAmount += 1;
            }
        }
        return monthAmount;
// Кол-во месяцев, в которых продажи были выше среднего
    }

}



