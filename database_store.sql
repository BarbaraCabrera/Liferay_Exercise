drop database if exists `database_store`;
create database database_store;
use database_store;
drop table if exists items;
create table `items`(
	`id` int unsigned not null primary key auto_increment,
	`name` VARCHAR(50),
	`price` DECIMAL(6,2),
    `category` varchar(50),
	`imported` boolean,
    `quantity` int(11) unsigned not null
    );	
describe items;