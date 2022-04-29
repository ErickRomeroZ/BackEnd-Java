public class Vineta {
    String dialogos;

    public Vineta(String dialogos){
        this.dialogos = dialogos;
    }

    public String getDialogos(){  return dialogos;  }

    public boolean setDialogos(String dialogos){
        if (!dialogos.isEmpty()){
            this.dialogos = dialogos;
            return true;
        } else
            return false;
    }

    public String ShowDialogos(){
        return dialogos+"\n";
    }
}
