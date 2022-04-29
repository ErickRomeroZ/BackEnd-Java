public class Vineta8 extends Vineta implements Vineta8Actions{
    public Vineta8(String dialogos) {
        super(dialogos);
    }

    @Override
    public void img8(Screen s) {
        s.cls();
        s.repaint();
        s.out(ShowDialogos(), "Comic Sans MS", 20, Colors.BlueGrey);
        s.showImage("vi8.png");
        s.setBounds(200, 100, 1100, 700);
    }
}
