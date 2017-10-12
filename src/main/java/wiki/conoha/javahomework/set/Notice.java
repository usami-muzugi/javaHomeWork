package wiki.conoha.javahomework.set;

import java.util.Date;

public class Notice {
    private int id; //ID
    private String title;
    private String creator;
    private Date createDate;

    public Notice(int id, String title, String creator, Date createDate) {
        super();
        this.id = id;
        this.title = title;
        this.creator = creator;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
