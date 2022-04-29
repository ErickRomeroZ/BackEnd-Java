public class ArtistPerformace {
    String artista;

    public ArtistPerformace(String artista){
        this.artista = artista;
    }

    public String getArtista(){  return artista;}

    public boolean setArtista(String artista){
        if (!artista.isEmpty()){
            this.artista = artista;
            return true;
        } else
            return false;
    }

    public String NameArtist(){
        return artista+"\n";
    }
}
