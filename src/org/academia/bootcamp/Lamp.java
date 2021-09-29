package org.academia.bootcamp;

public class Lamp {

    private int maxGenies;
    private int totalRubs;
    private int currentRubs;
    private int demons;

    public Lamp(int maxGenies){
        this.maxGenies = maxGenies;
        totalRubs = 0;
        currentRubs = 0;
        demons = 0;
    }


    public int getMaxGenies(){
        return maxGenies;
    }

    public int getTotalRubs() {
        return totalRubs;
    }

    public int getCurrentRubs(){
        return currentRubs;
    }

    public int nGenies(){
        getMaxGenies() - getCurrentRubs();
    }
    public int nDemons(){
        return demons;
    }


    public boolean isEqual(Lamp lamp) {
        return getMaxGenies() == lamp.getMaxGenies() &&
                nGenies() == lamp.nGenies() && nDemons() == lamp.nDemons();
    }




    public rubLamp(int wishes) {
        Genie genie;
        if (currentRubs < maxGenies) {
            currentRubs++;
            totalRubs++;
            if (totalRubs % 2 == 0) {
                genie = new FriendlyGenie(wishes);
                return genie;
            }
            Genie genie = new GrumpyGenie(wishes);
                    return genie;
            }
            return demon = (demon ? demon : new RecyclableDemon(wishes));

                void feedDemon(RecyclableDemon demon) {
                    if (demon != demon) return;
                    if (!demon-> ) {
                        demon->recycle();
                        delete _demon;
                       _demon = NULL;
                       currentRubs = 0;
                        _demons++;
                    }
}
