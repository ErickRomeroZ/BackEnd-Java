package p1;

public class Test {
    public static void main(String[] args) {
    showHarry();
    showCho();
    showBellatrix();
    showCedric();
    showSirius();
    }

    public static void showHarry(){
        Harry harryPotter = new Harry();
        harryPotter.setName("Harry Potter");
        harryPotter.setGender("Male");
        harryPotter.setHouse("Gryffindor");
        harryPotter.setNickName("The Boy Who Lived");
        harryPotter.setBoggart("Dementor");
        harryPotter.setPatronus("Stag");

        String msg = "Soy un Harry  de estas caracteristicas:"+"\n";
        msg += "Nombre: "+ harryPotter.getName()+"\n";
        msg += "Gender: "+ harryPotter.getGender()+"\n";
        msg += "House: "+ harryPotter.getHouse()+"\n";
        msg += "Nickname: "+ harryPotter.getNickName()+"\n";
        msg += "Boggart: "+ harryPotter.getBoggart()+"\n";
        msg += "Patronus: "+ harryPotter.getPatronus()+"\n";

        System.out.print(msg);

    }

    public static void showCho(){
        Cho choChang = new Cho("Cho Chang", "Female", "Ravenclaw", "None", "Lord Voldemort", "Swan");

        String msg = "Soy una Cho de estas caracteristicas:"+"\n";
        msg += choChang.state();

        System.out.print(msg);
    }

    public static void showBellatrix(){
        Bellatrix bellatrix = new Bellatrix();
        bellatrix.setName("Bellatrix Lestrange");
        bellatrix.setGender("Female");
        bellatrix.setHouse("Slytherin");
        bellatrix.setNickName("Bella");
        bellatrix.setBoggart("None");
        bellatrix.setPatronus("None");

        String msg = "Soy una Bellatrix de estas caracteristicas:"+"\n";
        msg += bellatrix.state();

        System.out.print(msg);
    }

    public static void showCedric(){
        Cedric cedric = new Cedric();
        cedric.setName("Cedric Diggory");
        cedric.setGender("Male");
        cedric.setHouse("Hufflepuff[");
        cedric.setNickName("Ced");
        cedric.setBoggart("Lord Voldemort");
        cedric.setPatronus("None");

        String msg = "Soy un Cedric de estas caracteristicas:"+"\n";
        msg += cedric.state();

        System.out.print(msg);
    }

    public static void showSirius(){
        Sirius sirius = new Sirius("Sirius Black", "Male", "Gryffindor", "Padfoot", "Lord Voldemort", "Non-corporeal");

        String msg = "Soy una Cho de estas caracteristicas:"+"\n";
        msg += sirius.state();

        System.out.print(msg);
    }
}
