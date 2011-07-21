package org.liblas;

import com.sun.jna.Native;

public interface Liblas extends com.sun.jna.Library {
	
	Liblas lib = (Liblas) Native.loadLibrary("las", Liblas.class);
	
	String LAS_GetVersion();
}
