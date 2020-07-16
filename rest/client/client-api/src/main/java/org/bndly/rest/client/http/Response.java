package org.bndly.rest.client.http;

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

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public interface Response {

	int getStatusCode();

	String getHeaderValue(String headerName);
	
	boolean isHavingEntity();
	
	InputStream getEntityData() throws IOException;
	
	String getEntityContentType();
	
	String getEntityContentEncoding();

	void consumeEntitySilently();
}
