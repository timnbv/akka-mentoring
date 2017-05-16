JM Program
Akka PC Assembly line

Automatize PC assembly line with Akka Framework (Java/Scala is optional).

Requirements:

* Create PC object and fill it with data from operation to operation
* Make more than 2 levels-hierarchy of actors
* Log all steps and meta info about Self and Sender with AkkaLogger
* Create 1 actor (or more) for each step of process and 1 router to route all requests for assembling
* Write Service layer with CompletableFutures in signatures (handle router answers or inbox events)
* Try with different dispatchers and pick one for your solution
* Tune ForkJoin executor for your environment (change configuration)
* The choice should be based on performance tests*
* Throughput of assembly line should be more than 100 000 assembled PCs per second*
* Throughput of assembly line should be more than 1 000 000 assembled PCs per second**


** -optional points

An example of actions is described in next paper: http://techreport.com/review/23624/how-to-build-a-pc-the-tech-report-guide