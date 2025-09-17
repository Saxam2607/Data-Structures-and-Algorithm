public class BuySellStocks {
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        System.out.println("maximum profit earned: " + stocks(arr));

    }
    static int stocks(int[] arr) {
        int n = arr.length;
        int maxProfit = 0;
        int min = arr[0];
        for(int i = 1; i < n; i++) {
            int cost = arr[i] - min;
            maxProfit = Math.max(cost, maxProfit);
            min = Math.min(arr[i], min);
        }
        return maxProfit;
    }
}
