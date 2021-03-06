package org.bndly.schema.definition.parser.api;

/*-
 * #%L
 * Schema Definition Parser
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

import org.bndly.schema.model.Schema;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public interface SchemaDefinitionIO {
	Schema parse(String location, String... extensions) throws ParsingException;
	Schema parse(InputStream rootSchemaInputStream, InputStream... extensions) throws ParsingException;
	void serialize(Schema schema, OutputStream outputStream) throws SerializingException;
}
