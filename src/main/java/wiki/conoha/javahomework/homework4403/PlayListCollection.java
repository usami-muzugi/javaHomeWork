package wiki.conoha.javahomework.homework4403;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-04
 * Time: 14:56
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class PlayListCollection extends PlayList{

    /**
     * 属性 : Map
     * getter\setter
     *  添加播放列表 public void addPlayList(PlayList playlist)
     *  删除播放列表 public void deletePlayList(PlayList playlist)
     *  通过名字查询 public PlayList searchPlayListByName(String name);
     *  显示所有播放列表名称 public void diaplayAllPlayListName();
     */
    //     *  添加播放列表 public void addPlayList(PlayList playlist)
    public static void addPlayList(PlayList playList) {
        System.out.println("向播放器中添加播放列表");
        System.out.println("输入要添加的播放列表名称");
        playList = new PlayList();
        playList.setPlayListName(new Scanner(System.in).next());
        System.out.println("播放器的名称为: "+playList.getPlayListName());
    }

    //     *  删除播放列表 public void deletePlayList(PlayList playlist)
    public static void deletePlayList(PlayList playList) {
        playList =null;
        System.out.println("删除成功！");
    }
    public static void diaplayAllPlayListName() {

    }
}
