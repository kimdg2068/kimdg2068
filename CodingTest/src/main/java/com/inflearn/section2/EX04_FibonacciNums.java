package com.inflearn.section2;

import java.util.Scanner;

public class EX04_FibonacciNums {
	/*
	 	����
		1) �Ǻ���Ű ������ ����Ѵ�. �Ǻ���ġ �����̶� ���� 2���� ���� ���Ͽ� ���� ���ڰ� �Ǵ� �����̴�.
		2) �Է��� �Ǻ���ġ ������ �� ���� �� �̴�. ���� 7�� �ԷµǸ� 1 1 2 3 5 8 13�� ����ϸ� �ȴ�.
		�Է�
		ù �ٿ� �� �׼� N(3<=N<=45)�� �Էµȴ�.
		���
		ù �ٿ� �Ǻ���ġ ������ ����մϴ�.
	 */
	
	public int[] mySol(int cnt) {
		//�� ���̵��: ũ�Ⱑ cnt�� �迭�� 1,1,2�� �־�ΰ� �ݺ����� ���� i=3���� i-1 + i-2 ����� �ʱ�ȭ.
		//���� ���̵��: �Ȱ����� 1,1�� �ְ� i=2���� ������ ��. �׷���?
		int[] ans = new int[cnt];
		ans[0] = 1;
		ans[1] = 1;
		ans[2] = 2;
		
		for(int i=3; i<cnt; i++) {
			ans[i] = ans[i-1] + ans[i-2];
		}
		return ans;
	}

	public static void main(String[] args) {
		EX04_FibonacciNums fn = new EX04_FibonacciNums();
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		for(int n : fn.mySol(cnt)) {
			System.out.print(n + " ");
		}
	}

}
