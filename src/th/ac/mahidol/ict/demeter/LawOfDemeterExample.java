package th.ac.mahidol.ict.demeter;

public class LawOfDemeterExample
{
    // This is an instance in the class scope
    // and hence this instance can be accessed by any members of this class
    AnotherClass instance = new AnotherClass();
    public void SampleMethodFollowingLoD(Test obj)
    {
        DoNothing(); // This is a valid call as you are calling a method of the same class
        Object data = obj.GetData(); // This is also valid since you are calling a method
        // on an instance that has been passed as a parameter  
        int result = instance.getResult(); // This is also a valid call as you are calling
        // a method on an instance locally created
        // This is also a valid call as you are calling a global variable
        int val = GlobalValues.VAL1 + GlobalValues.VAL2;
        // this violates the law of Demeter
        result = obj.anotherClassObj.getResult();
    }
    private void DoNothing()
    {
        // Write some code here
    }
}