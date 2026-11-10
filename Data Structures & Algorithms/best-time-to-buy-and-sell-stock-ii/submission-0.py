class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        curLowest = float("inf")
        curProfit = 0
        profit = 0

        for price in prices:
            if price < curLowest:
                curLowest = price
                if curProfit > 0 :
                    profit += curProfit
                curProfit = 0
            else:
                curProfit += price - curLowest
                curLowest = price
            print(price, curLowest, curProfit)
        
        return profit + curProfit

                