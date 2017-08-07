create table `user`(
`id` int(11) not null auto_increment,
`name` varchar(20) default null,
`age` int(5) default null,
`sex` varchar(10) default null,
primary key (`id`)
)engine=InnoDB default charset=utf8;