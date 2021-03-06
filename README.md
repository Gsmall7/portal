该框架仅供个人学习积累使用，不作为商用。

# 门户系统功能
1. 用户信息管理
2. 角色管理
3. 菜单目录管理
4. 门户管理
5. 统一鉴权模块（包含业务服务器上直接鉴权以及网关鉴权两种方式）
6. 应用管理
7. 多租户数据划分
8. 日志管理（重要的日志信息不只存放在日志文件中，还可以通过DB进行查询）
9. 组织架构管理

# 特性
1. 可拓展：采用SpringCloud微服务框架构建服务，不同服务之间使用Redis共享Session
2. 高性能：采用WebFlux异步IO构建Web应用，比传统同步IO的Web服务具有更高的性能

# 编码规范
1. 新建实体方法名以 save 打头
2. 修改实体方法名以 update 打头
3. 删除实体方法名以 delete 打头
4. 查询实体方法名以 get, list, page 打头
5. 添加关联关系方法名以 add 打头
6. 撤销关联关系方法名以 delete 打头