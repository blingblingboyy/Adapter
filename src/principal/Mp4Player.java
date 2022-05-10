package principal;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){
        //Faz nada
    }
    
    @Override
    public void playMp4(String fileName){
        System.out.println("Tocando midia mp4. Nome: " + fileName);
    }
}
