/*
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
package org.apache.ambari.common.rest.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Combination of the cluster definition and state.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterInformation", propOrder = {
    "definition",
    "state"
})
@XmlRootElement(name = "ClusterInformation")
public class ClusterInformation {

   
    @XmlElement
    protected ClusterDefinition definition = null;
    
    @XmlElement
    protected ClusterState state = null;

    /**
     * @return the definition
     */
    public ClusterDefinition getDefinition() {
        return definition;
    }

    /**
     * @param definition the definition to set
     */
    public void setDefinition(ClusterDefinition definition) {
        this.definition = definition;
    }

    /**
     * @return the state
     */
    public ClusterState getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(ClusterState state) {
        this.state = state;
    }
    
}
