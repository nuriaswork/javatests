package com.platzi.javatests.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    @Before
    public void setup() {
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }
    @Test
    public void paymentOK() {
        //simulamos el paymentgateway que solo tenemos el interfaz y que siempre devuelve ok
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));
        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    public void paymentERROR() {
        //simulamos el paymentgateway que solo tenemos el interfaz y que siempre devuelve error
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));
        assertFalse(paymentProcessor.makePayment(1000));
    }

}