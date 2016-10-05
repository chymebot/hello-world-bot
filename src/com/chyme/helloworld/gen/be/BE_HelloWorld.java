//	Generated using Unvired Modeller - Build R-4.000.0002
package com.chyme.helloworld.gen.be;

import java.util.ArrayList;

import com.unvired.lib.utility.BusinessEntity;
import com.unvired.lib.utility.Structure;

public class BE_HelloWorld extends BusinessEntity {

	private static final long serialVersionUID = 1L;
	public static final String NAME = "BE_HelloWorld";
	public BE_HelloWorld()
	{
		setName(NAME);
		setHeader(new HelloWorld_HEADER());
	}

	public HelloWorld_HEADER getHelloWorld_HEADER()
	{
		return (HelloWorld_HEADER)super.getHeader();
	}

	public static class HelloWorld_HEADER extends Structure
	{
		private static final long serialVersionUID = 1L;
		public static final String NAME = "HelloWorld_HEADER";


		public static final ArrayList<String> FIELDS = new ArrayList<String>();

		static {
		}

		public HelloWorld_HEADER()
		{
			setName(NAME);
		}

	}
}