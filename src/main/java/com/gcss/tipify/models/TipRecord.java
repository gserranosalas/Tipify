package com.gcss.tipify.models;

import java.util.Date;

/**
 * Created by gserranosalas on 25-06-16.
 */
public class TipRecord {
    private double bill;
    private int tipPercentange;
    private Date timestamp;

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public int getTipPercentange() {
        return tipPercentange;
    }

    public void setTipPercentange(int tipPercentange) {
        this.tipPercentange = tipPercentange;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
