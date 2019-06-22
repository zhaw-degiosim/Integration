CREATE TABLE `projects` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(100) NOT NULL,
	`description` VARCHAR(500) NULL,
	`start_date` DATE NOT NULL,
	`end_date` DATE NOT NULL,
	`created_date_time` DATETIME NOT NULL,
	PRIMARY KEY (`id`)
)
COLLATE='utf8_bin'
;

ALTER TABLE `projects`
	ADD COLUMN `update_date_time` DATETIME NOT NULL AFTER `created_date_time`,
	ADD COLUMN `leader_id` BIGINT NULL AFTER `update_date_time`,
	ADD CONSTRAINT `FK_projects_user` FOREIGN KEY (`leader_id`) REFERENCES `user` (`id`);
