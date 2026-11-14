package com.midas.core.service;

import com.midas.core.model.Transaction;
import org.springframework.stereotype.Service;
import java.util.*;

// logic antha ikkade untundi, controller just pilusthundi
@Service
public class TransactionService {

    // DB inka pettaledu, andhuke ippatiki list lo dhaachuthunna
    // tharuvatha DB vachaka idi theeseseyali
    private List<Transaction> allTransactions = new ArrayList<>();

    public Transaction transfer(Transaction t) {

        System.out.println("transfer start ayyindi : " + t.fromAccount + " -> " + t.toAccount);

        // amount 0 leka minus vasthe aapali, ala pampaleru ga
        if (t.amount <= 0) {
            throw new RuntimeException("amount 0 kante ekkuva undali bro");
        }

        // okate account ki pampukunte waste kadha, andhuke aaputhunna
        if (t.fromAccount.equals(t.toAccount)) {
            throw new RuntimeException("from and to okate, kudharadhu");
        }

        // id lekapothe bank lo track cheyalem, andhuke UUID pedthunna
        t.id = UUID.randomUUID().toString();
        t.status = "SUCCESS";

        allTransactions.add(t);

        System.out.println("transfer aipoyindi, id = " + t.id);
        return t;
    }

    // anni transactions chupinchadaniki idi
    public List<Transaction> getAll() {
        return allTransactions;
    }
}