package com.inflearn.section2;

import java.util.Scanner;

public class EX07_OXQuiz {
	/*
	 	OX ������ �°ų� Ʋ�� �� ����� ���� ������ ������ ���Ѵ�.
		���� ���� OX ������ ������� ���迡�� ���������� ���� ������ ��쿡�� �������� �ֱ� ���ؼ� ������ ���� ���� ����� �ϱ�� �Ͽ���.
		1�� ������ �´� ��쿡�� 1������ ����Ѵ�. ���� ������ ���ؼ��� ���� Ʋ���ٰ� ���� �´� ó�� ������ 1������ ����Ѵ�.
		����, �������� ������ ���� �´� ��쿡�� �� ��° ������ 2��, �� ��° ������ 3��, ..., K��° ������ K������ ����Ѵ�. Ʋ�� ������ 0������ ����Ѵ�.
		���� ���, �Ʒ��� ���� 10 ���� OX �������� ���� ���� ������ ��쿡�� 1�� ǥ���ϰ�, Ʋ�� ��쿡�� 0���� ǥ���Ͽ��� ��,
		���� ����� �Ʒ� ǥ�� ���� ���Ǿ�, �� ������ 1+1+2+3+1+2=10 ���̴�.
		���蹮���� ä�� ����� �־����� ��, �� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		�Է�
		ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ��� N�� ������ ä�� ����� ��Ÿ���� 0 Ȥ�� 1�� �� ĭ�� ���̿� �ΰ� �־�����.
		0�� ������ ���� Ʋ�� ����̰�, 1�� ������ ���� �´� ����̴�.
		���
		ù° �ٿ� �Է¿��� �־��� ä�� ����� ���Ͽ� �������� ������ �� ������ ����Ѵ�.
	 */
	
	public int mySol(int cnt, int[] arr) {
		//�� ���̵��: arr ���Ұ� 1�̸� point ����++, 0������ point���� 0���� �ʱ�ȭ -> ans += point
		int ans = 0;
		int point = 0;
		for(int i=0; i<cnt; i++) {
			if(arr[i] == 1) {
				point++;
			} else {
				point = 0;
			}
			ans += point;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		EX07_OXQuiz quiz = new EX07_OXQuiz();
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
		for(int i=0; i<cnt; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(quiz.mySol(cnt, arr));
	}
}
