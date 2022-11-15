package com.Smart;

public class SmartPhone extends SmartDivice {
    String redMovil;
    int numeroTelefonico;
    int pixelesCamaraFrontalAncho;
    int pixelesCamaraFrontalAlto;
    int pixelesPantallaAncho;
    int pixelesPantallaAlto;


    public SmartPhone(String redMovil, int numeroTelefonico, int pixelesCamaraFrontalAncho, int pixelesCamaraFrontalAlto, int pixelesCamaraTraseraAncho, int pixelesCamaraTraseraAlto) {
        super(true, "x21", "Android", 100, 100 );
        this.redMovil = redMovil;
        this.numeroTelefonico = numeroTelefonico;
        this.pixelesCamaraFrontalAncho = pixelesCamaraFrontalAncho;
        this.pixelesCamaraFrontalAlto = pixelesCamaraFrontalAlto;
        this.pixelesPantallaAncho = pixelesCamaraTraseraAncho;
        this.pixelesPantallaAlto = pixelesCamaraTraseraAlto;
    }

    public SmartPhone() {
    }

    public String toString()
    {
        return this.redMovil + " " + this.numeroTelefonico + " " + this.pixelesCamaraFrontalAlto + " " + this.pixelesCamaraFrontalAncho + " " + this.pixelesPantallaAlto + " " + this.pixelesPantallaAncho;
    }
}
