package model;

import java.util.Random;

public class Bidder implements Observer {

    private String name;
    private double maxBid;
    private double personalBid;
    private double currentBid;

    public Bidder(String name, double maxBid) {
        this.name = name;
        this.maxBid = maxBid;
    }

    @Override
    public void update(Subject suj, Object obj) {
        Double bid = (Double) obj;
        currentBid = bid;
        System.out.println("Bidder " + name + " has been updated with recent bid " + bid.toString());
        if (bid < maxBid) {
            makeBid(currentBid);
        } else {
            System.out.println("I can't bid any higher!");
        }
    }

    public void makeBid(double bid) {
        Random random = new Random();
        personalBid = bid + random.nextInt(10);
        System.out.println(getName() + " is bidding " + personalBid);
    }

    public double getPersonalBid() {
        return personalBid;
    }

    public double getMaxBid() {
        return maxBid;
    }

    public String getName() {
        return name;
    }
}
