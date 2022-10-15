public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long maxNum() {
        long maxNum = sales[0];
        for (long sale : sales) {
            if (sale > maxNum)
                maxNum = sale;
        }
        return maxNum;
    }

    public long minNum() {
        long minNum = sales[0];
        for (long sale : sales) {
            if (sale < minNum)
                minNum = sale;
        }
        return minNum;
    }
    public long TrimmMinMax() {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (sum - minNum() - maxNum()) / (sales.length - 2);
    }
}
