//	Generated using Unvired Modeller - Build R-4.000.0042
package com.chyme.helloworld.gen.pa;

import com.chyme.helloworld.gen.utils.BEUtility;
import com.unvired.ump.agent.IBusinessProcess;

public abstract class ABSTRACT_COMMAND_HELLOWORLDSAMPLE extends BotService {
	protected com.chyme.helloworld.gen.be.BE_HelloWorldSample inputBE_HelloWorldSample;

	public void init(IBusinessProcess process) {
		super.init(process);

		inputBE_HelloWorldSample = BEUtility.getBE_HelloWorldSample(process.getBusinessEntityInput()).get(0);

	}

}
