package wiki.conoha.javahomework.dsaawj;

public class NickName {
    private Name nick;
    public NickName(){
        nick = new Name();
    }

    public void setNick(String name){
        nick.setFirstName(name);
    }
    public String getNickName(){
        return nick.getFirstName();
    }

    public static void main(String[] args) {
        NickName bob = new NickName();

    }
}
