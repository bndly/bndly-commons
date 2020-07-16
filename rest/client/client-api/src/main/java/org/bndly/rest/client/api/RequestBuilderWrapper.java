package org.bndly.rest.client.api;

/*-
 * #%L
 * REST Client API
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

import org.bndly.rest.client.http.RequestBuilder;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public interface RequestBuilderWrapper {
	/**
	 * Returns the wrapped requestBuilder
	 * @return never null
	 */
	RequestBuilder requestBuilder();
	
	/**
	 * Returns a copy of the wrapped requestBuilder
	 * @return never null
	 */
	RequestBuilder copyRequestBuilder();
}
