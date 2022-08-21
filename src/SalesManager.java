public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int Max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int MaxNum() {
        int maxNum = sales[0];
        for (int sale : sales) {
            if (sale > maxNum)
                maxNum = sale;
        }
        return maxNum;
    }

    public int MinNum() {
        int minNum = sales[0];
        for (int sale : sales) {
            if (sale < minNum)
                minNum = sale;
        }
        return minNum;
    }
    public int TrimmMinMax () {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return (sum - MinNum() - MaxNum()) / (sales.length - 2);
    }
}
