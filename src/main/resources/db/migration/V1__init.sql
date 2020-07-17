-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 16, 2020 at 09:43 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.2.31

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `generated`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id` bigint(20) NOT NULL,
  `label` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `category_product`
--

CREATE TABLE `category_product` (
  `id` bigint(20) NOT NULL,
  `category` bigint(20) DEFAULT NULL,
  `product` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `city`
--

CREATE TABLE `city` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `post_code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `city`
--

INSERT INTO `city` (`id`, `name`, `post_code`) VALUES
(3, 'Temara', '1232'),
(12, 'Tanger', NULL),
(18, 'Rabat', '1000'),
(23, 'Nador', NULL),
(29, 'guelmim', NULL),
(33, 'Tetouane', NULL),
(45, 'Geulmim', NULL),
(49, 'Taroudant', NULL),
(54, 'Amzemiz', '10000'),
(56, NULL, NULL),
(58, NULL, NULL),
(62, NULL, NULL),
(64, NULL, NULL),
(68, NULL, NULL),
(70, NULL, NULL),
(74, NULL, NULL),
(76, NULL, NULL),
(80, NULL, NULL),
(82, NULL, NULL),
(86, NULL, NULL),
(88, NULL, NULL),
(93, NULL, NULL),
(95, NULL, NULL),
(99, NULL, NULL),
(101, NULL, NULL),
(105, NULL, NULL),
(107, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone_number` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `city` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`id`, `address`, `email`, `first_name`, `last_name`, `phone_number`, `city`) VALUES
(4, NULL, NULL, 'chafiq', 'lakrad', '212617856765', 3),
(13, NULL, NULL, 'Nabil', 'mouslimi', '212614091472', 12),
(19, NULL, NULL, 'Abderrahim', 'ouardighi', '212662772875', 18),
(24, NULL, NULL, 'Noureddine', 'baz', '212677987769', 23),
(30, NULL, NULL, 'lahoucine', 'labras', '212604994642', 29),
(34, NULL, NULL, 'youssef', 'kamil', '212677199355', 33),
(37, NULL, NULL, 'MOHAMED', 'TAYAR', '212640769187', 33),
(42, NULL, NULL, 'KAMAL', 'IDRISI', '212661394201', 3),
(46, NULL, NULL, 'MOHAMED', 'OUAMALO', '212667748420', 45),
(50, NULL, NULL, 'omar', 'elmerabet', '212677808914', 49);

-- --------------------------------------------------------

--
-- Table structure for table `command`
--

CREATE TABLE `command` (
  `id` bigint(20) NOT NULL,
  `adress` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `day` int(11) NOT NULL,
  `month` int(11) NOT NULL,
  `order_date` date DEFAULT NULL,
  `reference` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `regulation_date` date DEFAULT NULL,
  `remarque` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `total` decimal(19,2) DEFAULT NULL,
  `year` int(11) NOT NULL,
  `admin` bigint(20) DEFAULT NULL,
  `city` bigint(20) DEFAULT NULL,
  `client` bigint(20) DEFAULT NULL,
  `delivery` bigint(20) DEFAULT NULL,
  `delivery_cost` bigint(20) DEFAULT NULL,
  `order_status` bigint(20) DEFAULT NULL,
  `validator` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `command`
--

INSERT INTO `command` (`id`, `adress`, `day`, `month`, `order_date`, `reference`, `regulation_date`, `remarque`, `total`, `year`, `admin`, `city`, `client`, `delivery`, `delivery_cost`, `order_status`, `validator`) VALUES
(151, 'Nador TAOUINA', 9, 7, '2020-07-09', 'LT2831', '2020-07-09', '18/6: MA3AYAT LIH TA7AD', '299.00', 2020, 1, 23, 24, 111, NULL, 1, 112),
(149, '12.RueLarbi Ben Abdallah  Rabat(10H30MIN)', 8, 7, '2020-07-08', 'LT2786', '2020-07-08', NULL, '299.00', 2020, 1, 18, 19, 115, NULL, 13, 112),
(153, 'hay oued edahab rue souk larbiaa imm. aziza12 appr devant imm. chemssit 9', 17, 7, '2020-07-17', 'CX1577', '2020-07-07', NULL, '399.00', 2020, 1, 3, 4, 115, NULL, 12, 112),
(147, 'Branes 2 residence sidi moussa appartement8 etage 1', 7, 7, '2020-07-07', 'LT2570', '2020-07-07', NULL, '299.00', 2020, 1, 12, 13, 111, NULL, 1, 112);

-- --------------------------------------------------------

--
-- Table structure for table `commande_access`
--

CREATE TABLE `commande_access` (
  `id` bigint(20) NOT NULL,
  `command` bigint(20) DEFAULT NULL,
  `validator` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `comment`
--

CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL,
  `date_comment` datetime DEFAULT NULL,
  `message` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `command` bigint(20) DEFAULT NULL,
  `user` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `delivery_cost`
--

CREATE TABLE `delivery_cost` (
  `id` bigint(20) NOT NULL,
  `shipping_cost` decimal(19,2) DEFAULT NULL,
  `city` bigint(20) DEFAULT NULL,
  `delivery` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `delivery_cost`
--

INSERT INTO `delivery_cost` (`id`, `shipping_cost`, `city`, `delivery`) VALUES
(98, NULL, 93, 97),
(110, NULL, 105, 109),
(104, NULL, 99, 103);

-- --------------------------------------------------------

--
-- Table structure for table `delivery_type`
--

CREATE TABLE `delivery_type` (
  `id` bigint(20) NOT NULL,
  `label` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `delivery_type`
--

INSERT INTO `delivery_type` (`id`, `label`) VALUES
(57, NULL),
(63, NULL),
(69, NULL),
(75, NULL),
(81, NULL),
(87, NULL),
(94, NULL),
(100, NULL),
(106, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `operation_stock`
--

CREATE TABLE `operation_stock` (
  `id` bigint(20) NOT NULL,
  `date_operation_stock` date DEFAULT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `qte` decimal(19,2) DEFAULT NULL,
  `qte_after_operation` decimal(19,2) DEFAULT NULL,
  `qte_before_operation` decimal(19,2) DEFAULT NULL,
  `admin` bigint(20) DEFAULT NULL,
  `city` bigint(20) DEFAULT NULL,
  `command` bigint(20) DEFAULT NULL,
  `operation_stock_type` bigint(20) DEFAULT NULL,
  `product` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `operation_stock_type`
--

CREATE TABLE `operation_stock_type` (
  `id` bigint(20) NOT NULL,
  `code` bigint(20) DEFAULT NULL,
  `label` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `order_line`
--

CREATE TABLE `order_line` (
  `id` bigint(20) NOT NULL,
  `price` decimal(19,2) DEFAULT NULL,
  `qte` decimal(19,2) DEFAULT NULL,
  `qte_envoye` decimal(19,2) DEFAULT NULL,
  `qte_livre` decimal(19,2) DEFAULT NULL,
  `command` bigint(20) DEFAULT NULL,
  `product` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `order_line`
--

INSERT INTO `order_line` (`id`, `price`, `qte`, `qte_envoye`, `qte_livre`, `command`, `product`) VALUES
(154, '399.00', '1.00', NULL, NULL, 153, 9),
(152, '299.00', '1.00', NULL, NULL, 151, 27),
(150, '299.00', '1.00', NULL, NULL, 149, 16),
(148, '299.00', '1.00', NULL, NULL, 147, 16);

-- --------------------------------------------------------

--
-- Table structure for table `order_status`
--

CREATE TABLE `order_status` (
  `id` bigint(20) NOT NULL,
  `code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `color` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `label` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `super_order_status` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `order_status`
--

INSERT INTO `order_status` (`id`, `code`, `color`, `label`, `super_order_status`) VALUES
(6, 'confirmed', 'badge-dark', 'Confirmé', 2),
(5, 'canceled', 'badge-success', 'Annulé', 1),
(4, 'horsZone', 'badge-dark', 'HORS-ZONE', 1),
(3, 'interested ', 'badge-success', 'clt intéresse', 1),
(1, 'new', 'badge-success', 'NEW ', 1),
(2, 'noReponse', 'badge-dark', 'Pas.Reponse', 1),
(7, 'processed', 'badge-success', 'En Cours', 3),
(8, 'noReponse', 'badge-dark', 'Pas.Reponse', 3),
(9, 'exp', 'badge-success', 'EXPÉDITION', 3),
(10, 'horeZone', 'badge-dark', 'HORS-ZONE', 3),
(11, 'sendCanceled', 'badge-success', '(env)Annulé', 4),
(12, 'delivered', 'badge-dark', 'Livré', 4),
(13, 'paid', 'badge-success', 'Payé', 4);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` bigint(20) NOT NULL,
  `color` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `label` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` decimal(19,2) DEFAULT NULL,
  `reference` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `size` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `weight` decimal(19,2) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `color`, `label`, `price`, `reference`, `size`, `weight`) VALUES
