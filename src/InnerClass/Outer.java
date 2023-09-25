package InnerClass;

public class Outer {
    private int x = 0;
    private myInner inner;

    public void outerMethod(){
        inner = new myInner(); // Instance inner class
        inner.innerMethod(); //--> Call method dalam inner class
    }

    public int getX(){
        return this.x;
    }

    public class myInner{
        public void innerMethod(){
            x = 13; // X dapat diakses walau memiliki modifier private
        }
    }
}
