package encapsulation;

public class User {
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

    static String displayAll(String nama, String email, String password, int token){
        return "Nama: " + nama + "\nEmail: " + email + "\nPassword: " + password + "\nToken: " + token;
    }
}
