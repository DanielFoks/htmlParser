package com.rakuten;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

import com.rakuten.parser.AppleParser;
import com.rakuten.parser.CarParser;
import com.rakuten.parser.GeneralParser;
import com.rakuten.parser.Item;
import com.rakuten.parser.Parser;

public class ParserTest {

    @Test
    public void parserTestApple() throws IOException {
        Parser parser = new AppleParser();
    
        String apple01 = new String(Files.readAllBytes(Paths.get("src/main/resources/amazon/apple/01.html")));
        Item apple01Item = parser.parse(apple01);
        Assert.assertEquals("Apple AirPods Pro", apple01Item.getName());
        Assert.assertEquals("Apple", apple01Item.getCategory());
        Assert.assertEquals("$249.00", apple01Item.getPrice());
    
        String apple02 = new String(Files.readAllBytes(Paths.get("src/main/resources/amazon/apple/02.html")));
        Item apple02Item = parser.parse(apple02);
        Assert.assertEquals("New Apple MacBook Pro (16-Inch, 16GB RAM, 1TB Storage, 2.3GHz Intel Core i9) - Space Gray", apple02Item.getName());
        Assert.assertEquals("Apple", apple02Item.getCategory());
        Assert.assertEquals("$2,572.93", apple02Item.getPrice());
    
        String apple03 = new String(Files.readAllBytes(Paths.get("src/main/resources/amazon/apple/03.html")));
        Item apple03Item = parser.parse(apple03);
        Assert.assertEquals("Apple MagSafe to MagSafe 2 Converter", apple03Item.getName());
        Assert.assertEquals("Apple", apple03Item.getCategory());
        Assert.assertEquals("$9.99", apple03Item.getPrice());
    
        String apple04 = new String(Files.readAllBytes(Paths.get("src/main/resources/amazon/apple/04.html")));
        Item apple04Item = parser.parse(apple04);
        Assert.assertEquals("Apple Magic Keyboard with Numeric Keypad (Wireless, Rechargable) (US English) - Silver", apple04Item.getName());
        Assert.assertEquals("Apple", apple04Item.getCategory());
        Assert.assertEquals("$119.00", apple04Item.getPrice());
    }

    @Test
    public void parserTestCar() throws IOException {
        Parser parser = new CarParser();
        String car01 = new String(Files.readAllBytes(Paths.get("src/main/resources/amazon/car/01.html")));
        Item car01Item = parser.parse(car01);
        Assert.assertEquals("2020 BMW M5", car01Item.getName());
        Assert.assertEquals("BMW", car01Item.getCategory());
        Assert.assertEquals("$103,695.00", car01Item.getPrice());
    
        String car02 = new String(Files.readAllBytes(Paths.get("src/main/resources/amazon/car/02.html")));
        Item car02Item = parser.parse(car02);
        Assert.assertEquals("2020 BMW 840i Gran Coupe", car02Item.getName());
        Assert.assertEquals("BMW", car02Item.getCategory());
        Assert.assertEquals("$85,895.00", car02Item.getPrice());
    
        String car03 = new String(Files.readAllBytes(Paths.get("src/main/resources/amazon/car/03.html")));
        Item car03Item = parser.parse(car03);
        Assert.assertEquals("2020 BMW 530i xDrive", car03Item.getName());
        Assert.assertEquals("BMW", car03Item.getCategory());
        Assert.assertEquals("$57,195.00", car03Item.getPrice());
    
        String car04 = new String(Files.readAllBytes(Paths.get("src/main/resources/amazon/car/04.html")));
        Item car04Item = parser.parse(car04);
        Assert.assertEquals("2020 BMW M550i xDrive", car04Item.getName());
        Assert.assertEquals("BMW", car04Item.getCategory());
        Assert.assertEquals("$77,645.00", car04Item.getPrice());
    }

    @Test
    public void parserTestGeneral() throws IOException {
        Parser parser = new GeneralParser();
    
        String general01 = new String(Files.readAllBytes(Paths.get("src/main/resources/amazon/general/01.html")));
        Item general01Item = parser.parse(general01);
        Assert.assertEquals("Olympus Tough TG-6 Waterproof Camera, Red", general01Item.getName());
        Assert.assertEquals("Electronics › Camera & Photo › Digital Cameras › Point & Shoot Digital Cameras", general01Item.getCategory());
        Assert.assertEquals("$379.00", general01Item.getPrice());
    
        String general02 = new String(Files.readAllBytes(Paths.get("src/main/resources/amazon/general/02.html")));
        Item general02Item = parser.parse(general02);
        Assert.assertEquals("Designing Distributed Systems: Patterns and Paradigms for Scalable, Reliable Services", general02Item.getName());
        Assert.assertEquals("Books › Computers & Technology › Networking & Cloud Computing", general02Item.getCategory());
        Assert.assertEquals("$26.49", general02Item.getPrice());
    
        String general03 = new String(Files.readAllBytes(Paths.get("src/main/resources/amazon/general/03.html")));
        Item general03Item = parser.parse(general03);
        Assert.assertEquals("Designing Data-Intensive Applications: The Big Ideas Behind Reliable, Scalable, and Maintainable Systems", general03Item.getName());
        Assert.assertEquals("Books › Computers & Technology › Databases & Big Data", general03Item.getCategory());
        Assert.assertEquals("$35.00", general03Item.getPrice());
    
        String general04 = new String(Files.readAllBytes(Paths.get("src/main/resources/amazon/general/04.html")));
        Item general04Item = parser.parse(general04);
        Assert.assertEquals("The DevOps Handbook: How to Create World-Class Agility, Reliability, and Security in Technology Organizations", general04Item.getName());
        Assert.assertEquals("Books › Business & Money › Management & Leadership", general04Item.getCategory());
        Assert.assertEquals("$18.69", general04Item.getPrice());
    }
}
