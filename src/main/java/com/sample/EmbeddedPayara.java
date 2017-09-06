/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample;

import fish.payara.micro.BootstrapException;
import fish.payara.micro.PayaraMicro;

/**
 *
 * @author kazuki
 */
public class EmbeddedPayara {

    public static void main(String[] args) throws BootstrapException {

        PayaraMicro.getInstance()
                .addDeployment("./target/payara-micro-sample.war")
                .bootStrap();
    }
}
