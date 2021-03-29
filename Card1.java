package pack15;

import java.util.ArrayList;
import java.util.Objects;

public class Card1 {
    public int rank;//牌面
    public String suit;//花色


    public Card1(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("[%s, %s]", suit, toRank(rank));
    }

    public String toRank(int rank) {
        switch (rank) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "k";
            default:
                return String.valueOf(rank);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card1 card1 = (Card1) o;
        return rank == card1.rank &&
                Objects.equals(suit, card1.suit);
    }

//    @Override
//    public int hashCode() {
//
//        return Objects.hash(rank, suit);
//    }
//
//    public static void myEquals(String[] args) {
//
//    }



}
