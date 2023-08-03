package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    // search feature
    By SearchField = By.id("small-searchterms");
    By SearchButton =  By.cssSelector("button[class=\"button-1 search-box-button\"]");
    By ProductsItem = By.className("product-item");
    By SKU = By.className("sku");

    //follow us feature
    By FaceBookButton = By.className("facebook");
    By TwitterButton = By.className("twitter");
    By RssButton = By.className("rss");
    By YouTubeButton = By.className("youtube");


    public WebElement searchField(){return Hooks.driver.findElement(SearchField);}
    public WebElement searchButton(){return Hooks.driver.findElement(SearchButton);}
    public List<WebElement> productsItem(){return Hooks.driver.findElements(ProductsItem);}
    public WebElement sku(){return Hooks.driver.findElement(SKU);}

    public WebElement faceBookButton(){return Hooks.driver.findElement(FaceBookButton);}
    public WebElement twitterButton(){return Hooks.driver.findElement(TwitterButton);}
    public WebElement rssButton(){return Hooks.driver.findElement(RssButton);}
    public WebElement youTubeButton(){return Hooks.driver.findElement(YouTubeButton);}

}
