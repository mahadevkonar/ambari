package org.apache.ambari;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Environment;

public class AmbariService extends Service<AmbariConfiguration> {
  public static void main(String[] args) throws Exception {
    new AmbariService().run(args);
  }

  private AmbariService() {
    super("ambari");
  }

  @Override
  protected void initialize(AmbariConfiguration configuration,
      Environment environment) {
    // nothing to do yet
  }

}

