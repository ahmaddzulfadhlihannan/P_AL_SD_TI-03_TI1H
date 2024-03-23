package Minggu0503;

public class Pangkat03 {
    public int nilai, pangkat;

    Pangkat03(int a, int n) {
        nilai = a;
        pangkat = n;
    }

    int pangkatBF(int a, int n) {
        int hasil = a;
        for(int i = 1; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if(n==1) {
            return a;
        }
        else {
            if(n%2==1) {
                return (pangkatDC(a,a/2)*pangkatDC(a,a/2)*a);
            }else {
                return (pangkatDC(a,n/2)*pangkatDC(a,a/2));
            }
        }
    }
}
