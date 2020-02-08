package pojo;

import java.util.List;
import java.util.Map;

public class People {

    private String name;
    private Integer age;
    private List<Account> accounts;
    private Map<String, Phone> phoneMap;

    public People() {
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", accounts=" + accounts +
                ", phoneMap=" + phoneMap +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Map<String, Phone> getPhoneMap() {
        return phoneMap;
    }

    public void setPhoneMap(Map<String, Phone> phoneMap) {
        this.phoneMap = phoneMap;
    }
}
