public class Vineta2 extends Vineta implements Vineta2Actions{
    public Vineta2(String dialogos) {
        super(dialogos);
    }

    @Override
    public void img2(Screen s) {
        s.cls();
        s.repaint();
        s.out(ShowDialogos(), "Comic Sans MS", 20, Colors.BlueGrey);
        s.showImage("vi2.png");
        s.setBounds(200, 100, 1100, 700);
    }
}
