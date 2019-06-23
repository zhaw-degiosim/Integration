/* Alte Flyway Tabelle löschen falls noch vorhanden */

DROP TABLE IF EXISTS `flyway_schema_history`;

/* Systemuser erstellen */

INSERT INTO `role` (`id`, `create_date_time`, `name`, `update_date_time`) VALUES (1, '2019-04-02 07:57:00.000000', 'ROLE_ADMIN', '2019-04-02 07:57:03.000000');
INSERT INTO `user` (`id`, `create_date_time`, `first_name`, `last_name`, `mail`, `password`, `salutation`, `update_date_time`) VALUES (1, '2019-04-02 07:56:29.000000', 'Admin', 'Admin', 'admin@tagcloud.ch', '$2a$10$TBoYn9sw197j8U1V9zCfMOjTXkq.eGnLWnoW.S.FKlYLGZiI1t0Pa', 'Herr', '2019-04-02 07:56:29.000000');
INSERT INTO `user_roles` (`users_id`, `roles_id`) VALUES (1, 1);
INSERT INTO `user` (`create_date_time`, `first_name`, `last_name`, `mail`, `password`, `salutation`, `update_date_time`) VALUES ('2019-04-03 12:01:43.119000', 'Test', 'Test', 'test@tagcloud.ch', '$2a$10$wYToCG3ltwsxtMjGnexQPO3FO56uxncB3k2GBgXoq/9ck/CwrY992', 'Herr', '2019-04-03 12:01:43.121000');

/* Testprojekte erstellen */

INSERT INTO `tagcloud`.`projects` (`create_date_time`, `description`, `end_date`, `name`, `start_date`, `update_date_time`, `leader_id`) VALUES ('2019-06-22 16:22:57.000000', 'Initiales Tesprojekt - zum testen', '2029-06-22', 'Initiales Testprojekt', '2019-06-22', '2019-06-22 16:23:18.000000', '1');
INSERT INTO `tagcloud`.`projects` (`create_date_time`, `description`, `end_date`, `name`, `start_date`, `update_date_time`, `leader_id`) VALUES ('2019-06-23 16:52:33.000000', 'Zweites Testproject', '2029-06-23', 'Zweites Testprojekt', '2019-06-23', '2019-06-23 16:53:14.000000', '2');
UPDATE `tagcloud`.`projects` SET `employee1`='Hans Muster', `employee2`='Peter Muster' WHERE  `id`=1;
UPDATE `tagcloud`.`projects` SET `employee1`='Ina Muster', `employee2`='Heidi Muster' WHERE  `id`=2;

INSERT INTO `tagcloud`.`activities` (`create_date_time`, `description`, `name`, `time_planed`, `time_used`, `update_date_time`) VALUES ('2019-06-23 22:22:52.000000', 'Aktivität 1', 'Aktivität1', '2', '1', '2019-06-23 22:23:15.000000');
INSERT INTO `tagcloud`.`activities` (`id`, `create_date_time`, `description`, `name`, `time_planed`, `time_used`, `update_date_time`) VALUES ('2', '2019-06-23 22:23:31.000000', 'Aktivität 2', 'Aktivität2', '3', '2', '2019-06-23 22:23:52.000000');

