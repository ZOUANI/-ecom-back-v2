-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : ven. 17 juil. 2020 à 21:49
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

--
-- Déchargement des données de la table `category`
--

INSERT INTO `category` (`id`, `label`) VALUES
(1, 'phone');

--
-- Déchargement des données de la table `category_product`
--

INSERT INTO `category_product` (`id`, `category`, `product`) VALUES
(1, 1, 1);

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

--
-- Déchargement des données de la table `comment`
--

INSERT INTO `comment` (`id`, `date_comment`, `message`, `command`, `user`) VALUES
(328, '2020-07-17 19:48:24', 'j\'ai un prob', 301, 2);

--
-- Déchargement des données de la table `delivery_cost`
--

INSERT INTO `delivery_cost` (`id`, `shipping_cost`, `city`, `delivery`) VALUES
(1, '50.00', 1, 3),
(2, '60.00', 2, 2);

--
-- Déchargement des données de la table `delivery_type`
--

INSERT INTO `delivery_type` (`id`, `label`) VALUES
(34, NULL),
(38, NULL);

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(329),
(329),
(329),
(329),
(329),
(329),
(329),
(329),
(329),
(329),
(329),
(329),
(329);

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

--
-- Déchargement des données de la table `product`
--

INSERT INTO `product` (`id`, `color`, `label`, `price`, `qte_stock`, `reference`, `size`, `weight`) VALUES
(293, NULL, 'LG Q6', NULL, NULL, NULL, NULL, NULL),
(298, NULL, 'Pare-Brise Pare-Soleil', NULL, NULL, NULL, NULL, NULL),
(305, NULL, 'Samsung Galaxy s10', NULL, NULL, NULL, NULL, NULL),
(315, NULL, 'FRESHPACK-PRO', NULL, NULL, NULL, NULL, NULL);

--
-- Déchargement des données de la table `role`
--

INSERT INTO `role` (`id`, `authority`) VALUES
(1, 'Admin'),
(2, 'Validator'),
(3, 'Delivery');

--
-- Déchargement des données de la table `super_order_status`
--

INSERT INTO `super_order_status` (`id`, `code`, `color`, `label`, `code_super_status`) VALUES
(1, 'notConfirmed', NULL, 'NOT CONFIRMED', 'notConfirmed'),
(2, 'confirmed', NULL, 'CONFIRMED', 'confirmed'),
(3, 'sent', NULL, 'SENT', 'confirmed_sent'),
(4, 'delivered', NULL, 'DELIVERED', 'confirmed_sent_delivered');

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
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
