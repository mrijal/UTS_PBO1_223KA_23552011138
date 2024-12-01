

# UTS Pemrograman Berorientasi Obyek 1
<ul>
  <li>Mata Kuliah: Pemrograman Berorientasi Obyek 1</li>
  <li>Dosen Pengampu: <a href="https://github.com/Muhammad-Ikhwan-Fathulloh">Muhammad Ikhwan Fathulloh</a></li>
</ul>

## Profil
<ul>
  <li>Nama: Muhammad Rijal</li>
  <li>NIM: 23552011138</li>
  <li>Studi Kasus: Studi Kasus: Aplikasi Manajemen Asuransi</li>
</ul>

## Judul Studi Kasus
<p>Aplikasi Manajemeen Asuransi Berbasis CLI</p>

## Penjelasan Studi Kasus
<p>
Aplikasi Manajemen Asuransi merupakan aplikasi yang berguna untuk mengcover proses pendaftaraan dan claim asuransi. hal ini memunkgkinkan perhitungan yang lebih presisi terhadap premi dan penyimpanan data yang terstuktur juga aman dari kesalahan manusiawi.
Pada Aplikasai ini terdapat 2 Fitur penting yaitu : </p>
<ul>
  <li>Registrasi Polis</li>
  <li>Klaim Asuransi</li>
</ul>

## Penjelasan 4 Pilar OOP dalam Studi Kasus

### 1. Inheritance
<p>Inheritance (pewarisan) merupakan konsep OOP yang memungkinkan suatu class dapat menggunakan method dan property dari class induknya, ini berguna agar kita tidak harus mendefine suatu method atau property untuk setiap class yang dimana method tersebut memiliki fungsi yang sama.
Dalam studi kasus ini, kelas AsuransiJiwa dan AsuransiKesehatan mewarisi method dam property dari kelas JenisAsuransi. Kedua kelas tersebut mengimplementasikan metode hitungLimitKlaim() dan klaim() yang berbeda sesuai dengan jenis asuransi.</p>

### 2. Encapsulation
<p>Encapsulation merupakan pembungkusan (seperti kapsul) terhadap suatu method atau properti dari suatu class, hal ini bertujuan untuk menjaga data agar tidak dapat diakses di sembarang tempat. Pada Studi kasus ini contoh penerapannya terdapat pada class Nasabah yang dimana properti-propertinya hanya bisa diakses / didapatkan melalui method tersendisi seperti noPolis yang hanya bisa di baca dengan getNoPolis()</p>

### 3. Polymorphism
<p>Polymorphism merupakan suatu konsep yang dimana memungkinkan objek dari suatu kelas untuk diperlakukan sebagai objek dari kelas yang lebih umum. Dalam hal ini, baik AsuransiJiwa maupun AsuransiKesehatan adalah turunan dari JenisAsuransi, dan keduanya dapat diperlakukan sebagai objek JenisAsuransi. Contohnya, ketika nasabah mengajukan klaim, metode klaim() yang berbeda akan dipanggil tergantung pada jenis asuransi yang dipilih oleh nasabah, meskipun cara pemanggilannya sama.</p>

### 4. Abstraction
<p>Abstraksi Merupakan konsep OOP yang dimana terdapat suatu class yang dibuat sebagai gambaran/aturan pembuatan untuk kelas turunannya. Kelas JenisAsuransi adalah contoh penerapan abstraksi karena ia mendeklarasikan metode hitungLimitKlaim() dan klaim(), namun tidak memberikan implementasi rinci. Implementasi rinci dilakukan oleh kelas turunan seperti AsuransiJiwa dan AsuransiKesehatan</p>

## Demo Proyek
<ul>
  <li>Github: <a href="https://github.com/mrijal/UTS_PBO1_223KA_23552011138">Github</a></li>
  <li>Youtube: <a href="https://youtu.be/jZtTSshv6ro">Youtube</a></li>
</ul>

