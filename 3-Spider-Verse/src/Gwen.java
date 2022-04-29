public class Gwen extends SpiderTipo implements GwenActionsCallbacks{
    public Gwen(String nombre, String nombreReal, String universo, String especie, String genero, String colorTraje, String calzado) {
        super(nombre, nombreReal, universo, especie, genero, colorTraje, calzado);
    }

    @Override
    public void GolpeTelarana(Screen s) {
        s.setVisible(true);
        s.out(message(), "Comic Sans MS", 30, Colors.BoyZone);
        s.showImage("Bolpetelaraña.jpg");
        s.setBounds(200, 100, 1100, 700);
    }

    @Override
    public void GolpeBallet(Screen s) {
        s.cls();
        s.repaint();
        s.out(message(), "Comic Sans MS", 30, Colors.BoyZone);
        s.showImage("Ballet.jpg");
        s.setBounds(200, 100, 1100, 700);
    }

    @Override
    public void RafagaDeTelaraña(Screen s) {
        s.cls();
        s.repaint();
        s.out(message(), "Comic Sans MS", 30, Colors.BoyZone);
        s.showImage("Rafaga.jpg");
        s.setBounds(200, 100, 1100, 700);
    }
}
