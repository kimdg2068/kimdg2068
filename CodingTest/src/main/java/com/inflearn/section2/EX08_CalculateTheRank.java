package com.inflearn.section2;

import java.util.Scanner;

public class EX08_CalculateTheRank {
	/*
	 	����
		N���� �л��� ���������� �ԷµǸ� �� �л��� ����� �Էµ� ������� ����ϴ� ���α׷��� �ۼ��ϼ���.
		���� ������ �Էµ� ��� ���� ����� ���� ó���Ѵ�.
		�� ���� ���� ������ 92���ε� 92���� 3�� �����ϸ� 1���� 3���̰� �� ���� �л��� 4���� �ȴ�.
		�Է�
		ù �ٿ� N(3<=N<=100)�� �Էµǰ�, �� ��° �ٿ� ���������� �ǹ��ϴ� N���� ������ �Էµȴ�.
		���
		�Էµ� ������� ����� ����Ѵ�
	 */
	
	public String mySol(int cnt, int[] scores) {
		//�� ���̵��: ���� for������ �ڱ� ������ ��� ���ҿ� ���ؼ� �ڱ⺸�� ū ������ ������ rank++�ؼ� StringBuilder�� �߰�.
		StringBuilder ans = new StringBuilder();
		int rank;
		for(int i=0; i<cnt; i++) {
			rank = 1;
			int curNum = scores[i];
			for(int j=0; j<cnt; j++) {
				if(curNum < scores[j]) rank++;
			}
			ans.append(rank + " ");
		}
		
		return ans.toString();
	}

	public static void main(String[] args) {
		EX08_CalculateTheRank cr = new EX08_CalculateTheRank();
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] scores = new int[cnt];
		for(int i=0; i<cnt; i++) {
			scores[i] = sc.nextInt();
		}
		System.out.println(cr.mySol(cnt, scores));
	}
}
