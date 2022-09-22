public class HWW4 {
    private double balance,rate;

    public HWW4()
    {
        balance=0;
    }
    public HWW4 (double initialBalance)
    {
        balance=initialBalance;
    }
    public  void addInsert(double rate)
    {
        balance=balance+balance*(rate/100);
    }
    public  double getBalance()
    {
        return balance;
    }
}
