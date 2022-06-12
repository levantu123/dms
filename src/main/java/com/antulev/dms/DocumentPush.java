package com.antulev.dms;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class DocumentPush {
	
	private String content;
	
	private List<MultipartFile> file;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public List<MultipartFile> getFile() {
		return file;
	}

	public void setFile(List<MultipartFile> file) {
		this.file = file;
	}
}
