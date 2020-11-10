# How to start

1. In root folder run `docker-compose up -d` it will launch sonarqube service and postgres db for it
2. Go to sonarqube logs by `docker logs -f sonarqube_sonarqube_1` and wait for log message `INFO  app[][o.s.a.SchedulerImpl] SonarQube is up`
3. After this you can go to http://localhost:9000 and explore SonarQube UI
4. On main page go Administration -> Projects -> Management -> Create Project
5. Give project an arbitrary name, i.e. DemoProject and specify a unique project key, for example demo_project 
6. You will see input asking to give name for security token, enter name and copy to clipboard a generated value 
7. Set up QualityProfile for demo, go to QualityProfiles tab and press the create button. Give some name for quality profile, choose language Java, and upload config files 
 for PMD and CheckStyle that can be found in root folder --  `default-ruleset.xml` and `Life360 GoogleStyle (1).xml` appropriately.
8. After the go to the previously created project and under Administration tab go to Quality profiles
9. Choose for Java previously created quality profile
10. So, it is time to check that everything is set-up right. Open `gradle.properties` file, set `systemProp.sonar.login` to the generated security token and `systemProp.sonar.projectKey` to your project key
11. Go to terminal and run `./gradlew sonarqube`
12. In a few minutes you should see that the demo project page is updated and there are some issues and tips how to resolve them 

