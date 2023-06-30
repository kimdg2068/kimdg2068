package com.inflearn.section2;

import java.util.Scanner;

public class EX10_CntOfPeak {
	/*
	 	지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
		각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
		격자의 가장자리는 0으로 초기화 되었다고 가정한다.
		만약 N=5 이고, 격자판의 숫자가 다음과 같다면 봉우리의 개수는 10개입니다.
		입력
		첫 줄에 자연수 N이 주어진다.(2<=N<=50)
		두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
		출력
		봉우리의 개수를 출력하세요.
	 */
	
	public int mySol(int cnt, int[][] arr) {
		//내 아이디어: 7*7배열의 내부 5*5배열 원소 기준으로 arr[i][j]와 상, 하(arr[i-1][j], arr[i+1][j]), 좌, 우(arr[i][j-1], arr[i][j+1]) 크기 비교
		//arr[i][j]가 가장 크다면 ans++
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
		//인강 아이디어: 상하좌우 좌표를 미리 int배열인 dx, dy로 초기화 해놓음. (int[] dx = {-1, 0, 1, 0}/int[] dy = {0, 1, 0, -1})
		//for문 돌려서 arr[i][j]와 arr[i+dx][i+dy]를 비교.
		//나처럼 바깥 범위까지 포함해서 배열을 크게 안 만들고 i+dx, i+dy 값을 0과 cnt 사이로 제한함.
		//깔끔하고 좋다. 4방이 아니라 8방 비교하는 문제도 있는데 if로 하면 조건 다 걸어야 함.
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
