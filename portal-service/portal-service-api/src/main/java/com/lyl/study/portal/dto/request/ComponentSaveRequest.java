package com.lyl.study.portal.dto.request;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@ToString
@Accessors(chain = true)
public class ComponentSaveRequest implements Serializable {
    /**
     * 名称
     */
    private String name;
    /**
     * 编码
     */
    private String code;
    /**
     * 租户ID
     */
    private String tenantId;
    /**
     * 备注
     */
    private String comments;
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
    /**
     * 菜单ID
     */
    private String menuId;
    /**
     * 页面组件ID（Xpath）
     */
    private String objectId;
}
