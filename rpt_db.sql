/*
 Navicat Premium Data Transfer

 Source Server         : myConnect
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : rpt_db

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 27/11/2021 19:31:53
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_report
-- ----------------------------
DROP TABLE IF EXISTS `tbl_report`;
CREATE TABLE `tbl_report` (
  `id` int NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `context` varchar(255) DEFAULT NULL,
  `time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of tbl_report
-- ----------------------------
BEGIN;
INSERT INTO `tbl_report` VALUES (1, '请假', '张三', '不舒服', '2021-11-25 21:04:20');
INSERT INTO `tbl_report` VALUES (2, '周报', '李四', '看论文', '2021-11-25 21:05:02');
INSERT INTO `tbl_report` VALUES (3, '周报', '王五', '写作业', '2021-11-25 21:06:46');
INSERT INTO `tbl_report` VALUES (4, '周报', '赵云', '五杀', '2021-11-26 12:29:47');
INSERT INTO `tbl_report` VALUES (5, '周报', '王五', '学习', '2021-11-26 12:51:58');
INSERT INTO `tbl_report` VALUES (8, '通知', '孙尚香', '连跪', '2021-11-26 15:05:07');
INSERT INTO `tbl_report` VALUES (10, '通知', '孙膑', '连胜', '2021-11-26 15:08:26');
INSERT INTO `tbl_report` VALUES (13, '111', '111', NULL, '2021-11-26 16:11:41');
INSERT INTO `tbl_report` VALUES (14, '222', '222', NULL, '2021-11-26 16:11:44');
INSERT INTO `tbl_report` VALUES (15, '222', '21312', NULL, '2021-11-26 16:11:47');
INSERT INTO `tbl_report` VALUES (18, '周报', '赵云', '五杀', '2021-11-26 20:39:46');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
