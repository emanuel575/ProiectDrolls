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
            Iasi.get_cityZones().add(IasiCenter);
            Iasi.get_cityZones().add(IasiHillZone);
            Iasi.get_cityZones().add(IasiLimit);
            //########################################################
            City Cluj = new City("Cluj",15.0);
            CityZone ClujCenter = new CityZone("ClujCenter",15.0,2000);
            CityZone ClujHillZone = new CityZone("ClujHillZone",15.0,1800);
            CityZone ClujLimit = new CityZone("ClujLimit",15.0,1500);
            Cluj.get_cityZones().add(ClujCenter);
            Cluj.get_cityZones().add(ClujHillZone);
            Cluj.get_cityZones().add(ClujLimit);

            //########################################################
            City Bucuresti = new City("Bucuresti",10.0);
            CityZone BucurestiCenter = new CityZone("BucurestiCenter",15.0,2000);
            CityZone BucurestiHillZone = new CityZone("BucurestiHillZone",15.0,1800);
            CityZone BucurestiLimit = new CityZone("BucurestiLimit",15.0,1400);
            Bucuresti.get_cityZones().add(BucurestiCenter);
            Bucuresti.get_cityZones().add(BucurestiHillZone);
            Bucuresti.get_cityZones().add(BucurestiLimit);

            //### apartaments creator

            List<Apartament> IasiCenterApartaments = new ArrayList<Apartament>();
            IasiCenterApartaments.add(new Apartament(ApartamentType.ONE_ROOM,50000.,CompartimentType.D,30.));
            IasiCenterApartaments.add(new Apartament(ApartamentType.TWO_ROOMS,560000.,CompartimentType.D,50.,false));
            IasiCenterApartaments.add(new Apartament(ApartamentType.TREE_ROOMS,75000.,CompartimentType.D,71.));
            IasiCenterApartaments.add(new Apartament(ApartamentType.PENTHOUSE,150000.,CompartimentType.D,100.));

            IasiCenter.set_apartments(IasiCenterApartaments);

            User client = new User();
            client.set_chosenCity(Iasi);
            client.set_chosenCityZone(IasiCenter);
            client.set_maxBuget(68000.);
            client.set_chosenCompartiment(CompartimentType.D);
            client.set_apartamentArea(70.0);
            client.set_chosenApartamentType(ApartamentType.PENTHOUSE);
            client.set_chosenPaymentType(PaymentType.CREDIT);
            client.set_targetAnnualGrowth(15.);

            FactHandle factHandler;

            factHandler = kSession.insert(client);
            kSession.insert(IasiHillZone);
            kSession.fireAllRules();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
