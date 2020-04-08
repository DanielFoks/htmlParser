package com.rakuten.parser;

import org.jsoup.nodes.Element;

public interface SimpleElementSearcher {
	default Element getSimplePriceElement(final Element mainElement) {
		return mainElement.selectFirst("td > span#priceblock_ourprice");
	}
	
	default Element getSimpleTitleElement(final Element mainElement) {
		return mainElement.selectFirst("#title > span#productTitle");
	}
}
