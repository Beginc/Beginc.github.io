package pojo;

public class Account {
    private Integer id;
    private User user;
    private Double money;

    public Account(Integer id, User user, Double money) {
        this.id = id;
        this.user = user;
        this.money = money;
    }

    public Account() {
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", user=" + (user != null ? String.valueOf(user.getId()) : "null") +
                ", money=" + money +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
