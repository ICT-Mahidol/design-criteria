package th.ac.mahidol.ict.coupling;

public class A {
    private int val = 10;
    private String name = "Joe";
    public double height = 1.8;

    public void showVal() {
        B b = new B();
        b.showVal(this.val);
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "A{" +
                "val=" + val +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
