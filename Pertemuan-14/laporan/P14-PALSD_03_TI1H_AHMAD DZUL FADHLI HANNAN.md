# Pertemuan 14 Praktikum Algoritma dan Struktur Data
<img src = "Logo Polinema (Politeknik Negeri Malang).png">  

Nama : AHMAD DZUL FADHLI HANNAN  
Nomor : 03  
Kelas : TI1H  
NIM : 2341720106

## 1. Tujuan Praktikum
Setelah melakukan praktikum ini, mahasiswa mampu:  
1.	memahami model graph  
2.	membuat dan mendeklarasikan struktur algoritma graph  
3.	menerapkan algoritma dasar graph dalam beberapa studi kasus  

## 2. Praktikum
### 2.1 Percobaan 1
#### 2.1.1 Langkah-langkah
#### 2.1.2 Verifikasi Hasil Percobaan  
<img src = "image.png">  

#### 2.1.3 Pertanyaan
1.	Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!  
2.	Pada class Graph, terdapat atribut list[] bertipe DoubleLinkedList. Sebutkan tujuan pembuatan variabel tersebut!  
Jawaban : Digunakan untuk menyimpan informasi tentang hubungan antara setiap titik (vertex) dalam grafik.  
3.	Jelaskan alur kerja dari method removeEdge!  
Jawaban : 
- Metode removeEdge menerima dua parameter asal dan tujuan, yang merupakan indeks dari titik-titik yang terhubung dalam grafik.  
- Pada setiap iterasi, metode ini memeriksa apakah indeks saat ini sama dengan tujuan.  
- Jika indeks saat ini sama dengan tujuan, maka metode ini memanggil metode remove pada DoubleLinkedList yang terletak pada indeks asal untuk menghapus tujuan dari DoubleLinkedList tersebut.        
4.	Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add jenis lain saat digunakan pada method addEdge pada class Graph?  
Jawaban : Untuk memastikan bahwa hubungan tersebut akan menjadi titik pertama dalam DoubleLinkedList tersebut.  
5.	Modifikasi kode program sehingga dapat dilakukan pengecekan apakah terdapat jalur antara suatu node dengan node lainnya, seperti contoh berikut (Anda dapat memanfaatkan Scanner).  
![alt text](image.png)  
Jawaban :  
![alt text](image-1.png)  
![alt text](image-2.png)  
![alt text](image-3.png)  


### 2.2 Percobaan 2  
#### 2.2.1 Langkah-langkah  
#### 2.2.2 Verifikasi Hasil Percobaan  
![alt text](image-4.png)  


#### 2.2.3 Pertanyaan  
1.	Perbaiki kode program Anda apabila terdapat error atau hasil kompilasi kode tidak sesuai!  
Jawaban :  
![alt text](image-5.png)  
2.	Apa jenis graph yang digunakan pada Percobaan 2?  
Jawaban : Directed graph  
3.	Apa maksud dari dua baris kode berikut?  
![alt text](image-6.png)  

Jawaban : Digunakan untuk menambahkan edge dari node B ke node C berjarak 70 meter, dan edge dari C ke B berjarak 80 meter;  

4.	Modifikasi kode program sehingga terdapat method untuk menghitung degree, termasuk inDegree dan outDegree!  
Jawaban :  
![alt text](image-7.png)  
![alt text](image-8.png)  


### 2.3 Tugas
1.	Modifikasi kode program pada class GraphMain sehingga terdapat menu program yang bersifat dinamis, setidaknya terdiri dari:  
a)	Add Edge  
b)	Remove Edge  
c)	Degree  
d)	Print Graph  
e)	Cek Edge  
Pengguna dapat memilih menu program melalui input Scanner  
2.	Tambahkan method updateJarak pada Percobaan 1 yang digunakan untuk mengubah jarak antara dua node asal dan tujuan!  
3.	Tambahkan method hitungEdge untuk menghitung banyaknya edge yang terdapat di dalam graf!  


Jawaban :   
1.  
Menu  
![alt text](image-20.png)  
![alt text](image-18.png)  
Add Edge  
![alt text](image-9.png)
Degree    
![alt text](image-10.png)  
Print Graph  
![alt text](image-11.png)  
Remove Edge  
![alt text](image-12.png)  
![alt text](image-13.png)  
Cek Edge  
![alt text](image-14.png)  
![alt text](image-15.png)  
2. Update Jarak  
Class Graph  
![alt text](image-21.png)  
Class DoubleLinkedList  
![alt text](image-22.png)  
![alt text](image-16.png)  
![alt text](image-17.png)  
3. Hitung Edge  
![alt text](image-23.png)  
![alt text](image-19.png)  