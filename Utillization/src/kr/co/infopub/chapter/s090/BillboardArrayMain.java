// 090. ������ ��Ʈ ������Ʈ���� ������ �о� ����Ʈ�� �����ϱ�
package kr.co.infopub.chapter.s090;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class BillboardArrayMain {

	public static void main(String[] args) {
		ArrayList<String> htmls = new ArrayList<String>();
		String newUrls = "https://www.billboard.com/charts/hot-100/";
		URL url = null;
		try {
			url = new URL(newUrls);  // �ּ� ã��
			// �ּ����� ���� �ȱ�
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(url.openStream(), "euc-kr"), 8);
			String line = null;
			while((line = reader.readLine()) != null) {
				if(!line.trim().equals("")) {
					htmls.add(line.trim());
				}
			}
		} catch(Exception e) {
			System.out.println("Billboard Parsing error !!!");
		}
		// ArrayList�� ����� ���ڿ��� ���
		for(String str : htmls) {
			System.out.println(str);
		}
	}
}