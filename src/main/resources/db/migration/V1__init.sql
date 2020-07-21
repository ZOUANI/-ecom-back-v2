-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
Hôte : 127.0.0.1
-- Généré le : ven. 17 juil. 2020 à 22:43
-- Version du serveur :  10.4.13-MariaDB
-- Version de PHP : 7.2.31

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `generated`
--

-- --------------------------------------------------------

--
-- Structure de la table `category`
--

CREATE TABLE `category` (
  `id` bigint(20) NOT NULL,
  `label` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `category`
--

INSERT INTO `category` (`id`, `label`) VALUES
(1, 'phone');

-- --------------------------------------------------------

--
-- Structure de la table `category_product`
--

CREATE TABLE `category_product` (
  `id` bigint(20) NOT NULL,
  `category` bigint(20) DEFAULT NULL,
  `product` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `category_product`
--

INSERT INTO `category_product` (`id`, `category`, `product`) VALUES
(1, 1, 1);

-- --------------------------------------------------------

--
-- Structure de la table `city`
--

CREATE TABLE `city` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `post_code` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `city`
--

INSERT INTO `city` (`id`, `name`, `post_code`) VALUES
(1, 'marrakech', '14'),
(2, 'casa', '54'),
(62, 'Temara', NULL),
(67, 'Tanger', NULL),
(70, 'Rabat', NULL),
(73, 'Nador', NULL),
(76, 'guelmim', NULL),
(79, 'Tetouane', NULL),
(87, 'Geulmim', NULL),
(90, 'Taroudant', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE `client` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL,
  `city` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id`, `address`, `email`, `first_name`, `last_name`, `phone_number`, `city`) VALUES
(324, NULL, NULL, 'omar', 'elmerabet', '0677808914', 90),
(321, NULL, NULL, 'MOHAMED', 'OUAMALO', '0667748420', 87),
(318, NULL, NULL, 'KAMAL', 'IDRISI', '0661394201', 62),
(313, NULL, NULL, 'MOHAMED', 'TAYAR', '0640769187', 79),
(310, NULL, NULL, 'youssef', 'kamil', '0677199355', 79),
(307, NULL, NULL, 'lahoucine', 'labras', '0604994642', 76),
(303, NULL, NULL, 'Noureddine', 'baz', '0677987769', 73),
(300, NULL, NULL, 'Abderrahim', 'ouardighi', '0662772875', 70),
(296, NULL, NULL, 'Nabil', 'mouslimi', '0614091472', 67),
(290, NULL, NULL, 'chafiq', 'lakrad', '0617856765', 62);

-- --------------------------------------------------------

--
-- Structure de la table `command`
--

CREATE TABLE `command` (
  `id` bigint(20) NOT NULL,
  `address` varchar(255) DEFAULT NULL,
  `day` int(11) NOT NULL,
  `month` int(11) NOT NULL,
  `order_date` date DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `regulation_date` date DEFAULT NULL,
  `remarque` varchar(255) DEFAULT NULL,
  `total` decimal(19,2) DEFAULT NULL,
  `year` int(11) NOT NULL,
  `admin` bigint(20) DEFAULT NULL,
  `city` bigint(20) DEFAULT NULL,
  `client` bigint(20) DEFAULT NULL,
  `delivery` bigint(20) DEFAULT NULL,
  `order_status` bigint(20) DEFAULT NULL,
  `validator` bigint(20) DEFAULT NULL,
  `adress` varchar(255) DEFAULT NULL,
  `delivery_cost` bigint(20) DEFAULT NULL,
  `comment_resolution` bit(1) DEFAULT NULL,
  `date_comment_resolution` date DEFAULT NULL,
  `nbr_total_comment` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `command`
--

INSERT INTO `command` (`id`, `address`, `day`, `month`, `order_date`, `reference`, `regulation_date`, `remarque`, `total`, `year`, `admin`, `city`, `client`, `delivery`, `order_status`, `validator`, `adress`, `delivery_cost`, `comment_resolution`, `date_comment_resolution`, `nbr_total_comment`) VALUES
(292, NULL, 1, 7, '2020-07-01', 'CX1577', '2020-07-07', NULL, '399.00', 2020, 1, 62, 290, 289, 8, 2, 'hay oued edahab rue souk larbiaa imm. aziza12 appr devant imm. chemssit 9', NULL, b'0', NULL, 0),
(297, NULL, 12, 7, '2020-07-12', 'LT2570', '2020-07-07', NULL, '299.00', 2020, 1, 67, 296, 295, 9, 291, 'Branes 2 residence sidi moussa appartement8 etage 1', NULL, b'0', NULL, 0),
(301, NULL, 8, 7, '2020-07-08', 'LT2786', '2020-07-08', NULL, '299.00', 2020, 1, 70, 300, 289, 4, 2, '12.RueLarbi Ben Abdallah  Rabat(10H30MIN)', NULL, b'0', NULL, 1),
(304, NULL, 9, 7, '2020-07-09', 'LT2831', '2020-07-09', '18/6: MA3AYAT LIH TA7AD', '299.00', 2020, 1, 73, 303, 295, 4, 291, 'Nador TAOUINA', NULL, b'0', NULL, 0),
(308, NULL, 10, 7, '2020-07-10', 'LT2851', '2020-07-11', NULL, '299.00', 2020, 1, 76, 307, 289, 4, 2, 'guelmim RES SAHRA', NULL, b'0', NULL, 0),
(311, NULL, 9, 7, '2020-07-09', 'LT2499', '2020-07-09', NULL, '249.00', 2020, 1, 79, 310, 295, 9, 291, 'bv med 5', NULL, b'0', NULL, 0),
(314, NULL, 10, 7, '2020-07-10', 'CX1507', '2020-07-11', NULL, '399.00', 2020, 1, 79, 313, 289, 9, 291, 'MHANACH 2 BV SEBTA', NULL, b'0', NULL, 0),
(319, NULL, 8, 7, '2020-07-08', 'CX1512', '2020-07-10', NULL, '399.00', 2020, 1, 62, 318, 317, 1, 291, 'BV OMAR BNO KHATAB', NULL, b'0', NULL, 0),
(322, NULL, 9, 7, '2020-07-09', 'LT2516', '2020-06-12', NULL, '249.00', 2020, 1, 87, 321, 295, 5, 291, 'HAY SINA3I', NULL, b'0', NULL, 0),
(326, NULL, 11, 7, '2020-07-11', 'CX1523', '2020-07-12', NULL, '399.00', 2020, 1, 90, 324, 289, 7, 2, 'oulad issa taroudant', NULL, b'0', NULL, 0);

-- --------------------------------------------------------

--
-- Structure de la table `commande_access`
--

CREATE TABLE `commande_access` (
  `id` bigint(20) NOT NULL,
  `command` bigint(20) DEFAULT NULL,
  `validator` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `comment`
--

CREATE TABLE `comment` (
  `id` bigint(20) NOT NULL,
  `date_comment` datetime DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `command` bigint(20) DEFAULT NULL,
  `user` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `comment`
--

INSERT INTO `comment` (`id`, `date_comment`, `message`, `command`, `user`) VALUES
(328, '2020-07-17 19:48:24', 'j\'ai un prob', 301, 2);

-- --------------------------------------------------------

--
-- Structure de la table `delivery_cost`
--

CREATE TABLE `delivery_cost` (
  `id` bigint(20) NOT NULL,
  `shipping_cost` decimal(19,2) DEFAULT NULL,
  `city` bigint(20) DEFAULT NULL,
  `delivery` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `delivery_cost`
--

INSERT INTO `delivery_cost` (`id`, `shipping_cost`, `city`, `delivery`) VALUES
(1, '50.00', 1, 3),
(2, '60.00', 2, 2);

-- --------------------------------------------------------

--
-- Structure de la table `delivery_type`
--

CREATE TABLE `delivery_type` (
  `id` bigint(20) NOT NULL,
  `label` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `delivery_type`
--

INSERT INTO `delivery_type` (`id`, `label`) VALUES
(34, NULL),
(38, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `operation_stock`
--

CREATE TABLE `operation_stock` (
  `id` bigint(20) NOT NULL,
  `date_operation_stock` date DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `qte` decimal(19,2) DEFAULT NULL,
  `qte_after_operation` decimal(19,2) DEFAULT NULL,
  `qte_before_operation` decimal(19,2) DEFAULT NULL,
  `admin` bigint(20) DEFAULT NULL,
  `city` bigint(20) DEFAULT NULL,
  `command` bigint(20) DEFAULT NULL,
  `operation_stock_type` bigint(20) DEFAULT NULL,
  `product` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `operation_stock_type`
--

CREATE TABLE `operation_stock_type` (
  `id` bigint(20) NOT NULL,
  `code` bigint(20) DEFAULT NULL,
  `label` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `order_line`
--

CREATE TABLE `order_line` (
  `id` bigint(20) NOT NULL,
  `price` decimal(19,2) DEFAULT NULL,
  `qte` decimal(19,2) DEFAULT NULL,
  `command` bigint(20) DEFAULT NULL,
  `product` bigint(20) DEFAULT NULL,
  `qte_envoye` decimal(19,2) DEFAULT NULL,
  `qte_livre` decimal(19,2) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `order_line`
--

INSERT INTO `order_line` (`id`, `price`, `qte`, `command`, `product`, `qte_envoye`, `qte_livre`) VALUES
(327, '399.00', '1.00', 326, 305, NULL, NULL),
(323, '249.00', '1.00', 322, 298, NULL, NULL),
(320, '399.00', '1.00', 319, 315, NULL, NULL),
(316, '399.00', '1.00', 314, 315, NULL, NULL),
(312, '249.00', '1.00', 311, 298, NULL, NULL),
(309, '299.00', '1.00', 308, 293, NULL, NULL),
(306, '299.00', '1.00', 304, 305, NULL, NULL),
(302, '299.00', '1.00', 301, 298, NULL, NULL),
(299, '299.00', '1.00', 297, 298, NULL, NULL),
(294, '399.00', '1.00', 292, 293, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `order_status`
--

CREATE TABLE `order_status` (
  `id` bigint(20) NOT NULL,
  `label` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `super_order_status` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `order_status`
--

INSERT INTO `order_status` (`id`, `label`, `code`, `color`, `super_order_status`) VALUES
(1, 'NEW ', 'new', 'DarkGray', 1),
(2, 'NOT ANSWERED', 'notAnswered', 'DarkOrange', 1),
(3, 'CANCELED', 'canceled', 'LimeGreen', 1),
(4, 'CONFIRMED', 'confirmed', 'Lime', 2),
(5, 'READY', 'ready', 'PaleVioletRed', 2),
(6, 'REPORTED', 'reported', 'SpringGreen', 3),
(9, 'PAID', 'paid', 'PowderBlue', 4),
(7, 'REFUSED', 'refused', 'Yellow', 3),
(8, 'NOT PAID', 'notPaid', 'Moccasin', 4);

-- --------------------------------------------------------

--
-- Structure de la table `package_status`
--

CREATE TABLE `package_status` (
  `id` bigint(20) NOT NULL,
  `label` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `product`
--

CREATE TABLE `product` (
  `id` bigint(20) NOT NULL,
  `color` varchar(255) DEFAULT NULL,
  `label` varchar(255) DEFAULT NULL,
  `price` decimal(19,2) DEFAULT NULL,
  `qte_stock` int(11) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `size` varchar(255) DEFAULT NULL,
  `weight` decimal(19,2) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `product`
--

INSERT INTO `product` (`id`, `color`, `label`, `price`, `qte_stock`, `reference`, `size`, `weight`) VALUES
(293, NULL, 'LG Q6', NULL, NULL, NULL, NULL, NULL),
(298, NULL, 'Pare-Brise Pare-Soleil', NULL, NULL, NULL, NULL, NULL),
(305, NULL, 'Samsung Galaxy s10', NULL, NULL, NULL, NULL, NULL),
(315, NULL, 'FRESHPACK-PRO', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `role`
--

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `authority` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `role`
--

INSERT INTO `role` (`id`, `authority`) VALUES
(1, 'Admin'),
(2, 'Validator'),
(3, 'Delivery');

-- --------------------------------------------------------

--
-- Structure de la table `stock`
--

CREATE TABLE `stock` (
  `id` bigint(20) NOT NULL,
  `qte` decimal(19,2) DEFAULT NULL,
  `admin` bigint(20) DEFAULT NULL,
  `city` bigint(20) DEFAULT NULL,
  `product` bigint(20) DEFAULT NULL,
  `qte_envoye` decimal(19,2) DEFAULT NULL,
  `qte_livre` decimal(19,2) DEFAULT NULL,
  `qte_restante` decimal(19,2) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `super_order_status`
--

CREATE TABLE `super_order_status` (
  `id` bigint(20) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL,
  `label` varchar(255) DEFAULT NULL,
  `code_super_status` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `super_order_status`
--

INSERT INTO `super_order_status` (`id`, `code`, `color`, `label`, `code_super_status`) VALUES
(1, 'notConfirmed', NULL, 'NOT CONFIRMED', 'notConfirmed'),
(2, 'confirmed', NULL, 'CONFIRMED', 'confirmed'),
(3, 'sent', NULL, 'SENT', 'confirmed_sent'),
(4, 'delivered', NULL, 'DELIVERED', 'confirmed_sent_delivered');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `created` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
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
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `code`, `created`, `email`, `enabled`, `last_name`, `phone_number`, `authority`, `city`, `delivery_type`, `super_admin`, `password`, `enabled_new_command`, `firstt_name`) VALUES
(3, 'delivery1', '2020-05-01', 'delivery@gmail.com', b'1', 'amana', '035224354', 3, NULL, NULL, 4, '$2a$10$O9fj1nblleh9yyotW.J68eJOmqPJMA0jZJuW9J3VefpPygPkrJFd.', NULL, 'service'),
(2, 'validator1', '2020-06-11', 'validator@gmail.com', b'1', 'younes', '021564445', 2, NULL, NULL, 1, '$2a$10$zVjSow8Ypikn5V5yG4YWtOwUMlBvYU3JbS.pa8fYL5ezFhBHawhFe', b'0', NULL),
(1, 'admin1', '2020-06-04', 'admin@gmail.com', b'1', 'adminLast', '0212542', 1, NULL, NULL, 1, '$2a$10$54McHJIlxPGxOR.UYEW7iekDb/0eW0xrcK6oLhn8.Lo0mElkwf8hi', NULL, NULL),
(4, 'admin2', '2020-05-06', 'admin2@gmail.com', b'1', 'zz', '024245563', 1, NULL, NULL, 1, '$2a$10$54McHJIlxPGxOR.UYEW7iekDb/0eW0xrcK6oLhn8.Lo0mElkwf8hi', NULL, NULL),
(317, 'FastBox', '2020-07-16', NULL, NULL, NULL, NULL, 3, NULL, NULL, 1, NULL, NULL, NULL),
(295, 'DHL', '2020-07-16', NULL, NULL, NULL, NULL, 3, NULL, NULL, 1, NULL, NULL, NULL),
(291, NULL, '2020-07-16', NULL, NULL, 'ABRA', NULL, 2, NULL, NULL, 1, NULL, NULL, 'Younes'),
(289, 'Amana', '2020-07-16', NULL, NULL, NULL, NULL, 3, NULL, NULL, 1, NULL, NULL, NULL);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `category_product`
--
ALTER TABLE `category_product`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3vidvmo4dm428sja3d6ucjlr6` (`category`),
  ADD KEY `FK2kprsishy69iw1bw262itfi06` (`product`);

--
-- Index pour la table `city`
--
ALTER TABLE `city`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK3muajrdo22hvnvirpb7x3ap9b` (`city`);

--
-- Index pour la table `command`
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
-- Index pour la table `commande_access`
--
ALTER TABLE `commande_access`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK9r78mncvxwqtwy1wvw4nuw7l6` (`command`),
  ADD KEY `FKth1tdl8ne36tqvtc8egm5u7x7` (`validator`);

--
-- Index pour la table `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKr55hngm2ta2cx7p2dq00ru8f0` (`command`),
  ADD KEY `FKlxlm2octv83r6g7kkfxc9iwbi` (`user`);

--
-- Index pour la table `delivery_cost`
--
ALTER TABLE `delivery_cost`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKmq66obj80e9xqb9bnm20qanpj` (`city`),
  ADD KEY `FK3e67j1opr4f7b3p5xwj9jf1hk` (`delivery`);

--
-- Index pour la table `delivery_type`
--
ALTER TABLE `delivery_type`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `operation_stock`
--
ALTER TABLE `operation_stock`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKi7se6gkxyxqtbcwd7m222wvw0` (`admin`),
  ADD KEY `FK2blnkr81kgcb90b523hnw5dsx` (`city`),
  ADD KEY `FKcel9rwyd8kibi7wwapg6w1lqs` (`command`),
  ADD KEY `FK9ox0pr2we7llhdn7vb857y9e5` (`operation_stock_type`),
  ADD KEY `FK913fmec1os2vc9sld7tyap740` (`product`);

--
-- Index pour la table `operation_stock_type`
--
ALTER TABLE `operation_stock_type`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `order_line`
--
ALTER TABLE `order_line`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK7j35h1jer9ukjnaei8fh000gn` (`command`),
  ADD KEY `FK863a744knr50mljrji0krsko` (`product`);

--
-- Index pour la table `order_status`
--
ALTER TABLE `order_status`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKq8hj2fgp9vh3iobldra8ma5ln` (`super_order_status`);

--
-- Index pour la table `package_status`
--
ALTER TABLE `package_status`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKm0x7o4m89xg11obx2r35te6bx` (`admin`),
  ADD KEY `FKbt1x7f2l0ffqbqr6lcvdjyjj9` (`city`),
  ADD KEY `FK2qw3dn28c2ycrur4qc7tm8u2u` (`product`);

--
-- Index pour la table `super_order_status`
--
ALTER TABLE `super_order_status`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `user`
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
