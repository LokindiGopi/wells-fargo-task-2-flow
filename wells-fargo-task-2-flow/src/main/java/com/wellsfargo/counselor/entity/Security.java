package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;
import jdk.jfr.Timestamp;

import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long SecurityID;

    @ManyToMany
    @JoinColumn(name = "Portfolioid", referencedColumnName = "Portfolioid")
    private Portfolio portfolioID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String Category;

    @Column(nullable = false)
    private int purchaseprice;

    @Column(nullable = false)
    private Timestamp purchaseDate;

    @Column(nullable = false)
    private int Quantity;

    public long getSecurityID() {
        return SecurityID;
    }

    public void setSecurityID(long securityID) {
        SecurityID = securityID;
    }

    public Portfolio getPortfolioID() {
        return portfolioID;
    }

    public void setPortfolioID(Portfolio portfolioID) {
        this.portfolioID = portfolioID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public int getPurchaseprice() {
        return purchaseprice;
    }

    public void setPurchaseprice(int purchaseprice) {
        this.purchaseprice = purchaseprice;
    }

    public Timestamp getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Timestamp purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
