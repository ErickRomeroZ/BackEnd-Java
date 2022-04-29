public class Test {
    public static void main(String[] args) throws InterruptedException {

        TestSpiders();

    }

    private static void TestSpiders() throws InterruptedException{
        Screen screen = new Screen();
        Dialog d = new Dialog();
        Miles miles = new Miles(
                "Miles Morales",
                "Miles Gonzalo Morales",
                "Tierra-1610",
                "Humano",
                "Masculino",
                "Negro y rojo",
                "Nike Air Jordan 1 Retro High"
        );
        Gwen gwen = new Gwen(
                "Spider-Gwen",
                "Gwendolyne Maxine Stacy",
                "Tierra-65",
                "Humano",
                "Femenino",
                "Blanco y negro",
                "Zapatillas de ballet"
        );
        Ham ham = new Ham(
                "Spider-Ham",
                "Peter Porker",
                "Tierra-25",
                "Porcino antropomorfico",
                "Masculino",
                "Azul y rojo",
                " "
        );

        Runnable attack1 = new Runnable() {
            @Override
            public void run() {
                try {
                    miles.explosionDeEnergia(screen);
                    Thread.sleep(4000);

                    miles.camuflajeAracnido(screen);
                    Thread.sleep(4000);

                    miles.puñetazoDeVeneno(screen);
                    Thread.sleep(4000);

                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Thread attackMiles = new Thread(attack1);
        //attackMiles.start();

        Runnable attack2 = new Runnable() {
            @Override
            public void run() {
                try {
                    gwen.GolpeTelarana(screen);
                    Thread.sleep(4000);

                    gwen.GolpeBallet(screen);
                    Thread.sleep(4000);

                    gwen.RafagaDeTelaraña(screen);
                    Thread.sleep(4000);

                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Thread attackGwen = new Thread(attack2);
        //attackGwen.start();

        Runnable attack3 = new Runnable() {
            @Override
            public void run() {
                try {
                    ham.DetonadoresPorker(screen);
                    Thread.sleep(4000);

                    ham.AguijonElectrico(screen);
                    Thread.sleep(4000);

                    ham.SinsentidoAracnido(screen);
                    Thread.sleep(4000);

                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Thread attackHam = new Thread(attack3);
        //attackHam.start();

        screen.out("Welcome to the Spider-Verse\n", Colors.C64Ntsc);
        screen.changeStyle("Helvetica", 30, Colors.AgalFuel, Colors.AntiFlashWhite);
        screen.setVisible(true);
        String r = d.readString("Escoge el personaje que quieras revisar: \n1:Miles Morales \n2:Spider-Gwen \n3:Spider-ham");
        if (r.charAt(0) == '1') {
            attackMiles.start();
        }
        else if (r.charAt(0) == '2'){
            attackGwen.start();
        }
        else if (r.charAt(0) == '3'){
            attackHam.start();
        }
        else{
            screen.out("Teclea un numero correcto", "Century Schoolbook L", 28, Colors.Desire);
        }

    }

}
