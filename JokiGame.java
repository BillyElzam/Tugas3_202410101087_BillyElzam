class penjoki {
    String nama_penjoki, nomor_telepon, alamat ;
    int id_penjoki;

    public penjoki(String nama_penjoki, String nomor_telepon, String alamat, int id_penjoki){
        this.nama_penjoki = nama_penjoki;
        this.nomor_telepon = nomor_telepon;
        this.alamat = alamat;
        this.id_penjoki = id_penjoki;
    }
    String getNamaPenjoki(){
        return "Nama Penjoki : " + nama_penjoki;
    }
    String setNomorTelepon(){
        return "Nama Telepon : " + nomor_telepon;
    }
    String getAlamat(){
        return "Alamat : " + alamat;
    }
    String getIdPenjoki(){
        return "Id Penjoki : " + id_penjoki;
    }
}

class pelanggan {
    String nama_pelanggan, nomor_teleponp, email_game, password_email;
    int id_pelanggan, biaya;

    public pelanggan(String nama_pelanggan, String nomor_teleponp, String email_game, String password_email, int id_pelanggan, int biaya){
        this.nama_pelanggan = nama_pelanggan;
        this.nomor_teleponp = nomor_teleponp;
        this.email_game = email_game;
        this.password_email = password_email;
        this.id_pelanggan = id_pelanggan;
        this.biaya = biaya;
    }
    String getNamaPelanggan(){
        return "Nama Pelanggan : " + nama_pelanggan;
    }
    String setNomorTeleponP(){
        return "Nomor Telepon : " + nomor_teleponp;
    }
    String getEmailGame(){
        return "Email Game : " + email_game;
    }
    String getPasswordEmail(){
        return "Password Email : " + password_email;
    }
    String getIdPelanggan(){
        return "Id Pelanggan : " + id_pelanggan;
    }
    String setBiaya(){
        return "Biaya : " + biaya;
    }
}

public class JokiGame{

    public static void main(String[] args){
        penjoki Penjoki1 = new penjoki("Billy", "089445544545", "Jalan Kenangan 9", 2001);
        System.out.println("----------PENJOKI----------");
        System.out.println(Penjoki1.getNamaPenjoki());
        System.out.println(Penjoki1.setNomorTelepon());
        System.out.println(Penjoki1.getAlamat());
        System.out.println(Penjoki1.getIdPenjoki());
        System.out.println("____________________________");
        System.out.println("----------PELANGGAN----------");
        pelanggan Pelanggan1 = new pelanggan("Rifat", "081211621123", "Email Game", "Password Email", 5001, 50000);
        System.out.println(Pelanggan1.getNamaPelanggan());
        System.out.println(Pelanggan1.setNomorTeleponP());
        System.out.println(Pelanggan1.getEmailGame());
        System.out.println(Pelanggan1.getPasswordEmail());
        System.out.println(Pelanggan1.getIdPelanggan());
        System.out.println(Pelanggan1.setBiaya());
        System.out.println("_____________________________");


    }
}