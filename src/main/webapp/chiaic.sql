/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : chiaic

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-09-19 17:39:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ch_common
-- ----------------------------
DROP TABLE IF EXISTS `ch_common`;
CREATE TABLE `ch_common` (
  `com_id` int(11) NOT NULL AUTO_INCREMENT,
  `com_type` int(11) DEFAULT NULL,
  `com_order` int(11) DEFAULT NULL,
  `com_name` varchar(255) DEFAULT NULL,
  `com_img` varchar(255) DEFAULT NULL,
  `com_body` varchar(255) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `add_user` varchar(255) DEFAULT NULL,
  `is_delete` int(11) DEFAULT NULL,
  PRIMARY KEY (`com_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of ch_common
-- ----------------------------

-- ----------------------------
-- Table structure for ch_file
-- ----------------------------
DROP TABLE IF EXISTS `ch_file`;
CREATE TABLE `ch_file` (
  `file_id` int(11) NOT NULL,
  `file_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of ch_file
-- ----------------------------

-- ----------------------------
-- Table structure for ch_news
-- ----------------------------
DROP TABLE IF EXISTS `ch_news`;
CREATE TABLE `ch_news` (
  `new_id` int(11) NOT NULL AUTO_INCREMENT,
  `new_title` varchar(255) DEFAULT NULL,
  `new_subhead` varchar(255) DEFAULT NULL,
  `prom_time` datetime DEFAULT NULL,
  `new_writer` varchar(100) DEFAULT NULL,
  `new_sm_body` varchar(255) DEFAULT NULL,
  `new_body` longtext,
  `pic_main` varchar(255) DEFAULT NULL,
  `add_user` varchar(100) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `new_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`new_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of ch_news
-- ----------------------------

-- ----------------------------
-- Table structure for ch_product
-- ----------------------------
DROP TABLE IF EXISTS `ch_product`;
CREATE TABLE `ch_product` (
  `pro_id` int(11) NOT NULL AUTO_INCREMENT,
  `pro_title` varchar(255) DEFAULT NULL,
  `pro_type` int(11) DEFAULT NULL COMMENT '0物理产品,1平台产品,2技术服务',
  `pro_body` longtext,
  `pic_main` varchar(255) DEFAULT NULL,
  `is_recom` int(11) DEFAULT NULL COMMENT '0常规 1推荐',
  `add_user` varchar(100) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `is_delete` int(11) DEFAULT NULL,
  PRIMARY KEY (`pro_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of ch_product
-- ----------------------------

-- ----------------------------
-- Table structure for ch_user
-- ----------------------------
DROP TABLE IF EXISTS `ch_user`;
CREATE TABLE `ch_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `type_id` int(11) DEFAULT NULL,
  `real_name` varchar(100) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `add_time` datetime DEFAULT NULL,
  `found_user` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10005 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of ch_user
-- ----------------------------
INSERT INTO `ch_user` VALUES ('10001', 'admin', '123456', '100', '管理员', '18338802018', 'jargles@qq.com', '0', '2019-09-06 16:07:11', '自注册');
INSERT INTO `ch_user` VALUES ('10002', 'cheng', '123456', '99', '程明明', '15565382198', 'chengguniang666@163.com', '1', '2019-09-06 16:10:59', '管理员');
INSERT INTO `ch_user` VALUES ('10003', '张永领', '123456', '99', '张永领', '18237926887', '8888888@qq.com', '0', '2019-09-06 04:21:54', 'cheng');
INSERT INTO `ch_user` VALUES ('10004', '唐聪聪', '123456', '99', '唐聪聪', '18855815888', '8888888@qq.com', '1', '2019-09-06 04:23:33', '程明明');
