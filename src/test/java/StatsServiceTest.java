import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void FindMinMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FindMaxMonth() {
        StatsService services = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = services.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SumOfSales() {
        StatsService services = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 32;
        long actual = services.SumOfSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSales() {
        StatsService services = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 32) / 12;
        long actual = services.averageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void bellowAverage() {
        StatsService services = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = services.bellowAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveAverage() {
        StatsService services = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) services.aboveAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}