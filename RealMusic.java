public class RealMusic implements Music {

    private String musicName;

    public RealMusic(String musicName){
        this.musicName=musicName;
        loadfromServer(musicName);
    }

    @Override
    public void listening() {
        System.out.println("Listerning"+" "+musicName);
    }

    public void loadfromServer(String musicName){
        System.out.println("Load Music From Server"+" "+musicName);
    }

    
}
