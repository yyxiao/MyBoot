/*
 Navicat Premium Data Transfer

 Source Server         : localhost-mysql
 Source Server Type    : MySQL
 Source Server Version : 50715
 Source Host           : localhost
 Source Database       : test

 Target Server Type    : MySQL
 Target Server Version : 50715
 File Encoding         : utf-8

 Date: 04/09/2019 15:27:11 PM
*/

SET
NAMES
utf8mb4;
SET
FOREIGN_KEY_CHECKS
=
0;

-- ----------------------------
--  Table structure for `AAA_CRM_LOG`
-- ----------------------------
DROP TABLE IF EXISTS `AAA_CRM_LOG`;
CREATE TABLE `AAA_CRM_LOG`
(
  `AAA_CRM_ID`    varchar(32) COLLATE utf8_bin NOT NULL COMMENT '物理主键',
  `VISIT_NET`     varchar(6) COLLATE utf8_bin  DEFAULT NULL COMMENT '帐号归属地本地网',
  `ACCESS_DESC`   varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '用户接入串',
  `ACCESS_ADD`    varchar(15) COLLATE utf8_bin DEFAULT NULL COMMENT '接入设备地址',
  `ACCESS_SIGN`   varchar(60) COLLATE utf8_bin DEFAULT NULL COMMENT '接入设备标示',
  `SESSION_ID`    varchar(80) COLLATE utf8_bin DEFAULT NULL COMMENT '会话ID',
  `APP_IP`        varchar(15) COLLATE utf8_bin DEFAULT NULL COMMENT '客户端IP地址',
  `MAC`           varchar(24) COLLATE utf8_bin DEFAULT NULL COMMENT 'MAC地址',
  `START_TIME`    varchar(14) COLLATE utf8_bin DEFAULT NULL COMMENT '开始时间',
  `END_TIME`      varchar(14) COLLATE utf8_bin DEFAULT NULL COMMENT '结束时间',
  `ONLINE_TIME`   decimal(65,30)               DEFAULT NULL COMMENT '上网时长',
  `IN_DISCHARGE`  varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '入流量',
  `OUT_DISCHARGE` varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '出流量',
  `ALL_DISCHARGE` varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '总流量',
  `PROVINCE_NAME` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '省名称',
  `CITY_NAME`     varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '市名称',
  `AREA_NAME`     varchar(40) COLLATE utf8_bin DEFAULT NULL COMMENT '地区编码',
  `BUREAU_NAME`   varchar(40) COLLATE utf8_bin DEFAULT NULL COMMENT '局向名称',
  `SCHOOL_NAME`   varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '所在学校',
  `USER_ACCOUNT`  varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '宽带账户',
  `TEL`           varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '手机号',
  `IS_LOGINED`    varchar(1) COLLATE utf8_bin  DEFAULT NULL COMMENT '已登录 0：是  1：否',
  `PACKAGE_NAME`  varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '宽带套餐',
  `PACKAGE_TIME`  decimal(65,30)               DEFAULT NULL COMMENT '宽带套餐时长',
  `HANDLE_TIME`   varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '宽带办理时间',
  PRIMARY KEY (`AAA_CRM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =utf8_bin;

-- ----------------------------
--  Table structure for `AAA_LOGIN_FTP_LOG`
-- ----------------------------
DROP TABLE IF EXISTS `AAA_LOGIN_FTP_LOG`;
CREATE TABLE `AAA_LOGIN_FTP_LOG`
(
  `AAA_LOGIN_FTP_LOG_ID` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '物理主键',
  `CHARGE_TPYE`          varchar(1) COLLATE utf8_bin  DEFAULT NULL COMMENT '计费标识',
  `ACCESS_TYPE`          varchar(1) COLLATE utf8_bin  DEFAULT NULL COMMENT '接入类型',
  `BELONG_NET`           varchar(6) COLLATE utf8_bin  DEFAULT NULL COMMENT '帐号归属地本地网',
  `VISIT_NET`            varchar(6) COLLATE utf8_bin  DEFAULT NULL COMMENT '帐号访问地本地网',
  `TICKET_SOURCE`        varchar(4) COLLATE utf8_bin  DEFAULT NULL COMMENT '话单资源',
  `INITIAL_SOURCE`       varchar(4) COLLATE utf8_bin  DEFAULT NULL COMMENT '默认资源',
  `ACCOUNT`              varchar(24) COLLATE utf8_bin DEFAULT NULL COMMENT '帐号',
  `ACCESS_DESC`          varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '用户接入串',
  `ACCESS_ADD`           varchar(15) COLLATE utf8_bin DEFAULT NULL COMMENT '接入设备地址',
  `ACCESS_SIGN`          varchar(60) COLLATE utf8_bin DEFAULT NULL COMMENT '接入设备标示',
  `SESSION_ID`           varchar(80) COLLATE utf8_bin DEFAULT NULL COMMENT '会话ID',
  `APP_IP`               varchar(15) COLLATE utf8_bin DEFAULT NULL COMMENT '客户端IP地址',
  `CALLING_NO`           varchar(24) COLLATE utf8_bin DEFAULT NULL COMMENT '主叫号码',
  `MAC_NUM`              varchar(24) COLLATE utf8_bin DEFAULT NULL COMMENT 'MAC地址',
  `CALLED_NO`            varchar(24) COLLATE utf8_bin DEFAULT NULL COMMENT '被叫号码',
  `START_TIME`           varchar(14) COLLATE utf8_bin DEFAULT NULL COMMENT '开始时间',
  `END_TIME`             varchar(14) COLLATE utf8_bin DEFAULT NULL COMMENT '结束时间',
  `CALL_TIME`            decimal(65,30)               DEFAULT NULL COMMENT '通话时长',
  `IN_DISCHARGE`         varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '入流量',
  `OUT_DISCHARGE`        varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '出流量',
  `ALL_DISCHARGE`        varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '总流量',
  `COUNTRY`              varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '国家',
  `AAA_FTPNAME`          varchar(80) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`AAA_LOGIN_FTP_LOG_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =utf8_bin;

-- ----------------------------
--  Table structure for `ANY_SCHOOL_ONLINE_TIME`
-- ----------------------------
DROP TABLE IF EXISTS `ANY_SCHOOL_ONLINE_TIME`;
CREATE TABLE `ANY_SCHOOL_ONLINE_TIME`
(
  `ANY_SCHOOL_ONLINE_TIME_ID` varchar(32) COLLATE utf8_bin NOT NULL COMMENT '物理主键',
  `PROVINCE_NAME`             varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '省名称',
  `CITY_NAME`                 varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '市名称',
  `AREA_NAME`                 varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '地区名称',
  `BUREAU_NAME`               varchar(40) COLLATE utf8_bin DEFAULT NULL COMMENT '局向名称',
  `SCHOOL_NAME`               varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '学校名称',
  `PACKAGE_NAME`              varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '宽带套餐',
  `ONLINE_TIME`               decimal(65,30)               DEFAULT NULL COMMENT '上网时长',
  `LOGIN_NUM`                 decimal(65,30)               DEFAULT NULL COMMENT '登录次数',
  `MAC_NUM`                   decimal(65,30)               DEFAULT NULL COMMENT 'MAC地址',
  `FIRST_LOGIN_NUM`           decimal(65,30)               DEFAULT NULL COMMENT '使用人数',
  `USER_NUM`                  decimal(65,30)               DEFAULT NULL COMMENT '用户总量(不限)',
  `GREATER_HOUR_NUM`          decimal(65,30)               DEFAULT NULL COMMENT '大于等于一小时',
  `LESS_HOUR_NUM`             decimal(65,30)               DEFAULT NULL COMMENT '小于一小时',
  `COUNT_TIME`                varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '统计时间',
  PRIMARY KEY (`ANY_SCHOOL_ONLINE_TIME_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =utf8_bin;

-- ----------------------------
--  Table structure for `CRM_USERINFO`
-- ----------------------------
DROP TABLE IF EXISTS `CRM_USERINFO`;
CREATE TABLE `CRM_USERINFO`
(
  `CRM_USERINFO_ID`   varchar(32) COLLATE utf8_bin NOT NULL COMMENT '物理主键',
  `PROVINCE_NAME`     varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `CITY_NAME`         varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '市名称',
  `AREA_NAME`         varchar(40) COLLATE utf8_bin DEFAULT NULL COMMENT '地区名称',
  `BUREAU_NAME`       varchar(40) COLLATE utf8_bin DEFAULT NULL COMMENT '局向名称',
  `SCHOOL_NAME`       varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '所在学校',
  `USER_ACCOUNT`      varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '宽带账户',
  `TEL`               varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '手机号',
  `IS_BIND_MOBILE`    varchar(1) COLLATE utf8_bin  DEFAULT NULL COMMENT '是否绑定手机 0：是  1：否',
  `IS_LOGINED`        varchar(1) COLLATE utf8_bin  DEFAULT NULL COMMENT '已登录 0：是  1：否',
  `PACKAGE_NAME`      varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '宽带套餐',
  `PACKAGE_TIME`      decimal(65,30)               DEFAULT NULL COMMENT '宽带套餐时长',
  `HANDLE_TIME`       varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '宽带办理时间',
  `ONLINE_TIME`       decimal(65,30)               DEFAULT NULL COMMENT '上网时长',
  `UPDATE_TIME`       varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `MULTI_DEVICE_FLAG` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `TRUE_NAME`         varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '用户姓名',
  PRIMARY KEY (`CRM_USERINFO_ID`),
  KEY                 `CRM_INDEX_ACCOUNT` (`USER_ACCOUNT`,`TEL`),
  KEY                 `CRM_INDEX_INDEX` (`TEL`),
  KEY                 `PACKAGE_TIME_INDEX` (`PACKAGE_TIME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =utf8_bin;

-- ----------------------------
--  Table structure for `bd_product_dept_employee_info`
-- ----------------------------
DROP TABLE IF EXISTS `bd_product_dept_employee_info`;
CREATE TABLE `bd_product_dept_employee_info`
(
  `P_ID`                 varchar(32) NOT NULL COMMENT '主键',
  `PERSON_ID`            varchar(32)   DEFAULT NULL COMMENT '员工ID',
  `PERSON_CODE`          varchar(32)   DEFAULT NULL COMMENT '员工编号',
  `PERSON_NAME`          varchar(32)   DEFAULT NULL COMMENT '员工名称',
  `DEPT_ID`              varchar(32)   DEFAULT NULL COMMENT '所属部门ID',
  `DEPT_NAME`            varchar(32)   DEFAULT NULL COMMENT '所属部门名称',
  `POSITION`             varchar(32)   DEFAULT NULL COMMENT '岗位',
  `SEX`                  char(1)       DEFAULT NULL COMMENT '性别',
  `WORK_STATE`           varchar(10)   DEFAULT NULL COMMENT '本公司-聘用状态(0:聘用;1:离职;2:试用;3:辞退;4退休)；外包-外包人员工作状态（0 闲置;1 进组;2 离职）',
  `ENTRY_WORK_DATE`      varchar(32)   DEFAULT NULL COMMENT '入职日期',
  `EMPLOY_DATE`          varchar(32)   DEFAULT NULL COMMENT '聘用日期',
  `COMPANY_AGE`          decimal(2,0)  DEFAULT NULL COMMENT '司龄',
  `FINANCE_COMPANY`      varchar(32)   DEFAULT NULL COMMENT '财务公司',
  `PERSON_COST`          decimal(10,4) DEFAULT NULL COMMENT '员工成本',
  `PERSON_EXPENSES`      decimal(10,4) DEFAULT NULL COMMENT '员工费用',
  `PERSON_EDUCATION`     varchar(32)   DEFAULT NULL COMMENT '员工学历',
  `PERSON_WORK_YEAR`     decimal(2,0)  DEFAULT NULL COMMENT '员工工作年限',
  `PERSON_TITLE`         varchar(32)   DEFAULT NULL COMMENT '员工职称',
  `INFO_UPDATE_DATE`     varchar(19)   DEFAULT NULL COMMENT '信息更新日期',
  `current_project_name` varchar(255)  DEFAULT NULL COMMENT '当前项目名称',
  `current_project_id`   char(32)      DEFAULT NULL COMMENT '当前所在项目Id',
  `word_lode`            decimal(10,2) DEFAULT NULL COMMENT '工作负荷度',
  `first_dept_id`        char(32)      DEFAULT NULL COMMENT '一级部门id',
  `first_dept_name`      varchar(255)  DEFAULT NULL COMMENT '一级部门名称',
  `org_id`               char(32)      DEFAULT NULL COMMENT '单位主键',
  `suppot_type`          char(1)       DEFAULT NULL COMMENT '支撑类型（0：内部支撑 1：外部支撑）',
  `work_hours`           int(255) DEFAULT NULL COMMENT '工作量',
  `leave_time`           char(10)      DEFAULT NULL COMMENT '离职时间',
  PRIMARY KEY (`P_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='生产部门员工基本信息';

-- ----------------------------
--  Table structure for `boohee`
-- ----------------------------
DROP TABLE IF EXISTS `boohee`;
CREATE TABLE `boohee`
(
  `taskid`     varchar(64) NOT NULL,
  `url`        varchar(1024) DEFAULT NULL,
  `result`     mediumblob,
  `updatetime` double(16,
  4
) DEFAULT NULL,
  PRIMARY KEY
(
  `taskid`
)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
--  Table structure for `city`
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city`
(
  `code` varchar(5) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `complat_zone`
-- ----------------------------
DROP TABLE IF EXISTS `complat_zone`;
CREATE TABLE `complat_zone`
(
  `iid`     varchar(32) NOT NULL COMMENT '主键',
  `name`    varchar(255) DEFAULT NULL COMMENT '区域名',
  `pinyin`  varchar(255) DEFAULT NULL COMMENT '区域名拼音',
  `pid`     varchar(32)  DEFAULT NULL COMMENT '区域父级ID',
  `orderId` varchar(11)  DEFAULT NULL COMMENT '排序ID',
  `codeId`  varchar(50)  DEFAULT NULL COMMENT '区域行政编码',
  `type`    int(1) DEFAULT NULL COMMENT '类型:1省级 2市（州） 3区县 4乡镇街道 5其他',
  PRIMARY KEY (`iid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
--  Table structure for `material`
-- ----------------------------
DROP TABLE IF EXISTS `material`;
CREATE TABLE `material`
(
  `id`               int(11) NOT NULL,
  `material_name`    varchar(50)  DEFAULT NULL COMMENT '原料名称',
  `parent_id`        varchar(36)  DEFAULT '0' COMMENT '0 主要名称 其他parent_id对应的别名',
  `calorie`          decimal(8,2) DEFAULT '0.00' COMMENT '热量',
  `carbohydrate`     decimal(8,2) DEFAULT '0.00' COMMENT '碳水化合物',
  `fat`              decimal(8,2) DEFAULT '0.00' COMMENT '脂肪',
  `protein`          decimal(8,2) DEFAULT '0.00' COMMENT '蛋白质',
  `fibre`            decimal(8,2) DEFAULT '0.00' COMMENT '纤维素',
  `vitamine_a`       decimal(8,2) DEFAULT '0.00' COMMENT '维生素A',
  `vitamine_c`       decimal(8,2) DEFAULT '0.00' COMMENT '维生素C',
  `vitamine_e`       decimal(8,2) DEFAULT '0.00' COMMENT '维生素E',
  `carotene`         decimal(8,2) DEFAULT '0.00' COMMENT '胡萝卜素',
  `oryzanin`         decimal(8,2) DEFAULT '0.00' COMMENT '硫胺素',
  `lactochrome`      decimal(8,2) DEFAULT '0.00' COMMENT '核黄素',
  `niacin`           decimal(8,2) DEFAULT '0.00' COMMENT '烟酸',
  `cholesterol`      decimal(8,2) DEFAULT '0.00' COMMENT '胆固醇',
  `magnesium`        decimal(8,2) DEFAULT '0.00' COMMENT '镁',
  `calcium`          decimal(8,2) DEFAULT '0.00' COMMENT '钙',
  `iron`             decimal(8,2) DEFAULT '0.00' COMMENT '铁',
  `zinc`             decimal(8,2) DEFAULT '0.00' COMMENT '锌',
  `copper`           decimal(8,2) DEFAULT '0.00' COMMENT '铜',
  `manganese`        decimal(8,2) DEFAULT '0.00' COMMENT '锰',
  `potassium`        decimal(8,2) DEFAULT '0.00' COMMENT '钾',
  `phosphorus`       decimal(8,2) DEFAULT '0.00' COMMENT '磷',
  `sodium`           decimal(8,2) DEFAULT '0.00' COMMENT '钠',
  `selenium`         decimal(8,2) DEFAULT '0.00' COMMENT '硒',
  `creator`          varchar(36)  DEFAULT NULL COMMENT '创建者',
  `create_time`      datetime     DEFAULT NULL,
  `updater`          varchar(36)  DEFAULT NULL COMMENT '更新人',
  `last_update_time` datetime     DEFAULT NULL,
  `stat`             int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='原料基础数据表';

-- ----------------------------
--  Table structure for `merp_pub_usergroup`
-- ----------------------------
DROP TABLE IF EXISTS `merp_pub_usergroup`;
CREATE TABLE `merp_pub_usergroup`
(
  `c_id`             char(4)      NOT NULL,
  `vc_usergroupname` varchar(100) NOT NULL,
  `vc_usergroupspec` varchar(255) DEFAULT NULL,
  `vc_parid`         varchar(4)   DEFAULT NULL,
  `i_orderid`        int(11) DEFAULT '0',
  `vc_extend01`      text,
  `xzqh_bm`          varchar(12)  DEFAULT NULL,
  `ougrcode`         varchar(50)  DEFAULT NULL,
  `webid`            int(11) DEFAULT NULL,
  `jis_orderid`      int(11) DEFAULT NULL,
  `vc_extend02`      varchar(255) DEFAULT NULL,
  `b_needshow`       int(1) DEFAULT '1',
  `vc_depcode`       varchar(255) DEFAULT NULL,
  PRIMARY KEY (`c_id`),
  KEY                `merp_pub_usergroup_index1` (`vc_parid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `sf_simple`
-- ----------------------------
DROP TABLE IF EXISTS `sf_simple`;
CREATE TABLE `sf_simple`
(
  `user_id`         char(32) NOT NULL COMMENT '员工主键',
  `org_id`          char(32) NOT NULL COMMENT '单位主键',
  `user_name`       varchar(32)   DEFAULT NULL COMMENT '员工姓名',
  `user_number`     char(7)       DEFAULT NULL COMMENT '员工工号',
  `first_dept_id`   char(32)      DEFAULT NULL COMMENT '一级部门ID',
  `first_dept_name` varchar(64)   DEFAULT NULL COMMENT '一级部门名称',
  `sed_dept_id`     char(32)      DEFAULT NULL COMMENT '二级部门Id',
  `sed_dept_name`   varchar(64)   DEFAULT NULL COMMENT '二级部门名称',
  `gender`          char(1)       DEFAULT NULL COMMENT '性别(1:男；2:女)',
  `email`           varchar(64)   DEFAULT NULL COMMENT '邮箱',
  `high_degree`     char(1)       DEFAULT NULL COMMENT '最高学位(0:学士学位;1:双学位;2:硕士学位;3:博士学位;4:无学位)',
  `post`            varchar(4)    DEFAULT NULL COMMENT '岗位类型(T1,资深专家;T2,专家;T3,骨干;T4,有经验者;T5,初学者)',
  `cost`            decimal(13,2) DEFAULT NULL COMMENT '人员成本',
  `qualifications`  varchar(64)   DEFAULT NULL COMMENT '任职资格：1-JAVA; 2-iOS; 3-Android; 4-前端; 5-大数据; 6-项目经理; 7-软件实施; 8-软件运维; 9-售前; 10-UED; 11-测试; 12-DBA; 13-架构师',
  `work_experience` varchar(8)    DEFAULT NULL COMMENT '工作年限',
  `out_org_name`    varchar(64)   DEFAULT NULL COMMENT '外包公司名称',
  `service_length`  varchar(8)    DEFAULT NULL COMMENT '司龄',
  `last_work_time`  char(10)      DEFAULT NULL COMMENT '参加工作时间',
  `entry_time`      char(10)      DEFAULT NULL COMMENT '入职时间',
  `hire_date`       char(10)      DEFAULT NULL COMMENT '聘用时间',
  `separate_date`   char(10)      DEFAULT NULL COMMENT '离职时间',
  `is_work`         char(1)       DEFAULT NULL COMMENT '是否在职:0,在职;1,离职.在取数据时如果type=1,删除该条数据;在同步时如果离职时间为空则为在职',
  `hire_status`     char(1)       DEFAULT NULL COMMENT '本公司-聘用状态(0:聘用;1:离职;2:试用;3:辞退;4退休)；外包-外包人员工作状态（0 闲置;1 进组;2 离职）',
  `title`           char(1)       DEFAULT NULL COMMENT '人员职称(0:初级;1:中级;2:高级;3:其他)',
  `user_type`       char(1)       DEFAULT NULL COMMENT '人员类型：0：事业部人员，1：外包人员',
  `bd_update_time`  char(19)      DEFAULT NULL COMMENT '数据更新时间',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='人员简表';

-- ----------------------------
--  Table structure for `test1`
-- ----------------------------
DROP TABLE IF EXISTS `test1`;
CREATE TABLE `test1`
(
  `id`   int(10) DEFAULT NULL,
  `name` varchar(10) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE =utf8_bin;

-- ----------------------------
--  Table structure for `test2`
-- ----------------------------
DROP TABLE IF EXISTS `test2`;
CREATE TABLE `test2`
(
  `id`   int(10) DEFAULT NULL,
  `name` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET
FOREIGN_KEY_CHECKS
=
1;
