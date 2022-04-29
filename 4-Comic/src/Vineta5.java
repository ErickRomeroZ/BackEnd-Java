public class Vineta5 extends Vineta implements Vineta5Actions{
    public Vineta5(String dialogos) {
        super(dialogos);
    }

    @Override
    public void img5(Screen s) {
        s.cls();
        s.repaint();
        s.out(ShowDialogos(), "Comic Sans MS", 20, Colors.BlueGrey);
        s.showImage("vi5.png");
        s.setBounds(200, 100, 1100, 700);
    }
}
