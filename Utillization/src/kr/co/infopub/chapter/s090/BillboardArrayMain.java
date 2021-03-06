// 090. 빌보드 차트 웹사이트에서 정보를 읽어 리스트에 저장하기
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
			url = new URL(newUrls);  // 주소 찾기
			// 주소지에 빨대 꽂기
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
		// ArrayList에 저장된 문자열을 출력
		for(String str : htmls) {
			System.out.println(str);
		}
	}
}
