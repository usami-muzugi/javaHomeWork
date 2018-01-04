package wiki.conoha.javahomework.homework4403;

import java.util.List;

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
     * 方法 getter、setter public void addToPlayList(Song song)
     *      show all of songs from list : public void displayAllSong()
     *      use id number to find songs : public Song searchSongById()
     *      search songs by name : public Song searchSongByName(String name)
     *      update :public void updateSong(Song song)
     *      从播放列表种删除歌曲 : public void deleteSong(String name)
     *      导出歌单 : public void exportPlayList()
     *
     *
     */
    private String playListName;
    private List musicList;

    public void addToPlayList(Song song) {

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
