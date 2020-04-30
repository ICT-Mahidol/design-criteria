package th.ac.mahidol.ict.coupling;

public class B {
    // data coupling
    public void showVal(int val) {
        System.out.println(val);
    }

    // stamp coupling
    public void showVal2(A a) {
        // only the val attribute is used
        System.out.println(a.getVal());
    }

    // data coupling since both attributes in the object is used
    public void showInfo(A a) {
        System.out.println(a.toString());
    }

    // control coupling
    public void showInfoByFlag(A a, int flag) {
        if (flag == 0) {
            System.out.println(a.getVal());
        } else if (flag == 1) {
            System.out.println(a.getName());
        }
    }

    // common/global coupling
    public void showGlobal() {
        System.out.println(C.GLOBAL1);
        System.out.println(C.GLOBAL2);
    }

    // content/pathological coupling
    public void showHeight(A a ) {
        System.out.println(a.height);
        a.height = 1.9;
        a.height += 5;
    }
}
