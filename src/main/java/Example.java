import AbstractPackage.useAbstractClass;

interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}

interface FuncInterface02 {
    int add(int a, int b);

    default void sms() {
        System.out.println("Hello!");
    }
}

abstract class Book {
    String title;
    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    @Override
    public void setTitle(String s) {
        title = s;
    }
}


public class Example{
    public static void main(String[] args) {
        useAbstractClass obj = new useAbstractClass();
        obj.details();
        obj.message();

        FuncInterface fobj = (int x) -> System.out.println(2*x);
        fobj.abstractFun(4);

        FuncInterface02 sobj = (int x, int y) -> (x + y);
        System.out.println(sobj.add(2,4));

        System.out.println(obj.returnDay(2, 7, 2021));

        MyBook myBook = new MyBook();
        myBook.setTitle("RAJA");

        System.out.println(myBook.getTitle());
    }
}
