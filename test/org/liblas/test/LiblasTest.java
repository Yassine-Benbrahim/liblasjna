package org.liblas.test;

import junit.framework.TestCase;

import org.liblas.Liblas;

import com.sun.jna.Native;

public class LiblasTest extends TestCase {
	public void testLiblas()
	{
		Native.setProtected(true);
		System.out.println(Liblas.lib.LAS_GetVersion());
		//FIXME: Not present in my Ubuntu distro
		//System.out.println(Liblas.lib.LAS_GetFullVersion());
		System.out.println(Liblas.lib.LAS_IsGDALEnabled());
		System.out.println(Liblas.lib.LAS_IsLibGeoTIFFEnabled());
		//FIXME: Need proper structs rather than this hack
		long fileH = Liblas.lib.LASReader_Create("samples/lt_srs_rt-qt-1.2.las");
		System.out.println(fileH);
		long hPoint;
		do
		{
			hPoint = Liblas.lib.LASReader_GetNextPoint(fileH);
			System.out.println(Liblas.lib.LASPoint_GetX(hPoint));
			System.out.println(Liblas.lib.LASPoint_GetY(hPoint));
			System.out.println(Liblas.lib.LASPoint_GetZ(hPoint));
		}while(hPoint>0);
		Liblas.lib.LASReader_Destroy(fileH);
	}
}
