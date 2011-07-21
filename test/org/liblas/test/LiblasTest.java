package org.liblas.test;

import junit.framework.TestCase;

import org.liblas.Liblas;

import com.sun.jna.Native;

public class LiblasTest extends TestCase {
	public void testLiblas()
	{
		Native.setProtected(true);
		System.out.println(Liblas.lib.LAS_GetVersion());
	}
}
