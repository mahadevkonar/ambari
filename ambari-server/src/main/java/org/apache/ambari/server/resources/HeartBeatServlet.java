package org.apache.ambari.server.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Path("/production/agent/hosts")
public class HeartBeatServlet {
 private static final Log LOG = LogFactory.getLog(HeartBeatServlet.class);

  /**
   * @return
   */
  @GET
  public String doGet(@Context UriInfo uriInfo) {
    LOG.info("Called on a get message " + uriInfo.getAbsolutePath());
    return "s";
  }

  /**
   * 
   * @param xml
   * @return
   */
  @POST
  @Produces("application/xml")
  @Consumes({"application/x-www-form-urlencoded", "multipart/form-data"})
  public String doPost(@FormParam("xml") String xml) {
    if(xml == null) { 
      LOG.error("Expected 'xml' parameter was not found in the POST");
      return null;
    }
    return xml;
  }
}
