-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 17-Ago-2022 às 02:11
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `SuperMarketDB`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `id_cliente` int(11) NOT NULL,
  `nome_cliente` varchar(255) DEFAULT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `id_produto` int(11) NOT NULL,
  `descricao_produto` varchar(80) NOT NULL,
  `quantidade_produto` int(11) NOT NULL,
  `valor` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `nome_usuario` varchar(255) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `nivel_acesso` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nome_usuario`, `senha`, `nivel_acesso`) VALUES
(1, 'admin', 'PhDPujvog4YX/ERF4JycXEG2LT2p8VNJ', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE `vendas` (
  `id_venda` int(10) NOT NULL,
  `fk_cliente` int(10) NOT NULL,
  `quantidade` int(10) NOT NULL,
  `valor_total` float NOT NULL,
  `vendedor` varchar(40) NOT NULL,
  `metodo_pagamento` varchar(10) NOT NULL,
  `data` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda_produto`
--

CREATE TABLE `venda_produto` (
  `id_venda` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `qtd_produto` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`),
  ADD UNIQUE KEY `UK_7wflw78ibh162cmq12ii6ffly` (`cpf`);

--
-- Índices para tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`id_produto`);

--
-- Índices para tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Índices para tabela `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`id_venda`),
  ADD KEY `fk_cliente` (`fk_cliente`);

--
-- Índices para tabela `venda_produto`
--
ALTER TABLE `venda_produto`
  ADD KEY `id_venda` (`id_venda`),
  ADD KEY `id_produto` (`id_produto`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `produtos`
--
ALTER TABLE `produtos`
  MODIFY `id_produto` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `vendas`
--
ALTER TABLE `vendas`
  MODIFY `id_venda` int(10) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `vendas_ibfk_1` FOREIGN KEY (`fk_cliente`) REFERENCES `clientes` (`id_cliente`);

--
-- Limitadores para a tabela `venda_produto`
--
ALTER TABLE `venda_produto`
  ADD CONSTRAINT `venda_produto_ibfk_1` FOREIGN KEY (`id_venda`) REFERENCES `vendas` (`id_venda`),
  ADD CONSTRAINT `venda_produto_ibfk_2` FOREIGN KEY (`id_produto`) REFERENCES `produtos` (`id_produto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
