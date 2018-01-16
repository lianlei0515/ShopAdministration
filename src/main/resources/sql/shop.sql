# Host: localhost  (Version 5.7.17-log)
# Date: 2018-01-16 11:22:25
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "ty_user"
#

DROP TABLE IF EXISTS `ty_user`;
CREATE TABLE `ty_user` (
  `id` varchar(50) NOT NULL DEFAULT '' COMMENT 'id',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名称',
  `user_sex` int(3) NOT NULL DEFAULT '0' COMMENT '用户性别，0：男；1：女',
  `user_age` int(11) NOT NULL DEFAULT '0' COMMENT '用户年龄',
  `user_tel` varchar(255) NOT NULL DEFAULT '' COMMENT '用户手机号',
  `user_birthday` datetime NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '用户生日',
  `user_state` varchar(3) NOT NULL DEFAULT '1' COMMENT '用户状态0：不正常，1：正常',
  `create_id` varchar(50) DEFAULT NULL COMMENT '创建人id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_id` varchar(50) DEFAULT NULL COMMENT '修改人id',
  `update_time` datetime DEFAULT NULL COMMENT '修改时间',
  `delete_state` tinyint(2) NOT NULL DEFAULT '1' COMMENT '是否删除1：未删除，0：删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

#
# Data for table "ty_user"
#

