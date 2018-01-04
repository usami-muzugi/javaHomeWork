package wiki.conoha.javahomework.homework4403;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-04
 * Time: 14:55
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class PlayList {
    /**
     * 属性 播放列表名称 PlayListName String 、播放列表中歌曲集合 musicList List
     * 方法 getter、setter
     *                                    public void addToPlayList(Song song)
     *      show all of songs from list : public void displayAllSong()
     *      use id number to find songs : public Song searchSongById()
     *      search songs by name : public Song searchSongByName(String name)
     *      update :public void updateSong(Song song)
     *      从播放列表中删除歌曲 : public void deleteSong(String name)
     *      导出歌单 : public void exportPlayList()
     *
     *
     */
    private String playListName;
    private List musicList;

    public  void addToPlayList() {
        System.out.println("将歌曲添加到播放列表");
        System.out.println("请输入要添加个歌曲数量: ");
        musicList = new ArrayList<Song>();

        boolean flag = true;
        int sum = 0;

        /**
         * 添加歌曲的数量
         */
        while (flag) {
            try {
                sum = new Scanner(System.in).nextInt();
                flag = false;
                if (sum == 0) {
                    System.out.println("不能一首都不添加！");
                    System.out.println("请输入要添加个歌曲数量: ");
                    flag = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("输入错误！ 请输入对应数字！");
                System.out.println("请输入要添加个歌曲数量: ");
            }
        }


        /**
         * 进行添加
         */
        for (int i = 0; i < sum; i++) {
            String id,name,singer;
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第" + (i + 1) + "首歌曲:");
            System.out.println("请输入歌曲的ID:");
            id = scanner.next();
            System.out.println("请输入歌曲的名称:");
            name = scanner.next();
            System.out.println("请输入演唱者:");
            singer = scanner.next();
            musicList.add(Song.getInstance(id,name,singer));
        }
    }


    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public List getMusicList() {
        return musicList;
    }

    public void setMusicList(List musicList) {
        this.musicList = musicList;
    }
}
