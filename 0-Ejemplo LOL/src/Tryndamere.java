public class Tryndamere extends Champion implements TryndamereActionCallbacks{
    public Tryndamere(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }

    @Override
    public void battleFury(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.OrangeHibiscus);
        s.showImage("Battlefury.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void bloodlust(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.OrangeHibiscus);
        s.showImage("Blood.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void mockingShout(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.OrangeHibiscus);
        s.showImage("Mock.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void spinningSplash(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.OrangeHibiscus);
        s.showImage("Spinning.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void undyingRage(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.OrangeHibiscus);
        s.showImage("Undying.gif");
        s.setBounds(200, 100, 1100, 900);
    }
}
