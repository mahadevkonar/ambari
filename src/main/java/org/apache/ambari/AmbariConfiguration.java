package org.apache.ambari;

import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

import com.yammer.dropwizard.config.Configuration;

public class AmbariConfiguration extends Configuration {
  @NotEmpty
  @JsonProperty
  private String template;

  @NotEmpty
  @JsonProperty
  private String defaultName = "Stranger";

  public String getTemplate() {
    return template;
  }

  public String getDefaultName() {
    return defaultName;
  }
}
