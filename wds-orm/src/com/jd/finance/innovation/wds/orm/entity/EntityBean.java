package com.jd.finance.innovation.wds.orm.entity;

import com.jd.finance.innovation.wds.orm.annotation.Column;
import com.jd.finance.innovation.wds.orm.annotation.PrimaryKey;
import com.jd.finance.innovation.wds.orm.enums.DataType;

/**
 * Created by chenminghe on 2017/4/20.
 */
public abstract class EntityBean implements PersistableEntity<Long> {

	private static final long serialVersionUID = 3313078939932467479L;

	@Column(
			type = DataType.VARCHAR,
			length = "32",
			comment = "创建人"
	)
	private String creator;

	@Column(
			type = DataType.VARCHAR,
			length = "32",
			comment = "最后一次编辑人"
	)
	private String editor;

	@PrimaryKey
	private Long id;

	public EntityBean() {
	}

	public EntityBean(Long id) {
		this();
		this.id = id;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getEditor() {
		return editor;

	}

	public void setEditor(String editor) {
		this.editor = editor;
	}
}
