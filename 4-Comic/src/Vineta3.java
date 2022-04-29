public class Vineta3 extends Vineta implements Vineta3Actions{
    public Vineta3(String dialogos) {
        super(dialogos);
    }

    @Override
    public void img3(Screen s) {
        s.cls();
        s.repaint();
        s.out(ShowDialogos(), "Comic Sans MS", 20, Colors.BlueGrey);
        s.showImage("vi3.png");
        s.setBounds(200, 100, 1100, 700);
    }
}
