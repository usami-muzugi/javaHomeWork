package wiki.conoha.javahomework.homework4403;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: wizard
 * Date: 2018-01-04
 * Time: 14:56
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class TestDemo implements Serializable {
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
        boolean fl;
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
                    case 1: {
                        if (PlayListCollection.searchPlayListByName(PlayListCollection.mainPlayList).getMusicList().size() != 0) {
                            System.out.println(PlayListCollection.mainPlayList + "存在曲目，该方法仅可新添，要修改曲目请使用修改方法");
                        } else {
                            fl = true;
                            System.out.println("将歌曲添加到主播放列表");
                            while (fl) {
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
                                        PlayListCollection.searchPlayListByName(PlayListCollection.mainPlayList).addToPlayList(new Song(song[0], song[1], song[2]));
                                    }
                                    System.out.println("添加完毕!");
                                    fl = false;
                                } catch (InputMismatchException e) {
                                    System.out.println("输入有误请输入数字");
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                    break;
                    case 2: {
                        fl = true;
                        while (fl) {
                            System.out.println("请输入要添加的播放列表名称:");
                            string = scanner.next();
                            if (string.equals(PlayListCollection.mainPlayList)) {
                                System.out.println("不能添加到主播放列表");
                            } else {
                                if (PlayListCollection.searchPlayListByName(string).getMusicList().size() != 0) {
                                    System.out.println(string + "存在曲目，该方法仅可新添，要修改曲目请使用修改方法");
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
                                        System.out.println("该播放列表不存在，请先将播放列表添加到播放器中！");
                                        fl = false;
                                    }
                                }
                            }
                        }
                    }
                    break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6: {
                        fl = true;
                        while (fl) {
                            System.out.println("请输入要删除的播放列表名称:");
                            string = scanner.next();
                            try {
                                if (PlayListCollection.searchPlayListByName(string).getMusicList().size() == 0)
                                    System.out.println(string + "不存在曲目，该方法仅可显示存在曲目的列表！");
                            } catch (Exception e) {
                                System.out.println(string + "不存在曲目，该方法仅可删除存在曲目的列表！");
                            }
                            PlayListCollection.deletePlayList(new PlayList(string));
                            System.out.println("删除成功！");
                            fl = false;
                        }
                    }
                    break; //6 -- 删除播放列表中的歌曲
                    case 7: {
                        fl = true;
                        while (fl) {
                            System.out.println("请输入要显示的播放列表名称:");
                            string = scanner.next();
                            try {
                                if (PlayListCollection.searchPlayListByName(string).getMusicList().size() == 0)
                                    System.out.println(string + "不存在曲目，该方法仅可显示存在曲目的列表！");
                            } catch (Exception e) {
                                System.out.println(string + "不存在该列表，该方法仅可显示存在的列表！");
                            }
                            System.out.println(string + "列表共有" + PlayListCollection.searchPlayListByName(string).getMusicList().size() + "个曲目");
                            Iterator iterator = PlayListCollection.searchPlayListByName(string).getMusicList().iterator();
                            while (iterator.hasNext()) {
                                System.out.println(iterator.next());
                            }
                            fl = false;
                        }
                    }
                    break; //7 -- 显示播放列表中的所有歌曲
                    case 8: {
                        File file = new File("C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\homework4403\\PlayListOutputFile");
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                            System.out.println("请输入要导出的播放列表名称:");
                            string = scanner.next();
                            try {
                                if (PlayListCollection.searchPlayListByName(string).getMusicList().size() == 0)
                                    System.out.println(string + "不存在曲目，该方法仅可导出存在曲目的列表！");
                            } catch (Exception e) {
                                System.out.println(string + "不存在该列表，该方法仅可显示存在的列表！");
                            }
                            //对象输出流的对象所对应的类还没有实现Serializable接口。调用ObjectOutputStream输出的对象必须实现这个接口的
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                            objectOutputStream.writeObject(PlayListCollection.searchPlayListByName(string));
                            objectOutputStream.flush();
                            objectOutputStream.close();
                            fileOutputStream.close();
                    }
                    break;  //8 -- 导出歌单
                    case 9:
                        flag = false;
                        break;
                    default:
                        System.out.println("输入有误，请输入对应数字！");
                }
            } catch (InputMismatchException e) {
                System.out.println("输入错误！ 请输入对应数字！");
            } catch (Exception e) {
                e.printStackTrace();
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
                            if (playList.getMusicList().size() == 0) {
                                System.out.println("播放列表为空！");
                            } else {
                                Iterator<Song> iterator = playList.getMusicList().iterator();
                                while (iterator.hasNext()) {
                                    System.out.println(iterator.next());
                                }
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