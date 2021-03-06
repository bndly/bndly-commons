package org.bndly.schema.api.exception;

/*-
 * #%L
 * Schema API
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

import org.bndly.schema.api.query.Query;

public class EmptyResultException extends SchemaException {
    private final Query query;

    public EmptyResultException(Query query) {
        this.query = query;
    }

    public EmptyResultException(Query query, String message) {
        super(message);
        this.query = query;
    }

    public EmptyResultException(Query query, Throwable cause) {
        super(cause);
        this.query = query;
    }

    public EmptyResultException(Query query, String message, Throwable cause) {
        super(message, cause);
        this.query = query;
    }

    public Query getQuery() {
        return query;
    }
    
}
