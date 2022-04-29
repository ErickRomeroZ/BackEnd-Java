package p1;

public class Sirius {
    public String name, gender, house, nickName, boggart, patronus;

    public Sirius(String name,String gender, String house, String nickName, String boggart, String patronus){
        this.name = name;
        this.gender = gender;
        this.house = house;
        this.nickName = nickName;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public String state(){
        return  "Name: "+name+"\n"+
                "Gender: "+gender+"\n"+
                "House: "+house+"\n"+
                "Nickname: "+nickName+"\n"+
                "Boggart: "+boggart+"\n"+
                "Patronus: "+patronus+"\n";
    }

}
