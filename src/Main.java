public class Main {

    public static void main(String[] args) {long[] sales = {1, 10, 20, 50, 80};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.maxNum());
        System.out.println(salesManager.minNum());
        System.out.println(salesManager.TrimmMinMax());
    }
}