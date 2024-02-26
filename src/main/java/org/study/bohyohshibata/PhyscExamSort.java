package org.study.bohyohshibata;

import java.util.Arrays;
import java.util.Comparator;

public class PhyscExamSort {
    static class PhyscData {
        String name;
        int height;
        double vision;
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public String toString() {
            return name + " " + height + " " + vision;
        }

        static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 :
                        (d1.height < d2.height) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        PhyscData[] x = {
            new PhyscData("가가", 162, 0.3),
            new PhyscData("나나", 173, 0.7),
            new PhyscData("다다", 175, 2.0),
            new PhyscData("라라", 171, 1.5),
            new PhyscData("마마", 168, 1.2)
        };

        Arrays.sort(x, PhyscData.HEIGHT_ORDER);
        System.out.println(Arrays.toString(x));
    }
}
