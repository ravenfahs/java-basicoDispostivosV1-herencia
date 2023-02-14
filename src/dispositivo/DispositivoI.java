package dispositivo;

public class DispositivoI {
    String dispositivo;
    String marca;
    String referencia;
    String tipoPantalla;
    String tamañoPantalla; //Alto X Ancho
    String dimensiones;
    String resolucion;//pixeles
    boolean camara;
    String rom;//permanete
    String ram;//temporal
    String procesador;
    String peso;
    String conexionesInalambricas;
    boolean gigaRed; //true o false
    String sistemaOperativo;
    String duracionBateria;
    String tiempoCarga;
    boolean resistenaciaSalAguaPolvo;
    String resistenciaAgua;
    boolean linterna;
    String funciones;
    boolean medios;
    String formatos;
    //Sensores
    boolean giroscopio;
    boolean gps;//locacion
    boolean acelerómetro;
    boolean sensorGeomagnetico;
    boolean sensorOpticoRitmoCardiaco;
    boolean sensorLuzAmbiental;
    boolean sensorPresionAire;
    boolean nfc;
    boolean sensorInfrarrojo;
    boolean sensorHuellasDactilares;
    boolean brújula;
    boolean sensorProximidad;
    boolean sensorGrabedad;


    public String impresionSmartWatch() {
        return "\n\n...Caracteristicas...\n" + "Marca: " + marca + "\n" + "Referencia: " + referencia + "\n"
                + "Tamaño Pantalla: " + tamañoPantalla + "\n" + "Tipo de Pantalla: " + tipoPantalla
                + "\n" + "Dimensiones: " + dimensiones + "\n" + "Resolucion: " + resolucion + "\n" + "Camara=" + camara + "\n" + "Rom: " + rom + "\n"
                + "Ram: " + ram + "\n" + "Procesador: " + procesador + "\n" + "Peso: " + peso + "\n" + "Conexiones Inalambricas: "
                + conexionesInalambricas + "\n" + "GigaRed: " + gigaRed + "\n\n" + "...Sistema operativo...\n" + "Sistema Operativo: " + sistemaOperativo + "\n\n"
                + "...Caracteristica Bateria...\n" + "Duracion de la Bateria: " + duracionBateria + "\n" + "Tiempo de Carga: " + tiempoCarga + "\n\n" + "...Ventajas...\n"
                + "Resistenacia al Agua y Polvo: " + resistenaciaSalAguaPolvo + "\n" + "ResistenciaAgua: " + resistenciaAgua + "\n"
                + "Linterna: " + linterna + "\n" + "Medios: " + medios + "\n" + "Funciones: \n" + funciones + "\n\n" + "...Sensores..." + "\n" + "Giroscopio: " + giroscopio + "\n"
                + "Gps: " + gps + "\n" + "Acelerómetro: " + acelerómetro + "\n" + "Sensor Geomagnetico: " + sensorGeomagnetico
                + "\n" + "Sensor Optico del Ritmo Cardiaco: " + sensorOpticoRitmoCardiaco + "\n" + "Sensor de Luz Ambiental: "
                + sensorLuzAmbiental + "\n" + "Sensor de Presion de Aire: " + sensorPresionAire + "\n" + "Nfc: " + nfc + "\n"
                + "Sensor de Infrarrojo: " + sensorInfrarrojo + "\n" + "Sensor de Huellas Tactilares: " + sensorHuellasDactilares + "\n"
                + "Brújula: " + brújula + "\n" + "Sensor de Proximidad: " + sensorProximidad + "\n" + "Sensor de Gravedad: " + sensorGrabedad;
    }

    public String getFormatos() {
        return formatos;
    }

    public boolean isSensorHuellasDactilares() {
        return sensorHuellasDactilares;
    }

    public String impresionSmartPhone() {
        return "\n\n...Caracteristicas...\n" + "Marca: " + marca + "\n" + "Referencia: " + referencia + "\n"
                + "Tipo de Pantalla: " + tipoPantalla + "\n" + "Tamaño de la Pantalla: " + tamañoPantalla + "\n" + "Dimensiones dispositivp: "
                + dimensiones + "Resolucion de Pantalla: " + resolucion + "Camara: " + camara + "Rom: " + rom + "Ram: " + ram
                + "Procesador: " + procesador + "\n" + "Peso: " + peso + "\n" + "Conexiones Inalambricas: " + conexionesInalambricas + "\n"
                + "GigaRed: " + gigaRed + "\n\n" + "...Sistema operativo...\n" + "Sistema Operativo: " + sistemaOperativo + "\n\n" + "...Caracteristica Bateria...\n" + "Duracion de la Bateria: "
                + duracionBateria + "\n" + "Tiempo de Carga: " + tiempoCarga + "\n\n" + "...Ventajas..." + "Resistenacia al Agua y Polvo: "
                + resistenaciaSalAguaPolvo + "\n" + "Resistencia Agua: " + resistenciaAgua + "\n" + "Linterna: " + linterna + "\n"
                + "Funciones: " + funciones + "\n" + "Medios: " + medios + "\n" + "Formatos: " + formatos + "\n\n" + "...Sensores...\n" + "Giroscopio: "
                + giroscopio + "Gps: " + gps + "\n" + "Acelerómetro: " + acelerómetro + "\n" + "Sensor Geomagnetico: "
                + sensorGeomagnetico + "\n" + "Sensor Optico del RitmoCardiaco: " + sensorOpticoRitmoCardiaco + "\n"
                + "Sensor de Luz Ambiental: " + sensorLuzAmbiental + "\n" + "Sensor de Presion del Aire: " + sensorPresionAire + "Nfc: "
                + nfc + "\n" + "Sensor Infrarrojo: " + sensorInfrarrojo + "\n" + "Sensor de Huellas tactilares: "
                + sensorHuellasDactilares + "\n" + "Brújula: " + brújula + "Sensor de Proximidad: " + sensorProximidad + "\n"
                + "sensorGrabedad: " + sensorGrabedad;
    }

