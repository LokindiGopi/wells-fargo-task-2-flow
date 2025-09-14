package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long Portfolioid;

    @ManyToMany
    @JoinColumn(name = "clientID", referencedColumnName = "ClientID")
    private Client ClientID;

    @Column(nullable = false)
    private String creationdate;

    public long getPortfolioid() {
        return Portfolioid;
    }

    public void setPortfolioid(long portfolioid) {
        Portfolioid = portfolioid;
    }

    public Client getClientID() {
        return ClientID;
    }

    public void setClientID(Client clientID) {
        ClientID = clientID;
    }

    public String getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(String creationdate) {
        this.creationdate = creationdate;
    }
}
