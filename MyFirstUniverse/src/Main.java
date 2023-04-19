import Space.Hmloviny;
import Space.Vesmir;
import tools.MessageReader;
import tools.PrintToFile;
import vesmirnetelesa.*;
import zive_tvory.bezstavovce.Hmyzy.Mucha;
import zive_tvory.clovecina.Clovek;
import zive_tvory.clovecina.Muz;
import zive_tvory.clovecina.Zena;
import zive_tvory.stavovce.Ryby.Kapor;
import zive_tvory.stavovce.Ryby.Pirana;
import zive_tvory.stavovce.Vtaky.Orol;

import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");
        Vesmir mojVesmir = new Vesmir();
        mojVesmir.startVesmir();
        mojVesmir.stopVesmir();
        Hmloviny velkeHmloviny = new Hmloviny();
       // Planeta Zem = new Planeta("zem",127565665,10000);
        //pole planet s kapacitou 1000 planét
        Planeta[] pole_planet = new Planeta[1000];
        int i=0;
    // vytvorenie 1000 planet
        while(i<1000)
        {
            pole_planet[i]=new Planeta();
            i++;
        }
        //Zem.setPlanetaryWeight(5927*10^24-2000000);
        Hviezda Slnko = new Hviezda("Slnko",189*Math.exp(30),5504);
        Slnecna_sustava Prva = new Slnecna_sustava();
        //Prva.addTeleso(Zem);
        Planetarna_Sustava PS = new Planetarna_Sustava();
        //**************DU OOP2022*********************//
        //vytvorenie galaxie mliecna cesta
        Galaxia Mliecna_cesta = new Galaxia();
        //pridanie slnecnej sustavy do pola planetarnych sustav
        Mliecna_cesta.addSustava(Prva);
        //vytvorenei vlastenho objektu
        Higgsov_bozon bozon = new Higgsov_bozon();
        Mliecna_cesta.addSustava(bozon);
        Galaxia Senderak = new Galaxia();
        //poslanie spravy z galasie mliecna cesta do galaxie senderak
        Mliecna_cesta.sendMessage(Senderak,"Ahoj ako sa mas <><>");
        //Prijata sprava v galaxii senderak
        System.out.println(Senderak.getSprava());
        // vytvorenie vlastnej funkcie a jej pouzitiie cez referenciu mliecna cesta
        Mliecna_cesta.setHb(bozon);
        Mliecna_cesta.destroySustava();
        //************cvicenie7**************
        Zem MatickaZem = new Zem("Zem",12756,59722*Math.pow(10,24));
        for (int j = 0; j < 20; j++) {
            //MatickaZem.addTvora(new Ryba());
            //MatickaZem.addTvora(new Vtak());
          //  MatickaZem.addTvora(new Cicavce());

        }
      //  Tvory[] pole =MatickaZem.getPoleTvorov();
      //  for (int j = 0; j < 20; j++) {
       //     pole[j].hybsa(10,10,0);

       // }

        Kapor vianocnykapor = new Kapor(50);
        Date dNow = new Date();
        vianocnykapor.born(dNow);
        MatickaZem.addTvora(vianocnykapor);
        vianocnykapor.hybsa(10,10,0);
        vianocnykapor.die();
      //  for (int j = 0; j < vianocnykapor.getSustavy().length; j++) {
     //       System.out.println(vianocnykapor.getSustavy()[j].getTypSustavy());

     //   }
        //**********************DU2********************/
        //vytvorenie noveho druhu ryb
        Pirana cervenoBrucha = new Pirana(65);
        cervenoBrucha.born(dNow);
        cervenoBrucha.hybsa(12,4,6);
        MatickaZem.addTvora(cervenoBrucha);
        // vytvorenie orlika
        Orol orlik = new Orol(17);
        orlik.born(dNow);
        orlik.hybsa(5,6,3);
        MatickaZem.addTvora(orlik);
        //vytvorenie muchy
        Mucha vinnamuska = new Mucha(64);
        vinnamuska.born(dNow);
        vinnamuska.hybsa(0,0,0);
        MatickaZem.addTvora(vinnamuska);

        Muz prvyMuz = new Muz(null,null,34,"Adam","Prvy");
        Zena prvaZena = new Zena(null,null,34, "Eva", "Prva");

        System.out.println(prvyMuz);
        System.out.println(prvaZena);
        Clovek prveDieta = prvaZena.splodit(prvyMuz);
        prveDieta.born(dNow);
        prveDieta.setName("Kain");
        Clovek druheDieta = prvaZena.splodit(prvyMuz);
        druheDieta.born(dNow);
        druheDieta.setName("Abel");
        System.out.println(prveDieta);
        System.out.println(druheDieta);
        MatickaZem.addTvora(prvyMuz);
        MatickaZem.addTvora(prvaZena);
        MatickaZem.addTvora(prveDieta);
        MatickaZem.addTvora(druheDieta);
        //*******************************************************

      //  for (int j = 0; j < MatickaZem.getPocet_tvorov(); j++) {


       //     System.out.println(MatickaZem.getPoleTvorov().get(j).toString());
     //   }
        PrintToFile prvy = new PrintToFile();
        prvy.writeToFile(MatickaZem);
        MessageReader AdamovReader = new MessageReader();
        AdamovReader.obtainFilename(args);
        AdamovReader.openAndread();
        AdamovReader.precessMessage();





    }



}