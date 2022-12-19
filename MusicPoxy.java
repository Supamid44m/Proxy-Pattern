public class MusicPoxy implements Music {

    private RealMusic realMusic;
    private String musicName;


    public MusicPoxy(String musicName){
        this.musicName=musicName;

    }

    @Override
    public void listening() {
        if(realMusic==null){
            realMusic = new RealMusic(musicName);
        }
        realMusic.listening();
        
    }
    
    
}
