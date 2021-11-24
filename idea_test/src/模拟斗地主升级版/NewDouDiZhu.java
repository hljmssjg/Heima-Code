package 模拟斗地主升级版;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class NewDouDiZhu {
    public static void main(String[] args) {
        // 定义HashMap 牌盒
        HashMap<Integer, String> CardsBox = new HashMap<>();
        // 定义花色序号牌值大小王的集合
        ArrayList<Integer> index = new ArrayList<>();

        String[] colors = {"♥", "♣", "♠", "♦"};
        String[] values = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] Jokers = {"大王", "小王"};

        // 添加值
        int num = 0;
        for (String value : values) {
            for (String color : colors) {
                CardsBox.put(num, color + value);
                index.add(num);
                num++;
            }
        }

        for (String joker : Jokers) {
            CardsBox.put(num, joker);
            index.add(num);
            num++;
        }

        Collections.shuffle(index);

        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        TreeSet<Integer> hiddenCards = new TreeSet<>();

        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 17) {
                    hiddenCards.add(index.get(i * 3 + j));
                    continue;
                }
                switch (j) {
                    case 0 -> player1.add(index.get(i * 3 + j));
                    case 1 -> player2.add(index.get(i * 3 + j));
                    case 2 -> player3.add(index.get(i * 3 + j));
                }


            }
        }

        checkCards("玩家1", player1, CardsBox);
        checkCards("玩家2", player2, CardsBox);
        checkCards("玩家3", player3, CardsBox);
        checkCards("底牌", hiddenCards, CardsBox);

    }

    public static void checkCards(String name, TreeSet<Integer> eachSet, HashMap<Integer, String> CardsBox) {
        System.out.println(name + "的牌为：");
        for (Integer cardIndex : eachSet) {
            System.out.print(CardsBox.get(cardIndex) + " ");
        }
        System.out.println();
    }
}
