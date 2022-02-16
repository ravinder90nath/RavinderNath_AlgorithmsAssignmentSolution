package StockerService;

import StockerGetSet.Stocks;

public class Search {
	public static boolean doesStockExist(Stocks[] stockArr, double stockPrice) {
		for (int i = 0; i < stockArr.length; i++) {
			if (stockArr[i].getStockPrice() == stockPrice)
				return true;
		}
		return false;
	}
}
