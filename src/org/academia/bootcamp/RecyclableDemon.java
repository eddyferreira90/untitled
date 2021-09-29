package org.academia.bootcamp;

public class RecyclableDemon extends Genie{

    private boolean wasRecycled;
    private Lamp lamp;

    public void recycle(){
        wasRecycled = true;
    }

    public RecyclableDemon(int maxWishes) {
        super(maxWishes);
        wasRecycled = false;
    }

    public boolean canGrantWish(){
        return !wasRecycled;
    }

    public boolean isWasRecycled(){
        return wasRecycled;
    }
}
