package com.binod.DrollsKnowledgeBase;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Binod Suman
 * Binod Suman Academy YouTube
 */

public class DemoTest {

    public static void main(String[] args) {
        try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("first-ksession-rule");

            PaymentOffer paymentOffer = new PaymentOffer();
            paymentOffer.setChannel("paytm");

            FactHandle factHandler;

            factHandler = kSession.insert(paymentOffer);
            kSession.fireAllRules();

            System.out.println("The cashback for this payment channel VIA KIE " + paymentOffer.getChannel() + " is " + paymentOffer.getDiscount());
        } catch (Exception e) {
            e.printStackTrace();
        }

        PaymentOffer paymentOffer = new PaymentOffer();
        paymentOffer.setChannel("ceva");
        paymentOffer.setDiscount(10);

        PaymentOffer paymentOffer1 = new PaymentOffer();
        paymentOffer1.setChannel("ceva2package com.binod.DrollsKnowledgeBase");

    }
}
