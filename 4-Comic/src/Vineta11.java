public class Vineta11 extends Vineta implements Vineta11Actions{
    public Vineta11(String dialogos) {
        super(dialogos);
    }

    @Override
    public void img11(Screen s) {
        s.cls();
        s.repaint();
        s.out(ShowDialogos(), "Comic Sans MS", 20, Colors.BlueGrey);
        s.showImage("vi11.png");
        s.setBounds(200, 100, 1100, 700);
    }
}
