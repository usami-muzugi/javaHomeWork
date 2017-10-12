package wiki.conoha.javahomework.set;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeTest {
    public static void main(String[] args) {
        Notice notice = new Notice(1,"卢本伟牛逼","Administrator",new Date());
        Notice notice1 = new Notice(2,"大吉大利，晚上吃鸡！","Administrator",new Date());
        Notice notice2 = new Notice(3,"表面兄弟卢本伟","Administrator",new Date());

        //创建一个列表类
        List list = new ArrayList();

        //将公告类添加到列表类里
        list.add(notice);
        list.add(notice1);
        list.add(notice2);

        //显示公告
        System.out.println("公告的内容为:");
        for (int i = 0; i <list.size(); i++) {
            System.out.println((i+1)+":"+((Notice)(list.get(i))).getTitle());
        }
        Notice notice3 = new Notice(4,"感谢卢本伟最爱吹牛逼的火箭","Administrator",new Date());
        list.add(1,notice3); //    void add(int index, E element);

        System.out.println("公告的内容为:");
        for (int i = 0; i <list.size(); i++) {
            System.out.println((i+1)+":"+((Notice)(list.get(i))).getTitle());
        }

        //删除一个
        System.out.println("删除一个");
        list.remove(notice2); //index Object

        System.out.println("删除公告后的内容为:");
        for (int i = 0; i <list.size(); i++) {
            System.out.println((i+1)+":"+((Notice)(list.get(i))).getTitle());
        }

        //修改一个
        System.out.println("修改一个");
        notice.setTitle("娱乐主播卢本伟牛逼！");
        list.set(0,notice);

        System.out.println("修改后公告的内容为:");
        for (int i = 0; i <list.size(); i++) {
            System.out.println((i+1)+":"+((Notice)(list.get(i))).getTitle());
        }
    }
}
