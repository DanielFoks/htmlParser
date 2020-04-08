package com.rakuten.web;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rakuten.parser.AppleParser;
import com.rakuten.parser.CarParser;
import com.rakuten.parser.GeneralParser;
import com.rakuten.parser.Item;
import com.rakuten.parser.Parser;

@Service
public class HTMLParserServiceImpl implements HTMLParserService {
	
	private final static String APPLE_TYPE = "apple";
	private final static String CAR_TYPE = "car";
	
	@Override
	public Item getItemByTypeAndName(String type, String fileName) throws IOException {
		final String htmlContent;
		try (final BufferedReader reader = new BufferedReader(
				new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("amazon/" + type + File.separator + fileName)))) {
			htmlContent = reader.lines().parallel().collect(Collectors.joining());
		}
		
		return this.getParserByType(type).parse(htmlContent);
	}
	
	private Parser getParserByType(String type) {
		switch (type) {
			case APPLE_TYPE:
				return new AppleParser();
			case CAR_TYPE:
				return new CarParser();
			default:
				return new GeneralParser();
		}
	}
}
