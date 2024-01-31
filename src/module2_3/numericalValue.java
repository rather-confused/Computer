package module2_3;

import java.util.Comparator;

public class numericalValue implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        String rank1 = o1.getRank();
        String rank2 = o2.getRank();

        if (rank1.equals(rank2)) return 0;
        if (o1.isFaceCard()) {
            if (!o2.isFaceCard()) return -1;
            switch (rank1) {
                case "K" -> {
                    return -1;
                }
                case "Q" -> {
                    if (rank2.equals("K")) return 1;
                    return -1;
                }
                case "J" -> {
                    if (rank2.equals("K") || rank2.equals("Q")) return 1;
                    return -1;
                }
            }
        } else if (o2.isFaceCard()) {
            return 1;
        }
        return Integer.parseInt(rank1) > Integer.parseInt(rank2) ? -1 : 1;
    }
}