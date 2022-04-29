public class Vineta7 extends Vineta implements Vineta7Actions{
    public Vineta7(String dialogos) {
        super(dialogos);
    }

    @Override
    public void img7(Screen s) {
        s.cls();
        s.repaint();
        s.out(ShowDialogos(), "Comic Sans MS", 20, Colors.BlueGrey);
        s.showImage("vi7.png");
        s.setBounds(200, 100, 1100, 700);
    }
}
