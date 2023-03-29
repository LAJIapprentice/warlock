-- 数据源管理
-- 数据源类型
DROP TABLE IF EXISTS tab_database;
CREATE TABLE IF NOT EXISTS tab_database
(
    id                bigint(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    database_name     varchar(100) DEFAULT NULL COMMENT '数据源名称',
    database_type     varchar(100) DEFAULT NULL COMMENT '数据源类型',
    database_version  varchar(100) DEFAULT NULL COMMENT '数据源版本',
    database_owner    varchar(100) DEFAULT NULL COMMENT '数据源管理员',
    database_url      varchar(100) DEFAULT NULL COMMENT '数据源路径',
    database_port     varchar(100) DEFAULT NULL COMMENT '数据源端口',
    database_user     varchar(100) DEFAULT NULL COMMENT '数据源用户',
    database_password varchar(100) DEFAULT NULL COMMENT '数据源密码',
    location          varchar(100) DEFAULT NULL COMMENT '目标端、源端',
    describe          text          COMMENT '数据源描述',
    address           varchar(100) DEFAULT NULL COMMENT '数据源地址',
    connect_path      varchar(100) DEFAULT NULL COMMENT 'JDBC类型',
    connect_type      varchar(100) DEFAULT NULL COMMENT '连接类型'
    )ENGINE = InnoDB AUTO_INCREMENT = 9
    DEFAULT CHARSET = utf8 COMMENT ='数据源表';

DROP TABLE IF EXISTS tab_task_group;
CREATE TABLE IF NOT EXISTS  tab_task_group
(
    id             bigint(20) NOT NULL AUTO_INCREMENT  PRIMARY KEY,
    group_name     varchar(100) DEFAULT NULL COMMENT '组名称',
    group_describe text          COMMENT '组描述',
    group_owner    varchar(100) DEFAULT NULL COMMENT '组管理员'
    )ENGINE = InnoDB AUTO_INCREMENT = 9
    DEFAULT CHARSET = utf8 COMMENT ='任务组表';

DROP TABLE IF EXISTS tab_scheduler_task;
CREATE TABLE IF NOT EXISTS tab_scheduler_task
(
    id                 bigint(20) NOT NULL AUTO_INCREMENT  PRIMARY KEY,
    task_group_id      bigint(20) DEFAULT NULL COMMENT '任务组Id',
    database_target_id bigint(20) DEFAULT NULL COMMENT '数据源目标端Id',
    database_source_id bigint(20) DEFAULT NULL COMMENT '数据源源端Id',
    table_target       varchar(100) DEFAULT NULL COMMENT '目标端表',
    table_source       varchar(100) DEFAULT NULL COMMENT '源端表',
    create_table       varchar(100) DEFAULT NULL COMMENT '是否创建表',
    scheduler_name     varchar(100) DEFAULT NULL COMMENT '调度名称',
    scheduler_type     varchar(100) DEFAULT NULL COMMENT 'sql、表迁移',
    scheduler_describe text          COMMENT '调度描述',
    scheduler_status   varchar(100) DEFAULT NULL COMMENT '调度状态',
    filter_condition   text          COMMENT '过滤条件',
    execute_user       varchar(100) DEFAULT NULL COMMENT '数据调度用户',
    core_execute       text          COMMENT '核心处理逻辑',
    prefix_sql         text          COMMENT '前置sql',
    suffix_sql         text          COMMENT '后置sql'
    )ENGINE = InnoDB AUTO_INCREMENT = 9
    DEFAULT CHARSET = utf8 COMMENT ='任务表';

DROP TABLE IF EXISTS tab_scheduler_history;
CREATE TABLE IF NOT EXISTS tab_scheduler_history
(
    id           bigint(20) NOT NULL AUTO_INCREMENT  PRIMARY KEY,
    core_sql     text          COMMENT '执行处理sql',
    status       varchar(100) DEFAULT NULL COMMENT '执行状态',
    amount       varchar(100) DEFAULT NULL COMMENT '调度数据量',
    start_time   varchar(100) DEFAULT NULL COMMENT '开始时间',
    end_time     varchar(100) DEFAULT NULL COMMENT '开始时间',
    operate_user varchar(100) DEFAULT NULL COMMENT '操作人',
    operate_log  text          COMMENT '执行日志'
    )ENGINE = InnoDB AUTO_INCREMENT = 9
    DEFAULT CHARSET = utf8 COMMENT ='任务历史表';