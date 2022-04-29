public class Vineta4 extends Vineta implements Vineta4Actions{
    public Vineta4(String dialogos) {
        super(dialogos);
    }

    @Override
    public void img4(Screen s) {
        s.cls();
        s.repaint();
        s.out(ShowDialogos(), "Comic Sans MS", 20, Colors.BlueGrey);
        s.showImage("vi4.png");
        s.setBounds(200, 100, 1100, 700);
    }
}
