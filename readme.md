# New Nintendo 64 game selector


###User story:

As an employee handling our finance, I want to buy a new N64 game to which the most people are interested. In our weekly team meeting, I open the voting application and ask all employees one-by-one which game they like most. They have to pick from a list of games I printed out. I cast the votes by clicking/tapping on the games on my screen.

Requirements
* It should show the 10 most popular N64 games.

* use the IGDB API to fetch games.
* 10 most popular game are selected according to sales.



### Installation

Run the backend 

```sh
$ mvn spring-boot:run
```

You can see the database here 

```sh
http://localhost:8080/h2-console
```

Front end under heavy onstruction


### global architecture 
```
WEB <-> Springboot  service  <-> database 
|
IGDB api 
```


Also In this project end to end test integration and unit test


The user will put his last name and vote on a game 
the back end will check if the user is registred it will display hello {first name}

backend will check if we already have the game
And will save user choice in a H2 databse to keep it simple 
see screenshot 
