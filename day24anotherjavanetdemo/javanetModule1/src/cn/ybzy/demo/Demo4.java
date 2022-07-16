package cn.ybzy.demo;

public class Demo4 {
    public static void main(String[] args) throws Exception {
        DownUtil downUtil = new DownUtil("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic.jj20.com%2Fup%2Fallimg%2F1011%2F06121G32T2%2F1F612132T2-6.jpg&refer=http%3A%2F%2Fpic.jj20.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1660140660&t=c3096283f07ceccc966e123dd1fc8995","d:\\aaa.jpg",5);
        downUtil.download(); //下载
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(downUtil.getCompleteRate()<1){
                    System.out.println("已经下载：" + downUtil.getCompleteRate());
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("已经下载：" + downUtil.getCompleteRate());
            }
        }).start();
    }
}
