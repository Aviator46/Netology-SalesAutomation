public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

<<<<<<< HEAD
    public long Max() {
        long max = -1;
        for (long sale : sales) {
=======
    public long max() {
        long max = -1;
        for (long sale : sales) {
>>>>>>> longer
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long MaxNum() {
        long maxNum = sales[0];
        for (long sale : sales) {
            if (sale > maxNum)
                maxNum = sale;
        }
        return maxNum;
    }

    public long MinNum() {
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
        return (sum - MinNum() - MaxNum()) / (sales.length - 2);
    }
}
