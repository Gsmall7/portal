package com.lyl.study.portal.dto.request;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@ToString
@Accessors(chain = true)
public class RoleAddPrivRequest implements Serializable {
    /**
     * 角色ID
     */
    private String roleId;
    /**
     * 权限类型：E-权限标识，A-Ant表达式
     */
    private String privType;
    /**
     * 权限标识(逗号划分）
     * 如: system:user:read,system:user:write
     */
    private String privEl;
    /**
     * Ant表达式(逗号分割)
     */
    private String privAnt;
}
