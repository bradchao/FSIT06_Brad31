package tw.org.iii.appps.brad31;

public class Member {
    private String title;
    private int icon;
    public Member(String title, int icon){
        this.title = title;
        this.icon = icon;
    }
    public String getTitle(){return title;}
    public int getIcon(){return icon;}
}
