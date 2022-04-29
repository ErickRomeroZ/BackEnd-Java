public class Vineta12 extends Vineta implements Vineta12Actions{
    public Vineta12(String dialogos) {
        super(dialogos);
    }

    @Override
    public void img12(Screen s) {
        s.cls();
        s.repaint();
        s.out(ShowDialogos(), "Comic Sans MS", 20, Colors.BlueGrey);
        s.showImage("vi12.png");
        s.setBounds(200, 100, 1100, 700);
    }
}
