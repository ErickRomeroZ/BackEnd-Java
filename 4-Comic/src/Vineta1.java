public class Vineta1 extends Vineta implements Vineta1Actions{
    public Vineta1(String dialogos) {
        super(dialogos);
    }

    @Override
    public void img1(Screen s) {
        s.setVisible(true);
        s.out(ShowDialogos(), "Comic Sans MS", 20, Colors.BlueGrey);
        s.showImage("vi1.png");
        s.setBounds(200, 100, 1100, 700);
    }
}
