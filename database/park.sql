/*
Navicat MySQL Data Transfer

Source Server         : keshe
Source Server Version : 50173
Source Host           : localhost:3306
Source Database       : park

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2018-12-26 16:54:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for history
-- ----------------------------
DROP TABLE IF EXISTS `history`;
CREATE TABLE `history` (
  `code` int(11) NOT NULL,
  `carId` int(11) DEFAULT NULL,
  `startTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  `spend` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of history
-- ----------------------------
INSERT INTO `history` VALUES ('218004', '17', '2018-06-27 02:14:50', '2018-06-27 12:12:55', '91.8');
INSERT INTO `history` VALUES ('231581', '13', '2018-06-27 02:11:29', '2018-06-27 12:14:48', '102');
INSERT INTO `history` VALUES ('416298', '1', '2018-06-27 02:22:42', '2018-06-29 16:59:37', '155');
INSERT INTO `history` VALUES ('473560', '14', '2018-06-27 02:12:29', '2018-07-08 23:52:14', '712.5');
INSERT INTO `history` VALUES ('747812', '213123', '2018-06-27 11:55:59', '2018-07-09 00:03:47', '690');
INSERT INTO `history` VALUES ('224303', '15', '2018-06-27 02:12:38', '2018-07-09 08:20:34', '735');
INSERT INTO `history` VALUES ('905332', '18', '2018-06-27 02:15:23', '2018-07-09 08:33:32', '735');
INSERT INTO `history` VALUES ('132898', '213', '2018-06-27 11:55:54', '2018-07-09 08:55:56', '712.5');
INSERT INTO `history` VALUES ('640287', '213123', '2018-06-27 11:56:01', '2018-07-09 08:56:20', '712.5');

-- ----------------------------
-- Table structure for parking
-- ----------------------------
DROP TABLE IF EXISTS `parking`;
CREATE TABLE `parking` (
  `code` varchar(255) NOT NULL,
  `id` int(11) NOT NULL,
  `carId` int(11) DEFAULT NULL,
  `startTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of parking
-- ----------------------------
INSERT INTO `parking` VALUES ('953340', '1', '19', '2018-06-27 02:15:45', '2018-06-27 02:15:45');
INSERT INTO `parking` VALUES ('199697', '2', '20', '2018-06-27 02:15:55', '2018-06-27 02:15:55');
INSERT INTO `parking` VALUES ('880226', '3', '213123', '2018-06-27 11:56:03', '2018-06-27 11:56:03');
INSERT INTO `parking` VALUES ('362833', '4', '213123', '2018-06-27 11:56:05', '2018-06-27 11:56:05');
INSERT INTO `parking` VALUES ('383091', '5', '213123', '2018-06-27 11:56:07', '2018-06-27 11:56:07');
INSERT INTO `parking` VALUES ('441563', '6', '213123', '2018-06-27 11:56:10', '2018-06-27 11:56:10');
INSERT INTO `parking` VALUES ('709724', '7', '213123', '2018-06-27 11:56:11', '2018-06-27 11:56:11');
INSERT INTO `parking` VALUES ('483069', '8', '213123', '2018-06-27 11:56:14', '2018-06-27 11:56:14');
INSERT INTO `parking` VALUES ('513724', '9', '213123', '2018-06-27 11:56:16', '2018-06-27 11:56:16');
INSERT INTO `parking` VALUES ('321429', '10', '213123', '2018-06-27 11:56:18', '2018-06-27 11:56:18');
INSERT INTO `parking` VALUES ('797430', '11', '213123', '2018-06-27 11:56:20', '2018-06-27 11:56:20');
INSERT INTO `parking` VALUES ('715267', '12', '213123', '2018-06-27 12:12:55', '2018-06-27 12:12:55');
INSERT INTO `parking` VALUES ('994304', '13', '213123', '2018-06-27 12:14:48', '2018-06-27 12:14:48');
INSERT INTO `parking` VALUES ('665943', '14', '1213', '2018-06-29 16:59:37', '2018-06-29 16:59:37');
INSERT INTO `parking` VALUES ('979560', '15', '213123', '2018-07-08 23:52:47', '2018-07-08 23:52:47');
INSERT INTO `parking` VALUES ('918585', '16', '123213213', '2018-07-09 08:53:56', '2018-07-09 08:53:56');
INSERT INTO `parking` VALUES ('607441', '17', '12321', '2018-07-09 08:54:21', '2018-07-09 08:54:21');
INSERT INTO `parking` VALUES ('192614', '18', '213213', '2018-07-09 08:55:16', '2018-07-09 08:55:16');
INSERT INTO `parking` VALUES ('232473', '19', '21321344', '2018-07-09 08:55:56', '2018-07-09 08:55:56');

-- ----------------------------
-- Table structure for shezhi
-- ----------------------------
DROP TABLE IF EXISTS `shezhi`;
CREATE TABLE `shezhi` (
  `id` int(11) NOT NULL,
  `pass` varchar(30) DEFAULT NULL,
  `maxP` int(11) DEFAULT NULL,
  `maxW` int(11) DEFAULT NULL,
  `nowP` int(11) DEFAULT NULL,
  `nowW` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of shezhi
-- ----------------------------
INSERT INTO `shezhi` VALUES ('1', '123', '20', '10', '19', '0', '2.5');

-- ----------------------------
-- Table structure for wait
-- ----------------------------
DROP TABLE IF EXISTS `wait`;
CREATE TABLE `wait` (
  `id` int(11) NOT NULL,
  `code` varchar(20) DEFAULT NULL,
  `carId` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of wait
-- ----------------------------
