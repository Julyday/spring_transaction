-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(12) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `money` int(16) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', 'julyday', '100000');
INSERT INTO `account` VALUES ('2', 'zhangsan', '100000');
INSERT INTO `account` VALUES ('3', 'lisi', '100000');