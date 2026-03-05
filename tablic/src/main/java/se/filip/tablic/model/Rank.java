package se.filip.tablic.model;

public enum Rank {
    ACE(1, 11), 
    TWO(2), 
    THREE(3), 
    FOUR(4), 
    FIVE(5), 
    SIX(6), 
    SEVEN(7), 
    EIGHT(8), 
    NINE(9), 
    TEN(10), 
    JACK(12), 
    QUEEN(13), 
    KING(14);

    private final int[] values;

    private Rank(int... value){
        this.values = value;
    }

    public int[] getValues(){
        return values;
    }
}