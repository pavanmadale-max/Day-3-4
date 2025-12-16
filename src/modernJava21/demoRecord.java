package modernJava21;


public class demoRecord {
    public static void main(String[] args) {


        walletUser user = new walletUser(1, "Pavan", "pavan2gmail.com");

        System.out.println(user.id());
        System.out.println(user.name());
        System.out.println(user.email());


    }
}
record walletUser(int id,String name,String email){

}