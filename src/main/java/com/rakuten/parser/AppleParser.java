package com.rakuten.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

public class AppleParser implements Parser, SimpleElementSearcher {
	@Override
	public Item parse(final String input) {
		//change to Optional.ofNullable() if we are unsure of data
		//category can be hardcoded for Apple
		Element mainTable = Jsoup.parse(input).body();
		String category = mainTable.selectFirst("div > #mbc").attr("data-brand");
		String title = this.getSimpleTitleElement(mainTable).text();
		String price = this.getSimplePriceElement(mainTable).text();
		
		return new Item(title, category, price);
	}
}
