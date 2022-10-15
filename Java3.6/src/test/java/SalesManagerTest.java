import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SalesManagerTest {
    @DisplayName("Проверка нахождения максимального значения в массиве")
    @Test
    public void testMaxNum() {
        SalesManager salesManager = new SalesManager(new long[]{1, 10, 20, 50, 80});
        Assertions.assertEquals(80, salesManager.maxNum());
    }

    @DisplayName("Проверка нахождения минимального значения в массиве")
    @Test
    public void testMinNum() {
        SalesManager salesManager = new SalesManager(new long[]{1, 10, 20, 50, 80});
        Assertions.assertEquals(1, salesManager.minNum());
    }

    @DisplayName("Проверка нахождения среднего обрезанного значения")
    @Test
    public void testTrimmMinMax() {
        SalesManager salesManager = new SalesManager(new long[]{1, 10, 20, 50, 80});
        Assertions.assertEquals(26, salesManager.TrimmMinMax());
    }
}