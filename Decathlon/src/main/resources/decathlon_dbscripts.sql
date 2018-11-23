create database decathlon;


CREATE TABLE `product` (
  `product_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_description` varchar(255) DEFAULT NULL,
  `product_level` varchar(255) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `product_sport` varchar(255) DEFAULT NULL,
  `associated_stores` int(11) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `FKe8jslsmxevjd3lk2x4x7td3b8` (`associated_stores`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1


CREATE TABLE `store` (
  `store_id` int(11) NOT NULL AUTO_INCREMENT,
  `store_description` varchar(255) DEFAULT NULL,
  `store_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`store_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1


