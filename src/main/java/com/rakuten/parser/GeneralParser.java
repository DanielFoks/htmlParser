package com.rakuten.parser;

import java.util.stream.Collectors;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

public class GeneralParser implements Parser, SimpleElementSearcher {
	@Override
	public Item parse(final String input) {
		//change to Optional.ofNullable() if we are unsure of data
		Element mainTable = Jsoup.parse(input).body();
		String category = mainTable.selectFirst("#wayfinding-breadcrumbs_feature_div > ul").children().parallelStream().map(Element::text).collect(Collectors.joining(" "));
		String title = this.getSimpleTitleElement(mainTable).text();
		Element priceE = this.getSimplePriceElement(mainTable);
		if (priceE == null) {
			priceE = mainTable.selectFirst("span.a-size-base.a-color-price.a-color-price");
		}
		
		return new Item(title, category, priceE.text());
	}
}