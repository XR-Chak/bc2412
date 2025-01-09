public abstract class Account {
  private Currency currency;
  private double balance;//1000->1,000


  public Account(Currency currency,double balance){
    this.currency = currency;
    this.balance = balance;
  }

  //1000->1,000
  public String getBalanceDesc(){
    
    return this.currency.name() + this.balance;
  }
}

