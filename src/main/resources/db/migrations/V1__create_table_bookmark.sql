CREATE TABLE IF NOT EXISTS `bookmark` (

    `id` varchar(36) PRIMARY KEY,
    `name` varchar(50),
    `url` varchar(50),
    `create_datetime` timestamp

);
