package com.mahyoussef.bloaters.largeclass.example2;

import java.time.LocalDateTime;

public class CardPaymentProcessor {

    private String visaCardNumber;
    private String visaCardHolder;
    private int visaCCN;
    private LocalDateTime visaExpirationDate;

    private String masterCardNumber;
    private String masterCardHolder;
    private int masterCCN;
    private LocalDateTime masterExpirationDate;

    private String maestroCardNumber;
    private String maestroCardHolder;
    private int maestroCCN;
    private LocalDateTime maestroExpirationDate;

    private String virtualCardNumber;
    private String virtualCardHolder;
    private int virtualCCN;
    private LocalDateTime virtualExpirationDate;

    public void processVisaCardPayment(){
        // logic
    }

    public void processMaterCardPayment(){
        // logic
    }

    public void processMaestroCardPayment(){
        // logic
    }

    public void processVirtualCardPayment(){
        // logic
    }

}
