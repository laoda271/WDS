package com.jd.finance.innovation.wds.core;

import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

/**
 * Created by chenminghe on 2017/4/20.
 */
public class Status implements Serializable{

	private static final long serialVersionUID = 6668053629991188756L;

	@XmlElement
	private int code;

	private String message;
}