    public void setSensorHuellasDactilares(boolean sensorHuellasDactilares) {
        this.sensorHuellasDactilares = sensorHuellasDactilares;
    }

    public void setFormatos(String formatos) {
        this.formatos = formatos;
    }

    public boolean isSensorGrabedad() {
        return sensorGrabedad;
    }

    public void setSensorGrabedad(boolean sensorGrabedad) {
        this.sensorGrabedad = sensorGrabedad;
    }

    public String getFunciones() {
        return funciones;
    }

    public void setFunciones(String funciones) {
        this.funciones = funciones;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getResistenciaAgua() {
        return resistenciaAgua;
    }

    public void setResistenciaAgua(String resistenciaAgua) {
        this.resistenciaAgua = resistenciaAgua;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(String tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isCamara() {
        return camara;
    }

    public void setCamara(boolean camara) {
        this.camara = camara;
    }

    public String getRom() {
        return rom;
    }

    public void setRom(String rom) {
        this.rom = rom;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getConexionesInalambricas() {
        return conexionesInalambricas;
    }

    public void setConexionesInalambricas(String conexionesInalambricas) {
        this.conexionesInalambricas = conexionesInalambricas;
    }

    public boolean isGigaRed() {
        return gigaRed;
    }

    public void setGigaRed(boolean gigaRed) {
        this.gigaRed = gigaRed;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(String duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    public String getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(String tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    public boolean isResistenaciaSalAguaPolvo() {
        return resistenaciaSalAguaPolvo;
    }

    public void setResistenaciaSalAguaPolvo(boolean resistenaciaSalAguaPolvo) {
        this.resistenaciaSalAguaPolvo = resistenaciaSalAguaPolvo;
    }

    public boolean isLinterna() {
        return linterna;
    }

    public void setLinterna(boolean linterna) {
        this.linterna = linterna;
    }

    public boolean isMedios() {
        return medios;
    }

    public void setMedios(boolean medios) {
        this.medios = medios;
    }

    public boolean isGiroscopio() {
        return giroscopio;
    }

    public void setGiroscopio(boolean giroscopio) {
        this.giroscopio = giroscopio;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isAcelerómetro() {
        return acelerómetro;
    }

    public void setAcelerómetro(boolean acelerómetro) {
        this.acelerómetro = acelerómetro;
    }

    public boolean isSensorGeomagnetico() {
        return sensorGeomagnetico;
    }

    public void setSensorGeomagnetico(boolean sensorGeomagnetico) {
        this.sensorGeomagnetico = sensorGeomagnetico;
    }

    public boolean isSensorOpticoRitmoCardiaco() {
        return sensorOpticoRitmoCardiaco;
    }

    public void setSensorOpticoRitmoCardiaco(boolean sensorOpticoRitmoCardiaco) {
        this.sensorOpticoRitmoCardiaco = sensorOpticoRitmoCardiaco;
    }

    public boolean isSensorLuzAmbiental() {
        return sensorLuzAmbiental;
    }

    public void setSensorLuzAmbiental(boolean sensorLuzAmbiental) {
        this.sensorLuzAmbiental = sensorLuzAmbiental;
    }

    public boolean isSensorPresionAire() {
        return sensorPresionAire;
    }

    public void setSensorPresionAire(boolean sensorPresionAire) {
        this.sensorPresionAire = sensorPresionAire;
    }

    public boolean isNfc() {
        return nfc;
    }

    public void setNfc(boolean nfc) {
        this.nfc = nfc;
    }

    public boolean isSensorInfrarrojo() {
        return sensorInfrarrojo;
    }

    public void setSensorInfrarrojo(boolean sensorInfrarrojo) {
        this.sensorInfrarrojo = sensorInfrarrojo;
    }

    public boolean issensorHuellasDactilares() {
        return sensorHuellasDactilares;
    }

    public void setsensorHuellasDactilares(boolean sensorHuellasDactilares) {
        this.sensorHuellasDactilares = sensorHuellasDactilares;
    }

    public boolean isBrújula() {
        return brújula;
    }

    public void setBrújula(boolean brújula) {
        this.brújula = brújula;
    }

    public boolean isSensorProximidad() {
        return sensorProximidad;
    }

    public void setSensorProximidad(boolean sensorProximidad) {
        this.sensorProximidad = sensorProximidad;
    }

}


