package com.binod.DrollsKnowledgeBase;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import java.util.*;
import java.util.stream.Collectors;

public class DemoTest {

    public static void main(String[] args) {
        try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("first-ksession-rule");

            City Iasi = new City("Iasi",5.0);
            CityZone IasiCenter = new CityZone("IasiCenter",7,1800);
            CityZone IasiHillZone = new CityZone("IasiHillZone",5,1500);
            CityZone IasiLimit = new CityZone("IasiLimit",3,1200);
            //########################################################
            City Cluj = new City("Cluj",15.0);
            CityZone ClujCenter = new CityZone("ClujCenter",15.0,2000);
            CityZone ClujHillZone = new CityZone("ClujHillZone",15.0,1800);
            CityZone ClujLimit = new CityZone("ClujLimit",15.0,1500);
            //########################################################
            City Bucuresti = new City("Bucuresti",10.0);
            CityZone BucurestiCenter = new CityZone("BucurestiCenter",15.0,2000);
            CityZone BucurestiHillZone = new CityZone("BucurestiHillZone",15.0,1800);
            CityZone BucurestiLimit = new CityZone("BucurestiLimit",15.0,1400);

            //### apartaments creator

            List<Apartament> IasiCenterApartaments = new ArrayList<Apartament>();
            IasiCenterApartaments.add(new Apartament(ApartamentType.ONE_ROOM,50000.,CompartimentType.D,30.));
            IasiCenterApartaments.add(new Apartament(ApartamentType.TWO_ROOMS,560000.,CompartimentType.D,50.));
            IasiCenterApartaments.add(new Apartament(ApartamentType.TREE_ROOMS,75000.,CompartimentType.D,70.));

            IasiCenter.set_apartments(IasiCenterApartaments);

            User client = new User();
            client.set_chosenCity(Iasi);
            client.set_chosenCityZone(IasiCenter);
            client.set_maxBuget(80000.);
            client.set_chosenCompartiment(CompartimentType.D);
            client.set_apartamentArea(50.);


//            PaymentOffer paymentOffer = new PaymentOffer();
//            paymentOffer.setChannel("paytm");

            FactHandle factHandler;

            factHandler = kSession.insert(client);
            kSession.fireAllRules();

//            System.out.println("The cashback for this payment channel VIA KIE " + paymentOffer.getChannel() + " is " + paymentOffer.getDiscount());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
