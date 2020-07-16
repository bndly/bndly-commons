package org.bndly.schema.impl;

/*-
 * #%L
 * Schema Impl
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

import org.bndly.schema.api.db.AttributeColumn;
import org.bndly.schema.model.Type;
import org.bndly.schema.model.UniqueConstraint;

public class UniqueConstraintOnType {

    private final UniqueConstraint uniqueConstraint;
    private final Type type;
    private final AttributeColumn columnInUniqueConstraintTable;

    public UniqueConstraintOnType(UniqueConstraint uniqueConstraint, Type type, AttributeColumn columnInUniqueConstraintTable) {
        this.uniqueConstraint = uniqueConstraint;
        this.type = type;
        this.columnInUniqueConstraintTable = columnInUniqueConstraintTable;
    }

    public Type getType() {
        return type;
    }

    public UniqueConstraint getUniqueConstraint() {
        return uniqueConstraint;
    }

    public AttributeColumn getColumnInUniqueConstraintTable() {
        return columnInUniqueConstraintTable;
    }
    
}
