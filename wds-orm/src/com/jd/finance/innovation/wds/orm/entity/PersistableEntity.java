//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.jd.finance.innovation.wds.orm.entity;

import java.io.Serializable;
import java.util.Date;

public interface PersistableEntity<P extends Serializable> extends Serializable {
	P getId();

	void setId(P var1);

	Date getCreatedTime();

	void setCreatedTime(Date var1);

	Date getModifiedTime();

	void setModifiedTime(Date var1);
}
