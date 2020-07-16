package org.bndly.rest.pdf.beans;

/*-
 * #%L
 * REST PDF Resource
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

import org.bndly.rest.atomlink.api.JAXBMessageClassProvider;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
public class JAXBMessageClassProviderImpl implements JAXBMessageClassProvider {
	private static final Collection<Class<?>> classes;
	static {
		classes = new HashSet<>();
		classes.add(PDFDocument.class);
		classes.add(PDFDocuments.class);
	}

	@Override
	public Collection<Class<?>> getJAXBMessageClasses() {
		return classes;
	}
	
}
