package 模拟斗地主;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> CardsBox = new ArrayList<>();
        String[] colors = {"♣", "♦", "♠", "♥"};
        String[] marks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] Jokers = {"小王", "大王"};

        for (String color : colors) {
            for (String mark : marks) {
                CardsBox.add(color + mark);
            }
        }
        CardsBox.add(Jokers[0]);
        CardsBox.add(Jokers[1]);

        Collections.shuffle(CardsBox);

        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> HiddenCards = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 17) {
                    HiddenCards.add(CardsBox.get(i * 3 + j));
                    continue;
                }
                switch (j) {
                    case 0 -> player1.add(CardsBox.get(i * 3 + j));
                    case 1 -> player2.add(CardsBox.get(i * 3 + j));
                    case 2 -> player3.add(CardsBox.get(i * 3 + j));
                }


            }
        }

        System.out.println("选手一的牌为-------------------");
        for (String card : player1) {
            System.out.print(card + ",");
        }
        System.out.println();
        System.out.println("选手二的牌为-------------------");
        for (String card : player2) {
            System.out.print(card + ",");
        }
        System.out.println();
        System.out.println("选手三的牌为-------------------");
        for (String card : player3) {
            System.out.print(card + ",");
        }
        System.out.println();
        System.out.println("底牌为-------------------");
        for (String card : HiddenCards) {
            System.out.print(card + ",");
        }
    }
}
