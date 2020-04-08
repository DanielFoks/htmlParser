# Rakuten interview test project (html parser)

## Description

Parsing the html-pages, extracting the fields of interest.

## Task

1. Given html pages samples in test resources, provide a Parser interface implementation(s) extracting item name, item price and item category, unit test are provided for your convenience.
2. Pack a web-application based on your implementation into a docker container, with a http rcp endpoint exposed: submitting an html page url to it, must return parsed values.


## Docker guide
1. Build the application (run gradle bootWar task)
2. Put Dockerfile to same folder with generated .war file and open terminal there
3. In the terminal:
- docker build -f Dockerfile -t htmlparser .
- docker run -p 8080:8080 -t htmlparser

## Test url
http://localhost:8080/amazon/general/02.html
