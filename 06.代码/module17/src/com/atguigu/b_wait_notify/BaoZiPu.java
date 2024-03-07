package com.atguigu.b_wait_notify;

/*
   count和flag可以定义成包装类
   但是要记得给count和flag手动赋值
   不然对于本案例来说,容易出现空指针异常
 */
public class BaoZiPu {
    //代表包子的count
    private int count;
    //代表是否有包子的flag
    private boolean flag;

    public BaoZiPu() {
    }

    public BaoZiPu(int count, boolean flag) {
        this.count = count;
        this.flag = flag;
    }

    /*
       getCount 改造成消费包子方法
       直接输出count
     */
    public synchronized void getCount() {
        //1.判断flag是否为false,如果是false,证明没有包子,消费线程等待
        while (this.flag == false) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //2.如果flag为true,证明有包子,开始消费
        System.out.println("消费了..............第" + count + "个包子");

        //3.改变flag状态,为false,证明消费完了,没 有包子了
        this.flag = false;
        //4.唤醒所有等待线程
        this.notifyAll();
    }

    /*
       setCount 改造成生产包子
       count++
     */
    public synchronized void setCount() {
        //1.判断flag是否为true,如果是true,证明有包子,生产线程等待
        while (this.flag == true) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //2.如果flag为false,证明没有包子,开始生产
        count++;
        System.out.println("生产了...第" + count + "个包子");
        //3.改变flag状态,为true,证明生产完了,有包子了
        this.flag = true;
        //4.唤醒所有等待线程
        this.notifyAll();
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
