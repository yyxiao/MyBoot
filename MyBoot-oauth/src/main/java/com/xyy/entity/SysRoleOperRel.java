package com.xyy.entity;

/**
 * SysRoleOperRel
 * com.xyy.entity
 *
 * @author Xander
 * @Description
 * @Date 2019-05-20 11:30
 * The word 'impossible' is not in my dictionary.
 */
public class SysRoleOperRel implements java.io.Serializable {

    private String roleOperId;
    private String operatorId;
    private String roleId;

    public SysRoleOperRel() {
    }

    public SysRoleOperRel(String operatorId, String roleId) {
        this.operatorId = operatorId;
        this.roleId = roleId;
    }

    public String getRoleOperId() {
        return this.roleOperId;
    }

    public void setRoleOperId(String roleOperId) {
        this.roleOperId = roleOperId;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getRoleId() {
        return this.roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}