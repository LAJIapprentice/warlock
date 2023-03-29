### 数据传输服务

### 数据查询服务

### 定时调度服务

### 权限管理服务
权限管理、人员、部门管理

### 消息通知服务 

数据传输

权限管理系统，接入系统，完成权限控制，token、appId、appKey、

超级管理员、管理员权限、一级部门权限、二级部门权限、三级部门权限、个人权限

部门：
    部门Id、部门名称、部门owner、部门负责人、部门描述、上级部门Id、部门位置、网址入口、创建时间、更新时间

基础架构
springboot
mybatis-plus
springSecurity+oauth2

dubbo+zookeeper[注册中心+配置中心]
redis缓存
kafka消息中间件，流量削峰
elasticsearch搜索引擎 
kibana日志查询

kong网关
seata分布式事务

prometheus grafana监控系统
SkyWalking链路追踪

mysql存储数据

传输数据源类型
Postgresql
hadoop
spark
flink
hive

clinkHouse
mongodb
oracle
hbase



kernel-admin        -- 后台管理模块

kernel-authority    -- 权限管理模块

kernel-common       -- 公共模块

kernel-engine       -- 数据源管理模块

kernel-pigeon       -- 通信模块

kernel-search       -- 搜索引擎模块

renren-generator    -- 代码生成器


-- 自定义资源注解，权限注解，requestId,


