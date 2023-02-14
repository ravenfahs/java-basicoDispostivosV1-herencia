package dispositivo;

public class SmartWatch extends DispositivoI {
    String tamañoMuñeca;
    String serie;
    String tipoCorrea;
    String cuerpo;
    String colorReloj;

    public SmartWatch(String dispositivo, String marca, String referencia, String tamañoPantalla, String dimensiones, String resolucion) {
        this.dispositivo = dispositivo;
        this.marca = marca;
        this.referencia = referencia;
        this.tamañoPantalla = tamañoPantalla;
        this.dimensiones = dimensiones;
        this.resolucion = resolucion;
    }

    public SmartWatch(String tamañoMuñeca, String serie, String tipoCorrea, String cuerpo, String colorReloj) {

        ///this.dispositivo=dispositivo;
        this.tamañoMuñeca = tamañoMuñeca;
        this.serie = serie;
        this.tipoCorrea = tipoCorrea;
        this.cuerpo = cuerpo;
        this.colorReloj = colorReloj;
    }

    public String getTamañoMuñeca() {
        return tamañoMuñeca;
    }

    public void setTamañoMuñeca(String tamañoMuñeca) {
        this.tamañoMuñeca = tamañoMuñeca;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTipoCorrea() {
        return tipoCorrea;
    }

    public void setTipoCorrea(String tipoCorrea) {
        this.tipoCorrea = tipoCorrea;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public String getColorReloj() {
        return colorReloj;
    }

    public void setColorReloj(String colorReloj) {
        this.colorReloj = colorReloj;
    }

    public String SmartWatch2() {
        return "Dispositivos Inteligentes: \n\n" + "Tipo de dispositivo inteligente: " + dispositivo + "\n" + "Tamaño de la Muñeca: " + tamañoMuñeca + "\n" + "Serie: " + serie + "\n" + "Tipo de la Correa: " + tipoCorrea + "\n"
                + "Cuerpo del reloj: " + cuerpo + "\n" + "Color del cuerpo del Reloj: " + colorReloj;
    }


}
