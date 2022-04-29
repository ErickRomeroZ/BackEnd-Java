public class Vineta9 extends Vineta implements Vineta9Actions{
    public Vineta9(String dialogos) {
        super(dialogos);
    }

    @Override
    public void img9(Screen s) {
        s.cls();
        s.repaint();
        s.out(ShowDialogos(), "Comic Sans MS", 20, Colors.BlueGrey);
        s.showImage("vi9.png");
        s.setBounds(200, 100, 1100, 700);
    }
}
