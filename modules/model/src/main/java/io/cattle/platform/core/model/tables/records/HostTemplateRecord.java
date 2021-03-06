/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.HostTemplate;
import io.cattle.platform.core.model.tables.HostTemplateTable;
import io.cattle.platform.db.jooq.utils.TableRecordJaxb;

import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "host_template", schema = "cattle")
public class HostTemplateRecord extends UpdatableRecordImpl<HostTemplateRecord> implements TableRecordJaxb, Record14<Long, String, String, String, String, String, Date, Date, Date, Map<String,Object>, String, String, Long, Long>, HostTemplate {

    private static final long serialVersionUID = 559922137;

    /**
     * Setter for <code>cattle.host_template.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.host_template.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.host_template.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.host_template.name</code>.
     */
    @Column(name = "name", length = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cattle.host_template.kind</code>.
     */
    @Override
    public void setKind(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.host_template.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    @Override
    public String getKind() {
        return (String) get(2);
    }

    /**
     * Setter for <code>cattle.host_template.uuid</code>.
     */
    @Override
    public void setUuid(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.host_template.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    @Override
    public String getUuid() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cattle.host_template.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.host_template.description</code>.
     */
    @Column(name = "description", length = 1024)
    @Override
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.host_template.state</code>.
     */
    @Override
    public void setState(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.host_template.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    @Override
    public String getState() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cattle.host_template.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.host_template.created</code>.
     */
    @Column(name = "created")
    @Override
    public Date getCreated() {
        return (Date) get(6);
    }

    /**
     * Setter for <code>cattle.host_template.removed</code>.
     */
    @Override
    public void setRemoved(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.host_template.removed</code>.
     */
    @Column(name = "removed")
    @Override
    public Date getRemoved() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>cattle.host_template.remove_time</code>.
     */
    @Override
    public void setRemoveTime(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.host_template.remove_time</code>.
     */
    @Column(name = "remove_time")
    @Override
    public Date getRemoveTime() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>cattle.host_template.data</code>.
     */
    @Override
    public void setData(Map<String,Object> value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.host_template.data</code>.
     */
    @Column(name = "data", length = 16777215)
    @Override
    public Map<String,Object> getData() {
        return (Map<String,Object>) get(9);
    }

    /**
     * Setter for <code>cattle.host_template.driver</code>.
     */
    @Override
    public void setDriver(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.host_template.driver</code>.
     */
    @Column(name = "driver", length = 255)
    @Override
    public String getDriver() {
        return (String) get(10);
    }

    /**
     * Setter for <code>cattle.host_template.flavor_prefix</code>.
     */
    @Override
    public void setFlavorPrefix(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>cattle.host_template.flavor_prefix</code>.
     */
    @Column(name = "flavor_prefix", length = 255)
    @Override
    public String getFlavorPrefix() {
        return (String) get(11);
    }

    /**
     * Setter for <code>cattle.host_template.cluster_id</code>.
     */
    @Override
    public void setClusterId(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>cattle.host_template.cluster_id</code>.
     */
    @Column(name = "cluster_id", nullable = false, precision = 19)
    @Override
    public Long getClusterId() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>cattle.host_template.creator_id</code>.
     */
    @Override
    public void setCreatorId(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>cattle.host_template.creator_id</code>.
     */
    @Column(name = "creator_id", precision = 19)
    @Override
    public Long getCreatorId() {
        return (Long) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, String, String, String, String, String, Date, Date, Date, Map<String,Object>, String, String, Long, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, String, String, String, String, String, Date, Date, Date, Map<String,Object>, String, String, Long, Long> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return HostTemplateTable.HOST_TEMPLATE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return HostTemplateTable.HOST_TEMPLATE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return HostTemplateTable.HOST_TEMPLATE.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return HostTemplateTable.HOST_TEMPLATE.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return HostTemplateTable.HOST_TEMPLATE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return HostTemplateTable.HOST_TEMPLATE.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field7() {
        return HostTemplateTable.HOST_TEMPLATE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return HostTemplateTable.HOST_TEMPLATE.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return HostTemplateTable.HOST_TEMPLATE.REMOVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map<String,Object>> field10() {
        return HostTemplateTable.HOST_TEMPLATE.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return HostTemplateTable.HOST_TEMPLATE.DRIVER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return HostTemplateTable.HOST_TEMPLATE.FLAVOR_PREFIX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return HostTemplateTable.HOST_TEMPLATE.CLUSTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return HostTemplateTable.HOST_TEMPLATE.CREATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value7() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getRemoveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String,Object> value10() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDriver();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getFlavorPrefix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getClusterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getCreatorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord value3(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord value4(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord value6(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord value7(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord value8(Date value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord value9(Date value) {
        setRemoveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord value10(Map<String,Object> value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord value11(String value) {
        setDriver(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord value12(String value) {
        setFlavorPrefix(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord value13(Long value) {
        setClusterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord value14(Long value) {
        setCreatorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostTemplateRecord values(Long value1, String value2, String value3, String value4, String value5, String value6, Date value7, Date value8, Date value9, Map<String,Object> value10, String value11, String value12, Long value13, Long value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(HostTemplate from) {
        setId(from.getId());
        setName(from.getName());
        setKind(from.getKind());
        setUuid(from.getUuid());
        setDescription(from.getDescription());
        setState(from.getState());
        setCreated(from.getCreated());
        setRemoved(from.getRemoved());
        setRemoveTime(from.getRemoveTime());
        setData(from.getData());
        setDriver(from.getDriver());
        setFlavorPrefix(from.getFlavorPrefix());
        setClusterId(from.getClusterId());
        setCreatorId(from.getCreatorId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends HostTemplate> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HostTemplateRecord
     */
    public HostTemplateRecord() {
        super(HostTemplateTable.HOST_TEMPLATE);
    }

    /**
     * Create a detached, initialised HostTemplateRecord
     */
    public HostTemplateRecord(Long id, String name, String kind, String uuid, String description, String state, Date created, Date removed, Date removeTime, Map<String,Object> data, String driver, String flavorPrefix, Long clusterId, Long creatorId) {
        super(HostTemplateTable.HOST_TEMPLATE);

        set(0, id);
        set(1, name);
        set(2, kind);
        set(3, uuid);
        set(4, description);
        set(5, state);
        set(6, created);
        set(7, removed);
        set(8, removeTime);
        set(9, data);
        set(10, driver);
        set(11, flavorPrefix);
        set(12, clusterId);
        set(13, creatorId);
    }
}
