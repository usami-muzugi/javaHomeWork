package wiki.conoha.javahomework.homework4403;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-04
 * Time: 14:55
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class Song {
    /**
     *  属性:歌曲ID id、歌名 name、演唱者 singer 均为String类型
     *  方法 构造方法、getter、setter、hashCode、equals、toString
    */
    private String id;
    private String name;
    private String singer;

    /**
     * 构造方法
     */
    public Song(String id,String name,String singer) {
        this.id = id;
        this.name = name;
        this.singer = singer;
    }

    /**
     *  getter and setter
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }


    /**
     *
     * equals() nad hashCode()
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (id != null ? !id.equals(song.id) : song.id != null) return false;
        if (name != null ? !name.equals(song.name) : song.name != null) return false;
        return singer != null ? singer.equals(song.singer) : song.singer == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (singer != null ? singer.hashCode() : 0);
        return result;
    }

    /**
     * toString()
     */
    @Override
    public String toString() {
        return "Song{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }

}
