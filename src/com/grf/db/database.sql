/*
 Navicat Premium Data Transfer

 Source Server         : @mysql
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : java_phonebook

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 28/02/2022 18:50:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person`  (
                           `id` int NOT NULL AUTO_INCREMENT,
                           `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                           `number` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
                           `userId` int NOT NULL,
                           PRIMARY KEY (`id`) USING BTREE,
                           INDEX `fk_userId`(`userId`) USING BTREE,
                           CONSTRAINT `fk_userId` FOREIGN KEY (`userId`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 96 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES (89, 'ali', '09129000343', 1);
INSERT INTO `person` VALUES (92, 'test', '23424324432', 2);
INSERT INTO `person` VALUES (93, 'ali', '34343', 3);
INSERT INTO `person` VALUES (94, 'test create updated', '13222323', 4);
INSERT INTO `person` VALUES (96, 'hasan', '091299999', 1);
INSERT INTO `person` VALUES (97, 'bbb', '1111', 1);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
                         `id` int NOT NULL AUTO_INCREMENT,
                         `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                         `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
                         PRIMARY KEY (`id`) USING BTREE,
                         UNIQUE INDEX `username_unique`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'fadakar', '81dc9bdb52d04dc20036dbd8313ed055');
INSERT INTO `user` VALUES (2, 'reza', '81dc9bdb52d04dc20036dbd8313ed055');
INSERT INTO `user` VALUES (3, 'amir', '81dc9bdb52d04dc20036dbd8313ed055');
INSERT INTO `user` VALUES (4, 'saeed', '81dc9bdb52d04dc20036dbd8313ed055');

SET FOREIGN_KEY_CHECKS = 1;
