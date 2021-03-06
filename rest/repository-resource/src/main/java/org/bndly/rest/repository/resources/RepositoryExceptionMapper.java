package org.bndly.rest.repository.resources;

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

import org.bndly.rest.common.beans.error.ErrorRestBean;
import org.bndly.rest.controller.api.ExceptionMapper;
import org.bndly.rest.controller.api.Response;
import org.bndly.schema.api.repository.NodeNotFoundException;
import org.bndly.schema.api.repository.PropertyNotFoundException;
import org.bndly.schema.api.repository.RepositoryException;
import org.osgi.service.component.annotations.Component;

/**
 *
 * @author cybercon &lt;bndly@cybercon.de&gt;
 */
@Component(service = ExceptionMapper.class, immediate = true)
public class RepositoryExceptionMapper implements ExceptionMapper<RepositoryException> {

	@Override
	public Response toResponse(RepositoryException e) {
		ErrorRestBean msg = new ErrorRestBean();
		msg.setMessage(e.getMessage());
		if (NodeNotFoundException.class.isInstance(e)) {
			msg.setName("UnknownResourceError");
		} else if (PropertyNotFoundException.class.isInstance(e)) {
			msg.setName("UnknownResourceError");
		} else {
			msg.setName("RepositoryError");
		}
		return Response.status(404).entity(msg);
	}
	
}
