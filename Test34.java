package pack15;

import java.util.ArrayList;
import java.util.Random;

public class Test34 {
    public static void main(String[] args) {
        Card1 card1 = new Card1(1, "♥");
        Card1 card2 = new Card1(11, "♠");
        System.out.println(card1);
        System.out.println(card2);


        //初始化一副完整的牌
        ArrayList<Card1> cardList1 = initCard();
        System.out.println(cardList1);

        System.out.println("+++++++++++++++");

        shuffle(cardList1);
        System.out.println(cardList1);


        System.out.println(cardList1.contains(card1));

        ArrayList<Card1> aplayer = new ArrayList<>();
        ArrayList<Card1> bplayer = new ArrayList<>();
        ArrayList<Card1> cplayer = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Card1 card = cardList1.remove(0);
            aplayer.add(card);
            card = cardList1.remove(0);
            bplayer.add(card);
            card = cardList1.remove(0);
            cplayer.add(card);
        }

        System.out.println(cardList1.size());
        System.out.println("A:" + aplayer);
        System.out.println("B:" + bplayer);
        System.out.println("C:" + cplayer);





    }

    private static void shuffle(ArrayList<Card1> cardList1) {
        Random random = new Random();

        for (int i = cardList1.size() - 1; i > 0; i --) {

            int randomCard = random.nextInt(i);
            Card1 bcard = cardList1.get(randomCard);
            Card1 acard = cardList1.get(i);
            cardList1.set(i, bcard);
            cardList1.set(randomCard, acard);

        }
    }


    public static ArrayList<Card1> initCard() {
        ArrayList<Card1> card = new ArrayList<>();
        String[] suits = {"♥","♠","♦","♣"};
        for (String suit:suits) {
            for (int rank = 1; rank < 14; rank++) {
                Card1 card1 = new Card1(rank, suit);

                card.add(card1);
            }
        }
        return card;
    }




}
