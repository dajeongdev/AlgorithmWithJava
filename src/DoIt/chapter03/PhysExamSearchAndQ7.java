package DoIt.chapter03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearchAndQ7 {

    static class PhysData {
        private String name;   // 이름
        private int height;    // 키
        private double vision; // 시력

        // 생성자
        public PhysData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        // 문자열을 반환하는 메서드 (정보 확인용)
        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhysData> HEIGHT_ORDER = new HeightOrderComparater();
        public static final Comparator<PhysData> VISION_ORDER = new VisionOrderComparator();

        private static class HeightOrderComparater implements Comparator<PhysData> {
            public int compare(PhysData d1, PhysData d2) {
                return (d1.height > d2.height) ?   1 :
                        (d1.height < d2.height) ? -1 : 0;
            }
        }

        private static class VisionOrderComparator implements Comparator<PhysData> {
            public int compare(PhysData d1, PhysData d2) {
                return (d1.vision > d2.vision) ?   1 :
                        (d1.vision < d2.vision) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhysData[] x = {
                new PhysData("이나령", 162, 0.3),
                new PhysData("유지훈", 168, 0.4),
                new PhysData("김한결", 160, 0.8),
                new PhysData("홍준기", 171, 1.5),
                new PhysData("전서현", 173, 0.7),
                new PhysData("이호연", 174, 1.2),
                new PhysData("이수민", 175, 2.0)
        };

        System.out.print("키가 몇 cm인 사람을 찾고 있나요? : ");
        int height = sc.nextInt();
        int heightIdx = Arrays.binarySearch(x, new PhysData("", height, 0.0), PhysData.HEIGHT_ORDER);

        if (heightIdx < 0) {
            System.out.println("일치하는 사람이 없습니다.");
        } else {
            System.out.println("x[" + heightIdx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[heightIdx]);
        }

        System.out.print("시력 몇인 사람을 찾고 있나요? : ");
        double vision = sc.nextDouble();
        int visionIdx = Arrays.binarySearch(x, new PhysData("", 0, vision), PhysData.VISION_ORDER);

        if (visionIdx < 0) {
            System.out.println("일치하는 사람이 없습니다.");
        } else {
            System.out.println("x[" + visionIdx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[visionIdx]);
        }
    }
}