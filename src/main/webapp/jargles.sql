/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : jargles

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-09-19 17:40:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ja_user
-- ----------------------------
DROP TABLE IF EXISTS `ja_user`;
CREATE TABLE `ja_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `jargles_id` int(11) DEFAULT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `real_name` varchar(100) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `qq_num` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of ja_user
-- ----------------------------
INSERT INTO `ja_user` VALUES ('1', '10001', 'Jargles', 'Lss2014', '李松松', '0', '19', '1994-08-27', '18338802018', '8137210');
INSERT INTO `ja_user` VALUES ('2', '10002', 'gao', 'Lss2014', '高', '1', '29', '2000-02-08', '18513070070', '2083864209');
INSERT INTO `ja_user` VALUES ('4', '10003', 'cheng', 'lss2014', '程明明', null, '66', null, null, null);
