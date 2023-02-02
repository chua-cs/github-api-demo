# github-api-demo
A simple Java application to demonstrate how to fetch repo contributors via Github APIs

## Usage
First of all, this is a maven based project. Source code shall be build before executing the application.

`mvn clean install`

Once successfully build, the application can be launched with the command below:

`java -jar target/test-app-1.0.jar [owner/repo]`

Where, **[owner/repo]** is optional. Of course, without this value, we get no result.

Example:

`java -jar target/test-app-1.0.jar danfickle/openhtmltopdf`
 
    Accepted Value: danfickle/openhtmltopdf
    Top Contributors for the repo:
    1. danfickle, contributed: 970
    2. rototor, contributed: 157
    3. pbrant, contributed: 119
    4. syjer, contributed: 37
    5. jensrutschmann, contributed: 20
    6. beckje01, contributed: 8
    7. evermind-micw, contributed: 8
    8. nedjs, contributed: 8
    9. adityadmahale, contributed: 6
    10. loesak, contributed: 5
    11. DSW-PS, contributed: 4
    12. pdoubleya, contributed: 4
    13. vianney, contributed: 4
    14. achuinard, contributed: 3
    15. dmap, contributed: 3
    16. gmottram, contributed: 3
    17. qligier, contributed: 3
    18. ebruchez, contributed: 3
    19. zimmi, contributed: 3
    20. vipcxj, contributed: 3
    21. kmtong, contributed: 2
    22. kschaefe, contributed: 2
    23. backslash47, contributed: 2
    24. tobymckoi, contributed: 2
    25. brundipub, contributed: 2
