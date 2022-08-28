package com.ksrtc.website.ksrtcWebsite;

import com.ksrtc.website.pages.Home;
import com.ksrtc.website.pages.Booking;
import com.ksrtc.website.pages.Payment;

public class KsrtcWebsite {

    public Home home;
    public Booking booking;
    public Payment payment;

    public KsrtcWebsite(){
        home = new Home();
    }
}
