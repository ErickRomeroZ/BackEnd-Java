public class Vineta6 extends Vineta implements Vineta6Actions{
    public Vineta6(String dialogos) {
        super(dialogos);
    }

    @Override
    public void img6(Screen s) {
        s.cls();
        s.repaint();
        s.out(ShowDialogos(), "Comic Sans MS", 20, Colors.BlueGrey);
        s.showImage("vi6.png");
        s.setBounds(200, 100, 1100, 700);
    }
}
