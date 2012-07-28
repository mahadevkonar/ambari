/**
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements.  See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership.  The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License.  You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.apache.ambari.common.conf;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Ambari Configuration based on Java Properties File.
 * 
 */
public class AmbariConfiguration {
  public static final String AMBARI_CONFIG_FILE = "ambari.properties";
  
  public AmbariConfiguration() {
    Properties defaultProps = new Properties();
    FileInputStream in = null;
    try {
      in = new FileInputStream(AMBARI_CONFIG_FILE);
      defaultProps.load(in);
    } catch (IOException ie) {
      throw new RuntimeException("Unable to find Ambari Config " + 
          AMBARI_CONFIG_FILE);
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch(IOException ie) {/*Ignore*/}
      }
    } 
    
  }
  
}
