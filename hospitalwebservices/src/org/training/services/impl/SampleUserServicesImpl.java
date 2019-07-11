/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package org.training.services.impl;

import de.hybris.platform.core.model.user.AddressModel;
import de.hybris.platform.core.model.user.UserModel;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.training.services.SampleUserServices;


public class SampleUserServicesImpl implements SampleUserServices
{
	private final Map<String, UserModel> data;

	@SuppressWarnings(
	{ "deprecation" })
	public SampleUserServicesImpl()
	{
		//user 1

		data = new HashMap<String, UserModel>();
		AddressModel address = new AddressModel();
		address.setStreetname("grosse strasse");
		address.setStreetnumber("5b / 79");
		address.setTown("Berlin");
		address.setContactAddress(Boolean.TRUE);

		AddressModel address1 = new AddressModel();
		address1.setStreetname("Papenmoorweg");
		address1.setStreetnumber("2");
		address1.setTown("Hamburg");

		UserModel model = new UserModel();
		model.setName("User1");
		model.setDescription("normal user");
		model.setAddresses(Arrays.asList(address, address1));
		data.put("user1", model);

		//user 2
		address = new AddressModel();
		address.setStreetname("long street");
		address.setStreetnumber("1 / 864");
		address.setTown("Small town");
		address.setBillingAddress(Boolean.TRUE);

		address1 = new AddressModel();
		address1.setStreetname("short street");
		address1.setStreetnumber("9875643");
		address1.setTown("Small town");

		model = new UserModel();
		model.setName("Second user");
		model.setDescription("not a normal user");
		model.setAddresses(Arrays.asList(address, address1));
		data.put("user2", model);



		//		def client_id = 'mobile_android';
		//		def client_secret = 'secret';
		//		def redirect_uri = 'http://localhost:8080/oauth2_callback';
		//
		//		if (!params.token)
		//		{
		//			out << "No refresh token given..."
		//			return
		//		}
		//
		//		def token = params.token
		//
		//		//exchange code for real oauth token
		//		URL tokenURL = "http://localhost:9001/authorizationserver/oauth/token".toURL()
		//		HTTPResponse res = tokenURL.post(deadline: 30, payload:"refresh_token=${token}&client_id=${client_id}&client_secret=${client_secret}&redirect_uri=${URLEncoder.encode(redirect_uri, 'UTF-8')}&grant_type=refresh_token".getBytes())
		//
		//		out << res.text
		//


	}

	@Override
	public UserModel getUserById(final String id)
	{
		return data.get(id);
	}

	@Override
	public Collection<UserModel> getUsers()
	{
		return data.values();
	}

}
