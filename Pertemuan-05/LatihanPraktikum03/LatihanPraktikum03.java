package LatihanPraktikum03;

public class LatihanPraktikum03 {

    String merk, tipe, tahun;
    int topAcceleration, topPower;

    public LatihanPraktikum03(String merk, String tipe, String tahun, int topAcceleration, int topPower) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.topAcceleration = topAcceleration;
        this.topPower = topPower;
    }

    public static int cariMaxAcceleration(LatihanPraktikum03[] cars, int start, int end) {
        if (start == end) {
            return cars[start].topAcceleration;
        }

        int mid = (start + end) / 2;
        int leftMax = cariMaxAcceleration(cars, start, mid);
        int rightMax = cariMaxAcceleration(cars, mid + 1, end);

        return Math.max(leftMax, rightMax);
    }

    public static int cariMinAcceleration(LatihanPraktikum03[] cars, int start, int end) {
        if (start == end) {
            return cars[start].topAcceleration;
        }

        int mid = (start + end) / 2;
        int lm = cariMinAcceleration(cars, start, mid);
        int rm = cariMinAcceleration(cars, mid + 1, end);

        return Math.min(lm, rm);
    }

    public static double rataRataPower(LatihanPraktikum03[] cars) {
        int totalPower = 0;
        for (LatihanPraktikum03 car : cars) {
            totalPower += car.topPower;
        }
        return (double) totalPower / cars.length;
    }
}
