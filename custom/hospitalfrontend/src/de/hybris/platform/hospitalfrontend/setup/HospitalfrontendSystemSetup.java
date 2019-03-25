/*
 * [y] hybris Platform
 *
 * Copyright (c) 2018 SAP SE or an SAP affiliate company. All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package de.hybris.platform.hospitalfrontend.setup;

import static de.hybris.platform.hospitalfrontend.constants.HospitalfrontendConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import de.hybris.platform.hospitalfrontend.constants.HospitalfrontendConstants;
import de.hybris.platform.hospitalfrontend.service.HospitalfrontendService;


@SystemSetup(extension = HospitalfrontendConstants.EXTENSIONNAME)
public class HospitalfrontendSystemSetup
{
	private final HospitalfrontendService hospitalfrontendService;

	public HospitalfrontendSystemSetup(final HospitalfrontendService hospitalfrontendService)
	{
		this.hospitalfrontendService = hospitalfrontendService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		hospitalfrontendService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return HospitalfrontendSystemSetup.class.getResourceAsStream("/hospitalfrontend/sap-hybris-platform.png");
	}
}
