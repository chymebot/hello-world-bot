//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.helloworld.gen.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import com.chyme.helloworld.gen.be.BE_HelloWorldSample;
import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class BEUtility
{
	public static List<BE_HelloWorldSample> getBE_HelloWorldSample(List<BusinessEntity> beList)
	{
		ArrayList<BE_HelloWorldSample> typedBEs = new ArrayList<BE_HelloWorldSample>();

		if(beList != null)
		{
			for (BusinessEntity be : beList)
			{
				if(be.getName().equals(BE_HelloWorldSample.NAME))
				{
					BE_HelloWorldSample typedBE = new BE_HelloWorldSample();
					typedBEs.add(typedBE);
					for (Entry<String, String> field : be.getHeader().getFieldsInOrder().entrySet())
					{
						typedBE.getHeader().addField(field.getKey(), field.getValue());
					}

					//	Process each item individually
					for (Structure item : be.getItems())
					{
					}
				}
			}
		}
		return typedBEs;
	}

}