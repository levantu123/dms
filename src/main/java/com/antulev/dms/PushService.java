package com.antulev.dms;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PushService {
	
	@Autowired
	Storage storage;
	
	public void push(DocumentPush push) throws IOException {
		storage.push(push);
	}

	public List<Map<String, Object>> getAll() {
		return storage.getPushes();
	}
}
