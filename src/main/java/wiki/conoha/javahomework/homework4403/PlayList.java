package wiki.conoha.javahomework.homework4403;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-04
 * Time: 14:55
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class PlayList extends Song{
    /**
     * 属性 播放列表名称 PlayListName String 、播放列表中歌曲集合 musicList List
     * 方法 getter、setter
     *      将歌曲添加到播放列表 :   public void addToPlayList(Song song)
     *      显示播放列表中所有歌曲 : public void displayAllSong()
     *      通过ID查询歌曲 : public Song searchSongById()
     *      通过歌曲名称查询歌曲 : public Song searchSongByName(String name)
     *      修改歌曲 :public void updateSong(Song song)
     *      从播放列表中删除歌曲 : public void deleteSong(String name)
     *
     *      导出歌单 : public void exportPlayList()
     *
     */

    private String playListName;
    private List<Song> musicList = new ArrayList<>();

    //     *      将歌曲添加到播放列表 :   public void addToPlayList(Song song)
    public void addToPlayList(Song song) {
        musicList.add(song);
    }

    PlayList(String playListName,List<Song> musicList){
        super();
        this.playListName = playListName;
        this.musicList = musicList;
    }

    PlayList(String playListName) {
        super();
        this.playListName = playListName;
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public List<Song> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Song> musicList) {
        this.musicList = musicList;
    }
}
