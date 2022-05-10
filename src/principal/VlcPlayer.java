package principal;

public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Tocando arquivo vlc. Nome: " + fileName);
    }
    
    @Override
    public void playMp4(String fileName){
        //Faz nada
    }
}
