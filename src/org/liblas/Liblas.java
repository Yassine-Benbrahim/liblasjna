package org.liblas;

import com.sun.jna.Native;

public interface Liblas extends com.sun.jna.Library {
	
	Liblas lib = (Liblas) Native.loadLibrary("las", Liblas.class);
	
	String LAS_GetVersion();
	String LAS_GetFullVersion();
	int LAS_IsGDALEnabled();
	int LAS_IsLibGeoTIFFEnabled();
	long LASReader_Create(String filename);
	void LASReader_Destroy(long hFile);
	long LASReader_GetNextPoint(long hFile);
	double LASPoint_GetX(long hPoint);  	
	double LASPoint_GetY(long hPoint);
	double LASPoint_GetZ(long hPoint);
}
