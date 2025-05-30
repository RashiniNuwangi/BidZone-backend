package com.chandimal.auctionApp.Service;

import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public abstract class BidObserver {
    protected  abstract void updateHighestBid(Long auction_id, CompletableFuture<Double> newHighestBid);
}
