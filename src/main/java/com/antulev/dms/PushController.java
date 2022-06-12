package com.antulev.dms;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PushController {
	
	@Autowired
	PushService pushService;
	
	@PostMapping("/push")
	public Map<String, String> push(DocumentPush push) throws IOException {
		pushService.push(push);
		var message = new HashMap<String, String>();
		message.put("message", "This function should nerver fail");
		return message;
	}
	@GetMapping("/push")
	public List<Map<String, Object>> getAll() {
		return pushService.getAll();
	}
}
