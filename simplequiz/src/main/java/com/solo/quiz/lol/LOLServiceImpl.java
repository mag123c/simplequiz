package com.solo.quiz.lol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class LOLServiceImpl implements LOLService {

	@Override
	public List<Map<String, String>> getItems() {
		List<Map<String, String>> itemList = new ArrayList<>();
		Items items = new Items();
		itemList = items.getItems();
		Collections.shuffle(itemList);
		
		//10문제만, 차후 확장 어떻게 할지 생각하기 - 0429
		List<Map<String, String>> item = new ArrayList<>();
		for(int i=0; i<10; i++) {
			item.add(itemList.get(i));
		}	

		return item;
	}

}
