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
package org.apache.ambari.resource.statemachine;

public enum ClusterEventType {
  
  //Producer:Client, Cluster
  START,

  //Producer:Client, Cluster
  STOP,

  //Producer: Service
  START_SUCCESS,
  
  //Producer: Service
  START_FAILURE,
  
  //Producer: Service
  STOP_SUCCESS,
  
  //Producer: Service
  STOP_FAILURE,
  
  //Producer: Client
  RELEASE_NODES,
  
  //Producer: Client
  ADD_NODES
  
}