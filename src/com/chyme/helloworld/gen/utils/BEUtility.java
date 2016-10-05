//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.helloworld.gen.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import com.chyme.helloworld.gen.be.BE_HelloWorld;
import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class BEUtility
{
	public static List<BE_HelloWorld> getBE_HelloWorld(List<BusinessEntity> beList)
	{
		ArrayList<BE_HelloWorld> typedBEs = new ArrayList<BE_HelloWorld>();

		if(beList != null)
		{
			for (BusinessEntity be : beList)
			{
				if(be.getName().equals(BE_HelloWorld.NAME))
				{
					BE_HelloWorld typedBE = new BE_HelloWorld();
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