
package TugasP4;


public class Sepeda {
     // Property / Atribut
    String merk;
    int jarak = 0; // Jarak awal sebelum digunakan adalah 0 km
    
    // Method untuk bergerak maju (menambah jarak 10 km)
    public void bergerakMaju() {
        jarak += 10;
    }
    
    // Method untuk bergerak mundur (mengurangi jarak 5 km)
    public void bergerakMundur() {
        jarak -= 5;
    }
    
    // Method untuk berhenti (menampilkan status/posisi terakhir)
    public void berhenti() {
        // Method berhenti menandai sepeda tidak lagi bergerak
    }
}
