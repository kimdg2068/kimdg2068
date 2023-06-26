package com.inflearn.section2;

import java.util.Scanner;

public class EX09_MaxSumOfGrid {
	/*
	 	5*5 �����ǿ� �Ʒ��� ���� ���ڰ� �����ֽ��ϴ�.
		N*N�� �������� �־����� �� ���� ��, �� ���� ��, �� �밢���� �� �� �� �� ū ���� ����մϴ�.
		�Է�
		ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)
		�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.
		���
		�ִ����� ����մϴ�.
	 */
	
	public int mySol(int cnt, int[][] nums) {
		//�� ���̵��: ���� ���� 2���� �迭�� �ʱ�ȭ int[i][j] > i�� �ٱ�for��, j�� ����for��
		//���� ��: int[i][j] 0~i,j���� ��
		//���� ��: int[j][i] 0~i,j���� ��
		//�밢1�� ��: int[i][i] 0~i���� ��
		//�밢2�� ��: int[i][j] i+j=cnt�� ��
		int maxSum = 0;
		int sum = 0;
		
		//���� ��
		for(int i=0; i<cnt; i++) {
			sum = 0;
			for(int j=0; j<cnt; j++) {
				sum += nums[i][j];
			}
			if(sum > maxSum) maxSum = sum;
		}
		
		//���� ��
		for(int i=0; i<cnt; i++) {
			sum = 0;
			for(int j=0; j<cnt; j++) {
				sum += nums[j][i];
			}
			if(sum > maxSum) maxSum = sum;
		}
		
		sum = 0;
		//�밢1�� ��
		for(int i=0; i<cnt; i++) {
			sum += nums[i][i];
		}
		if(sum > maxSum) maxSum = sum;
		
		sum = 0;
		//�밢2�� ��
		for(int i=0; i<cnt; i++) {
			sum += nums[i][cnt-1-i];
			if(sum > maxSum) maxSum = sum;
		}
		
		return maxSum;
	}
	
	public int solution(int cnt, int[][] nums) {
		//���� ���̵��: ���� ����ѵ� ������&������, �밢1����&�밢2�� ���� ���� ���ؼ� �ݺ��� ������.
		int ans = 0;
		int sum1;
		int sum2;
		
		//���� �� & ���� ��
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
		//�밢�� 1�� �� & �밢�� 2�� ��
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
