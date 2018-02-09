package cn.yh.st.common.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Transient;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	/** 主键ID **/
	@Id
	private Long id;

	/** 创建时间 **/
	@Transient
	private Date createTime;

	/** 主键ID **/
	public Long getId() {
		return id;
	}

	/** 主键ID **/
	public void setId(Long id) {
		this.id = id;
	}

	/** 创建时间 **/
	public Date getCreateTime() {
		return createTime;
	}

	/** 创建时间 **/
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public boolean equals(Object o) {
		return o != null && o.getClass().equals(this.getClass())
				&& EqualsBuilder.reflectionEquals(this, o);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
