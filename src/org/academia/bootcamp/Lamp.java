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





                    }
}
