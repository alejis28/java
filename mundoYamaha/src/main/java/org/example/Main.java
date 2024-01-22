package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer idDeudor;
        Integer tipoDocumento;
        String documento;
        String nombres;
        String apellidos;
        String telefonoMovil;
        String telefonoFijo;
        String direccion;
        String idFiador;
        String nombresFiador;
        String documentoFiador;
        Double valorBrutoMoto;
        Double valorTotalMoto;
        Boolean tieneLicenciaConductor;
        String tipoDeCompra;

        Scanner leer =new Scanner(System.in);

        //proceso
        System.out.println("*******************");
        System.out.println("MUNDO YAMAHA");
        System.out.println("*******************");


        System.out.println("apreciado cliente, usted cuenta con licencia?" );
        tieneLicenciaConductor=leer.nextBoolean();

        //primera pregunta o decicion
        if (tieneLicenciaConductor==true) {
            //si tine licencia

            System.out.println("nombres del cliente:");
            nombres= leer.nextLine();

            System.out.println("apellidos  del cliente:");
            apellidos=leer.nextLine();

            System.out.println("tipo documento");
            tipoDocumento=leer.nextInt();

            System.out.println("numero documento");
            documento= leer.nextLine();

            System.out.println("telefono celular");
            telefonoFijo= leer.nextLine();

            System.out.println("teledono fijo");
            telefonoMovil= leer.nextLine();

            System.out.println("cual es su dirrecion");
            direccion= leer.nextLine();

            System.out.println("documento fiador");
            documentoFiador= leer.nextLine();

            System.out.println("nombre fiador");
            nombresFiador=leer.nextLine();

            System.out.println("Nuestras Motocicletas: ");
            System.out.println("1.YAMAHA SZR-125---$9000000");
            System.out.println("2.YAMAHA crypton FI---$8000000");
            System.out.println("3.YAMAHA XTZ125---$10500000");
            System.out.println("4.YAMAHA MT10---$720000000");
            System.out.println("5.YAMAHA NMAX300---$34000000");

            Integer motoSelecionada;
            System.out.println("digite la motocicleta deseada");
            motoSelecionada= leer.nextInt();
            Double valorMoto=0.0;
            if (motoSelecionada==1) {
                valorMoto=9000000.0;

            }else if(motoSelecionada==2) {
                valorMoto=8000000.0;

            }else if(motoSelecionada==3) {
                valorMoto=10500000.0;

            }else if(motoSelecionada==4) {
                valorMoto=72000000.0;

            }else if(motoSelecionada==5) {
                valorMoto=34000000.0;

            }else{
                System.out.println("moto invalida");

            }




            //2.pregunta : lo quiere a credito

            System.out.println("usuario digite /credito o /contado para continuar su compra");
            leer.nextLine();
            tipoDeCompra=leer.nextLine() . toLowerCase();
            if (tipoDeCompra.equals("credito")) {

                //la pregunta % a financiar
                Double porcentajeCredito;
                System.out.printf("ingresa el porcentaje a financiar:");
                porcentajeCredito=leer.nextDouble();
                if(porcentajeCredito==1.0){

                    Double valorIntereses=0.25;
                    valorMoto=valorMoto+(valorMoto*valorIntereses);

                } else if (porcentajeCredito==0.7){

                    Double valorIntereses=0.15;

                } else if (porcentajeCredito==0.5){

                    Double valorIntereses=0.07;

                }else{

                }


            }else{
                System.out.println("exelente te daremos un descuneto de 10%");

            }
        }else{
                  //no tine licencia
            System.out.println("apreciado usuario,no podemos continuar la transaccion");
            System.out.println("lo invitamos a tramitar su licencia.vuelva pronto...");
        }
    }
}