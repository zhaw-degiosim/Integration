ALTER TABLE `role`
	ADD COLUMN `description` VARCHAR(100) NULL AFTER `update_date_time`;
	
UPDATE `role` SET `description`='Administrator' WHERE  `name` = 'ROLE_ADMIN';

INSERT INTO `role` (`create_date_time`, `name`, `update_date_time`, `description`) VALUES ('2019-04-08 15:13:28.000000', 'ROLE_PROJECT_LEADER', '2019-04-08 15:13:10.000000', 'Projektleiter');
