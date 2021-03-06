// 086. 빌보드 차트 정보를 파일로 저장하기
package kr.co.infopub.chapter.s086;

import java.io.File;
// 파일 저장
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import kr.co.infopub.chapter.s083.Billboard;

public class BillFileWriter {

	public static void main(String[] args) {
		Billboard b1 = new Billboard(1, "Despacito", 1, 
				"https://www.billboard.com/images/pref_images/q61808osztw.jpg", "luis fonsi");
		Billboard b2 = new Billboard(2, "That's What I Like", 2, 
				"https://www.billboard.com/images/pref_images/q59725qvpol.jpg", "bruno mars");
		Billboard b3 = new Billboard(3, "I'm The One", 3, 
				"https://www.billboard.com/images/pref_images/q64532p164.jpg", "dj khaled");
		
		ArrayList<Billboard> bblist = new ArrayList<>();
		bblist.add(b1);
		bblist.add(b2);
		bblist.add(b3);
		
		File f = new File("billboard");
		if(!f.exists()) { f.mkdirs(); }
		try(PrintWriter pw = new PrintWriter(new FileWriter("billboard\\bill.txt", false), true)){
			for(Billboard bb : bblist) {
				pw.println(bb);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
