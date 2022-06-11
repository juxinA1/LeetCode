package com.LeetCode.solution0699;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Administrator 在二维平面上�? x 轴上，放置着�?些方块�?? 给你�?个二维整数数�? positions ，其�?
 *         positions[i] = [lefti, sideLengthi] 表示：第 i 个方块边长为 sideLengthi ，其左侧边与
 *         x 轴上坐标点 lefti 对齐�? 每个方块都从�?个比目前�?有的落地方块更高的高度掉落�?�下。方块沿 y 轴负方向下落，直到着陆到
 *         另一个正方形的顶�? 或�?�是 x 轴上 。一个方块仅仅是擦过另一个方块的左侧边或右侧边不算着陆�?�一旦着陆，它就会固定在原地，无法移动�??
 *         在每个方块掉落后，你必须记录目前�?有已经落稳的 方块堆叠的最高高�? �? 返回�?个整数数�? ans ，其�? ans[i] 表示在第 i
 *         块方块掉落后堆叠的最高高度�?? 来源：力扣（LeetCode�?
 *         链接：https://leetcode.cn/problems/falling-squares
 *         著作权归领扣网络�?有�?�商业转载请联系官方授权，非商业转载请注明出处�??
 */
public class Solution0699 {

	public List<Integer> fallingSquares(int[][] positions) {
		List<Integer> res = new ArrayList<>();

		int[][] tempArr = new int[10000][10000];
		int max = 0;

		for (int i = 0; i < positions.length; i++) {
			int left = positions[i][0];
			int sideLength = positions[i][1];
			int row = getRow(tempArr, max, left, sideLength);
			int col = left;
			editArr(tempArr, row, col, sideLength);

			if (row + sideLength > max) {
				max = row + sideLength;
			}
			res.add(max);
		}

		return res;
	}

	private int getRow(int[][] arr, int maxRow, int left, int sideLength) {
		for (int i = maxRow; i > 0; i--) {
			for (int j = left; j < left + sideLength; j++) {
				if (arr[i][j] == 1) {
					return i;
				}
			}
		}
		return 0;
	}

	private void editArr(int[][] arr, int row, int col, int sideLength) {
		for (int i = 0; i <= sideLength; i++) {
			for (int j = 0; j <= sideLength; j++) {
				arr[row + i][col + j] = 1;
			}
		}
	}
}
