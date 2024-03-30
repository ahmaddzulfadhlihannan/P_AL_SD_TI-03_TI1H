package LatihanPraktikum03;

public class MainHotel {
    public static void main(String[] args) {
    HotelService list = new HotelService();
    Hotel hotel1 = new Hotel("Hotel A", "Jakarta", 500000, (byte) 3);
    Hotel hotel2 = new Hotel("Hotel B", "Bandung", 700000, (byte) 4);
    Hotel hotel3 = new Hotel("Hotel C", "Surabaya", 900000, (byte) 2);
    Hotel hotel4 = new Hotel("Hotel D", "Yogyakarta", 1200000, (byte) 5);
    Hotel hotel5 = new Hotel("Hotel E", "Bali", 1500000, (byte) 1);

    list.tambah(hotel1);
    list.tambah(hotel2);
    list.tambah(hotel3);
    list.tambah(hotel4);
    list.tambah(hotel5);
    
    System.out.println("List hotel sebelum di sorting : ");
    list.tampil();

    System.out.println("Bubble sort");
    System.out.println("Harga termurah sampai tertinggi : ");
    list.hargaBubbleSort();
    list.tampil();
    System.out.println("Rating tertinggi sampai terendah : ");
    list.bintangBubbleSort();
    list.tampil();

    System.out.println("Selection sort");
    System.out.println("Harga termurah sampai tertinggi : ");
    list.hargaSelectionSort();
    list.tampil();
    System.out.println("Rating tertinggi sampai terendah : ");
    list.bintangSelectionSort();
    list.tampil();
    }
    
    
    
    

}
