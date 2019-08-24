package tw.org.iii.appps.brad31;

public class Member {
    private String title;
    private int icon;
    private boolean isVIP;

    public Member(String title, int icon){
        this.title = title;
        this.icon = icon;
        this.isVIP = (int)(Math.random()*2)==0;
    }
    public String getTitle(){return title;}
    public int getIcon(){return icon;}
    public boolean isVIP(){return isVIP;}
    public void setVIP(boolean isVIP){this.isVIP = isVIP;}
}
