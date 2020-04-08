package com.rakuten.web;

import java.io.IOException;

import com.rakuten.parser.Item;

public interface HTMLParserService {
	Item getItemByTypeAndName(String type, String fileName) throws IOException;
}
