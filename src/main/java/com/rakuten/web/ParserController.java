package com.rakuten.web;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.parser.Item;

@RestController
public class ParserController {
	
	private final HTMLParserService htmlParserService;
	
	@Autowired
	public ParserController(final HTMLParserService htmlParserService) {
		this.htmlParserService = htmlParserService;
	}
	
	@GetMapping("/amazon/{type}/{fileName}")
	public Item getItemByType(@PathVariable final String type, @PathVariable final String fileName) throws IOException {
		return this.htmlParserService.getItemByTypeAndName(type, fileName);
	}
	
	@ExceptionHandler({IOException.class, NullPointerException.class})
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public void handleException() {
	}
}
