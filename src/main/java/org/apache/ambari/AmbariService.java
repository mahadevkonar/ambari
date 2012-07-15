package org.apache.ambari;

import org.apache.ambari.resources.AmbariResource;

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
    final String template = configuration.getTemplate();
    final String defaultName = configuration.getDefaultName();
    environment.addResource(new AmbariResource(template, defaultName));
  }
}

