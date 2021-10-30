package model;

public class Auctioneer extends Subject {

    private String name;
    private double currentBid;

    public Auctioneer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCurrentBid() {
        return currentBid;
    }

    public void acceptBid(double bid) {
        if (bid <= currentBid) {
            System.out.println("That bid isn't larger than the current bid!");
        } else {
            currentBid = bid;
            notifyObservers(this, bid);
        }
    }

    public void notifyObservers(double bid) {
        notifyObservers(this,bid);
    }
}
