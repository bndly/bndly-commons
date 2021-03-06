package org.bndly.rest.descriptor.model;

/*-
 * #%L
 * REST API Descriptor
 * %%
 * Copyright (C) 2013 - 2020 Cybercon GmbH
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

public class LinkDescriptor extends AbstractDocumented implements Documented {
    private String rel;
    private TypeDescriptor consumes;
    private TypeDescriptor returns;

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

    public TypeDescriptor getConsumes() {
        return consumes;
    }

    public void setConsumes(TypeDescriptor consumes) {
        this.consumes = consumes;
    }

    public TypeDescriptor getReturns() {
        return returns;
    }

    public void setReturns(TypeDescriptor returns) {
        this.returns = returns;
    }
    
}
