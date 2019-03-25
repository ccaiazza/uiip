/**
 *
 */
package org.training.hospital.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.JobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.HospitalModel;
import org.training.hospital.core.model.RepartoModel;
import org.training.hospital.core.service.HospitalService;




/**
 * @author soprasteria
 *
 */
public class InfoJob implements JobPerformable<CronJobModel>
{



	private HospitalService hospitalService;

	@Override
	public PerformResult perform(final CronJobModel cronjob)
	{
		final File file = new File("/hospitalcore/infoHospital.txt");
		final List<HospitalModel> infoHospitals = hospitalService.getHospitals();
		FileWriter fw = null;
		boolean esito;
		try
		{
			fw = new FileWriter(file);
		}
		catch (final IOException e)
		{
			// XXX Auto-generated catch block
			e.printStackTrace();

		}

		for (int i = 0; i < infoHospitals.size(); i++)
		{
			for (final RepartoModel r : infoHospitals.get(i).getReparti())
			{
				try
				{
					fw.write(infoHospitals.get(i).getName() + "con numero di reparti di " + infoHospitals.get(i).getNumberRep()
							+ "con i reparti: " + r.getName() + " " + r.getCode() + "\n");
					esito = true;

				}
				catch (final IOException eccezione)
				{
					esito = false;
				}
			}
		}
		if(esito = true) {
			return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);

		}
		else {
			return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
		}
	}



	/**
	 * @return the hospitalService
	 */
	public HospitalService getHospitalService()
	{
		return hospitalService;
	}

	/**
	 * @param hospitalService
	 *           the hospitalService to set
	 */
	@Required
	public void setHospitalService(final HospitalService hospitalService)
	{
		this.hospitalService = hospitalService;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.cronjob.JobPerformable#isAbortable()
	 */
	@Override
	public boolean isAbortable()
	{
		// XXX Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see de.hybris.platform.servicelayer.cronjob.JobPerformable#isPerformable()
	 */
	@Override
	public boolean isPerformable()
	{
		// XXX Auto-generated method stub
		return false;
	}




}

