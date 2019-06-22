ALTER TABLE `activities`
	CHANGE COLUMN `time` `time_planed` INT(2) NOT NULL AFTER `description`,
	ADD COLUMN `time_used` INT(2) NOT NULL AFTER `time_planed`;
	
ALTER TABLE `activities`
	CHANGE COLUMN `time_used` `time_used` INT(2) NULL AFTER `time_planed`,
	ADD COLUMN `user_id` BIGINT NULL DEFAULT NULL AFTER `update_date`,
	ADD CONSTRAINT `FK_activities_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);

	