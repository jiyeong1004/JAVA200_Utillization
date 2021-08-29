// 084. ������ ��Ʈ�� ��ü�� �����ϰ� ����ϱ�
package kr.co.infopub.chapter.s084;

import kr.co.infopub.chapter.s083.Billboard;

public class BillboardMainObject {

	public static void main(String[] args) {
		Billboard b1 = new Billboard(1, "Despacito", 1, 
				"https://www.billboard.com/images/pref_images/q61808osztw.jpg", "luis fonsi");
		Billboard b2 = new Billboard(2, "That's What I Like", 2, 
				"https://www.billboard.com/images/pref_images/q59725qvpol.jpg", "bruno mars");
		Billboard b3 = new Billboard(3, "I'm The One", 3, 
				"https://www.billboard.com/images/pref_images/q64532pl64x.jpg", "dj khaled");
		
		showAbout(b1);  // 1�� ��ü
		showAbout(b2);  // 1�� ��ü
		showAbout(b1, b2);  // 2�� ��ü
		showAbout(b1, b2, b3);  // 3�� ��ü
		
		Billboard[] b = new Billboard[3];
		b[0] = new Billboard(1, "Despacito", 1, 
				"https://www.billboard.com/images/pref_images/q61808osztw.jpg", "luis fonsi");
		b[1] = b2;  // �����ص� ����, ������ ��ü�� �޾Ƶ� �ȴ�.
		b[2] = b3;
		showAbout(b[0], b[1]);  // 2�� ��ü
		showAbout(b);  // �迭 -> 3�� ��ü
	}
	
	public static void showAbout(Billboard bb) {  // ��ü�� �����Ͽ� ���
		System.out.println("1----------------------");
		String sf = String.format("%d, %s, %d, %s, %s", bb.getRank(), bb.getSong(), bb.getLastweek(), 
				bb.getImagesrc(), bb.getArtist());
		System.out.println(sf);
	}
	
	public static void showAbout(Billboard ... b) {  // ��ü�� �����Ͽ� ���
		System.out.println("2======================>");
		for(Billboard bill : b) {
			showAbout(bill);  // 1
		}
		System.out.println("<======================2");
	}
}