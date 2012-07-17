package org.apache.ambari.agent.jersey;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.apache.log4j.Logger;

@Path("/production/run/no_key")
public class PuppetKickResource {
  private static final Logger LOG = Logger.getLogger(PuppetKickResource.class);

  /**
   * 
   * @return
   */
  @GET
  public String doGet(@Context UriInfo uriInfo) {
    LOG.info("Called on a get message " + uriInfo.getAbsolutePath());
    return "s";
  }

  /**
   *  
   * @return
   */
  @POST
  @Consumes("text/pson")
  public String doPost(@Context UriInfo uriInfo) {
    LOG.info("Puppet Kick Servlet called on " + uriInfo.getAbsolutePath());
    return "Success";
  }
}
