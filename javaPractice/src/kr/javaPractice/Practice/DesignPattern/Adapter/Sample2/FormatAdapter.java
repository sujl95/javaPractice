package kr.javaPractice.Practice.DesignPattern.Adapter.Sample2;

public class FormatAdapter implements MediaPlayer{
    MediaPackage mediaPackage ;
    public FormatAdapter(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    @Override
    public void play(String filename) {
        System.out.print("Using Adapter --> ");
        mediaPackage.playFile(filename);
    }
}
