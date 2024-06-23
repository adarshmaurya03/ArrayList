package ArrayList;
import java.util.*;

public class MaxWaterSecondMethodPointerApproach {

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
        int lp = 0;
        int rp = hieght.size() - 1;
        int maxw = 0;
        while (lp < rp) {
            // width*hieght
            int currw = (rp - lp) * Math.min(hieght.get(lp), hieght.get(rp));
            maxw = Math.max(maxw, currw);

            if (hieght.get(lp) < hieght.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxw;
    }
}
