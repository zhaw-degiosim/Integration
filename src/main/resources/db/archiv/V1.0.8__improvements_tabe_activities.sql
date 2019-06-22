ALTER TABLE `activities`
	CHANGE COLUMN `name` `name` VARCHAR(100) NOT NULL COLLATE 'utf8_bin' AFTER `id`,
	ADD COLUMN `description` VARCHAR(500) NULL AFTER `name`,
	ADD COLUMN `time` INT(2) NOT NULL AFTER `description`;