package com.rakuten.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

public class CarParser implements Parser {
	@Override
	public Item parse(final String input) {
		//change to Optional.ofNullable() if we are unsure of data
		//get the right table to search not in all document
		Element mainTable = Jsoup.parse(input).selectFirst("div.a-fixed-right-grid-col.a-col-right");
		String category = mainTable.selectFirst("a").text();
		String title = mainTable.selectFirst("#product-title > h1").text();
		String price = mainTable.selectFirst("div > span.a-size-base-plus.a-color-price").text();
		
		return new Item(title, category, price);
	}
}