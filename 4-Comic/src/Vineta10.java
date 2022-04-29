public class Vineta10 extends Vineta implements Vineta10Actions{
    public Vineta10(String dialogos) {
        super(dialogos);
    }

    @Override
    public void img10(Screen s) {
        s.cls();
        s.repaint();
        s.out(ShowDialogos(), "Comic Sans MS", 20, Colors.BlueGrey);
        s.showImage("vi10.png");
        s.setBounds(200, 100, 1100, 700);
    }
}
