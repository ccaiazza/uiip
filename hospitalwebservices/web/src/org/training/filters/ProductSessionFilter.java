/**
 *
 */
package org.training.filters;

import de.hybris.platform.catalog.CatalogVersionService;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Required;


public class ProductSessionFilter extends AbstractUrlMatchingFilter
{
	private String catalogRegexp;
	private String catalogVersionRegexp;
	private CatalogVersionService catalogVersionService;
	private static final Logger LOG = Logger.getLogger(ProductSessionFilter.class);

	@Override
	protected void doFilterInternal(final HttpServletRequest request, final HttpServletResponse response, final FilterChain filterChain)
			throws ServletException, IOException
	{
		{
			final String catalog = getValue(request, catalogRegexp);
			final String version = getValue(request, catalogVersionRegexp);

			if (StringUtils.isEmpty(catalog) && StringUtils.isEmpty(version))
			{
				LOG.info("Catalog and catalogversion not found");

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
	}

	public String getCatalogRegexp()
	{
		return catalogRegexp;
	}

	@Required
	public void setCatalogRegexp(final String catalogRegexp)
	{
		this.catalogRegexp = catalogRegexp;
	}

	public String getCatalogVersionRegexp()
	{
		return catalogVersionRegexp;
	}

	@Required
	public void setCatalogVersionRegexp(final String catalogVersionRegexp)
	{
		this.catalogVersionRegexp = catalogVersionRegexp;
	}

	public CatalogVersionService getCatalogVersionService()
	{
		return catalogVersionService;
	}

	@Required
	public void setCatalogVersionService(final CatalogVersionService catalogVersionService)
	{
		this.catalogVersionService = catalogVersionService;
	}


}