package p1;

public class Bellatrix {
    public String name, gender, house, nickName, boggart, patronus;

    public String getName(){  return name;  }
    public String getGender(){  return gender;  }
    public String getHouse(){  return house;  }
    public String getNickName(){  return nickName;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }
    public boolean setGender(String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        } else
            return false;
    }
    public boolean setHouse(String house){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        } else
            return false;
    }
    public boolean setNickName(String nickName){
        if(!nickName.isEmpty()){
            this.nickName = nickName;
            return true;
        } else
            return false;
    }
    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        } else
            return false;
    }
    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else
            return false;
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
