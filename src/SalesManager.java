public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int maxNum() {
        int maxNum = sales[0];
        for (int sale : sales) {
            if (sale > maxNum)
                maxNum = sale;
        }
        return maxNum;
    }

    public int minNum() {
        int minNum = sales[0];
        for (int sale : sales) {
            if (sale < minNum)
                minNum = sale;
        }
        return minNum;
    }
    public int trimmMinMax () {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return (sum - minNum() - maxNum()) / (sales.length - 2);
    }
}
