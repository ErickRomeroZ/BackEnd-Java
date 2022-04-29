public class Comic {
    public static void main(String[] args) throws InterruptedException{
        TestComic();
    }

    private static void TestComic() throws InterruptedException{
        Screen screen = new Screen();
        Vineta1 vineta1 = new Vineta1(
                "Ugo era un pingüino que era más lento que todos los demás pingüinos y siempre tardaba demasiado en hacer cosas que a los demás les tomaba minutos"
        );
        Vineta2 vineta2 = new Vineta2(
                "Todos se burlaban de Ugo ya que no era tan rápido como ellos"
        );
        Vineta3 vineta3 = new Vineta3(
                "Constantemente Ugo el pingüino se lamentaba por su lentitud"
        );
        Vineta4 vineta4 = new Vineta4(
                "Y es que no es para menos siempre llega tarde, es el último en acabar sus tareas, casi nunca consigue premios a la rápidez y, para colmo es un dormilon."
        );
        Vineta5 vineta5 = new Vineta5(
                "Un buen día, harto de que sus compañeros le recriminaran por su poco esfuerzo al realizar sus tareas, se propuso a volver a hacer sus labores."
        );
        Vineta6 vineta6 = new Vineta6(
                "Pero cada tarea que intentaba volvían las burlas de los demás, y dejaba todas sus actividades olvidadas"
        );
        Vineta7 vineta7 = new Vineta7(
                "Y es que había optado por no intentar siquiera realizar actividades tan sencillas como amontonar piedras, o quitar la nieve del camino hacia las casas de todos los demás pingüinos."
        );
        Vineta8 vineta8 = new Vineta8(
                "De pronto un pinguino mayor escucho a Ugo y le dijo.."
        );
        Vineta9 vineta9 = new Vineta9(
                "El pingüino mayor prosiguió y le dio un consejo"
        );
        Vineta10 vineta10 = new Vineta10(
                "Ugo agradecido con su compañero dejo de llorar y le prometió que no olvidaría el valor del esfuerzo"
        );
        Vineta11 vineta11 = new Vineta11(
                "Pasaron unos días y Ugo el pingüino se esforzaba en sus quehaceres"
        );
        Vineta12 vineta12 = new Vineta12(
                "Se sentía feliz consigo mismo pues cada día conseguía lo poquito que se proponía porque era consciente de que había hecho todo lo posible por lograrlo."
        );

        Runnable vinetas = new Runnable() {
            @Override
            public void run() {
                try {
                    vineta1.img1(screen);
                    Thread.sleep(5000);

                    vineta2.img2(screen);
                    Thread.sleep(5000);

                    vineta3.img3(screen);
                    Thread.sleep(5000);

                    vineta4.img4(screen);
                    Thread.sleep(5000);

                    vineta5.img5(screen);
                    Thread.sleep(5000);

                    vineta6.img6(screen);
                    Thread.sleep(5000);

                    vineta7.img7(screen);
                    Thread.sleep(5000);

                    vineta8.img8(screen);
                    Thread.sleep(5000);

                    vineta9.img9(screen);
                    Thread.sleep(5000);

                    vineta10.img10(screen);
                    Thread.sleep(5000);

                    vineta11.img11(screen);
                    Thread.sleep(5000);

                    vineta12.img12(screen);
                    Thread.sleep(5000);

                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Thread comic = new Thread(vinetas);
        comic.start();

    }

}
