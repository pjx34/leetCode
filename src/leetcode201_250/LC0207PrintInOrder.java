package leetcode201_250;

import java.util.concurrent.atomic.AtomicInteger;

//�����ṩ��һ���ࣺ
//
//public class Foo {
//? public void first() { print("first"); }
//? public void second() { print("second"); }
//? public void third() { print("third"); }
//}
//������ͬ���߳� A��B��C ���Ṳ��һ��?Foo?ʵ����
//
//һ��������� first() ����
//һ���������?second() ����
//����һ��������� third() ����
//������޸ĳ�����ȷ�� second() ������ first() ����֮��ִ�У�third() ������ second() ����֮��ִ�С�
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
