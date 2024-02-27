Feature: play rock paper scissors

Background:
Given an RPS game

Rule: After playing N rounds. the scoreboard displays "(0:0:N)".

Scenario: If the game is played 3 rounds, the scoreboard is "(0:0:3)".
# TODO: Fill in
When RPS game play 3 rounds
Then the scoreboard is "(0:0:3)"

Scenario: If the game is played 5 rounds, the scoreboard is "(0:0:5)".
# TODO: Fill in
When RPS game play 3 rounds
Then the scoreboard is "(0:0:3)"