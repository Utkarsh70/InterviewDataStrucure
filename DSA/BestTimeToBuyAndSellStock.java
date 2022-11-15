public class BestTimeToBuyAndSellStock
  {
    public int maxProfit(int []prices) {
       int l = prives.length;
       int maxProfir = 0;
       int minProfit = prices[0];
        for(int i=1;i<l;i++) {
               maxProfit = Math.max(maxProfit, prices[i]-minPrice);
               minPrice = Math.min(minPrice,prices[i]);
         }
        return maxProfit;
     }
  }