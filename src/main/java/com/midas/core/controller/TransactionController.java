package com.midas.core.controller;

import com.midas.core.model.Transaction;
import com.midas.core.service.TransactionService;
import org.springframework.web.bind.annotation.*;
import java.util.*;

// browser / postman nunchi request vasthe first ikkadike vasthundi
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/transactions")
public class TransactionController {

    private TransactionService service;

    // service ni ikkada theeskuntunna, lekapothe logic ela pilustham
    public TransactionController(TransactionService service) {
        this.service = service;
    }

    // dabbu pampali ante ee API kottandi
    @PostMapping
    public Transaction create(@RequestBody Transaction t) {
        return service.transfer(t);
    }

    // anni transactions chudali ante idi kottandi
    @GetMapping
    public List<Transaction> getAll() {
        return service.getAll();
    }
}