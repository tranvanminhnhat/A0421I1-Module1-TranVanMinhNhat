package l1111_demo;

import java.util.Comparator;

public class EnglishScoreComparatorAscending implements Comparator<NormalStudent> {
    @Override
    public int compare(NormalStudent o1, NormalStudent o2) {
        if (o1.getEnglishScore() < o2.getEnglishScore()){
            return -1;
        }else if (o1.getEnglishScore() > o2.getEnglishScore()){
            return 1;
        }else {
            return 0;
        }
    }
}
