# demo-servlet-min

This is a Minimal Java Servlet Eclipse project.  Its a good starting point for learning the basics of servlet 
development but the structure is not meant to be used for a production project.  There is no Maven integration
and the servlet spec jar is included in the compile classpath; something you'd never do in a real project.  But 
its a good place to start without having to get Maven running yet.

- You will of course need a Java JRE or JDK.  OpenJDK is best as Oracle now wants $$$ for runtimes and anything is always
better than an Oracle product anyway.


- You will need a recent Eclipse. Get "Eclipse for Java Developers" Edition. Do not get the "For Java EE" version 
of Eclipse as you will get a whole lot of stuff you don't need and probably never will.  In 16 years, I have never
had to use anything but the "Java Developers" version of Eclipse for writing Java WebApps.  Install Tomcat Plugin for 
Eclipse from the Eclipse Marketplace and that is all you will probably ever need.


- Lastly you need Tomcat, which is the reference servlet container.  Don't bother doing development in something
like WebLogic or Websphere of any "vendor" server.  Its pointless as every vendor's server by definition has to be 
compatible with Tomcat anyway. Therefore any code that you develop in Tomcat is pretty much guaranteed to run anywhere,
although some may just need an extra config file in WEB-INF. Don't "install" Tomcat, just download the zip and then 
hook it into your Eclipse Tomcat plugin.  It pretty easy.

