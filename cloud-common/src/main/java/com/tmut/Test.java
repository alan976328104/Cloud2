package com.tmut;


public class Test  {
    static int persion = 10000;
    static int position=500;
    public static void main(String[] args) {
        for (int i = 0; i < persion; i++) {
            try {
                if(persion<=0){
                    System.out.println("不行了 爆满了！");
                }
                Thread.sleep(1000*30);
                position-=1;
                eat();
                System.out.println("当前排队吃饭人数:"+(persion-i)+"当前空余位置:"+position);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void eat(){
        new Thread(()->{
            try {
                Thread.sleep(1000*60*10);
                position+=1;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
