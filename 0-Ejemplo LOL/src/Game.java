public class Game {
    public static void main(String[] args) throws InterruptedException {
        TestTryndamere();
    }

    private static void TestTryndamere() throws InterruptedException {
        Screen screen = new Screen();
        Tryndamere tryndamere = new Tryndamere(
                15,
                "Tryndamere",
                "Fighter",
                "Moderate",
                "Fueled by unbridled fury and rage, Tryndamere once carved his way through the Freljord, openly challenging the greatest warriors of the north to prepare himself for even darker days ahead."
        );

        Runnable attack = new Runnable() {
            @Override
            public void run() {

                try {

                    tryndamere.battleFury(screen);
                    Thread.sleep(3000);

                    tryndamere.bloodlust(screen);
                    Thread.sleep(3000);

                    tryndamere.mockingShout(screen);
                    Thread.sleep(3000);

                    tryndamere.spinningSplash(screen);
                    Thread.sleep(3000);

                    tryndamere.undyingRage(screen);
                    Thread.sleep(3000);

                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Thread attackTryndamere = new Thread(attack);
        attackTryndamere.start();
    }
}
