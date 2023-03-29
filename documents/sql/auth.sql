
CREATE TABLE auth_user
(
    id             bigint(20) NOT NULL AUTO_INCREMENT,
    username       varchar(64)  DEFAULT NULL,
    password       varchar(64)  DEFAULT NULL,
    icon           varchar(500) DEFAULT NULL COMMENT '头像',
    email          varchar(100) DEFAULT NULL COMMENT '邮箱',
    nick_name      varchar(200) DEFAULT NULL COMMENT '昵称',
    note           varchar(500) DEFAULT NULL COMMENT '备注信息',
    login_time     timestamp    DEFAULT NULL COMMENT '最后登录时间',
    user_status    int(1)       DEFAULT '1' COMMENT '帐号启用状态',
    create_by      varchar(200) DEFAULT NULL COMMENT '创建人',
    last_update_by varchar(200) DEFAULT NULL COMMENT '更新人',
    create_time    timestamp    DEFAULT NULL COMMENT '创建时间',
    update_time    timestamp    DEFAULT NULL COMMENT '更新时间',
    del_flag       int(1)       DEFAULT '1' COMMENT '删除标志',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 9
  DEFAULT CHARSET = utf8 COMMENT ='后台用户表';

DROP TABLE IF EXISTS auth_user_group;
CREATE TABLE auth_user_group
(
    id             bigint(20) NOT NULL AUTO_INCREMENT,
    parent_id      bigint(20)   DEFAULT NULL COMMENT '父级ID',
    user_id        bigint(20)   DEFAULT NULL COMMENT '用户Id',
    group_level    int(4)       DEFAULT NULL COMMENT '权限组级',
    group_name     varchar(200) DEFAULT NULL COMMENT '组名称',
    create_by      varchar(200) DEFAULT NULL COMMENT '创建人',
    last_update_by varchar(200) DEFAULT NULL COMMENT '更新人',
    create_time    timestamp    DEFAULT NULL COMMENT '创建时间',
    update_time    timestamp    DEFAULT NULL COMMENT '更新时间',
    del_flag       int(1)       DEFAULT '1' COMMENT '删除标志',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 9
  DEFAULT CHARSET = utf8 COMMENT ='用户组表';


DROP TABLE IF EXISTS auth_menu;
CREATE TABLE auth_menu
(
    id             bigint(20) NOT NULL AUTO_INCREMENT,
    parent_id      bigint(20)   DEFAULT NULL COMMENT '父级ID',
    title          varchar(100) DEFAULT NULL COMMENT '菜单名称',
    menu_level     int(4)       DEFAULT NULL COMMENT '菜单级数',
    sort           int(4)       DEFAULT NULL COMMENT '菜单排序',
    menu_name      varchar(100) DEFAULT NULL COMMENT '前端名称',
    icon           varchar(200) DEFAULT NULL COMMENT '前端图标',
    hidden         int(1)       DEFAULT NULL COMMENT '前端隐藏',
    create_by      varchar(200) DEFAULT NULL COMMENT '创建人',
    last_update_by varchar(200) DEFAULT NULL COMMENT '更新人',
    create_time    timestamp    DEFAULT NULL COMMENT '创建时间',
    update_time    timestamp    DEFAULT NULL COMMENT '更新时间',
    del_flag       int(1)       DEFAULT '1' COMMENT '删除标志',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 26
  DEFAULT CHARSET = utf8 COMMENT ='后台菜单表';


DROP TABLE IF EXISTS auth_permission;
CREATE TABLE auth_permission
(
    id                bigint(20) NOT NULL AUTO_INCREMENT,
    pid               bigint(20)   DEFAULT NULL COMMENT '父级权限id',
    permission_name   varchar(100) DEFAULT NULL COMMENT '名称',
    permission_value  varchar(200) DEFAULT NULL COMMENT '权限值',
    icon              varchar(500) DEFAULT NULL COMMENT '图标',
    type              int(1)       DEFAULT NULL COMMENT '权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）',
    uri               varchar(200) DEFAULT NULL COMMENT '前端资源路径',
    permission_status int(1)       DEFAULT NULL COMMENT '启用状态',
    sort              int(11)      DEFAULT NULL COMMENT '排序',
    create_by         varchar(200) DEFAULT NULL COMMENT '创建人',
    last_update_by    varchar(200) DEFAULT NULL COMMENT '更新人',
    create_time       timestamp    DEFAULT NULL COMMENT '创建时间',
    update_time       timestamp    DEFAULT NULL COMMENT '更新时间',
    del_flag          int(1)       DEFAULT '1' COMMENT '删除标志',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 19
  DEFAULT CHARSET = utf8 COMMENT ='后台用户权限表';

DROP TABLE IF EXISTS auth_resource;
CREATE TABLE auth_resource
(
    id                   bigint(20) NOT NULL AUTO_INCREMENT,
    resource_name        varchar(200) DEFAULT NULL COMMENT '资源名称',
    resource_url         varchar(200) DEFAULT NULL COMMENT '资源URL',
    resource_description varchar(500) DEFAULT NULL COMMENT '描述',
    category_id          bigint(20)   DEFAULT NULL COMMENT '资源分类ID',
    create_by            varchar(200) DEFAULT NULL COMMENT '创建人',
    last_update_by       varchar(200) DEFAULT NULL COMMENT '更新人',
    create_time          timestamp    DEFAULT NULL COMMENT '创建时间',
    update_time          timestamp    DEFAULT NULL COMMENT '更新时间',
    del_flag             int(1)       DEFAULT '1' COMMENT '删除标志',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 33
  DEFAULT CHARSET = utf8 COMMENT ='后台资源表';


DROP TABLE IF EXISTS auth_role;
CREATE TABLE auth_role
(
    id               bigint(20) NOT NULL AUTO_INCREMENT,
    role_name        varchar(100) DEFAULT NULL COMMENT '名称',
    role_description varchar(500) DEFAULT NULL COMMENT '描述',
    user_count      int(11)      DEFAULT NULL COMMENT '后台用户数量',
    role_status      int(1)       DEFAULT '1' COMMENT '启用状态',
    sort             int(11)      DEFAULT '0',
    create_by        varchar(200) DEFAULT NULL COMMENT '创建人',
    last_update_by   varchar(200) DEFAULT NULL COMMENT '更新人',
    create_time      timestamp    DEFAULT NULL COMMENT '创建时间',
    update_time      timestamp    DEFAULT NULL COMMENT '更新时间',
    del_flag         int(1)       DEFAULT '1' COMMENT '删除标志',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 8
  DEFAULT CHARSET = utf8 COMMENT ='后台用户角色表';

DROP TABLE IF EXISTS auth_role_menu_relation;
CREATE TABLE auth_role_menu_relation
(
    id          bigint(20) NOT NULL AUTO_INCREMENT,
    role_id     bigint(20) DEFAULT NULL COMMENT '角色ID',
    menu_id     bigint(20) DEFAULT NULL COMMENT '菜单ID',
    create_time timestamp  DEFAULT NULL COMMENT '创建时间',
    update_time timestamp  DEFAULT NULL COMMENT '更新时间',
    del_flag    int(1)     DEFAULT '1' COMMENT '删除标志',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 96
  DEFAULT CHARSET = utf8 COMMENT ='后台角色菜单关系表';


DROP TABLE IF EXISTS auth_role_permission_relation;
CREATE TABLE auth_role_permission_relation
(
    id            bigint(20) NOT NULL AUTO_INCREMENT,
    role_id       bigint(20) DEFAULT NULL,
    permission_id bigint(20) DEFAULT NULL,
    create_time   timestamp  DEFAULT NULL COMMENT '创建时间',
    update_time   timestamp  DEFAULT NULL COMMENT '更新时间',
    del_flag      int(1)     DEFAULT '1' COMMENT '删除标志',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 18
  DEFAULT CHARSET = utf8 COMMENT ='后台用户角色和权限关系表';

DROP TABLE IF EXISTS auth_role_resource_relation;
CREATE TABLE auth_role_resource_relation
(
    id          bigint(20) NOT NULL AUTO_INCREMENT,
    role_id     bigint(20) DEFAULT NULL COMMENT '角色ID',
    resource_id bigint(20) DEFAULT NULL COMMENT '资源ID',
    create_time timestamp  DEFAULT NULL COMMENT '创建时间',
    update_time timestamp  DEFAULT NULL COMMENT '更新时间',
    del_flag    int(1)     DEFAULT '1' COMMENT '删除标志',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 225
  DEFAULT CHARSET = utf8 COMMENT ='后台角色资源关系表';

DROP TABLE IF EXISTS auth_user_permission_relation;
CREATE TABLE auth_user_permission_relation
(
    id            bigint(20) NOT NULL AUTO_INCREMENT,
    user_id      bigint(20) DEFAULT NULL,
    permission_id bigint(20) DEFAULT NULL,
    type          int(1)     DEFAULT NULL,
    create_time   timestamp  DEFAULT NULL COMMENT '创建时间',
    update_time   timestamp  DEFAULT NULL COMMENT '更新时间',
    del_flag      int(1)     DEFAULT '1' COMMENT '删除标志',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='后台用户和权限关系表(除角色中定义的权限以外的加减权限)';

DROP TABLE IF EXISTS auth_user_login_log;
CREATE TABLE auth_user_login_log
(
    id          bigint(20) NOT NULL AUTO_INCREMENT,
    user_id    bigint(20)   DEFAULT NULL,
    ip          varchar(64)  DEFAULT NULL,
    address     varchar(100) DEFAULT NULL,
    user_agent  varchar(100) DEFAULT NULL COMMENT '浏览器登录类型',
    create_time timestamp    DEFAULT NULL COMMENT '创建时间',
    update_time timestamp    DEFAULT NULL COMMENT '更新时间',
    del_flag    int(1)       DEFAULT '1' COMMENT '删除标志',
    PRIMARY KEY (id)
) ENGINE = InnoDB
  AUTO_INCREMENT = 204
  DEFAULT CHARSET = utf8 COMMENT ='后台用户登录日志表';

--
-- 资源 【前端一个页面一个资源Id,后端一个接口一个资源code，一个模块为一个资源组-权限组】
-- 角色 【超级管理员，用户组管理员、vip用户、普通用户】
-- 用户 【用户组，默认拥有整个组的权限，需要别的权限需要权限组管理员添加，也可组内权限需要申请】
-- 权限
--