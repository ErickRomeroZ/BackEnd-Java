public class SpiderTipo {
    String nombre, nombreReal, universo, especie, genero, colorTraje, calzado;

    public SpiderTipo(String nombre, String nombreReal, String universo, String especie, String genero, String colorTraje, String calzado){
        this.nombre = nombre;
        this.nombreReal = nombreReal;
        this.universo = universo;
        this.especie = especie;
        this.genero = genero;
        this.colorTraje = colorTraje;
        this.calzado = calzado;
    }

    public String getNombre(){  return nombre;  }
    public String getNombreReal(){  return nombreReal;  }
    public String getUniverso(){  return universo;  }
    public String getEspecie(){  return especie;  }
    public String getGenero(){  return genero;  }
    public String getColorTraje(){  return colorTraje;  }
    public String getCalzado(){  return calzado;  }

    public boolean  setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        } else
            return false;
    }

    public boolean  setNombreReal(String nombreReal){
        if (!nombreReal.isEmpty()){
            this.nombreReal = nombreReal;
            return true;
        } else
            return false;
    }

    public boolean  setUniverso(String universo){
        if (!universo.isEmpty()){
            this.universo = universo;
            return true;
        } else
            return false;
    }

    public boolean  setEspecie(String especie){
        if (!especie.isEmpty()){
            this.especie = especie;
            return true;
        } else
            return false;
    }

    public boolean  setGenero(String genero){
        if (!genero.isEmpty()){
            this.genero = genero;
            return true;
        } else
            return false;
    }

    public boolean  setColorTraje(String colorTraje){
        if (!colorTraje.isEmpty()){
            this.colorTraje = colorTraje;
            return true;
        } else
            return false;
    }

    public boolean  setCalzado(String calzado){
        if (!calzado.isEmpty()){
            this.calzado = calzado;
            return true;
        } else
            return false;
    }

    public String message(){
        return
                "Nombre: "+nombre+"\n"+
                        "Nombre real: "+nombreReal+"\n"+
                        "Universo: "+universo+"\n"+
                        "Especie: "+especie+"\n"+
                        "Género: "+genero+"\n"+
                        "Color de traje: "+colorTraje+"\n"+
                        "Calzado: "+calzado+"\n";
    }
}
