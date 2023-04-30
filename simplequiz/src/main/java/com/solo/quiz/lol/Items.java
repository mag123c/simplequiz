package com.solo.quiz.lol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.JSONObject;


public class Items {
	
	public String[] version = new String[] {"3.15.5", "13.8.1"};

	public List<Map<String, String>> getItems() {
		List<Map<String, String>> list = new ArrayList<>();

		for(String v : version) {
			String url = "https://ddragon.leagueoflegends.com/cdn/"+v+"/data/ko_KR/item.json";
			
			try {
				URL u = new URL(url);
				HttpURLConnection conn = (HttpURLConnection) u.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("Accept", "application/json");
				
				if(conn.getResponseCode() != 200) {
					throw new RuntimeException("Http code : " + conn.getResponseCode());
				}
				
				/*
				 * 1. br : JSON data read
				 * 2. sb : JSON to String
				 * 3. jsonobj : JSON parsing
				 */
				
				BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
				
				StringBuilder sb = new StringBuilder();
				String txt;
				while((txt = br.readLine()) != null){
					sb.append(txt);
				}
				String result = sb.toString();
				
				JSONObject json = new JSONObject(result);
				JSONObject data = json.getJSONObject("data");
				
	            Iterator<String> keys = data.keys();
	            while(keys.hasNext()) {
					Map<String, String> map = new HashMap<>();
	                String key = keys.next();
	                JSONObject itemObj = data.getJSONObject(key);
	                String name = itemObj.getString("name").replaceAll("\\s", "");
	                //신발 마법부여 없앰, 기타 issue 없앰
	                if(name.contains("(") || name.contains(":") || name.contains("닢") || name.contains("갱플랭크")) continue;
	                JSONObject imageObj = itemObj.getJSONObject("image");
	                String image = imageObj.getString("full");	                 
	                map.put(name, "https://ddragon.leagueoflegends.com/cdn/"+v+"/img/item/"+image);
	                list.add(map);
	            }
                
				conn.disconnect();			
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;		
	}
	
}
