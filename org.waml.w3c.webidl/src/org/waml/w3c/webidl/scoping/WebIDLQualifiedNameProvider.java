package org.waml.w3c.webidl.scoping;

public class WebIDLQualifiedNameProvider extends org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider {

	@Override
	public String getDelimiter() {
		return "::";
	}

}

