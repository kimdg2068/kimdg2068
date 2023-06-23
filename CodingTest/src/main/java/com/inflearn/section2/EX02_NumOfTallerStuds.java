package com.inflearn.section2;

import java.util.Scanner;

public class EX02_NumOfTallerStuds {
	/*
	 	����
		�������� N���� �л��� �Ϸķ� �������ϴ�. �Ϸķ� �� �ִ� �л��� Ű�� �տ������� ������� �־��� ��, �� �տ� �� �ִ�
		�������� �� �� �ִ� �л��� ���� ���ϴ� ���α׷��� �ۼ��ϼ���. (�տ� �� �ִ� ����麸�� ũ�� ���̰�, �۰ų� ������ ������ �ʽ��ϴ�.)
		�Է�
		ù �ٿ� ���� N(5<=N<=100,000)�� �Էµȴ�. �� �����ٿ� N���� �л��� Ű�� �տ������� ������� �־�����.
		���
		�������� �� �� �ִ� �ִ��л����� ����Ѵ�.
	 */
	
	public int mySol(int cnt, int[] arr) {
		//�� ���̵��: i��°(i�� 1����) ���� 0���� i-1��° ������ ��� ū ��쿡�� ans++;
		//���� for�� ������ �Ǵµ� �ð����⵵ ���� �ٸ� ����� ����?
		//�� ���̵��2: ù ���� max�� ��Ƴ��� �ѹ��� ���鼭 max���� ū ��쿡�� max�� �ʱ�ȭ�ϰ� ans++�ϸ� �ǰڴ�.
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
		//�ΰ� ���̵��: �� ���̵��2�� �Ȱ�����.
		//�������ڸ��� ����for�� ��������? �ٵ� �׷��� �ð����� ������ �ȵ˴ϴ�. �φ�������������
		//�ѹ� �� �����ϱ� ���߱�.
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
