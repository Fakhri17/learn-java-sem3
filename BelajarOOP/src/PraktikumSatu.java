import cobapackage.CobaClassPackage;

class KeywordModifier{
    private String email;
    private String password;
    public String nama;
    protected int token;

    public void displayName(){
        System.out.println("Nama saya " + this.nama);
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }

    public void setToken(int token){
        this.token = token;
    }

    public int getToken(){
        return this.token;
    }
}

public class PraktikumSatu {
    public static void main(String[] args) {

        CobaConstruc coba = new CobaConstruc("Fakhri Alauddin", 22);
        coba.print();

        KeywordModifier data = new KeywordModifier();
        data.nama = "Fakhri Alauddin";
        data.setEmail("fakhri@gmail.com");
        data.setPassword("123456");
        data.setToken(123456);

        data.displayName();
        System.out.println("Email saya " + data.getEmail());
        System.out.println("Password saya " + data.getPassword());
        System.out.println("Token saya " + data.getToken());

        CobaClassPackage cobaClassPackage = new CobaClassPackage();
        cobaClassPackage.nama = "Fakhri Alauddin";
        cobaClassPackage.umur = 22;
        System.out.println("Nama saya " + cobaClassPackage.nama);
        System.out.println("Umur saya " + cobaClassPackage.umur);
    }
}
