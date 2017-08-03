package com.giorgo.eutaxid;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import eu.europa.ec.taxud.tin.services.checktin.CheckTinPortType;
import eu.europa.ec.taxud.tin.services.checktin.CheckTinService;

@SpringBootApplication
public class EurotaxidApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurotaxidApplication.class, args);
		CheckTinService cts = new CheckTinService();
		CheckTinPortType ctpt = cts.getCheckTinPort();
		Holder<String> code = new Holder<String>("DE");
		Holder<String> tin = new Holder<String>("12346789");
		Holder<XMLGregorianCalendar> requestDate = new Holder<>();
		Holder<Boolean> validStructure = new Holder<>();
		Holder<Boolean> validSyntax = new Holder<>();
		ctpt.checkTin(code, tin, requestDate, validStructure, validSyntax);

		System.out.println("requestDate : " + requestDate.value);
		System.out.println("///////////////// requestDate");
		System.out.println("validStructure : " + validStructure.value);
		System.out.println("/////////////////  validStructure");
		System.out.println("validSyntax : " + validSyntax.value);
		System.out.println("/////////////////  validSyntax");
	}
}
