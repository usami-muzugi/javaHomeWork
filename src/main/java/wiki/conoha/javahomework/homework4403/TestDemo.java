package wiki.conoha.javahomework.homework4403;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-04
 * Time: 14:56
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class TestDemo {
    /**
     * 测试类方法
     * 测试歌曲类 public void testSong()
     * 测试播放器列表 public void testPlayList();
     * 测试播放器类 public void testPlayListCollection();
     * 主菜单 public void mainMenu();
     * 播放列表管理菜单 public void playListMenu();
     * 播放器菜单 public void playerMenu();
     * 主流程实现 public void test();
     */

    //     * 主菜单 public void mainMenu();

    public void mainMenu() {

        /**
         * 如果不重置Scanner对象sc将会总在while死循环 try catch,
         * 原因是Scanner对象发生异常后就不能再被使用,所以一直报异常,编程了死循环.
         * 解决方法,只要每次重新new一个Scanner就可以了，
         * 但不推荐这么写,因为非常消耗性能,且异常的开资会非常的大。
         */
        boolean flag = true;
        while (flag) {
            System.out.println("******************************************************");
            System.out.println("                      **主菜单**");
            System.out.println("                      1 -- 播放列表管理");
            System.out.println("                      2 -- 播放器管理");
            System.out.println("                      0 -- 退出");
            System.out.println("******************************************************");
            System.out.println("请输入对应数字进行操作: ");
            try {
                int operation = new Scanner(System.in).nextInt();
                switch (operation) {
                    case 1 : playListMenu(); break;
                    case 2 : playerMenu(); break;
                    case 0 : flag = false; break;
                    default:
                        System.out.println("输入有误，请输入对应数字！");
                }
            } catch (InputMismatchException e) {
                System.out.println("输入错误！ 请输入对应数字！");
            }
        }
    }

    //     * 播放列表管理菜单 public void playListMenu();
    public void playListMenu() {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        String string;
        while (flag) {
            try {
                System.out.println("******************************************************");
                System.out.println("                 **播放列表管理**");
                System.out.println("                 1 -- 将歌曲添加到主播放列表");
                System.out.println("                 2 -- 将歌曲添加到普通列表");
                System.out.println("                 3 -- 通过歌曲ID查询播放列表中的歌曲");
                System.out.println("                 4 -- 通过歌曲名称查询播放列表中的歌曲");
                System.out.println("                 5 -- 修改播放列表中的歌曲");
                System.out.println("                 6 -- 删除播放列表中的歌曲");
                System.out.println("                 7 -- 显示播放列表中的所有歌曲");
                System.out.println("                 8 -- 导出歌单");
                System.out.println("                 9 -- 返回上一级菜单 ");
                System.out.println("******************************************************");
                System.out.println("请输入对应数字进行管理: ");
                int operation = new Scanner(System.in).nextInt();
                switch (operation) {
                    case 1 : {
                        boolean fl = true;
                        System.out.println("将歌曲添加到主播放列表\n请输入要添加的歌曲数量:");
                        while (fl) {
                            try {
                                int sum = new Scanner(System.in).nextInt();
                                String [][] strings = new String[sum][3];
                                for (int i = 1; i <= sum; i++) {
                                    System.out.println("请输入第"+i+"首歌曲");
                                    System.out.println("请输入第一首歌曲的ID:");
                                    strings[i-1][0] = scanner.next();
                                    System.out.println("请输入第一首歌曲的名称:");
                                    strings[i-1][1] = scanner.next();
                                    System.out.println("请输入第一首歌曲的演唱者:");
                                    strings[i-1][2] = scanner.next();
                                }
                                for (String[] song:strings
                                     ) {
                                    PlayListCollection.searchPlayListByName("主播放列表").addToPlayList(new Song(song[0], song[1], song[2]));
                                }
                                fl=false;
                            } catch (InputMismatchException e) {
                                System.out.println("输入有误请输入数字");
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    } break;
                    case 2 :{
                        boolean fl = true;
                        while (fl) {
                            System.out.println("请输入要添加的播放列表名称:");
                            string = scanner.next();
                            if (string.equals("主播放列表")) {
                                System.out.println("不能添加到主播放列表");
                            } else {
                                try {
                                    System.out.println("请输入要添加的歌曲数量:");
                                    int sum = new Scanner(System.in).nextInt();
                                    String[][] strings = new String[sum][3];
                                    for (int i = 1; i <= sum; i++) {
                                        System.out.println("请输入第" + i + "首歌曲");
                                        System.out.println("请输入第一首歌曲的ID:");
                                        strings[i - 1][0] = scanner.next();
                                        System.out.println("请输入第一首歌曲的名称:");
                                        strings[i - 1][1] = scanner.next();
                                        System.out.println("请输入第一首歌曲的演唱者:");
                                        strings[i - 1][2] = scanner.next();
                                    }
                                    for (String[] song : strings
                                            ) {
                                        PlayListCollection.searchPlayListByName(string).addToPlayList(new Song(song[0], song[1], song[2]));
                                    }
                                    fl = false;
                                } catch (Exception e) {
                                    System.out.println("该播放列表不存在，请先将播放列表添加到播放器中！123");
                                }
                            }
                        }
                    }
                             break;
                    case 3 : break;
                    case 4 : break;
                    case 5 : break;
                    case 6 : break;
                    case 7 : break;
                    case 8 : break;
                    case 9 : flag = false; break;
                    default: System.out.println("输入有误，请输入对应数字！");
                }
            } catch (InputMismatchException e) {
                System.out.println("输入错误！ 请输入对应数字！");
            }
        }
    }

    //     * 播放器菜单 public void playerMenu();
    public void playerMenu() {
        boolean flag = true;
        String string;
        while (flag) {
            try {
                System.out.println("******************************************************");
                System.out.println("                 **播放器管理**");
                System.out.println("                 1 -- 向播放器添加播放列表");
                System.out.println("                 2 -- 从播放器删除播放列表");
                System.out.println("                 3 -- 通过名字查询播放列表信息");
                System.out.println("                 4 -- 显示所有播放列表名称");
                System.out.println("                 9 -- 返回上一级菜单 ");
                System.out.println("******************************************************");
                System.out.println("请输入对应数字进行管理: ");
                int operation = new Scanner(System.in).nextInt();
                switch (operation) {
                    case 1 : {
                        System.out.println("请输入要添加的播放列表的名称:");
                        string = new Scanner(System.in).next();
                        PlayListCollection.addPlayList(new PlayList(string));
                    } break;
                    case 2 : {
                        System.out.println("请输入你要删除的播放列表名称:");
                        string = new Scanner(System.in).next();
                        PlayListCollection.deletePlayList(new PlayList(string));
                    } break;
                    case 3 : {
                        System.out.println("请输入你要查询的播放列表名称:");
                        string = new Scanner(System.in).next();
                        try {
                            PlayList playList = PlayListCollection.searchPlayListByName(string);
                            System.out.println("播放列表名称:"+playList.getPlayListName()+"\n一共有"+playList.getMusicList().size()+"首歌"+"\n播放列表曲目:");
                            try {
                                Iterator<Song> iterator = playList.getMusicList().iterator();
                                while (iterator.hasNext()) {
                                    System.out.println(iterator.next());
                                }
                            } catch (NullPointerException e) {
                                System.out.print("播放列表为空！");
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }break;
                    case 4 : PlayListCollection.displayAllPlayListName();break;
                    case 9 : flag = false; break;
                    default: System.out.println("输入有误，请输入对应数字！");
                }
            } catch (InputMismatchException e) {
                System.out.println("输入错误！ 请输入对应数字！");
            }
        }
    }

    //     * 主流程实现 public void test();
    private  void test(){
        mainMenu();
    }

    public static void main(String[] args) {
        TestDemo testDemo = new TestDemo();
        testDemo.test();
    }
}