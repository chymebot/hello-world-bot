//	Generated using Unvired Modeller - Build R-4.000.0042
package com.chyme.helloworld.gen.be;

import java.util.ArrayList;

import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class BE_HelloWorldSample extends BusinessEntity {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "BE_HelloWorldSample";
	public BE_HelloWorldSample()
	{
		setName(NAME);
		setHeader(new HelloWorldSample_HEADER());
	}

	public HelloWorldSample_HEADER getHelloWorldSample_HEADER()
	{
		return (HelloWorldSample_HEADER)super.getHeader();
	}

	public static class HelloWorldSample_HEADER extends Structure
	{
		private static final long serialVersionUID = 1L;
		public static final String NAME = "HelloWorldSample_HEADER";


		public static final ArrayList<String> FIELDS = new ArrayList<String>();

		static {
		}

		public HelloWorldSample_HEADER()
		{
			setName(NAME);
		}

	}
}