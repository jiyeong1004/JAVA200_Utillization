// 094. 빌보드 차트 정보를 CSV로 저장하고 읽기
package kr.co.infopub.chapter.s094;

public class BillboardMain6 {

	public static void main(String[] args) {
		RequestFromBillboardHot rfw = new RequestFromBillboardHot();
		String a = "https://www.billboard.com/charts/hot-100/";
		String rs = rfw.getTimeDate(a);
		// rs = RestDay.toWantedDay(rs, 1);  // 하루 전
		System.out.println(rs);
		rfw.getAllHtml(a + rs);
		String str = "<article class=\"chart-row";
		rfw.getBillboardData(str);
		
		BillboardPrint.printToCSV(rfw.getBillboards(), "billboard\\" + rs + ".csv");
	}
}
