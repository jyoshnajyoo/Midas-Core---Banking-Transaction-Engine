package com.midas.core.model;

// idi just data hold cheyadaniki pettina class
// logic em undadhu ikkada, just fields matrame
public class Transaction {

    public String id; // prathi transfer ki oka id untundi

    public String fromAccount; // dabbu pampina vaadi account
    public String toAccount; // dabbu vellina vaadi account

    public double amount; // entha pampado

    // first lo andhariki pending ne, tharuvatha success avuthundi
    public String status = "PENDING";
}