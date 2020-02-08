package pojo;

public class Account {

    private Float money;

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                '}';
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }
}
