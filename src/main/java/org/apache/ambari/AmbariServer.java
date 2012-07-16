package org.apache.ambari;

import org.mortbay.jetty.Connector;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;
import org.mortbay.jetty.ssl.SslSelectChannelConnector;

import com.sun.jersey.api.core.ResourceConfig;
import com.sun.jersey.spi.container.servlet.ServletContainer;

public class AmbariServer {
  
  public static void main(String[] args) throws Exception
  {
    ServletHolder sh = new ServletHolder(ServletContainer.class);
    sh.setInitParameter("com.sun.jersey.config.property.resourceConfigClass", 
        ResourceConfig.class.getCanonicalName());
    sh.setInitParameter("com.sun.jersey.config.property.packages", 
        "org.apache.ambari.jersey");
    
    /** configure a ssl connector for the puppet agent **/
    
    SslSelectChannelConnector sslConnector = new SslSelectChannelConnector();
    sslConnector.setPort(8140);
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
