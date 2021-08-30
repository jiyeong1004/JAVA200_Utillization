// 087. ������ ������ ��Ʈ ���� ������ �о���̱�
package kr.co.infopub.chapter.s087;

import java.io.BufferedReader;
import java.io.FileReader;

public class BillFileReader {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(
				new FileReader("billboard\\bill.txt"))){
			String msg = "";
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
