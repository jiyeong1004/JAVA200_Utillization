// 095. 빌보드 차트 정보를 JSON으로 저장하고 읽기
package kr.co.infopub.chapter.s095;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import kr.co.infopub.chapter.s083.Billboard;

public class BillboardPrint {
	public static void printToJSON(List<Billboard> bblist, String fname) {
		try(PrintWriter pw = new PrintWriter(new FileWriter(fname, false), true)){
			pw.println("{\"billboard\":[");
			for(int i = 0; i < bblist.size() - 1; i++) {
				Billboard bb = bblist.get(i);
				pw.println(pair(bb) + ',');
			}
			pw.println(pair(bblist.get(bblist.size() - 1)));
			pw.println("]}");
		} catch(IOException e) {
		}
	}
	
	private static String pair(Billboard bb) {
		String rank = pair("rank", bb.getRank() + "");
		String song = pair("song", bb.getSong() + "");
		String lastweek = pair("lastweek", bb.getLastweek() + "");
		String imagesrc = pair("imagesrc", bb.getImagesrc() + "");
		String artist = pair("artist", bb.getArtist() + "");
		return String.format("{%s, %s, %s, %s, %s}", rank, song, lastweek, imagesrc, artist);
	}
	
	// "key":"value"
	private static String pair(String key, String value) {
		String ss = String.format("\"%s\":\"%s\"", key, value);
		return ss;
	}
	
	// {"key":"value"}
	private static String pairs(String key, String value){
		String ss = String.format("{\"%s\":\"%s\"}", key, value);
		return ss;
	}
}
