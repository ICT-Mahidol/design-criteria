package th.ac.mahidol.ict.coupling;

public class Child extends Parent {
    private int att2 = 5;
    public void method2() {
        // start creating inheritance coupling
        int sum = this.att1 + this.att2;
        // more inheritance coupling
        method1();
    }
}
