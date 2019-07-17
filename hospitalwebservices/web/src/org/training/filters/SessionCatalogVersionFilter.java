/**
 *
 */
package org.training.filters;

import de.hybris.platform.catalog.CatalogVersionService;

import java.io.IOException;
import java.util.regex.Matcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;


/**
 * @author ssole
 *
 */
public class SessionCatalogVersionFilter extends AbstractUrlMatchingFilter
{

	private CatalogVersionService catalogVersionService;
	private String catalogRegexp;
	private String catalogVersionRegexp;
	private static final Logger LOG = Logger.getLogger(SessionCatalogVersionFilter.class);

	@Override
	protected void doFilterInternal(final HttpServletRequest request, final HttpServletResponse response,
			final FilterChain filterChain) throws ServletException, IOException
	{
		final String catalog = getValue(request, catalogRegexp);
		final String version = getValue(request, catalogVersionRegexp);

		if (StringUtils.isEmpty(catalog) && StringUtils.isEmpty(version))
		{
			LOG.info("Catalog and version not found");

		}
		else if (StringUtils.isEmpty(catalog))
		{
			LOG.info("Catalog not found");
		}
		else if (StringUtils.isEmpty(catalog))
		{
			LOG.info("Version not found");
		}
		else
		{
			this.catalogVersionService.setSessionCatalogVersion(catalog, version);
		}

		filterChain.doFilter(request, response);
	}

	@Override
	protected String getValue(final HttpServletRequest request, final String regexp)
	{
		final Matcher matcher = getMatcher(request, regexp);
		if (matcher.find())
		{
			return matcher.group(2);
		}
		return null;
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

	}



