package com.inflearn.section2;

import java.util.Scanner;

public class EX02_NumOfTallerStuds {
	/*
	 	설명
		선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
		선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
		입력
		첫 줄에 정수 N(5<=N<=100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
		출력
		선생님이 볼 수 있는 최대학생수를 출력한다.
	 */
	
	public int mySol(int cnt, int[] arr) {
		//내 아이디어: i번째(i는 1부터) 수가 0부터 i-1번째 수보다 모두 큰 경우에만 ans++;
		//이중 for문 돌리면 되는데 시간복잡도 적은 다른 방법은 없나?
		//내 아이디어2: 첫 수를 max로 잡아놓고 한바퀴 돌면서 max보다 큰 경우에만 max값 초기화하고 ans++하면 되겠다.
		int ans = 1;
		int max = arr[0];
		for(int i=1; i<cnt; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ans++;
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		//인강 아이디어: 내 아이디어2랑 똑같았음.
		//시작하자마자 이중for문 생각했죠? 근데 그러면 시간제한 때문에 안됩니다. 하넼ㅋㅋㅋㅋㅋㅋ
		//한번 더 생각하길 잘했군.
		EX02_NumOfTallerStuds nots = new EX02_NumOfTallerStuds();
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		for(int i=0; i<cnt; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(nots.mySol(cnt, arr));
	}
}
