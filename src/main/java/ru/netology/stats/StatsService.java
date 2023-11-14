package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;                                              //минимум продаж

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;                                               //пик продаж

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long sumOfSales(long[] sales) {
        long totalSale = 0;                                            //сумма всех продаж

        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long averageSales(long[] sales) {
        return sumOfSales(sales) / sales.length;                      //средняя сумма продаж в месяц
    }

    public int bellowAverage(long[] sales) {                          //ниже среднего
        long average = averageSales(sales);
        int culc = 0;
        for (long sale : sales) {
            if (sale < average) {
                culc++;
            }
        }
        return culc;
    }

    public long aboveAverage(long[] sales) {                          //выше среднего
        long average = averageSales(sales);
        int culc = 0;
        for (long sale : sales) {
            if (sale > average) {
                culc++;
            }
        }
        return culc;
    }
}