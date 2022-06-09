package com.LeetCode.test;

import java.util.List;

import com.LeetCode.solution.Solution0699;

public class TestSolution0699 {
	public static void main(String[] args) {
		int[][] positions = { { 100, 100 }, { 200, 100 } };
		Solution0699 solution = new Solution0699();
		List<Integer> res = solution.fallingSquares(positions);
		
		for (Integer i : res) {
			System.out.println(i);
		}

	}
}
