package com.amazon.website.amazonWebsite;

import com.amazon.website.pages.*;

public class AmazonWebsite {
    public Home home;
    public Product product;
    public ResultSearch resultSearch;
    public Cart cart;
    public TodayDeals todayDeals;

    public AmazonWebsite(){
        home = new Home();
    }
}
