install MongoDb
start mongod shell=>      mongod.exe --dbpath "c:\work\mongodb\data"
install tomcat7
Import the given Dynamic Web project to your eclipse
Configure server to Apache tomcat 7
Launch the Project on Server(tomcat7)

Open a Browser/Chrome Rest Client extension

test cases:

1> GET http://localhost:8080/SaltSideBirdsExercise/birds
  This should yield No result
  
2. POST http://localhost:8080/SaltSideBirdsExercise/birds
with Content-Type as application/json
payload: {"name":"Makau","family":"Parrot","continents":["USA","Africa"],"visible":true}

3> POST http://localhost:8080/SaltSideBirdsExercise/birds
with Content-Type as application/json
payload: {"name":"Parrot","family":"Parrot","continents":["Asia","Europe", "USA"],"added":"2012-12-14","visible":true}

4> POST http://localhost:8080/SaltSideBirdsExercise/birds
with Content-Type as application/json
payload: {"name":"Crow","family":"Crow","continents":["Asia","Europe"],"added":"2010-12-14"}

5> GET http://localhost:8080/SaltSideBirdsExercise/birds
  This should yield 2 result( id's for items added in 2(say "id1") and 3(say "id2"), 4 will not be yielded as visible will be set to false)
  
6> GET http://localhost:8080/SaltSideBirdsExercise/birds/id1
this should yield result the following item with today's date(UTC)
{ "_id" : { "$oid" : "566f0355e032d2cb2ec35411"} , "name" : "Makau" , "family" : "Parrot" , "continents" : [ "Asia" , "Europe"] , "added" : "2015-12-14" , "visible" : true}

7> GET http://localhost:8080/SaltSideBirdsExercise/birds/id2
this should yield result the following item with today's date(UTC)
{ "_id" : { "$oid" : "566f0b9ce032c2cd8abc33f3"} , "name" : "Parrot" , "family" : "Parrot" , "continents" : [ "Asia" , "Europe" , "USA"] , "added" : "2012-12-14" , "visible" : true}

8> DELETE http://localhost:8080/SaltSideBirdsExercise/birds/566f0b9ce032c2cd8abc33f3
this should delete the entry in 7 and return 200

9> DELETE http://localhost:8080/SaltSideBirdsExercise/birds/566f0b9ce032c2cd8abc33f3
this should do nothing as item is already deleted. Return 404



Enhancements which should be further done:
a> Create unit test Case suite instead of manual testing
b> Create factory patterna nd supply mongo implementation as one of the available implementations
c> More error and exception handling
d> Code clean up. 
e> Maven dependency clean up.