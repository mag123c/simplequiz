//
//	public static void Crawl() throws IOException{
//		String url = "https://www.melon.com/chart/search/list.htm?chartType=AG&age=" + years + "&classCd=KPOP&moved=Y";
//		Document doc = Jsoup.connect(url)
//				.userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Sfari/537.36")
//				.header("scheme", "https")
//				.header("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7")
//				.header("accept-encoding", "gzip, deflate, br")
//				.header("accept-language", "Accept-Language: ko-KR,ko;q=0.9,en-US;q=0.8,en;q=0.7")
//				.header("cache-control", "no-cache")
//				.header("upgrade-insecure-requests", "1")				
//				.get();	
//		System.out.println(doc.toString());
//}

package com.solo.quiz.crawling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawling {
	
	static int years = 0;

	public Crawling(int years) {
		Crawling.years = years;
	}
	
	public static List<SongVO> Crawl(int num) {
		List<SongVO> list = new ArrayList<>();
//		String url = "https://www.melon.com/chart/search/list.htm?chartType=AG&age="+years+"&classCd=KPOP&moved=Y";
		String url = "https://www.melon.com/chart/age/list.htm?idx=1&chartType=AG&chartGenre=KPOP&chartDate="+years+"&moved=Y";
		Document doc;
		try {
			doc = Jsoup.connect(url)
					.userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Sfari/537.36")
					.get();
			Elements titles = doc.select("div[class=\"ellipsis rank01\"]");
			Elements singers = doc.select("div[class=\"ellipsis rank02\"]");
			for(int i=0; i<titles.size(); i++) {
				Element title = titles.get(i);
				Element singer = singers.select("span.checkEllipsis").get(i);
				String titleStr = title.text();
				String singerStr = singer.text();
				
				SongVO vo = new SongVO(titleStr, singerStr);
				list.add(vo);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
}

