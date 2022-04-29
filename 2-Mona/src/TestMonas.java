package p2;

public class TestMonas {
    public static void main(String[] args) {
        TestBoxertocat();
        TestLuchadortocat();
        TestSteroidtocat();
        TestDaftpunktocatThomas();
        TestDaftpunktocatGuy();
        TestSpidertocat();
    }

    private static void TestBoxertocat(){
        Boxertocat boxertocat = new Boxertocat();

        boxertocat.setId(139);
        boxertocat.setName("Boxertocat");
        boxertocat.setOutfit("Bandanna");
        boxertocat.setAccessory("Gloves");
        boxertocat.setJob("Boxer");

        String msg = "Soy un Boxertocat de estas caracteristicas:"+"\n";
        msg += "ID: "+ boxertocat.getId()+"\n";
        msg += "Name: "+ boxertocat.getName()+"\n";
        msg += "Outfit: "+ boxertocat.getOutfit()+"\n";
        msg += "Accessory: "+ boxertocat.getAccessory()+"\n";
        msg += "Job: "+ boxertocat.getJob()+"\n";

        System.out.print(msg);
    }

    public static void TestLuchadortocat(){
        Luchadortocat luchadortocat = new Luchadortocat();

        luchadortocat.setId(113);
        luchadortocat.setName("Luchadortocat");
        luchadortocat.setOutfit("Wrestler outfit");
        luchadortocat.setAccessory("Mask");
        luchadortocat.setJob("Wrestler");

        String msg = "Soy un Luchadortocat de estas caracteristicas:"+"\n";
        msg += "ID: "+ luchadortocat.getId()+"\n";
        msg += "Name: "+ luchadortocat.getName()+"\n";
        msg += "Outfit: "+ luchadortocat.getOutfit()+"\n";
        msg += "Accessory: "+ luchadortocat.getAccessory()+"\n";
        msg += "Job: "+ luchadortocat.getJob()+"\n";

        System.out.print(msg);
    }

    public static void TestSteroidtocat(){
        Steroidtocat steroidtocat = new Steroidtocat();

        steroidtocat.setId(106);
        steroidtocat.setName("Steroidtocat");
        steroidtocat.setOutfit("Fitted t-shirt and pants");
        steroidtocat.setAccessory("Sunglasses");
        steroidtocat.setJob("Go to GYM");

        String msg = "Soy un Steroidtocat de estas caracteristicas:"+"\n";
        msg += "ID: "+ steroidtocat.getId()+"\n";
        msg += "Name: "+ steroidtocat.getName()+"\n";
        msg += "Outfit: "+ steroidtocat.getOutfit()+"\n";
        msg += "Accessory: "+ steroidtocat.getAccessory()+"\n";
        msg += "Job: "+ steroidtocat.getJob()+"\n";

        System.out.print(msg);
    }

    public static void TestDaftpunktocatThomas(){
        DaftpunktocatThomas daftpunktocatThomas = new DaftpunktocatThomas();

        daftpunktocatThomas.setId(100);
        daftpunktocatThomas.setName("Daftpunktocat-Thomas");
        daftpunktocatThomas.setOutfit("Black suit");
        daftpunktocatThomas.setAccessory("Thomas helmet");
        daftpunktocatThomas.setJob("DJ");

        String msg = "Soy un Daftpunktocat-Thomas de estas caracteristicas:"+"\n";
        msg += "ID: "+ daftpunktocatThomas.getId()+"\n";
        msg += "Name: "+ daftpunktocatThomas.getName()+"\n";
        msg += "Outfit: "+ daftpunktocatThomas.getOutfit()+"\n";
        msg += "Accessory: "+ daftpunktocatThomas.getAccessory()+"\n";
        msg += "Job: "+ daftpunktocatThomas.getJob()+"\n";

        System.out.print(msg);
    }

    public static void TestDaftpunktocatGuy(){
        DaftpunktocatGuy daftpunktocatGuy = new DaftpunktocatGuy();

        daftpunktocatGuy.setId(99);
        daftpunktocatGuy.setName("Daftpunktocat-Guy");
        daftpunktocatGuy.setOutfit("Black suit");
        daftpunktocatGuy.setAccessory("Guy´s helmet");
        daftpunktocatGuy.setJob("DJ");

        String msg = "Soy un Daftpunktocat-Guy de estas caracteristicas:"+"\n";
        msg += "ID: "+ daftpunktocatGuy.getId()+"\n";
        msg += "Name: "+ daftpunktocatGuy.getName()+"\n";
        msg += "Outfit: "+ daftpunktocatGuy.getOutfit()+"\n";
        msg += "Accessory: "+ daftpunktocatGuy.getAccessory()+"\n";
        msg += "Job: "+ daftpunktocatGuy.getJob()+"\n";

        System.out.print(msg);
    }

    public static void TestSpidertocat(){
        Spidertocat spidertocat = new Spidertocat();

        spidertocat.setId(89);
        spidertocat.setName("Spidertocat");
        spidertocat.setOutfit("Spidermans costume");
        spidertocat.setAccessory("Spiderweb");
        spidertocat.setJob("Superhero");

        String msg = "Soy un Spidertocat de estas caracteristicas:"+"\n";
        msg += "ID: "+ spidertocat.getId()+"\n";
        msg += "Name: "+ spidertocat.getName()+"\n";
        msg += "Outfit: "+ spidertocat.getOutfit()+"\n";
        msg += "Accessory: "+ spidertocat.getAccessory()+"\n";
        msg += "Job: "+ spidertocat.getJob()+"\n";

        System.out.print(msg);
    }
}


