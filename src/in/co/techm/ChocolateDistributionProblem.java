package in.co.techm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

//http://www.geeksforgeeks.org/chocolate-distribution-problem/
public class ChocolateDistributionProblem {
	private int[] chocolateArr;
	private int numStudents;

	public int[] getChocolateArr() {
		return chocolateArr;
	}

	public void setChocolateArr(int[] chocolateArr) {
		this.chocolateArr = chocolateArr;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public static void main(String[] args) {
		ChocolateDistributionProblem c = new ChocolateDistributionProblem();
		c.setChocolateArr(new int[] { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28,
				42, 30, 44, 48, 43, 50 });
		c.setNumStudents(7);
		Arrays.sort(c.getChocolateArr());
		c.creteSubsets();
	}

	private void creteSubsets() {
		int minDiff = Integer.MAX_VALUE;
		for (int i = 0; i + this.getNumStudents() - 1 < this.getChocolateArr().length; i++) {
			int diff = this.getChocolateArr()[i + this.getNumStudents() - 1]
					- this.getChocolateArr()[i];
			if (diff < minDiff) {
				minDiff = diff;
			}
		}
		System.out.println("Minimum difference is:" + minDiff);
	}
}
