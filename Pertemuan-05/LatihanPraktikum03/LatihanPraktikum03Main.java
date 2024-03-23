package LatihanPraktikum03;

public class LatihanPraktikum03Main {
    public static void main(String[] args) {
        LatihanPraktikum03[] cars = {
            new LatihanPraktikum03("BMW", "M2 Coupe", "2016", 6816, 728),
            new LatihanPraktikum03("Ford", "Fiesta ST", "2014", 3921, 575),
            new LatihanPraktikum03("Nissan", "370Z", "2009", 4360, 657),
            new LatihanPraktikum03("Subaru", "BRZ", "2014", 4058, 609),
            new LatihanPraktikum03("Subaru", "Impreza WRX STI", "2013", 6255, 703),
            new LatihanPraktikum03("Toyota", "AE86 Trueno", "1986", 3700, 553),
            new LatihanPraktikum03("Toyota", "86/GT86", "2014", 4180, 609),
            new LatihanPraktikum03("Volkswagen", "Golf GTI", "2014", 4180, 631)
        };

        int maxAcceleration = LatihanPraktikum03.cariMaxAcceleration(cars, 0, cars.length - 1);
        System.out.println("Top Acceleration Tertinggi: " + maxAcceleration);
        System.out.println("Mobil dengan Top Acceleration Tertinggi:");

        for (LatihanPraktikum03 car : cars) {
            if (car.topAcceleration == maxAcceleration) {
                System.out.println("Merk: " + car.merk);
                System.out.println("Tipe: " + car.tipe);
                System.out.println("Tahun: " + car.tahun);
                System.out.println("Top Acceleration: " + car.topAcceleration);
                System.out.println("Top Power: " + car.topPower);
                System.out.println();
                break; 
            }
        }

        int minAcceleration = LatihanPraktikum03.cariMinAcceleration(cars, 0, cars.length - 1);
        System.out.println("Top Acceleration Terendah: " + minAcceleration);
        System.out.println("Mobil dengan Top Acceleration Terendah:");

        for (LatihanPraktikum03 car : cars) {
            if (car.topAcceleration == minAcceleration) {
                System.out.println("Merk: " + car.merk);
                System.out.println("Tipe: " + car.tipe);
                System.out.println("Tahun: " + car.tahun);
                System.out.println("Top Acceleration: " + car.topAcceleration);
                System.out.println("Top Power: " + car.topPower);
                System.out.println();
                break;
            }
        }

        double rataRata = LatihanPraktikum03.rataRataPower(cars);
        System.out.println("Rata-rata Top Power: " + rataRata);
    }
}
