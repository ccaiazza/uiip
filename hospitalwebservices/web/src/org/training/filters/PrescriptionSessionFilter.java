/**
 *
 */
package org.training.filters;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.servicelayer.session.SessionService;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;
import org.training.constants.HospitalwebservicesConstants;
import org.training.hospital.core.service.PatientService;



public class PrescriptionSessionFilter extends AbstractUrlMatchingFilter
{

	private CatalogVersionService catalogVersionService;
	private String catalogRegexp;
	private String catalogVersionRegexp;
	private String patientRegexp;
	private SessionService sessionService;
	private PatientService patientService;
	private static final Logger LOG = Logger.getLogger(PrescriptionSessionFilter.class);

	@Override
	protected void doFilterInternal(final HttpServletRequest request, final HttpServletResponse response,
			final FilterChain filterChain) throws ServletException, IOException
	{
		final String catalog = getValue(request, catalogRegexp);
		final String version = getValue(request, catalogVersionRegexp);
		final String patient = getValue(request, patientRegexp);

		if (StringUtils.isEmpty(catalog) && StringUtils.isEmpty(version) && StringUtils.isEmpty(patient))
		{
			LOG.info("Catalog, catalogversion and patient not found");

		}
		else if (StringUtils.isEmpty(catalog))
		{
			LOG.info("Catalog not found");
		}
		else if (StringUtils.isEmpty(version))
		{
			LOG.info("Version not found");
		}
		else if (StringUtils.isEmpty(patient))
		{
			LOG.info("Patient not found");
		}
		else
		{
			if (patientService.getPatientForUid(patient) != null)
			{
				sessionService.setAttribute(HospitalwebservicesConstants.USER_SESSION, patientService.getPatientForUid(patient));
			}
			else
			{
				LOG.info("Patient not found");
			}
			this.catalogVersionService.setSessionCatalogVersion(catalog, version);
		}

		filterChain.doFilter(request, response);
	}

	public CatalogVersionService getCatalogVersionService()
	{
		return catalogVersionService;
	}

	/**
	 * @param catalogVersionService
	 *           the catalogVersionService to set
	 */
	@Required
	public void setCatalogVersionService(final CatalogVersionService catalogVersionService)
	{
		this.catalogVersionService = catalogVersionService;
	}

	/**
	 * @return the catalogRegexp
	 */
	public String getCatalogRegexp()
	{
		return catalogRegexp;
	}

	/**
	 * @param catalogRegexp
	 *           the catalogRegexp to set
	 */
	@Required
	public void setCatalogRegexp(final String catalogRegexp)
	{
		this.catalogRegexp = catalogRegexp;
	}

	/**
	 * @return the catalogVersionRegexp
	 */
	public String getCatalogVersionRegexp()
	{
		return catalogVersionRegexp;
	}

	/**
	 * @param catalogVersionRegexp
	 *           the catalogVersionRegexp to set
	 */
	@Required
	public void setCatalogVersionRegexp(final String catalogVersionRegexp)
	{
		this.catalogVersionRegexp = catalogVersionRegexp;
	}

	public String getPatientRegexp()
	{
		return patientRegexp;
	}

	@Required
	public void setPatientRegexp(final String patientRegexp)
	{
		this.patientRegexp = patientRegexp;
	}

	public SessionService getSessionService()
	{
		return sessionService;
	}

	@Required
	public void setSessionService(final SessionService sessionService)
	{
		this.sessionService = sessionService;
	}

	public PatientService getPatientService()
	{
		return patientService;
	}

	@Required
	public void setPatientService(final PatientService patientService)
	{
		this.patientService = patientService;
	}
}



