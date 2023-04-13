package DoIt.chapter02;

import java.util.Scanner;

public class PhysicalExamination {

    static final int VMAX = 21; // 시력 분포 (0.0에서 0.1 단위로 21개)

    static class PhysicalData {
        String name;    // 이름
        int height;     // 키
        double vision;  // 시력

        PhysicalData(String name, int height, double vision) { // 생성자
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    // 키의 평균값을 구함
    static double avgHeight(PhysicalData[] data) {
        double sum = 0;

        for (int i = 0; i < data.length; i++)
            sum += data[i].height;

        return sum / data.length;
    }

    // 시력 분포를 구함
    static void distVision(PhysicalData[] data, int[] dist) {
        int i = 0;
        dist[i] = 0;
        for (i = 0; i < data.length; i++) {
            if (data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0)
                dist[(int)(data[i].vision * 10)]++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhysicalData[] x = {
                new PhysicalData("다정", 162, 0.3),
                new PhysicalData("윤정", 173, 0.7),
                new PhysicalData("동은", 175, 2.0),
                new PhysicalData("소영", 171, 1.5),
                new PhysicalData("지혜", 168, 0.4),
                new PhysicalData("선영", 174, 1.2),
                new PhysicalData("유선", 169, 0.8),
        };

        int[] vdist = new int[VMAX];

        System.out.println("  *신체 검사 리스트*  ");
        System.out.println("이름       키   시력");
        System.out.println("-----------------");
        for (int i = 0; i < x.length; i++)
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

        System.out.printf("\n평균 키 : %5.1fcm\n", avgHeight(x));

        distVision(x, vdist); // 시력 분포를 구함

        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++)
            System.out.printf("%3.1f~ : %2d명\n", i / 10.0, vdist[i]);
    }
}
