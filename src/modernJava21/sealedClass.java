package modernJava21;

sealed class Payment permits card,upi{
    void pay(){
        System.out.println("Payment is being processed");

    }
}

final class card extends Payment {
    void pay(){
       System.out.println("Pay using card");
    }
}

non-sealed class upi extends Payment {
    void pay(){
        System.out.println("Pay using upi");
    }
}

class phonepay  extends upi{
    void pay(){
        System.out.println("Pay using phonepay");
    }
}


class sealedClass {

    public static void main(String[] args) {
    Payment c=new card();
    Payment u=new upi();
    Payment p=new phonepay();

    c.pay();
    u.pay();
    p.pay();
    }

}
