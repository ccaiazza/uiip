/**
 *
 */
package org.training.controllers;

import de.hybris.platform.webservicescommons.mapping.DataMapper;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;


@Controller
public class BaseController
{
	@Resource(name = "dataMapper")
	private DataMapper dataMapper;


	public DataMapper getDataMapper()
	{
		return dataMapper;
	}
}
