/**
 *
 */
package org.training.hospital.core.job;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Required;
import org.training.hospital.core.model.HospitalModel;
import org.training.hospital.core.model.RepartoModel;
import org.training.hospital.core.service.HospitalService;
import org.training.hospital.core.service.RepartoService;

/**
 * @author soprasteria
 *
 */
public class UpdateHospitalListJob extends AbstractJobPerformable<CronJobModel>
{

	private HospitalService hospitalService;
	private File file;

	@Override
	public PerformResult perform(final CronJobModel cronJobModel)
	{
		file=new File("/hospitalCore/hospitalList.txt");
		FileWriter fw = null;

		final List<HospitalModel> hospitalList = hospitalService.getHospital();
		boolean ex = false;
		try {
			fw = new FileWriter(file);
		}
		catch (final IOException exc)
		{
			exc.getMessage();
			exc.printStackTrace();
		}


		for (int i=0; i<hospitalList.size();i++)
		{
			for(final RepartoModel r: hospitalList.get(i).getReparti()) {
				try
				{

					fw.write(hospitalList.get(i).getName() + " " + hospitalList.get(i).getNumberRep() + " " + r.getCodeReparto() + " "
						+ r.getNameRep());
					ex = true;
				}
				catch (final IOException exc)
				{
					ex = false;
				}
			}
		}
		if (ex = true)
		{
			return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
		}
		else
		{
			return new PerformResult(CronJobResult.FAILURE, CronJobStatus.ABORTED);
		}
	}



	public RepartoService getRepartoService()
	{
		return repartoService;
	}


	@Required
	public void setRepartoService(final RepartoService repartoService)
	{
		this.repartoService = repartoService;
	}



	public HospitalService getHospitalService()
	{
		return hospitalService;
	}


	@Required
	public void setHospitalService(final HospitalService hospitalService)
	{
		this.hospitalService = hospitalService;
	}



}
