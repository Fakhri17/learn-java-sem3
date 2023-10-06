package encapsulation;

public class PraktikumSatu {
    public static void main(String[] args) {
        User userSatu = new User();
        userSatu.nama = "Pandu Rafa";
        userSatu.setEmail("pandu@gmail.com");
        userSatu.setPassword("pandu123");
        userSatu.setToken(1234567890);

        userSatu.displayName();
        System.out.println("Email: " + userSatu.getEmail());
        System.out.println("Password: " + userSatu.getPassword());
        System.out.println("Token: " + userSatu.getToken());

        System.out.println("====================================");
        System.out.println(User.displayAll(userSatu.nama, userSatu.getEmail(), userSatu.getPassword(), userSatu.getToken()));
    }
}
