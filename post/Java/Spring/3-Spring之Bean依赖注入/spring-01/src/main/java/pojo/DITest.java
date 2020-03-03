package pojo;

import java.util.*;

public class DITest {

    private int basic;
    private String string;
    private Date ref;
    private int[] array;
    private List<Integer> list;
    private Set<Integer> set;
    private Map<String, Integer> map;
    private Properties prop;

    public DITest(int basic, String string, Date ref, int[] array, List<Integer> list, Set<Integer> set, Map<String, Integer> map, Properties prop) {
        this.basic = basic;
        this.string = string;
        this.ref = ref;
        this.array = array;
        this.list = list;
        this.set = set;
        this.map = map;
        this.prop = prop;
    }

    public DITest() {
    }

    @Override
    public String toString() {
        return "DITest{" +
                "basic=" + basic +
                ", string='" + string + '\'' +
                ", ref=" + ref +
                ", array=" + Arrays.toString(array) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", prop=" + prop +
                '}';
    }

    public void setBasic(int basic) {
        this.basic = basic;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setRef(Date ref) {
        this.ref = ref;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }
}
