/*
Navicat MySQL Data Transfer

Source Server         : php
Source Server Version : 50547
Source Host           : localhost:3306
Source Database       : db_douban_movie

Target Server Type    : MYSQL
Target Server Version : 50547
File Encoding         : 65001

Date: 2017-05-19 08:31:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for movie
-- ----------------------------
DROP TABLE IF EXISTS `movie`;
CREATE TABLE `movie` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `title` varchar(120) DEFAULT NULL,
  `rate` double(20,1) DEFAULT NULL COMMENT '电影评分',
  `releaseyear` varchar(30) DEFAULT NULL COMMENT '发行时间',
  `sendtime` varchar(30) DEFAULT NULL COMMENT '上映时间',
  `daoyan` varchar(12) DEFAULT NULL,
  `kan` varchar(200) DEFAULT NULL COMMENT '在线观看',
  `jianjie` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of movie
-- ----------------------------
INSERT INTO `movie` VALUES ('1', '大话西游', '2.0', '2015/5/5', '2016/05/05', 'xx', '123', null);
INSERT INTO `movie` VALUES ('2', '大话西游', '5.7', null, null, null, null, null);
INSERT INTO `movie` VALUES ('3', '大话西游', '3.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('4', '大话西游', '6.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('5', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('6', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('7', '大话西游', '6.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('8', '大话西游', '5.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('9', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('10', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('11', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('12', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('13', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('14', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('15', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('16', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('17', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('18', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('19', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('20', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('21', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('22', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('23', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('24', '大话西游', '1.0', null, null, null, null, null);
INSERT INTO `movie` VALUES ('25', '大话西游', '1.0', null, null, null, null, null);
