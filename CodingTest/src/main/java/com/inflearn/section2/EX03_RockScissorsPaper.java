package com.inflearn.section2;

import java.util.Scanner;

public class EX03_RockScissorsPaper {
	/*
	 * ����
		A, B �� ����� ���������� ������ �մϴ�. �� N���� ������ �Ͽ� A�� �̱�� A�� ����ϰ�, B�� �̱�� B�� ����մϴ�. ��� ��쿡�� D�� ����մϴ�.
		����, ����, ���� ������ 1:����, 2:����, 3:���� ���ϰڽ��ϴ�.
		�� ����� �� ȸ�� ����, ����, �� ������ �־����� �� ȸ�� ���� �̰���� ����ϴ� ���α׷��� �ۼ��ϼ���.
		�Է�
		ù ��° �ٿ� ���� Ƚ���� �ڿ��� N(1<=N<=100)�� �־����ϴ�.
		�� ��° �ٿ��� A�� �� ����, ����, �� ������ N�� �־����ϴ�.
		�� ��° �ٿ��� B�� �� ����, ����, �� ������ N�� �־����ϴ�.
		���
		�� �ٿ� �� ȸ�� ���ڸ� ����մϴ�. ����� ���� D�� ����մϴ�. 
	 */
	
	public String mySol(int cnt, int[] infoA, int[] infoB) {
		//�� ���̵��: A�� B�� ������ ���� �������� �ɰ��� ���������� ���и� ���ϰ� StringBuilder�� ����.
		//for�� �ѹ��� ������ �Ǵϱ� ȿ�������� �ʳ�? �ణ �ָ��� �� String ��ü�� ���� �����ϴ� ��? �׳� for�� �ι��� ����?
		//for�� �ѹ��� ������ �ǰڴ�. cnt*2��ŭ ������ i �������� cnt-1������ a�迭�� �ְ� �������� b�迭�� ������.. 
		//���������� ������ ��� ������ sb�� D �߰�, ���̰� 1�� ��� ū �� �߰�, ���̰� 2�� ��� ���� �� �߰�
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<cnt; i++) {
			int numA = infoA[i];
			int numB = infoB[i];
			int diff = Math.abs(numA - numB);
			char result = 'D';
			if(diff == 1) {
				if(numA > numB) result = 'A';
				else result = 'B';
			} else if(diff == 2) {
				if(numA < numB) result = 'A';
				else result = 'B';
			}
			sb.append(result);
		}
		
		return sb.toString();
	}
	
	public String solution(int cnt, int[] infoA, int[] infoB) {
		//���� ���̵��: int �迭 �ΰ� ���� ��, a b ���� ���� 'D', a=1, b=3/a=2, b=1/a=3, b=2�� ���� 'A', �������� 'B'�� ����.
		//�׳� ��� ���� �� ����. ���� ������ ���̷��� �ߴµ� �׷� �� ������ �����.. ���� ȿ������ ����?
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<cnt; i++) {
			if(infoA[i] == infoB[i]) sb.append("D");
			else if(infoA[i] == 1 && infoB[i] == 3) sb.append("A");
			else if(infoA[i] == 2 && infoB[i] == 1) sb.append("A");
			else if(infoA[i] == 3 && infoB[i] == 2) sb.append("A");
			else sb.append("B");
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		EX03_RockScissorsPaper rsp = new EX03_RockScissorsPaper();
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] infoA = new int[cnt];
		int[] infoB = new int[cnt];
		for(int i=0; i<cnt*2; i++) {
			if(i < cnt) {
				infoA[i] = sc.nextInt();
			} else {
				infoB[i-cnt] = sc.nextInt();
			}
		}
//		for(char c : rsp.mySol(cnt, infoA, infoB).toCharArray()) {
//			System.out.println(c);
//		}
		for(char c : rsp.solution(cnt, infoA, infoB).toCharArray()) {
			System.out.println(c);
		}
	}
}
