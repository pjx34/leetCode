package leetcode201_250;

import java.util.concurrent.atomic.AtomicInteger;

//我们提供了一个类：
//
//public class Foo {
//? public void first() { print("first"); }
//? public void second() { print("second"); }
//? public void third() { print("third"); }
//}
//三个不同的线程 A、B、C 将会共用一个?Foo?实例。
//
//一个将会调用 first() 方法
//一个将会调用?second() 方法
//还有一个将会调用 third() 方法
//请设计修改程序，以确保 second() 方法在 first() 方法之后被执行，third() 方法在 second() 方法之后被执行。
public class LC0207PrintInOrder {
    private AtomicInteger firstJobDone = new AtomicInteger(0);
    private AtomicInteger secondJobDone = new AtomicInteger(0);

   // public Foo() {}

    public void first(Runnable printFirst) throws InterruptedException{
        printFirst.run();
        firstJobDone.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException{
        while (firstJobDone.get()!=1){
            //waitting the first job to be done;
        }
        printSecond.run();
        secondJobDone.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException{
        while (secondJobDone.get()!=1){
            //waitting the third job to be done;
        }
        printThird.run();
    }

}
