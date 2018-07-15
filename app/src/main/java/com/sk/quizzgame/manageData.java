package com.sk.quizzgame;

import android.app.Application;

import java.util.ArrayList;

public class manageData extends Application {

    private ArrayList<String> Questions = new ArrayList<String>();
    private int keyV = 0;
    private  int hearts = 3;
            private int roundV = 0;
            private int score = 0;

            public int getScore(){
                return score;
            }

    public int getHearts() {
        return hearts;
    }

    public void setHearts(int hearts) {
        this.hearts = hearts;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getKeyV() {
        return keyV;
    }

    public void setKeyV(int keyV) {
        this.keyV = keyV;
    }

    public void setRoundV(int roundV) {
        this.roundV = roundV;
    }

    public int getRoundV() {
        return roundV;
    }

    public String QuestionsData(int key, int round){

        String dataE = null;
        switch (round) {
            case 0: {
                String[] data = {"Who's flag is this ?", "What is the capital of bolivia ?","Which mountain is known as Killer mountain ?","What is the population of china in 2018 ?","Where this place is located ?"};
                return dataE = data[key];
            }
            case 1:{
                String[] data = {"When the first world war started ? ", "When Algeria gained its independence from France ?","When queen Elizabeth II became queen ?","Who is this man ? ","Which of these countries never been in a war ?"};
                return dataE = data[key];
            }
            case 2:{
                String[] data = {"Which of these countries won 4 world cups ?", "Who's this person ?","In wich country this sport is not practiced ?","How many Ballon d'or Cristiano Ronaldo won ?","Which of these countries won the first world cup ?"};
                return dataE = data[key];
            }
            case 3:{
                String[] data = {"Who is this person ?", "What is the name of this molecule ?","Who invented this formula ? E = mc² ","How do we call the splitting of a heavy nucleus ?","Which of Einstein theories was recently proven ?"};
                return dataE = data[key];
            }
            case 4:{
                String[] data = {"6x9 = ", "Solve this equation ","This integral equales to : ", "This cosin can be written in another form which one of these forms is the correct ?","What is this theorem  called ?"};
                return dataE = data[key];
            }
            case 5:{
                String[] data = {"Who is this person ?", "How many albums did Iron Maiden make ?","Why did oasis split up ?","Whats the name of this groupe ?","Whats the name of this singer ?"};
                return dataE = data[key];
            }
            case 6:{
                String[] data = {"When was the first video game invented ?", "What's the name of this company ?","What kind of game is this one ?","What's the name of this console ?","Who is the highest paid E-Sport player in 2017 ?"};
                return dataE = data[key];
            }
            case 7:{
                String[] data = {"Who is this actor ?", "Which of these actors lost a lot of weight for a role in a movie ?","Who is this actress ?","Wich of these movies his cost of production was over 300 million USD ? ","What is the most watched tv show in 2017 ?"};
                return dataE = data[key];
            }
            case 8:{
                String[] data = {"Who is this actor ?", "Which of these actors lost a lot of weight for a role in a movie ?","Who is this actress ?","Wich of these movies his cost of production was over 300 million USD ? ","What is the most watched tv show in 2017 ?"};
                return dataE = data[key];
            }

        }
        return dataE;
    }
public ArrayList<String> AnswerQuestion(int key, int Round){
    ArrayList<String>DataE = new ArrayList<String>();
    switch (Round){
        case 0: {
            switch (key) {
                case 0: {
                    DataE.add("Guinea");
                    DataE.add("Lesotho");
                    DataE.add("Kenya");
                    DataE.add("1");
                    DataE.add("geography1");
                    return DataE;
                }
                case 1: {
                    DataE.add("Santa Cruze");
                    DataE.add("Cali");
                    DataE.add("La Paze, Sucre");
                    DataE.add("2");
                    DataE.add("none");
                    return DataE;
                }
                case 2: {
                    DataE.add("Nanga Parbat");
                    DataE.add("Everest");
                    DataE.add("Himalaya");
                    DataE.add("0");
                    DataE.add("none");
                    return DataE;
                }
                case 3: {
                    DataE.add("1.415 billion");
                    DataE.add("1.55 billion");
                    DataE.add("1.584 billion");
                    DataE.add("0");
                    DataE.add("none");
                    return DataE;
                }
                case 4: {
                    DataE.add("Arizona");
                    DataE.add("Asni");
                    DataE.add("Tamanrasset");
                    DataE.add("2");
                    DataE.add("geography5");
                    return DataE;
                }
            }
        }

        case 1:{
           switch (key){
               case 0:{
                   DataE.add("28 Jul 1914");
                   DataE.add("26 Jul 1914");
                   DataE.add("29 Jul 1914");
                   DataE.add("0");
                   DataE.add("none");
                   return DataE;
               }
               case 1:{
                   DataE.add("21 Mar 1962");
                   DataE.add("19 Mar 1962");
                   DataE.add("5 Jul 1962");
                   DataE.add("1");
                   DataE.add("none");
                   return DataE;
               }
               case 2:{
                   DataE.add("28 Feb 1962");
                   DataE.add("16 Feb 1962");
                   DataE.add("6 Feb 1962");
                   DataE.add("2");
                   DataE.add("none");
                   return DataE;
               }
               case 3:{
                   DataE.add("Albert Einstien");
                   DataE.add("Albert Camus");
                   DataE.add("Vladimir Lenin");
                   DataE.add("2");
                   DataE.add("history4");
                   return DataE;
               }
               case 4:{
                   DataE.add("Switzerland");
                   DataE.add("San Marino");
                   DataE.add("Norway");
                   DataE.add("1");
                   DataE.add("none");
                   return DataE;
               }
           }
        }

        case 2:{
            switch (key){
                case 0:{
                    DataE.add("Brazil");
                    DataE.add("Germany");
                    DataE.add("France");
                    DataE.add("1");
                    DataE.add("none");
                    return DataE;
                }
                case 1:{
                    DataE.add("Luis Figo");
                    DataE.add("Gianluigi Buffon");
                    DataE.add("Andrea Pirlo");
                    DataE.add("0");
                    DataE.add("sport2");
                    return DataE;
                }
                case 2:{
                    DataE.add("Ireland");
                    DataE.add("France");
                    DataE.add("Italy");
                    DataE.add("2");
                    DataE.add("sport3");
                    return DataE;
                }
                case 3:{
                    DataE.add("4");
                    DataE.add("3");
                    DataE.add("2");
                    DataE.add("1");
                    DataE.add("none");
                    return DataE;
                }
                case 4:{
                    DataE.add("USA");
                    DataE.add("Uruguay");
                    DataE.add("Argentina");
                    DataE.add("1");
                    DataE.add("none");
                    return DataE;
                }
            }
        }
        case 3:{
            switch (key){
                case 0:{
                    DataE.add("Wolfgang Amadeus Mozart");
                    DataE.add("Galileo Galilei");
                    DataE.add("Isaac Newton");
                    DataE.add("2");
                    DataE.add("science1");
                    return DataE;
                }
                case 1:{
                    DataE.add("Glucose");
                    DataE.add("Fructose");
                    DataE.add("Aspartame");
                    DataE.add("0");
                    DataE.add("science2");
                    return DataE;
                }
                case 2:{
                    DataE.add("Max Planck");
                    DataE.add("Ernest Rutherford");
                    DataE.add("Albert Einstein");
                    DataE.add("2");
                    DataE.add("none");
                    return DataE;
                }
                case 3:{
                    DataE.add("Fission");
                    DataE.add("Fusion");
                    DataE.add("Friction");
                    DataE.add("0");
                    DataE.add("none");
                    return DataE;
                }
                case 4:{
                    DataE.add("Gravitational waves");
                    DataE.add("Relativity");
                    DataE.add("Unified field");
                    DataE.add("0");
                    DataE.add("none");
                    return DataE;
                }
            }
        }
        case 4:{
            switch (key){
                case 0:{
                    DataE.add("48");
                    DataE.add("56");
                    DataE.add("54");
                    DataE.add("2");
                    DataE.add("none");
                    return DataE;
                }
                case 1:{
                    DataE.add("x = -5 and x = 5");
                    DataE.add("x = 1 and x = -0.5");
                    DataE.add("x = -3");
                    DataE.add("1");
                    DataE.add("math2");
                    return DataE;
                }
                case 2:{
                    DataE.add("pi/4");
                    DataE.add("pi/2");
                    DataE.add("0");
                    DataE.add("2");
                    DataE.add("math3");
                    return DataE;
                }
                case 3:{
                    DataE.add("sin(theta + pi/2)");
                    DataE.add("cos(theta - pi/2)");
                    DataE.add("sin(theta - pi/2)");
                    DataE.add("0");
                    DataE.add("math4");
                    return DataE;
                }
                case 4:{
                    DataE.add("pythagorean theorem");
                    DataE.add("thales's theorem");
                    DataE.add("al kash theorem");
                    DataE.add("1");
                    DataE.add("math5");
                    return DataE;
                }
            }
        }
        case 5:{
            switch (key){
                case 0:{
                 DataE.add("Lars Ulrich");
                 DataE.add("Robert Trujillo");
                 DataE.add("James Hetfield");
                 DataE.add("2");
                 DataE.add("music1");
                 return DataE;
                }
                case 1:{
                    DataE.add("14");
                    DataE.add("15");
                    DataE.add("16");
                    DataE.add("2");
                    DataE.add("none");
                    return DataE;
                }
                case 2:{
                    DataE.add("Because of a misunderstanding");
                    DataE.add("Because they had enough money");
                    DataE.add("Because they thought it was time to stop");
                    DataE.add("0");
                    DataE.add("none");
                    return DataE;
                }
                case 3:{
                    DataE.add("Nickelback");
                    DataE.add("Avril Lavigne");
                    DataE.add("The Cranberries");
                    DataE.add("2");
                    DataE.add("music4");
                    return DataE;
                }
                case 4:{
                     DataE.add("Gilberto Gil");
                     DataE.add("Cheb mami");
                     DataE.add("Cheb Khaled");
                     DataE.add("1");
                     DataE.add("music5");
                     return DataE;
                }
            }
        }
        case 6:{
            switch (key){
                case 0:{
                    DataE.add("1957");
                    DataE.add("1956");
                    DataE.add("1958");
                    DataE.add("2");
                    DataE.add("none");
                    return DataE;
                }
                case 1:{
                    DataE.add("Unreal");
                    DataE.add("Unity");
                    DataE.add("GameMaker");
                    DataE.add("0");
                    DataE.add("game2");
                    return DataE;
                }
                case 2:{
                    DataE.add("FPS");
                    DataE.add("MOBA");
                    DataE.add("MMORPG");
                    DataE.add("1");
                    DataE.add("game3");
                    return DataE;
                }
                case 3:{
                    DataE.add("Sega Genesis");
                    DataE.add("Nintendo GameCube");
                    DataE.add("Xbox");
                    DataE.add("0");
                    DataE.add("game4");
                    return DataE;
                }
                case 4:{
                    DataE.add("Amer Barqawi");
                    DataE.add("Peter Dager");
                    DataE.add("Kuro Tkhasomi");
                    DataE.add("2");
                    DataE.add("none");
                    return DataE;
                }
            }
        }

        case 7:{
            switch (key){
                case 0:{
DataE.add("Will Ferrell");
DataE.add("Chad Smith");
DataE.add("Cliff Martinez");
DataE.add("0");
DataE.add("movie1");
return DataE;
                }
                case 1:{
                    DataE.add("Tom Hanks");
                    DataE.add("Jason Statham");
                    DataE.add("Johnny Depp");
                    DataE.add("2");
                    DataE.add("none");
                    return DataE;


                }
                case 2:{
                    DataE.add("Jennifer Aniston");
                    DataE.add("Jennifer Lawrence");
                    DataE.add("Emma Stone");
                    DataE.add("1");
                    DataE.add("movie3");
                    return DataE;

                }
                case 3:{
                    DataE.add("Pirates of the Caribbean");
                    DataE.add("John Carter");
                    DataE.add("Titanic");
                    DataE.add("0");
                    DataE.add("none");
                    return DataE;

                }
                case 4:{
                    DataE.add("Stranger Things");
                    DataE.add("Vikings");
                    DataE.add("Game of Thrones");
                    DataE.add("2");
                    DataE.add("none");
                    return DataE;

                }
            }
        }

        case 8:{
            switch (key){
                case 0:{
                    DataE.add("");
                    DataE.add("");
                    DataE.add("");
                    DataE.add("0");
                    DataE.add("none");
                    return DataE;
                }
                case 1:{
                    DataE.add("Tom Hanks");
                    DataE.add("Jason Statham");
                    DataE.add("Johnny Depp");
                    DataE.add("2");
                    DataE.add("none");
                    return DataE;


                }
                case 2:{
                    DataE.add("Jennifer Aniston");
                    DataE.add("Jennifer Lawrence");
                    DataE.add("Emma Stone");
                    DataE.add("1");
                    DataE.add("movie3");
                    return DataE;

                }
                case 3:{
                    DataE.add("Pirates of the Caribbean");
                    DataE.add("John Carter");
                    DataE.add("Titanic");
                    DataE.add("0");
                    DataE.add("none");
                    return DataE;

                }
                case 4:{
                    DataE.add("Stranger Things");
                    DataE.add("Vikings");
                    DataE.add("Game of Thrones");
                    DataE.add("2");
                    DataE.add("none");
                    return DataE;

                }
            }
        }

    }



    DataE.clear();
    return DataE;
}


}
