package p2;

public class Mona {
    private int id;
    private String name;
    private String outfit;
    private String accessory;
    private String job;

    public int getId(){  return id;  }
    public String getName(){  return name;}
    public String getOutfit(){  return outfit;}
    public String getAccessory(){return accessory;}
    public String getJob(){return job;}

    public boolean setId(int id){
        if(id > 0){
            this.id = id;
            return true;
        } else
            return false;
    }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public boolean setOutfit(String outfit){
        if(!outfit.isEmpty()){
            this.outfit = outfit;
            return true;
        } else
            return false;
    }

    public boolean setAccessory(String accessory){
        if(!accessory.isEmpty()){
            this.accessory = accessory;
            return true;
        } else
            return false;
    }

    public boolean setJob(String job){
        if(!job.isEmpty()){
            this.job = job;
            return true;
        } else
            return false;
    }

}
