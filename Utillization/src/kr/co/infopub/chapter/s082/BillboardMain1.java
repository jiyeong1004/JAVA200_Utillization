// 082. ������ ��Ʈ �������� ����ϴ� ������ ���ڿ�
package kr.co.infopub.chapter.s082;

public class BillboardMain1 {

	public static void main(String[] args) {
		int rank = 1;  // ���� ����
		String song = "Despacito";  // ���ڿ� ����
		
		// Data�� �׸��� ��´�.
		int lastweek = 1;
		String imagesrc = "https://www.billboard.com/images/pref_images/q61808osztw.jpg";
		String artist = "luis fonsi";
		String sf = String.format("%d,  %s, %d, %s, %s", rank, song, lastweek, imagesrc, artist);
		System.out.println(sf);
	}
}
