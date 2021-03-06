package org.bndly.rest.repository.resources.json;

/*-
 * #%L
 * REST Repository Resource
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

import org.bndly.common.json.serializing.JSONWriter;
import org.bndly.schema.api.repository.Property;
import org.bndly.schema.api.repository.RepositoryException;
import java.io.IOException;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class StringJSONPropertyWriter implements JSONPropertyWriter {

	@Override
	public void write(Property property, JSONWriter writer) throws RepositoryException, IOException {
		String string = property.getString();
		if (string != null) {
			writer.writeString(string);
		} else {
			writer.writeNull();
		}
	}
}
