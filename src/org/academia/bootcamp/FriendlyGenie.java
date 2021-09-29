package org.academia.bootcamp;

public class FriendlyGenie extends Genie{


    public FriendlyGenie(int maxWishes) {
        super(maxWishes);
    }

    public int remainingWishes(){
        return getMaxWishes() - getWishesGranted();
    }
}
