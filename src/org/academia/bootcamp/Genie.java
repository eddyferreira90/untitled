package org.academia.bootcamp;

public class Genie {

    private int maxWishes;
    private int wishesGranted;

    public Genie(int maxWishes){
        this.maxWishes = maxWishes;
        this.wishesGranted = 0;
    }

    public int getMaxWishes() {
        return maxWishes;
    }

    public int getWishesGranted() {
        return wishesGranted;
    }

    public void increaseGranted(){
        wishesGranted++;
    }

    public boolean wishesAvailable(){
        return wishesGranted < maxWishes;
    }

    public boolean grantWish(){
         if (wishesAvailable()){
             increaseGranted();
             return true;
         }
         return false;
    }
}
