$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myFeature.feature");
formatter.feature({
  "id": "this-is-my-dummy-feature-file",
  "description": "",
  "name": "This is my dummy feature file",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "this-is-my-dummy-feature-file;this-is-my-first-dummy-scenario",
  "description": "",
  "name": "this is my first dummy scenario",
  "keyword": "Scenario",
  "line": 3,
  "type": "scenario"
});
formatter.step({
  "name": "This is my first dummy given step",
  "keyword": "Given ",
  "line": 4
});
formatter.step({
  "name": "This is my first dummy when step",
  "keyword": "When ",
  "line": 5
});
formatter.step({
  "name": "This is my first dummy then step",
  "keyword": "Then ",
  "line": 6
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});