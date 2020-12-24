package kr.javaPractice.Practice.DesignPattern.Adapter.Sample2;

public class MP3 implements MediaPlayer{
    @Override
    public void play(String filename) {
        System.out.println("Playing MP3 File " +filename);
    }
}
