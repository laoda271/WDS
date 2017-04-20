//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.jd.finance.innovation.wds.orm.enums;

public enum DataType {
	INT("0", true),
	TINYINT("0", true),
	BIGINT("0", true),
	SMALLINT("0", true),
	MEDIUMINT("0", true),
	FLOAT("0", true),
	DOUBLE("0", true),
	BIT("b'0'", false),
	CHAR("''", true),
	VARCHAR("''", false),
	TINYTEXT((String)null, false),
	TEXT((String)null, false),
	MEDIUMTEXT((String)null, false),
	LONGTEXT((String)null, false),
	BLOB((String)null, false),
	TINYBLOB((String)null, false),
	MEDIUMBLOB((String)null, false),
	LONGBLOB((String)null, false),
	BINARY("''", false),
	VARBINARY("''", false),
	ENUM((String)null, false),
	SET((String)null, false),
	DATE("'0000-00-00'", false),
	DATETIME("'0000-00-00 00:00:00'", false),
	TIMESTAMP("'0000-00-00 00:00:00'", false),
	TIME("'00:00:00'", false),
	YEAR("'0000'", false);

	private String defaultValue;
	private boolean numeric;

	private DataType(String defaultValue, boolean numeric) {
		this.defaultValue = defaultValue;
		this.numeric = numeric;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public boolean isNumeric() {
		return this.numeric;
	}
}
