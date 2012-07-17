package org.apache.ambari.agent;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;
import org.mortbay.jetty.ssl.SslSelectChannelConnector;

import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.spi.container.servlet.ServletContainer;

public class AmbariAgent {

  public static void main(String[] args) throws Exception
  {
    ServletHolder sh = new ServletHolder(ServletContainer.class);
    sh.setInitParameter("com.sun.jersey.config.property.resourceConfigClass", 
        PackagesResourceConfig.class.getCanonicalName());
    sh.setInitParameter("com.sun.jersey.config.property.packages", 
        "org.apache.ambari.agent.jersey");

    /** configure a ssl connector for the puppet agent **/

    SslSelectChannelConnector sslConnector = new SslSelectChannelConnector();
    sslConnector.setPort(8139);
    sslConnector.setKeyPassword("123456");
    sslConnector.setPassword("123456");
    sslConnector.setKeystore("/tmp/keystore");  
    Server server = new Server();
    server.setConnectors(new Connector[] {sslConnector});
    Context context = new Context(server, "/", Context.SESSIONS);
    context.addServlet(sh, "/*");
    server.start();
    server.start();
    server.join();
  }

}
