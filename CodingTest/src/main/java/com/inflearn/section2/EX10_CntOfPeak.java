package com.inflearn.section2;

import java.util.Scanner;

public class EX10_CntOfPeak {
	/*
	 	���� ������ N*N �����ǿ� �־����ϴ�. �� ���ڿ��� �� ������ ���̰� �����ֽ��ϴ�.
		�� �������� ���� �� �ڽ��� �����¿� ���ں��� ū ���ڴ� ���츮 �����Դϴ�. ���츮 ������ �� �� �ִ� �� �˾Ƴ��� ���α׷��� �ۼ��ϼ���.
		������ �����ڸ��� 0���� �ʱ�ȭ �Ǿ��ٰ� �����Ѵ�.
		���� N=5 �̰�, �������� ���ڰ� ������ ���ٸ� ���츮�� ������ 10���Դϴ�.
		�Է�
		ù �ٿ� �ڿ��� N�� �־�����.(2<=N<=50)
		�� ��° �ٺ��� N�ٿ� ���� �� �ٿ� N���� �ڿ����� �־�����. �� �ڿ����� 100�� ���� �ʴ´�.
		���
		���츮�� ������ ����ϼ���.
	 */
	
	public int mySol(int cnt, int[][] arr) {
		//�� ���̵��: 7*7�迭�� ���� 5*5�迭 ���� �������� arr[i][j]�� ��, ��(arr[i-1][j], arr[i+1][j]), ��, ��(arr[i][j-1], arr[i][j+1]) ũ�� ��
		//arr[i][j]�� ���� ũ�ٸ� ans++
		int ans = 0;
		for(int i=1; i<cnt+1; i++) {
			for(int j=1; j<cnt+1; j++) {
				int stand = arr[i][j];
				if(stand > arr[i-1][j] && stand > arr[i+1][j] && stand > arr[i][j-1] && stand > arr[i][j+1]) ans++;
			}
		}
		
		return ans;
	}
	
	public int solution(int cnt, int[][] arr) {
		//�ΰ� ���̵��: �����¿� ��ǥ�� �̸� int�迭�� dx, dy�� �ʱ�ȭ �س���. (int[] dx = {-1, 0, 1, 0}/int[] dy = {0, 1, 0, -1})
		//for�� ������ arr[i][j]�� arr[i+dx][i+dy]�� ��.
		//��ó�� �ٱ� �������� �����ؼ� �迭�� ũ�� �� ����� i+dx, i+dy ���� 0�� cnt ���̷� ������.
		//����ϰ� ����. 4���� �ƴ϶� 8�� ���ϴ� ������ �ִµ� if�� �ϸ� ���� �� �ɾ�� ��.
		int ans = 0;
		int[] dx = {-1, 0, 1, 0};
		int[] dy = {0, 1, 0, -1};
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<cnt; j++) {
				boolean isPeak = true;
				for(int k=0; k<dx.length; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					if(nx >= 0 && nx < cnt && ny >= 0 && ny < cnt) {
						if(arr[nx][ny] >= arr[i][j]) {
							isPeak = false;
							break;
						}
					}
				}
				if(isPeak) ans++;
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		EX10_CntOfPeak cop = new EX10_CntOfPeak();
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
//		int[][] arr = new int[cnt+2][cnt+2];
//		for(int i=1; i<cnt+1; i++) {
//			for(int j=1; j<cnt+1; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
		
		int[][] arr = new int[cnt][cnt];
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<cnt; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
//		System.out.println(cop.mySol(cnt, arr));
		System.out.println(cop.solution(cnt, arr));
	}

}
