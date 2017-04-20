package com.jd.finance.innovation.wds.orm.entity;

import com.jd.finance.innovation.wds.orm.annotation.Column;
import com.jd.finance.innovation.wds.orm.enums.DataType;

/**
 * Created by chenminghe on 2017/4/20.
 */
public abstract class EditableEntity extends EntityBean {

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

	public EditableEntity() {
	}

	public EditableEntity(Long id) {
		super(id);
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getEditor() {
		return this.editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}
}
