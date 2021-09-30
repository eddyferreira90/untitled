package org.academia.bootcamp;

public class GrumpyGenie extends Genie{


    public GrumpyGenie(int maxWishes) {
        super(1);
    }

    @Override
    public boolean grantWish() {
        if(getWishesGranted() < 1){

        }
    }
}
