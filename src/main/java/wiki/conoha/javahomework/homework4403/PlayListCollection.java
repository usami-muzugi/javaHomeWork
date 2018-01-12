package wiki.conoha.javahomework.homework4403;

import java.io.Serializable;
import java.util.*;


/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-04
 * Time: 14:56
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class PlayListCollection implements Serializable {

    /**
     * 属性 : Map
     * getter\setter
     *  添加播放列表 public void addPlayList(PlayList playlist)
     *  删除播放列表 public void deletePlayList(PlayList playlist)
     *  通过名字查询 public PlayList searchPlayListByName(String name);
     *  显示所有播放列表名称 public void displayAllPlayListName();
     */
    //播放列表属性
    private static Map<String,List<Song>> map = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    public static final String mainPlayList = "主播放列表";
    public static Map<String, List<Song>> getMap() {
        return map;
    }

    public static void setMap(Map<String, List<Song>> map) {
        PlayListCollection.map = map;
    }

    //创建主播放列表
    static {
        map.put(mainPlayList,new ArrayList<>());
    }

    //     *  添加播放列表 public void addPlayList(PlayList playlist)
    public static void addPlayList(PlayList playlist) {
        if (map.size() == 2) {
            System.out.println("已添加播放列表，不得再次添加播放列表！\n要操作播放列表,请先删除！");
        } else {
            try {
                searchPlayListByName(playlist.getPlayListName());
            } catch (Exception e) {         //捕获异常，播放列表不存在，于是添加新播放列表
                map.put(playlist.getPlayListName(),new ArrayList<>());
                System.out.println("添加完成！");
                displayAllPlayListName();
                return;
            }
            System.out.println("主播放列表不能被添加！请重新添加！");
        }
    }

    //     *  删除播放列表 public void deletePlayList(PlayList playlist)
    public static void deletePlayList(PlayList playlist) {
        if (playlist.getPlayListName().equals(mainPlayList)) {
            System.out.println("主播放列表不能被删除！请重新添加！");
        } else {
            try {
                searchPlayListByName(playlist.getPlayListName());
                map.remove(playlist.getPlayListName());
                System.out.println("删除成功！");
                displayAllPlayListName();
            } catch (Exception e) {
                System.out.println("播放列表"+playlist.getPlayListName()+"不存在！请重新删除！");
            }
        }

    }

    //     *  通过名字查询 public PlayList searchPlayListByName(String name);
    public static PlayList searchPlayListByName(String name) throws Exception {
        if (map.containsKey(name)) {
            return new PlayList(name,map.get(name));
        } else {
            throw new Exception("PlayListIsNotFoundException");
        }
    }

    //         *  显示所有播放列表名称 public void displayAllPlayListName();
    public static void displayAllPlayListName() {
        System.out.print("正在查询播放列表数量");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int sum = map.size();
        System.out.println("  播放列表数量:"+sum+"\n所有播放列表名称为:");
        for (String string:map.keySet()
                ) {
            sum++;
            System.out.println(string);
        }
    }
}
