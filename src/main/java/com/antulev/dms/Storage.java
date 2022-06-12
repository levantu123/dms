package com.antulev.dms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class Storage {
	private List<Map<String, Object>> pushes = new ArrayList<>();

	
	public void push(DocumentPush push) throws IOException {
		Map<String, Object> newPush = new HashMap<>();
		newPush.put("content", push.getContent());

		List<Map<String, Object>> files = new ArrayList<>();
		for(var i = 0; i < push.getFile().size(); i++) {
			Map<String, Object> file = new HashMap<>();
			file.put("name", push.getFile().get(i).getOriginalFilename());
			file.put("data", push.getFile().get(i).getBytes());
			files.add(file);
		}
		newPush.put("files", files);
		this.pushes.add(newPush);
	}


	public List<Map<String, Object>> getPushes() {
		return pushes;
	}
	
}
