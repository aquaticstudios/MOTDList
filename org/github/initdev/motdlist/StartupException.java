package org.github.initdev.motdlist;

public class StartupException extends Exception
{
	public StartupException(String message) { super(message); }

	public StartupException(Throwable cause) { super(cause); }

	public StartupException(String message, Throwable cause) { super(message, cause); }
}
