package dispositivo;
/*
* En ste ejercicio tendréis que crear una clase SmartDevice.
* Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
* Agregaréis atributos tal cual tendrían esos objetos en la realidad.
* Crear constructor vacío y con todos los parámetros para cada clase.
* Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
*
* */
public class Main {
    public static void main(String[] args) {
        // captura de datos del dispositivos SmartWatches

        SmartWatch watchGt2 = new SmartWatch("SmartWatch", "HUAWEI", "WATCH GT 2", "1,39 pulgadas", "45,9 x 45,9 x 10,7 mm", "454 x 454 HD");
        watchGt2.setTamañoMuñeca("14~21.cm");
        watchGt2.setSerie("46.mm - diametro");
        watchGt2.setTipoCorrea("Clássica");
        watchGt2.setCuerpo("Acero Inoxidable Negro");
        watchGt2.setColorReloj("Matte Black");
        watchGt2.setResistenaciaSalAguaPolvo(true);
        watchGt2.setResistenciaAgua("5 ATM");
        watchGt2.setSistemaOperativo("Lite OS");
        watchGt2.setTipoPantalla("AMOLED táctil");
        watchGt2.setProcesador("Kirin A1");
        watchGt2.setConexionesInalambricas("Bluetooth: BT5.1, BLE/BR/EDR");
        watchGt2.setRom("2 GB");
        watchGt2.setPeso("41 g-(Sin correa)");
        watchGt2.setDuracionBateria("14 días para uso típico");
        watchGt2.setTiempoCarga("1 hora aproximadamente al 100%");
        watchGt2.setLinterna(true);
        watchGt2.setMedios(true);
        watchGt2.setFunciones("Recibir y hacer llamadas\nReproducir musica\nMonitoreo de Sueño\nMonitorea el estrés a lo largo del día\nSeguimiento Permanente del progreso físico del día");
        watchGt2.setGps(true);
        watchGt2.setAcelerómetro(true);
        watchGt2.setGiroscopio(true);
        watchGt2.setSensorGeomagnetico(true);
        watchGt2.setSensorOpticoRitmoCardiaco(true);
        watchGt2.setSensorLuzAmbiental(true);
        watchGt2.setSensorPresionAire(true);
        System.out.println(watchGt2.SmartWatch2() + watchGt2.impresionSmartWatch());

        System.out.println("\n**************************************************\n");

        // captura de datos del dispositivos SmartPhones
        SmartPhone HUAWEIP50Pro = new SmartPhone("SmartPhone", "HUAWEI", "P50 Pro", "6.6 pulgadas", "158.8 mm Al, Ancho 72.8 mm An, 8.5 mm G", "2700 x 1228 pixeles");
        HUAWEIP50Pro.setPeso("195g (incluida la batería)");
        HUAWEIP50Pro.setTipoPantalla("OLED-Tasa de muestreo táctil de 300 Hz");
        HUAWEIP50Pro.setResolucion("2700 x 1228 pixeles");
        HUAWEIP50Pro.setProcesador("Octa-core, 1 x Cortex-X1@2.84 GHz + 3 x Cortex-A78@2.42 GHz + 4 x Cortex-A55@1.8 GHz");
        HUAWEIP50Pro.setGpu("Adreno 660");
        HUAWEIP50Pro.setRam("8 GB");
        HUAWEIP50Pro.setRom("256 GB");
        HUAWEIP50Pro.setSistemaOperativo("Android 11 - EMUI 12");
        HUAWEIP50Pro.setLinterna(true);
        HUAWEIP50Pro.setCamara(true);
        HUAWEIP50Pro.setCamaraTrasera("Cámara True-Chroma de 50 MP (Color, apertura f/1.8, OIS) \n" + "Cámara True-Chroma de 40 MP (MONO, apertura f/1.6)\n"
                + "Cámara ultra gran angular de 13 MP (apertura f/2.2)\n" + "Cámara de teleobjetivo de 64 MP (apertura f/3.5, OIS), admite AF");
        HUAWEIP50Pro.setResolucionImagenCamaraTrasera("8192 x 6144 píxeles");
        HUAWEIP50Pro.setResolucionVideoCamaraTrasera("Soporta hasta 3840 x 2160 píxeles, soporta vídeo a cámara ultralenta de 1080p@960fps.");
        HUAWEIP50Pro.setCamaraFrontal("Cámara selfie de 13 MP (gran angular, f/2.4, autofoco)");
        HUAWEIP50Pro.setResolucionImagenCamaraFrontal("4160 x 3120 píxeles");
        HUAWEIP50Pro.setResolucionVideoCamaraFrontal("Soporta hasta 3840 x 2160 píxeles, soporta vídeo a cámara lenta de 1080p@240fps.");
        HUAWEIP50Pro.setDuracionBateria("6 horas para uso típico");
        HUAWEIP50Pro.setTiempoCarga("48 minutos");
        HUAWEIP50Pro.setResistenaciaSalAguaPolvo(true);
        HUAWEIP50Pro.setResistenciaAgua("IP68 para la resistencia a las salpicaduras");
        HUAWEIP50Pro.setGigaRed(false);
        HUAWEIP50Pro.setConexionesInalambricas("WLAN 2.4 GHz y 5 GHz, 802.11 a/b/g/n/ac/ax, 2 x 2 MIMO, HE160, 4096 QAM, 8 Spatial-streaming MU-MIMO \n" +
                "Bluetooth 5.2, soporta BLE, SBC, AAC, LDAC.\n" + "USB Tipo-C, USB 3.1 GEN1 \n" + "Conector para el oído USB Type-C earjack");
        HUAWEIP50Pro.setNfc(true);
        HUAWEIP50Pro.setGps(true);
        HUAWEIP50Pro.setSensorGrabedad(true);
        HUAWEIP50Pro.setSensorInfrarrojo(true);
        HUAWEIP50Pro.setsensorHuellasDactilares(true);
        HUAWEIP50Pro.setGiroscopio(true);
        HUAWEIP50Pro.setBrújula(true);
        HUAWEIP50Pro.setSensorLuzAmbiental(true);
        HUAWEIP50Pro.setSensorProximidad(true);
        HUAWEIP50Pro.setMedios(true);
        HUAWEIP50Pro.setFormatos("*.mp3, *.mp4, *.3gp, *.ogg, *.amr, *.aac, *.flac, *.wav, *.midi soporta stereo 3gp, mp4");
        System.out.println(HUAWEIP50Pro.Smartphone2() + HUAWEIP50Pro.impresionSmartPhone() + "\n");

    }
}
