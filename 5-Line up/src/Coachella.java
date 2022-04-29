public class Coachella {
    public static void main(String[] args) throws InterruptedException {
        LineUp();
    }

    private static void LineUp() throws InterruptedException{
        Screen screen1 = new Screen();
        Screen screen2 = new Screen();
        Screen screen3 = new Screen();

        Dialog d = new Dialog();

        Malone malone = new Malone("Post Malone");
        Weeknd weeknd = new Weeknd("The Weeknd");
        Ye ye = new Ye("Kanye West");

        Runnable iniciaMalone = new Runnable() {
            @Override
            public void run() {
                try {
                    malone.ShowEscenario(screen1);
                    malone.Canto(screen1);
                    malone.Songone(screen1);
                    Thread.sleep(10);//
                    malone.CLS(screen1);
                    malone.ShowEscenario2(screen1);
                    malone.Canto(screen1);
                    malone.Songtwo(screen1);
                    Thread.sleep(10);
                    malone.CLS(screen1);

                    //--Termina Post-Malone inicia The Weeknd

                    weeknd.ShowEscenario(screen1);
                    weeknd.Canto(screen1);
                    weeknd.Songone(screen1);
                    Thread.sleep(10);
                    weeknd.CLS(screen1);
                    weeknd.ShowEscenario2(screen1);
                    weeknd.Canto(screen1);
                    weeknd.Songtwo(screen1);
                    Thread.sleep(10);
                    weeknd.CLS(screen1);

                    //--Termina The Weeknd inicia Kanye

                    ye.ShowEscenario(screen1);
                    ye.Canto(screen1);
                    ye.Songone(screen1);
                    Thread.sleep(10);
                    ye.CLS(screen1);
                    ye.ShowEscenario2(screen1);
                    ye.Canto(screen1);
                    ye.Songtwo(screen1);
                    Thread.sleep(10);
                    ye.CLS(screen1);

                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Runnable pirotecniaM = new Runnable() {
            @Override
            public void run() {
                try {
                    malone.PirotecniaLeft(screen2);
                    malone.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    malone.CLS(screen2);
                    malone.CLS(screen3);
                    Thread.sleep(151000);
                    malone.PirotecniaLeft(screen2);
                    malone.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    malone.CLS(screen2);
                    malone.CLS(screen3);
                    Thread.sleep(213000);

                    //Termina pirotecnia de Malone

                    weeknd.PirotecniaLeft(screen2);
                    weeknd.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    weeknd.CLS(screen2);
                    weeknd.CLS(screen3);
                    Thread.sleep(211000);
                    weeknd.PirotecniaLeft(screen2);
                    weeknd.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    weeknd.CLS(screen2);
                    weeknd.CLS(screen3);
                    Thread.sleep(259000);

                    //Termina pirotecnia de The Weeknd

                    ye.PirotecniaLeft(screen2);
                    ye.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    ye.CLS(screen2);
                    ye.CLS(screen3);
                    Thread.sleep(247000);
                    ye.PirotecniaLeft(screen2);
                    ye.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    ye.CLS(screen2);
                    ye.CLS(screen3);
                    Thread.sleep(219000);
                    ye.PirotecniaLeft(screen2);
                    ye.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    ye.CLS(screen2);
                    ye.CLS(screen3);
                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Runnable stageW = new Runnable() {
            @Override
            public void run() {
                try {
                    weeknd.ShowEscenario(screen1);
                    weeknd.Canto(screen1);
                    weeknd.Songone(screen1);
                    Thread.sleep(10);
                    weeknd.CLS(screen1);
                    weeknd.ShowEscenario2(screen1);
                    weeknd.Canto(screen1);
                    weeknd.Songtwo(screen1);
                    Thread.sleep(10);
                    weeknd.CLS(screen1);

                    //--Termina The Weeknd inicia Post-Malone

                    malone.ShowEscenario(screen1);
                    malone.Canto(screen1);
                    malone.Songone(screen1);
                    Thread.sleep(10);//
                    malone.CLS(screen1);
                    malone.ShowEscenario2(screen1);
                    malone.Canto(screen1);
                    malone.Songtwo(screen1);
                    Thread.sleep(10);
                    malone.CLS(screen1);

                    //--Termina Malone inicia Kanye

                    ye.ShowEscenario(screen1);
                    ye.Canto(screen1);
                    ye.Songone(screen1);
                    Thread.sleep(10);
                    ye.CLS(screen1);
                    ye.ShowEscenario2(screen1);
                    ye.Canto(screen1);
                    ye.Songtwo(screen1);
                    Thread.sleep(10);
                    ye.CLS(screen1);


                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Runnable pirotecniaW = new Runnable() {
            @Override
            public void run() {
                try {
                    weeknd.PirotecniaLeft(screen2);
                    weeknd.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    weeknd.CLS(screen2);
                    weeknd.CLS(screen3);
                    Thread.sleep(211000);
                    weeknd.PirotecniaLeft(screen2);
                    weeknd.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    weeknd.CLS(screen2);
                    weeknd.CLS(screen3);
                    Thread.sleep(259000);

                    //Termina pirotecnia de The Weeknd

                    malone.PirotecniaLeft(screen2);
                    malone.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    malone.CLS(screen2);
                    malone.CLS(screen3);
                    Thread.sleep(151000);
                    malone.PirotecniaLeft(screen2);
                    malone.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    malone.CLS(screen2);
                    malone.CLS(screen3);
                    Thread.sleep(213000);

                    //Termina pirotecnia de Malone

                    ye.PirotecniaLeft(screen2);
                    ye.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    ye.CLS(screen2);
                    ye.CLS(screen3);
                    Thread.sleep(247000);
                    ye.PirotecniaLeft(screen2);
                    ye.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    ye.CLS(screen2);
                    ye.CLS(screen3);
                    Thread.sleep(219000);
                    ye.PirotecniaLeft(screen2);
                    ye.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    ye.CLS(screen2);
                    ye.CLS(screen3);
                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Runnable stageY = new Runnable() {
            @Override
            public void run() {
                try {
                    ye.ShowEscenario(screen1);
                    ye.Canto(screen1);
                    ye.Songone(screen1);
                    Thread.sleep(10);
                    ye.CLS(screen1);
                    ye.ShowEscenario2(screen1);
                    ye.Canto(screen1);
                    ye.Songtwo(screen1);
                    Thread.sleep(10);
                    ye.CLS(screen1);

                    //--Termina Ye inicia The Weeknd

                    weeknd.ShowEscenario(screen1);
                    weeknd.Canto(screen1);
                    weeknd.Songone(screen1);
                    Thread.sleep(10);
                    weeknd.CLS(screen1);
                    weeknd.ShowEscenario2(screen1);
                    weeknd.Canto(screen1);
                    weeknd.Songtwo(screen1);
                    Thread.sleep(10);
                    weeknd.CLS(screen1);

                    //--Termina The Weeknd inicia Malone

                    malone.ShowEscenario(screen1);
                    malone.Canto(screen1);
                    malone.Songone(screen1);
                    Thread.sleep(10);//
                    malone.CLS(screen1);
                    malone.ShowEscenario2(screen1);
                    malone.Canto(screen1);
                    malone.Songtwo(screen1);
                    Thread.sleep(10);
                    malone.CLS(screen1);

                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Runnable pirotecniaY = new Runnable() {
            @Override
            public void run() {
                try {
                    ye.PirotecniaLeft(screen2);
                    ye.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    ye.CLS(screen2);
                    ye.CLS(screen3);
                    Thread.sleep(247000);
                    ye.PirotecniaLeft(screen2);
                    ye.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    ye.CLS(screen2);
                    ye.CLS(screen3);
                    Thread.sleep(219000);

                    //Termina pirotecnia de Kanye

                    weeknd.PirotecniaLeft(screen2);
                    weeknd.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    weeknd.CLS(screen2);
                    weeknd.CLS(screen3);
                    Thread.sleep(211000);
                    weeknd.PirotecniaLeft(screen2);
                    weeknd.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    weeknd.CLS(screen2);
                    weeknd.CLS(screen3);
                    Thread.sleep(259000);

                    //Termina pirotecnia de The Weeknd

                    malone.PirotecniaLeft(screen2);
                    malone.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    malone.CLS(screen2);
                    malone.CLS(screen3);
                    Thread.sleep(151000);
                    malone.PirotecniaLeft(screen2);
                    malone.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    malone.CLS(screen2);
                    malone.CLS(screen3);
                    Thread.sleep(213000);
                    malone.PirotecniaLeft(screen2);
                    malone.PirotecniaRight(screen3);
                    Thread.sleep(10000);
                    malone.CLS(screen2);
                    malone.CLS(screen3);

                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        //hilos donde inicia malone
        Thread malone1 = new Thread(iniciaMalone);
        Thread firemalone = new Thread(pirotecniaM);

        //hilo donde inicia weeknd
        Thread weeknd1 = new Thread(stageW);
        Thread fireweeknd = new Thread(pirotecniaW);

        //hilo donde inicia weeknd
        Thread ye1 = new Thread(stageY);
        Thread fireye = new Thread(pirotecniaY);

        screen1.out("WELCOME TO COACHELLA\n", Colors.GloomyPurple);
        screen1.changeStyle("Helvetica", 30, Colors.AgalFuel, Colors.AntiFlashWhite);
        screen1.setVisible(true);
        String r = d.readString("Que artista quieres que comience: \n1:The Weeknd \n2:Post Malone \n3:Kanye West");
        if (r.charAt(0) == '1') {
            weeknd1.start();
            fireweeknd.start();
        }
        else if (r.charAt(0) == '2'){
            malone1.start();
            firemalone.start();
        }
        else if (r.charAt(0) == '3'){
            ye1.start();
            fireye.start();
        }
        else{
            screen1.out("Teclea un numero correcto", "Century Schoolbook L", 28, Colors.Desire);
        }
    }
}
