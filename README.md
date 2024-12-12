[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/WCHp-cRl)
# Projet "Dice" - Gestion de lancés de dés avec Spring Boot

## Description
Le projet "Dice" est une application construite avec Spring Boot permettant de simuler des lancés de dés et de gérer un historique des résultats en base de données. Ce projet met en œuvre les concepts fondamentaux de Spring Boot, notamment l'injection de dépendances, les services RESTful, les entités JPA et les repositories.

## Fonctionnalités
- **Lancer de dés** : Permet de lancer un nombre spécifié de dés et de récupérer les résultats.
- **Journalisation des lancers** : Enregistre chaque lancer de dés avec le nombre de dés, les résultats et un horodatage dans une base de données.

## Configuration
### Application
- **Nom de l'application** : `dice`
- **Port du serveur** : `8081`

### Base de données
- **Type** : H2 (en mémoire)
- **URL** : `jdbc:h2:mem:dice`
- **Nom d'utilisateur** : `sa`
- **Mot de passe** : `password`
- **URL de la console H2** : http://localhost:8081/h2-console

## Dépendances
- **Spring Boot**,**Spring Data JPA**,**H2 Database**,**Lombok**

## Endpoints
- **URL pour simuler le lancer d'un seul dé** : http://localhost:8081/dice/rollDice
- **URL pour le lancer de X dés** : http://localhost:8081/dice/rollDices/X
- **URL des logs de chaque lancé** : http://localhost:8081/dice/diceLogs
