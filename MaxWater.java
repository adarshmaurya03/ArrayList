package ArrayList;
import java.util.*;

public class MaxWater {
    public static void main(String[] args) {
        ArrayList<Integer> hieght = new ArrayList<>();
        hieght.add(1);
        hieght.add(8);
        hieght.add(6);
        hieght.add(2);
        hieght.add(5);
        hieght.add(4);
        hieght.add(8);
        hieght.add(3);
        hieght.add(7);
        System.out.println(maxWater(hieght));

    }

    public static int maxWater(ArrayList<Integer> hieght) {
        if (hieght.size() < 2) {
            return -1;
        }
        int maxw = 0;

        for (int i = 0; i < hieght.size(); i++) {
            int width = 0;
            for (int j = i + 1; j < hieght.size(); j++) {
                width++;
                int water = width * Math.min(hieght.get(i), hieght.get(j));
                maxw = Math.max(maxw, water);
            }
        }
        return maxw;
    }

}
