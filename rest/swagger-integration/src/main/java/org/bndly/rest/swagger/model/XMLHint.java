package org.bndly.rest.swagger.model;

/*-
 * #%L
 * REST Swagger Integration
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

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class XMLHint {
	private String name;
	private String namespace;
	private String prefix;
	private Boolean attribute;
	private Boolean wrapped;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public Boolean getAttribute() {
		return attribute;
	}

	public void setAttribute(Boolean attribute) {
		this.attribute = attribute;
	}

	public Boolean getWrapped() {
		return wrapped;
	}

	public void setWrapped(Boolean wrapped) {
		this.wrapped = wrapped;
	}
	
	
}
