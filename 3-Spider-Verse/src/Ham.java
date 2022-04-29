public class Ham extends SpiderTipo implements HamActionsCallbacks{
    public Ham(String nombre, String nombreReal, String universo, String especie, String genero, String colorTraje, String calzado) {
        super(nombre, nombreReal, universo, especie, genero, colorTraje, calzado);
    }

    @Override
    public void DetonadoresPorker(Screen s) {
        s.setVisible(true);
        s.out(message(), "Comic Sans MS", 30, Colors.BoyZone);
        s.showImage("Detonadores.jpg");
        s.setBounds(200, 100, 1100, 700);
    }

    @Override
    public void AguijonElectrico(Screen s) {
        s.cls();
        s.repaint();
        s.out(message(), "Comic Sans MS", 30, Colors.BoyZone);
        s.showImage("Aguijon.jpg");
        s.setBounds(200, 100, 1100, 700);
    }

    @Override
    public void SinsentidoAracnido(Screen s) {
        s.cls();
        s.repaint();
        s.out(message(), "Comic Sans MS", 30, Colors.BoyZone);
        s.showImage("Sinsentido.jpg");
        s.setBounds(200, 100, 1100, 700);
    }
}
