package com.jd.finance.innovation.wds.orm.query;

import java.io.Serializable;

/**
 * Created by chenminghe on 2017/4/20.
 */
public class Sort implements Serializable {

	private static final long serialVersionUID = 3955738819360242944L;

	private String name;
	private SortDirection direction;

	public Sort() {
	}

	public Sort(String name, SortDirection direction) {
		this.name = name;
		this.direction = direction;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SortDirection getDirection() {
		return this.direction;
	}

	public void setDirection(SortDirection direction) {
		this.direction = direction;
	}
}
