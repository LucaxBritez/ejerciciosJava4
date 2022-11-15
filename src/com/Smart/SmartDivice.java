package com.Smart;

public class SmartDivice {
    boolean bluetooth;
    String protoComun;
    String sistemaOperativo;
    int altoPantalla;
    int anchoPantalla;

    public SmartDivice(boolean bluetooth, String protoComun, String sistemaOperativo, int altoPantalla, int anchoPantalla) {
        this.bluetooth = bluetooth;
        this.protoComun = protoComun;
        this.sistemaOperativo = sistemaOperativo;
        this.altoPantalla = altoPantalla;
        this.anchoPantalla = anchoPantalla;
    }
    public SmartDivice() {
    }

    public String toString()
    {
        return this.bluetooth + " " + this.protoComun + " " + this.sistemaOperativo + " " + this.altoPantalla + " " + this.anchoPantalla;
    }


}
