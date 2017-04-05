//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.helloworld.pa;

import com.chyme.helloworld.gen.pa.ABSTRACT_COMMAND_HELLOWORLDSAMPLE;
import com.unvired.chyme.api.Message;

public class COMMAND_HELLOWORLDSAMPLE extends ABSTRACT_COMMAND_HELLOWORLDSAMPLE {
	
	public void execute() {
		chymeAPI.setTags("PA_COMMAND_HELLOWORLDSAMPLE", "");
		try {
			chymeAPI.setMessage(new Message("Hi! If you are seeing this message means working fine.", null, Message.FLAG_NO_FOLLOWUP_COMMAND));
		} catch (Exception e) {
			chymeAPI.setMessage(new Message("Oops! Something went wrong. Please try again.", null, Message.FLAG_NO_FOLLOWUP_COMMAND));
		}
	}
}