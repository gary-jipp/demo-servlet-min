# demo-servlet-min

This is a Minimal Java Servlet Eclipse project.  Its a starting point for learning the basics of servlet 
development but the directiry structure is not meant to be used for a production project.  There is no Maven build filezand the servlet-spec jar is included in the compile classpath; something you'd never do in a real project. It's a good place to start without having to worry about Maven yet.

- You will of course need a Java JRE or JDK.  OpenJDK is best as Oracle now wants $$$ for runtimes and pretty much anything else is always better than something from Oracle anyway.  For Windows use an AdoptOpenJDK LTS, and the J9 engine is pretty awesome; smaller and faster.


- You will need a recent Eclipse. Get "Eclipse for Java Developers" Edition. Do not get the "For Java EE" version of Eclipse as you will get a whole lot of stuff you don't need and probably never will.  In 18 years using Eclipse, I have never had to use anything but the "Java Developers" version of Eclipse for writing Java WebApps.  Install Tomcat Plugin for Eclipse from the Eclipse Marketplace and that is all you will probably ever need.  if you find you need a particular function from the EE suite, such as a JSP editor, then just add that. Its all modular so no reason to get a bunch of stuff you'll never use to start.


- Lastly you need Tomcat, which is the reference servlet container.  Don't bother doing development with  something like WebLogic or Websphere or any "vendor" server.  Its pointless as every vendor's server by definition has to be compatible with Tomcat anyway. Therefore any code that you develop in Tomcat is pretty much guaranteed to run anywhere,although some may just need an extra config file in WEB-INF. Don't "install" Tomcat, just download the zip and then hook it into your Eclipse Tomcat plugin.  It's pretty easy.


- Import this project into your Eclipse from Git.  File->Import - Git->Projects from Git->Clone Uri. Be careful to tell Git to put the code in your Eclipse workspace or it will by default try to import into your home dir.  You maty want to set the Git preferences to always import into the workspace folder.

