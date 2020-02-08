package cn.edu.njust.pojo;

public class TestAccount {

    private Integer id;
    private Integer money;

    public TestAccount() {
    }

    @Override
    public String toString() {
        return "TestAccount{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
