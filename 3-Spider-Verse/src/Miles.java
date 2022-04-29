public class Miles extends SpiderTipo implements MilesActionsCallbacks{


    public Miles(String nombre, String nombreReal, String universo, String especie, String genero, String colorTraje, String calzado) {
        super(nombre, nombreReal, universo, especie, genero, colorTraje, calzado);
    }

    @Override
    public void explosionDeEnergia(Screen s) {
        s.setVisible(true);
        s.out(message(), "Comic Sans MS", 30, Colors.BoyZone);
        s.showImage("ExplosionEnergia.jpg");
        s.setBounds(200, 100, 1100, 700);
    }

    @Override
    public void camuflajeAracnido(Screen s) {
        s.cls();
        s.repaint();
        s.out(message(), "Comic Sans MS", 30, Colors.BoyZone);
        s.showImage("Camuflaje.jpg");
        s.setBounds(200, 100, 1100, 700);
    }

    @Override
    public void puñetazoDeVeneno(Screen s) {
        s.cls();
        s.repaint();
        s.out(message(), "Comic Sans MS", 30, Colors.BoyZone);
        s.showImage("PuñetazoVeneno.jpg");
        s.setBounds(200, 100, 1100, 700);
    }
}
