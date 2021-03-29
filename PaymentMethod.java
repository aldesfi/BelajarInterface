class PaymentMethod implements Cash, DebitCard, CreditCard
{
    public static void main (String[] args) 
    { 
        PaymentMethod PaymentMethod = new PaymentMethod();
        PaymentMethod.Pay(100);

        DebitCard PaymentMethod1 = new PaymentMethod();
        PaymentMethod.Pay(100, PaymentMethod1);

        CreditCard PaymentMethod2 = new PaymentMethod();
        PaymentMethod.Pay(100, PaymentMethod2);

    }
    @Override
    public boolean Pay(int JumlahBayar) {
        return false;
    }
    @Override
    public boolean Pay(int JumlahBayar, DebitCard DebitCard1) {
        return false;
    }

    @Override
    public boolean Pay(int JumlahBayar, CreditCard DebitCard2) {
        return false;
    }
   
}

