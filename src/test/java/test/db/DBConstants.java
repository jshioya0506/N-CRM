package test.db;

import java.io.File;

public final class DBConstants {
	public static final File CSV_DIR = new File("doc/db/csv");
	
	public static final String NC_CUSTOMER = "NC_CUSTOMER";
	public static final String NC_PERSON = "NC_PERSON";
	public static final String NC_CALLDOC = "NC_CALLDOC";
	public static final String NC_OUTSIDE_MAKE = "NC_OUTSIDE_MAKE";
	public static final String AREA = "AREA";
	public static final String NC_STANDARD = "NC_STANDARD";
	//public static final String NC_COMMON_NM = "NC_COMMON_NM";
	public static final String EMPLOYEE = "EMPLOYEE";
	public static final String NC_DIVISION = "NC_DIVISION";
	
	public static final String[] TABLES = new String[] {
			EMPLOYEE,
//			AREA,
//			NC_CUSTOMER,
//			NC_PERSON,
//			NC_CALLDOC,
//			NC_OUTSIDE_MAKE,
//			NC_STANDARD,
//			NC_DIVISION
	};
}
