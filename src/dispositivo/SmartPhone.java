package dispositivo;

public class SmartPhone  extends DispositivoI{
    String gpu;
    String camaraFrontal;
    String resolucionImagenCamaraFrontal;
    String resolucionVideoCamaraFrontal;
    String camaraTrasera;
    String resolucionImagenCamaraTrasera;
    String resolucionVideoCamaraTrasera;

    public SmartPhone(String dispositivo,String marca,String referencia,String tamañoPantalla,String dimensiones,String resolucion) {
        this.dispositivo=dispositivo;
        this.marca=marca;
        this.referencia=referencia;
        this.tamañoPantalla=tamañoPantalla;
        this.dimensiones=dimensiones;
        this.resolucion=resolucion;
    }



    public SmartPhone(String gpu, String camaraFrontal, String resolucionImagenCamaraFrontal,
                      String resolucionVideoCamaraFrontal, String camaraTrasera, String resolucionImagenCamaraTrasera,
                      String resolucionVideoCamaraTrasera) {
        super();
        this.gpu = gpu;
        this.camaraFrontal = camaraFrontal;
        this.resolucionImagenCamaraFrontal = resolucionImagenCamaraFrontal;
        this.resolucionVideoCamaraFrontal = resolucionVideoCamaraFrontal;
        this.camaraTrasera = camaraTrasera;
        this.resolucionImagenCamaraTrasera = resolucionImagenCamaraTrasera;
        this.resolucionVideoCamaraTrasera = resolucionVideoCamaraTrasera;
    }



    public String getResolucionVideoCamaraFrontal() {
        return resolucionVideoCamaraFrontal;
    }
    public void setResolucionVideoCamaraFrontal(String resolucionVideoCamaraFrontal) {
        this.resolucionVideoCamaraFrontal = resolucionVideoCamaraFrontal;
    }
    public String getResolucionVideoCamaraTrasera() {
        return resolucionVideoCamaraTrasera;
    }
    public void setResolucionVideoCamaraTrasera(String resolucionVideoCamaraTrasera) {
        this.resolucionVideoCamaraTrasera = resolucionVideoCamaraTrasera;
    }
    public String getGpu() {
        return gpu;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
    public String getCamaraFrontal() {
        return camaraFrontal;
    }
    public void setCamaraFrontal(String camaraFrontal) {
        this.camaraFrontal = camaraFrontal;
    }
    public String getCamaraTrasera() {
        return camaraTrasera;
    }
    public void setCamaraTrasera(String camaraTrasera) {
        this.camaraTrasera = camaraTrasera;
    }


    public String getResolucionImagenCamaraFrontal() {
        return resolucionImagenCamaraFrontal;
    }
    public void setResolucionImagenCamaraFrontal(String resolucionImagenCamaraFrontal) {
        this.resolucionImagenCamaraFrontal = resolucionImagenCamaraFrontal;
    }
    public String getResolucionImagenCamaraTrasera() {
        return resolucionImagenCamaraTrasera;
    }
    public void setResolucionImagenCamaraTrasera(String resolucionImagenCamaraTrasera) {
        this.resolucionImagenCamaraTrasera = resolucionImagenCamaraTrasera;
    }


    public String Smartphone2() {

        return "Dispositivos Inteligentes: \n\n"+"Tipo de dispositivo inteligente: "+dispositivo+"\n"+  "Camara Frontal: " + camaraFrontal +"\n"+ "Resolucion de la Imagen de la Camara Frontal: "
                + resolucionImagenCamaraFrontal +"\n"+ "Resolucion del Video de la Camara Frontal: " + resolucionVideoCamaraFrontal +"\n"
                + "Camara Trasera: " + camaraTrasera +"\n"+ "Resolucion de la Imagen de la Camara Trasera: "
                + resolucionImagenCamaraTrasera +"\n"+ "Resolucion de Video de la Camara Trasera=: " + resolucionVideoCamaraTrasera+"\n"+"Gpu: " + gpu;
    }


}
