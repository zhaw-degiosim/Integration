INSERT INTO `role` (`id`, `create_date_time`, `name`, `update_date_time`) VALUES
	(1, '2019-04-02 07:57:00.000000', 'ROLE_ADMIN', '2019-04-02 07:57:03.000000');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;

INSERT INTO `user` (`id`, `create_date_time`, `first_name`, `last_name`, `mail`, `password`, `salutation`, `update_date_time`) VALUES
	(1, '2019-04-02 07:56:29.000000', 'Admin', 'Admin', 'admin@tagcloud.ch', '$2a$10$TBoYn9sw197j8U1V9zCfMOjTXkq.eGnLWnoW.S.FKlYLGZiI1t0Pa', 'Herr', '2019-04-02 07:56:29.000000');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

INSERT INTO `user_roles` (`users_id`, `roles_id`) VALUES
	(1, 1);
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;

INSERT INTO `user` (`create_date_time`, `first_name`, `last_name`, `mail`, `password`, `salutation`, `update_date_time`) VALUES ('2019-04-03 12:01:43.119000', 'Test', 'Test', 'test@tagcloud.ch', '$2a$10$wYToCG3ltwsxtMjGnexQPO3FO56uxncB3k2GBgXoq/9ck/CwrY992', 'Herr', '2019-04-03 12:01:43.121000');

