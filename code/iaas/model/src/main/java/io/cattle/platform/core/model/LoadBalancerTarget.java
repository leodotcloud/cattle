/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "load_balancer_target", schema = "cattle")
public interface LoadBalancerTarget extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.load_balancer_target.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.load_balancer_target.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.load_balancer_target.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>cattle.load_balancer_target.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>cattle.load_balancer_target.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>cattle.load_balancer_target.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>cattle.load_balancer_target.uuid</code>.
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>cattle.load_balancer_target.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>cattle.load_balancer_target.description</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>cattle.load_balancer_target.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>cattle.load_balancer_target.state</code>.
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>cattle.load_balancer_target.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>cattle.load_balancer_target.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>cattle.load_balancer_target.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>cattle.load_balancer_target.removed</code>.
	 */
	public void setRemoved(java.util.Date value);

	/**
	 * Getter for <code>cattle.load_balancer_target.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	public java.util.Date getRemoved();

	/**
	 * Setter for <code>cattle.load_balancer_target.remove_time</code>.
	 */
	public void setRemoveTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.load_balancer_target.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.util.Date getRemoveTime();

	/**
	 * Setter for <code>cattle.load_balancer_target.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.load_balancer_target.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 65535)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>cattle.load_balancer_target.ip_address</code>.
	 */
	public void setIpAddress(java.lang.String value);

	/**
	 * Getter for <code>cattle.load_balancer_target.ip_address</code>.
	 */
	@javax.persistence.Column(name = "ip_address", length = 255)
	public java.lang.String getIpAddress();

	/**
	 * Setter for <code>cattle.load_balancer_target.instance_id</code>.
	 */
	public void setInstanceId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.load_balancer_target.instance_id</code>.
	 */
	@javax.persistence.Column(name = "instance_id", precision = 19)
	public java.lang.Long getInstanceId();

	/**
	 * Setter for <code>cattle.load_balancer_target.load_balancer_id</code>.
	 */
	public void setLoadBalancerId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.load_balancer_target.load_balancer_id</code>.
	 */
	@javax.persistence.Column(name = "load_balancer_id", precision = 19)
	public java.lang.Long getLoadBalancerId();

	/**
	 * Setter for <code>cattle.load_balancer_target.account_id</code>.
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.load_balancer_target.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	public java.lang.Long getAccountId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface LoadBalancerTarget
	 */
	public void from(io.cattle.platform.core.model.LoadBalancerTarget from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface LoadBalancerTarget
	 */
	public <E extends io.cattle.platform.core.model.LoadBalancerTarget> E into(E into);
}
