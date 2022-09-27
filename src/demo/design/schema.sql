CREATE TABLE `campaigns` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`description` VARCHAR(200) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`From` DATETIME NULL DEFAULT NULL,
	`name` VARCHAR(200) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`pictureUri` VARCHAR(200) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`to` DATETIME NULL DEFAULT NULL,
	`detailsUri` VARCHAR(200) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`pictureName` VARCHAR(200) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	PRIMARY KEY (`id`) USING BTREE
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=23
;

INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (1, 'campaign description 1', '2021-05-27 05:01:43', 'python book', '/images/banner1.png', '2021-06-03 05:01:43', 'python book details', 'banner1.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (2, 'campaign description 2', '2021-05-20 05:01:43', 'python book 2 part', '/images/banner2.png', '2021-06-10 05:01:43', 'python book details 2', 'banner2.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (3, 'campaign description 3', '2021-05-13 05:01:43', 'python book 3 part', '/images/banner3.png', '2021-06-17 05:01:43', 'python book details 3', 'banner3.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (4, 'campaign description 4', '2021-05-06 05:01:43', 'python book 4 part', '/images/banner4.png', '2021-06-24 05:01:43', 'python book details 4', 'banner4.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (5, 'campaign description 5', '2021-04-29 05:01:43', 'python book 5 part', '/images/banner5.png', '2021-07-01 05:01:43', 'python book details 5', 'banner5.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (6, 'campaign description 6', '2021-04-22 05:01:43', 'python book 6 part', '/images/banner6.png', '2021-07-08 05:01:43', 'python book details 6', 'banner6.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (7, 'campaign description 7', '2021-04-15 05:01:43', 'python book 7 part', '/images/banner7.png', '2021-07-15 05:01:43', 'python book details 7', 'banner7.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (8, 'campaign description 8', '2021-04-08 05:01:43', 'python book 8 part', '/images/banner1.png', '2021-07-22 05:01:43', 'python book details 8', 'banner1.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (9, 'campaign description 9', '2021-04-01 05:01:43', 'python book 9 part', '/images/banner2.png', '2021-07-29 05:01:43', 'python book details 9', 'banner2.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (10, 'campaign description 10', '2021-03-25 05:01:43', 'python book 10 part', '/images/banner3.png', '2021-08-05 05:01:43', 'python book details 10', 'banner3.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (11, 'campaign description 11', '2021-03-18 05:01:43', 'python book 11 part', '/images/banner4.png', '2021-08-12 05:01:43', 'python book details 11', 'banner4.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (12, 'campaign description 12', '2021-03-11 05:01:43', 'python book 12 part', '/images/banner5.png', '2021-08-19 05:01:43', 'python book details 12', 'banner5.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (13, 'campaign description 13', '2021-03-04 05:01:43', 'python book 13 part', '/images/banner6.png', '2021-08-26 05:01:43', 'python book details 13', 'banner6.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (14, 'campaign description 14', '2021-02-25 05:01:43', 'python book 14 part', '/images/banner7.png', '2021-09-02 05:01:43', 'python book details 14', 'banner7.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (15, 'campaign description 15', '2021-02-18 05:01:43', 'python book 15 part', '/images/banner1.png', '2021-09-09 05:01:43', 'python book details 15', 'banner1.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (16, 'campaign description 10', '2021-02-11 05:01:43', 'python book 16 part', '/images/banner2.png', '2021-09-16 05:01:43', 'python book details 16', 'banner2.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (17, 'campaign description 17', '2021-02-04 05:01:43', 'python book 17 part', '/images/banner3.png', '2021-09-23 05:01:43', 'python book details 17', 'banner3.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (18, 'campaign description 18', '2021-01-28 05:01:43', 'python book 18 part', '/images/banner4.png', '2021-09-30 05:01:43', 'python book details 18', 'banner4.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (19, 'campaign description 19', '2021-01-21 05:01:43', 'python book 19 part', '/images/banner5.png', '2021-10-07 05:01:43', 'python book details 19', 'banner5.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (20, 'campaign description 20', '2021-01-14 05:01:43', 'python book 20 part', '/images/banner6.png', '2021-10-14 05:01:43', 'python book details 20', 'banner6.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (21, 'campaign description 21', '2021-01-07 05:01:43', 'python book 21 part', '/images/banner7.png', '2021-10-21 05:01:43', 'python book details 21', 'banner7.png');
INSERT INTO `campaigns` (`id`, `description`, `From`, `name`, `pictureUri`, `to`, `detailsUri`, `pictureName`) VALUES (22, 'campaign description 22', '2020-12-31 05:01:43', 'python book 22 part', '/images/banner1.png', '2021-10-28 05:01:43', 'python book details 22', 'banner1.png');


CREATE TABLE `rules` (
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`campaignId` INT(11) NULL DEFAULT NULL,
	`description` VARCHAR(200) NULL DEFAULT NULL COLLATE 'utf8_general_ci',
	`ruletypeid` INT(11) NULL DEFAULT NULL,
	`locationId` INT(11) NULL DEFAULT NULL,
	PRIMARY KEY (`id`) USING BTREE,
	INDEX `fk_element_campaignId` (`campaignId`) USING BTREE,
	CONSTRAINT `fk_element_campaignId` FOREIGN KEY (`campaignId`) REFERENCES `MarketingDb`.`campaigns` (`id`) ON UPDATE RESTRICT ON DELETE RESTRICT
)
COLLATE='utf8_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=23
;

INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (1, 1, 'This campaign for location 1', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (2, 2, 'This campaign for location 2', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (3, 3, 'This campaign for location 3', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (4, 4, 'This campaign for location 4', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (5, 5, 'This campaign for location 5', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (6, 6, 'This campaign for location 6', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (7, 7, 'This campaign for location 7', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (8, 8, 'This campaign for location 8', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (9, 9, 'This campaign for location 9', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (10, 10, 'This campaign for location 10', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (11, 11, 'This campaign for location 11', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (12, 12, 'This campaign for location 12', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (13, 13, 'This campaign for location 13', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (14, 14, 'This campaign for location 14', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (15, 15, 'This campaign for location 15', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (16, 16, 'This campaign for location 16', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (17, 17, 'This campaign for location 17', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (18, 18, 'This campaign for location 18', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (19, 19, 'This campaign for location 19', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (20, 20, 'This campaign for location 20', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (21, 21, 'This campaign for location 21', 3, 3);
INSERT INTO `rules` (`id`, `campaignId`, `description`, `ruletypeid`, `locationId`) VALUES (22, 22, 'This campaign for location 22', 3, 3);


