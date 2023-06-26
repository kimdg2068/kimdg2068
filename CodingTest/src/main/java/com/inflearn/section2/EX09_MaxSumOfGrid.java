package com.inflearn.section2;

import java.util.Scanner;

public class EX09_MaxSumOfGrid {
	/*
	 	5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
		N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
		입력
		첫 줄에 자연수 N이 주어진다.(2<=N<=50)
		두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
		출력
		최대합을 출력합니다.
	 */
	
	public int mySol(int cnt, int[][] nums) {
		//내 아이디어: 격자 수를 2차원 배열에 초기화 int[i][j] > i는 바깥for문, j는 안쪽for문
		//행의 합: int[i][j] 0~i,j까지 합
		//열의 합: int[j][i] 0~i,j까지 합
		//대각1의 합: int[i][i] 0~i까지 합
		//대각2의 합: int[i][j] i+j=cnt의 합
		int maxSum = 0;
		int sum = 0;
		
		//행의 합
		for(int i=0; i<cnt; i++) {
			sum = 0;
			for(int j=0; j<cnt; j++) {
				sum += nums[i][j];
			}
			if(sum > maxSum) maxSum = sum;
		}
		
		//열의 합
		for(int i=0; i<cnt; i++) {
			sum = 0;
			for(int j=0; j<cnt; j++) {
				sum += nums[j][i];
			}
			if(sum > maxSum) maxSum = sum;
		}
		
		sum = 0;
		//대각1의 합
		for(int i=0; i<cnt; i++) {
			sum += nums[i][i];
		}
		if(sum > maxSum) maxSum = sum;
		
		sum = 0;
		//대각2의 합
		for(int i=0; i<cnt; i++) {
			sum += nums[i][cnt-1-i];
			if(sum > maxSum) maxSum = sum;
		}
		
		return maxSum;
	}
	
	public int solution(int cnt, int[][] nums) {
		//강의 아이디어: 나랑 비슷한데 행의합&열의합, 대각1의합&대각2의 합을 같이 구해서 반복문 적어짐.
		int ans = 0;
		int sum1;
		int sum2;
		
		//행의 합 & 열의 합
		for(int i=0; i<cnt; i++) {
			sum1 = 0;
			sum2 = 0;
			for(int j=0; j<cnt; j++) {
				sum1 += nums[i][j];
				sum2 += nums[j][i];
			}
			ans = Math.max(ans, sum1);
			ans = Math.max(ans, sum2);
		}
		
		sum1 = 0;
		sum2 = 0;
		//대각선 1의 합 & 대각선 2의 합
		for(int i=0; i<cnt; i++) {
			sum1 += nums[i][i];
			sum2 += nums[i][cnt-1-i];
		}
		ans = Math.max(ans, sum1);
		ans = Math.max(ans, sum2);
		
		return ans;
	}
	
	public static void main(String[] args) {
		EX09_MaxSumOfGrid msg = new EX09_MaxSumOfGrid();
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[][] arr = new int[cnt][cnt];
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<cnt; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
//		System.out.println(msg.mySol(cnt, arr));
		System.out.println(msg.solution(cnt, arr));
	}
}
