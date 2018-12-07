package test;

import java.util.ArrayList;

public class ContestCalculator {
	public ArrayList<Double> calculateWinner(ArrayList<Double> WyateErpsNuggets,
			ArrayList<Double> ButchCassidaysNuggets) {
		double total = 0;
		double total2 = 0;

		for (int i = 0; i < WyateErpsNuggets.size(); i++) {

			total += WyateErpsNuggets.get(i);
		}

		for (int i = 0; i < ButchCassidaysNuggets.size(); i++) {

			total2 += ButchCassidaysNuggets.get(i);
		}
		if (total >= total2) {
			return WyateErpsNuggets;
		}

		if (total2 > total) {
			return ButchCassidaysNuggets;
		}

		return null;

	}
}
