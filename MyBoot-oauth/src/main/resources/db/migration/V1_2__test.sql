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

 Date: 04/18/2019 10:48:54 AM
*/

SET
NAMES
utf8mb4;
SET
FOREIGN_KEY_CHECKS
=
0;

DROP TABLE IF EXISTS `city`;
-- ----------------------------
--  Table structure for `complat_city`
-- ----------------------------
DROP TABLE IF EXISTS `complat_city`;
CREATE TABLE `complat_city`
(
  `id`    varchar(32) NOT NULL,
  `name`  varchar(20) DEFAULT NULL,
  `other` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records of `complat_city`
-- ----------------------------
BEGIN;
INSERT INTO `complat_city`
VALUES ('8a929fcc644931a8016449383a340000', '北京', '8a929fcc644931a8016449383a340007 '),
       ('8a929fcc644931a8016449383a340009', '上海', '');
COMMIT;

SET
FOREIGN_KEY_CHECKS
=
1;
