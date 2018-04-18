package it.huanzi.model;

/**
 * Created by wqh on 2018/4/17.
 */
public class SysUserRole {
    private Long userId ;
    private Long roleId ;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
