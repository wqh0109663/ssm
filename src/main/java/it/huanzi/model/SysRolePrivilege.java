package it.huanzi.model;

/**
 * Created by wqh on 2018/4/17.
 */
public class SysRolePrivilege {
    private Long roleId;
    private Long privilegeId ;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }


}
