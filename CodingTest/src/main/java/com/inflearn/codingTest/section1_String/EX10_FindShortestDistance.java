package com.inflearn.codingTest.section1_String;

import java.util.ArrayList;
import java.util.Scanner;

public class EX10_FindShortestDistance {
	/*
	 	����
		�� ���� ���ڿ� s�� ���� t�� �־����� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �ּҰŸ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		�Է�
		ù ��° �ٿ� ���ڿ� s�� ���� t�� �־�����. ���ڿ��� ���ڴ� �ҹ��ڷθ� �־����ϴ�.
		���ڿ��� ���̴� 100�� ���� �ʴ´�.
		
		���
		ù ��° �ٿ� �� ���ڿ� s�� �� ���ڰ� ���� t�� ������ �Ÿ��� ������� ����Ѵ�.
	 */
	
	public String mySol(String str, char cha) {
		/*
		 * �� ���̵��
		 * 1. ����t�� ��� idx�� ���ؼ� int[]�� ����ִ´�.
		 * 2. i�� int[]�� idx�� ���� ���ؼ� �ּҰ��� StringBuilder�� �߰��Ѵ�.(1�� ������ �ٷ� ����)
		 * --> str.charAt(i)�� cha�� ���� ���� sb�� �ٷ� 0 �߰�
		 */
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> charIdxs = new ArrayList<Integer>();
		int idx = 0;
		while(true) {
			idx = str.indexOf(cha, idx);
			if(idx == -1) {
				break;
			}
			charIdxs.add(idx);
			idx++;
		}
		
		for(int i=0; i<str.length(); i++) {
			int minDis = 99;
			if(str.charAt(i) == cha) {
				minDis = 0;
			} else {
				for(int j=0; j<charIdxs.size(); j++) {
					int diff = Math.abs(i - charIdxs.get(j));
					if(minDis > diff) {
						minDis = diff;
					}
					if(minDis == 1) {
						break;
					}
				}
			}
			sb.append(minDis + " ");
		}
		
		return sb.toString();
	}
	
	public int[] solution(String str, char cha) {
		//�ΰ� ���̵��: �Ÿ����� �����س��� ���ڿ����� cha�� ���� ������ 0���� �ʱ�ȭ, �ƴ� ��� +1
		//�� ������ ���ڿ� ���ʺ��� �ѹ�, �����ʺ��� �ѹ� �ݺ��ؼ� �ּ� �Ÿ��� ã��
		//�� ���ڰ� �ڽ��� ���ʿ� �ִ� cha�� �����ʿ� �ִ� cha���� �Ÿ����� ���ϰ� �ǹǷ� �ּ� �Ÿ��� ã�� �� ����.
		//���ڿ� ���̸�ŭ �ι��� ���Ƽ� �� ������ �� �ֳ�.. ���δ� �ٵ� �� �� list ��Ĥ�������
		int[] ans = new int[str.length()];
		int minDis = 99;
		for(int i=0; i<ans.length; i++) {
			if(str.charAt(i) == cha) minDis = 0;
			else minDis++;
			ans[i] = minDis;
		}
		for(int i=ans.length-1; i>=0; i--) {
			if(str.charAt(i) == cha) minDis = 0;
			else minDis++;
			ans[i] = Math.min(ans[i], minDis);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		EX10_FindShortestDistance fsd = new EX10_FindShortestDistance();
		
		Scanner sc = new Scanner(System.in);
		String iptStr = sc.next();
		char iptChar = sc.next().charAt(0);
		//System.out.println(fsd.mySol(iptStr, iptChar));
		for(int n : fsd.solution(iptStr, iptChar)) {
			System.out.print(n + " ");
		}
	}
}
