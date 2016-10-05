//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.helloworld.gen.pa;

import com.chyme.helloworld.gen.utils.BEUtility;
import com.unvired.ump.agent.IBusinessProcess;

public abstract class ABSTRACT_COMMAND_HELLOWORLD extends BotService {
	protected com.chyme.helloworld.gen.be.BE_HelloWorld inputBE_HelloWorld;

	public void init(IBusinessProcess process) {
		super.init(process);

		inputBE_HelloWorld = BEUtility.getBE_HelloWorld(process.getBusinessEntityInput()).get(0);

	}

}
