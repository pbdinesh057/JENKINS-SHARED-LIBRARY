def call(){
   sh 'mvn clean package sonar:sonar'
}

/*
mvn [clean] [package] [plugin-prefix]:[plugin-goal]

1. `sonar:sonar`: Initiates the standard SonarQube analysis.

2. `sonar:scan`: Initiates a SonarQube analysis without performing a build. It assumes the build artifacts are already available.

3. `sonar:sonar -Dsonar.host.url=URL`: Specifies the SonarQube server URL to which the analysis results will be sent.

4. `sonar:sonar -Dsonar.projectKey=PROJECT_KEY`: Sets the project key in SonarQube, which is used to uniquely identify the project.

5. `sonar:sonar -Dsonar.login=TOKEN`: Specifies the SonarQube authentication token or login token for secure communication with the server.

6. `sonar:sonar -Dsonar.sources=src`: Specifies the source code directory to be analyzed.

7. `sonar:sonar -Dsonar.language=LANGUAGE`: Specifies the programming language used in the project.

8. `sonar:sonar -Dsonar.java.binaries=target/classes`: Specifies the compiled Java binaries directory.

9. `sonar:sonar -Dsonar.java.libraries=lib/*.jar`: Specifies the location of external Java libraries used in the project.

These are just a few examples of the many options available for configuring the SonarQube analysis with Maven. You can find more information about the available configurations and options in the official SonarQube documentation and the Maven plugin documentation. Remember to tailor the options to your project's needs and the SonarQube setup you have in place.

In the context of Maven, the command `mvn clean package sonar:sonar` is used for static code analysis using SonarQube.

Let's break it down:

1. `mvn`: It is the command to invoke Apache Maven, a build automation tool for Java projects.

2. `clean`: This is a Maven lifecycle phase. The `clean` phase is responsible for cleaning up the project by deleting any files generated during the build process.

3. `package`: This is another Maven lifecycle phase. The `package` phase is responsible for taking the compiled code and packaging it into a distributable format, such as a JAR or WAR file.

4. `sonar:sonar`: This is a Maven goal that triggers the SonarQube analysis for the project. SonarQube is a code quality and security analysis tool that helps identify and fix issues in the codebase. The `sonar:sonar` goal runs the SonarQube analysis on the project and sends the results to the configured SonarQube server.

By running `mvn clean package sonar:sonar`, you are cleaning the project, packaging the code, and then running the SonarQube analysis on the codebase to assess its quality and detect any potential issues.
*/