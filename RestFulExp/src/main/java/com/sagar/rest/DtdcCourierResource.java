package com.sagar.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/dtdcCourier")
public class DtdcCourierResource {

	@GET
	// to tell this is
	@Produces("Text/plain")
	// client will send request so the format it will specify
	/*
	 * sagar this is the method for tracking ...
	 */
	public String trackingConsinment(
			@QueryParam(value = "courierNo") String courierNo,
			@QueryParam("name") String name) {
		return "hii your courier no. is " + courierNo + " and name is " + name;

	}

	public DtdcCourierResource() {
		System.out.println("from DtDcContructor Contructor");
	}// end of constructor

}// end of class
// Third commit i am making