(9, NULL, 'LG Q6', NULL, NULL, NULL, NULL),
(16, NULL, 'Pare-Brise Pare-Soleil', NULL, NULL, NULL, NULL),
(27, NULL, 'Samsung Galaxy s10', NULL, NULL, NULL, NULL),
(39, NULL, 'FRESHPACK-PRO', NULL, NULL, NULL, NULL),
(92, NULL, 'pc', '120000.00', 'pc dell', '15', '10.00');

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `authority` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`id`, `authority`) VALUES
(3, 'Delivery'),
(2, 'Validator'),
(1, 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `id` bigint(20) NOT NULL,
  `qte_envoye` decimal(19,2) DEFAULT NULL,
  `qte_livre` decimal(19,2) DEFAULT NULL,
  `qte_restante` decimal(19,2) DEFAULT NULL,
  `admin` bigint(20) DEFAULT NULL,
  `city` bigint(20) DEFAULT NULL,
  `product` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `super_order_status`
--

CREATE TABLE `super_order_status` (
  `id` bigint(20) NOT NULL,
  `code` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `color` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `label` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `super_order_status`
--

INSERT INTO `super_order_status` (`id`, `code`, `color`, `label`) VALUES
(1, 'notConfirmed', NULL, 'Pas Confirmé'),
(2, 'confirmed', NULL, 'Confirmé'),
(3, 'processed ', NULL, 'En Cours'),
(4, 'delivered', NULL, 'Livré');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `created` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `authority` bigint(20) DEFAULT NULL,
  `city` bigint(20) DEFAULT NULL,
  `delivery_type` bigint(20) DEFAULT NULL,
  `super_admin` bigint(20) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `enabled_new_command` bit(1) DEFAULT NULL,
  `firstt_name` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `code`, `created`, `email`, `enabled`, `first_name`, `last_name`, `phone_number`, `authority`, `city`, `delivery_type`, `super_admin`, `password`, `enabled_new_command`, `firstt_name`) VALUES
(3, 'delivery1', '2020-05-01', 'delivery@gmail.com', b'1', 'deliveryFirst', 'amana', '035224354', 3, NULL, NULL, 1, '$2a$10$O9fj1nblleh9yyotW.J68eJOmqPJMA0jZJuW9J3VefpPygPkrJFd.', NULL, 'service'),
(2, 'validator1', '2020-06-11', 'validator@gmail.com', b'1', 'validatorFirst', 'younes', '021564445', 2, NULL, NULL, 1, '$2a$10$zVjSow8Ypikn5V5yG4YWtOwUMlBvYU3JbS.pa8fYL5ezFhBHawhFe', b'0', NULL),
(1, 'admin1', '2020-06-04', 'admin@gmail.com', b'1', 'adminFirst', 'adminLast', '0212542', 1, NULL, NULL, 1, '$2a$10$54McHJIlxPGxOR.UYEW7iekDb/0eW0xrcK6oLhn8.Lo0mElkwf8hi', NULL, NULL),
(4, 'admin2', '2020-05-06', 'admin2@gmail.com', b'1', 'aa', 'zz', '024245563', 1, NULL, NULL, 1, '$2a$10$54McHJIlxPGxOR.UYEW7iekDb/0eW0xrcK6oLhn8.Lo0mElkwf8hi', NULL, NULL),
(111, 'DHL', '2020-07-16', NULL, NULL, NULL, NULL, NULL, 3, NULL, NULL, NULL, NULL, NULL, NULL),
(112, NULL, '2020-07-16', NULL, NULL, NULL, 'ABRA', NULL, 2, NULL, NULL, NULL, NULL, NULL, 'Younes'),
(115, 'Amana', '2020-07-16', NULL, NULL, NULL, NULL, NULL, 3, NULL, NULL, NULL, NULL, NULL, NULL),
(123, 'FastBox', '2020-07-16', NULL, NULL, NULL, NULL, NULL, 3, NULL, NULL, NULL, NULL, NULL, NULL),
(127, NULL, '2020-07-16', NULL, NULL, NULL, 'ABRA', NULL, 2, NULL, NULL, NULL, NULL, NULL, 'Younes\"');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `category_product`
--
ALTER TABLE `category_product`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3vidvmo4dm428sja3d6ucjlr6` (`category`),
  ADD KEY `FK2kprsishy69iw1bw262itfi06` (`product`);

--
-- Indexes for table `city`
--
ALTER TABLE `city`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3muajrdo22hvnvirpb7x3ap9b` (`city`);

--
-- Indexes for table `command`
--
ALTER TABLE `command`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKo3vpa7f6vvtj5cubb021pbjec` (`admin`),
  ADD KEY `FK66q035m1kido7n7i7hnbm5w1j` (`city`),
  ADD KEY `FKn5hrlyqk9jn6b2gws2criryxt` (`client`),
  ADD KEY `FKhi7maaoxn52098rn4il8bcslc` (`delivery`),
  ADD KEY `FK7xeupor0snmob32wh69hn2vlx` (`delivery_cost`),
  ADD KEY `FKsdr1o28qaohbaox4785k2psbo` (`order_status`),
  ADD KEY `FKc0ws5o11m87k58gu457lgtq5o` (`validator`);

--
-- Indexes for table `commande_access`
--
ALTER TABLE `commande_access`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK9r78mncvxwqtwy1wvw4nuw7l6` (`command`),
  ADD KEY `FKth1tdl8ne36tqvtc8egm5u7x7` (`validator`);

--
-- Indexes for table `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKr55hngm2ta2cx7p2dq00ru8f0` (`command`),
  ADD KEY `FKlxlm2octv83r6g7kkfxc9iwbi` (`user`);

--
-- Indexes for table `delivery_cost`
--
ALTER TABLE `delivery_cost`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKmq66obj80e9xqb9bnm20qanpj` (`city`),
  ADD KEY `FK3e67j1opr4f7b3p5xwj9jf1hk` (`delivery`);

--
-- Indexes for table `delivery_type`
--
ALTER TABLE `delivery_type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `operation_stock`
--
ALTER TABLE `operation_stock`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKi7se6gkxyxqtbcwd7m222wvw0` (`admin`),
  ADD KEY `FK2blnkr81kgcb90b523hnw5dsx` (`city`),
  ADD KEY `FKcel9rwyd8kibi7wwapg6w1lqs` (`command`),
  ADD KEY `FK9ox0pr2we7llhdn7vb857y9e5` (`operation_stock_type`),
  ADD KEY `FK913fmec1os2vc9sld7tyap740` (`product`);

--
-- Indexes for table `operation_stock_type`
--
ALTER TABLE `operation_stock_type`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `order_line`
--
ALTER TABLE `order_line`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK7j35h1jer9ukjnaei8fh000gn` (`command`),
  ADD KEY `FK863a744knr50mljrji0krsko` (`product`);

--
-- Indexes for table `order_status`
--
ALTER TABLE `order_status`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKq8hj2fgp9vh3iobldra8ma5ln` (`super_order_status`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKm0x7o4m89xg11obx2r35te6bx` (`admin`),
  ADD KEY `FKbt1x7f2l0ffqbqr6lcvdjyjj9` (`city`),
  ADD KEY `FK2qw3dn28c2ycrur4qc7tm8u2u` (`product`);

--
-- Indexes for table `super_order_status`
--
ALTER TABLE `super_order_status`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK9sygk50fpevfts5boo80e1xas` (`authority`),
  ADD KEY `FKeal5g2o4amn2om6d2t00o9nqb` (`city`),
  ADD KEY `FK2ebgghw7yhg7ougf2ouywq69a` (`delivery_type`),
  ADD KEY `FKjjmn9ifcp4sxxya3s18bf5ffy` (`super_admin`);
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
