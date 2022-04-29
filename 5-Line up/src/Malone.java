import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Malone extends ArtistPerformace implements ShowMalone{
    public Malone(String artista) {
        super(artista);
    }

    @Override
    public void Canto(Screen s) {
        s.setVisible(true);
        s.out(NameArtist(), "Comic Sans MS", 35, Colors.MaximumBlueGreen);
        s.showImage("malone.png");
        s.setBounds(350, 150, 700, 450);
    }

    @Override
    public void PirotecniaLeft(Screen s) {
        s.setVisible(true);
        s.repaint();
        s.showImage("fireworks.gif");
        s.setBounds(50, 150, 250, 250);
    }

    @Override
    public void PirotecniaRight(Screen s) {
        s.setVisible(true);
        s.repaint();
        s.showImage("fireworks.gif");
        s.setBounds(1100, 150, 250, 250);
    }

    @Override
    public void CLS(Screen s) {
        s.cls();
    }

    @Override
    public void ShowEscenario(Screen s) {
        s.repaint();
        s.out("\n", "Comic Sans MS", 35, Colors.MaximumBlueGreen);
        s.showImage("malone1.gif");
        s.setBounds(350, 150, 700, 450);
    }

    @Override
    public void ShowEscenario2(Screen s) {
        s.repaint();
        s.out("\n", "Comic Sans MS", 35, Colors.MaximumBlueGreen);
        s.showImage("malone2.gif");
        s.setBounds(350, 150, 700, 450);
    }

    @Override
    public void Songone(Screen s) {
        try {
            FileInputStream fis = new FileInputStream("Sunflower.mp3");
            Player player = new Player(fis);
            player.play();
            player.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void Songtwo(Screen s) {
        try {
            FileInputStream fis = new FileInputStream("FallApart.mp3");
            Player player = new Player(fis);
            player.play();
            player.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}
