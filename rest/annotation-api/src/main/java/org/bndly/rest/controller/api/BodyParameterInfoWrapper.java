package org.bndly.rest.controller.api;

/*-
 * #%L
 * REST Annotation API
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

import org.bndly.rest.controller.api.DocumentationInfo.BodyParameterInfo;
import java.lang.reflect.Type;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class BodyParameterInfoWrapper implements BodyParameterInfo {

	private final BodyParameterInfo wrapped;

	public BodyParameterInfoWrapper(BodyParameterInfo wrapped) {
		if (wrapped == null) {
			throw new IllegalArgumentException("wrapped body parameter info is not allowed to be null");
		}
		this.wrapped = wrapped;
	}
	
	@Override
	public String getSchemaElementName() {
		return wrapped.getSchemaElementName();
	}

	@Override
	public String getName() {
		return wrapped.getName();
	}

	@Override
	public String getDescription() {
		return wrapped.getDescription();
	}

	@Override
	public Boolean isRequired() {
		return wrapped.isRequired();
	}

	@Override
	public Type getJavaType() {
		return wrapped.getJavaType();
	}
	
}
