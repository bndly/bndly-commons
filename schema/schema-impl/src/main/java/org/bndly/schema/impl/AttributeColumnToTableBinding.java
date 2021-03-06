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
import org.bndly.schema.api.db.Table;

public class AttributeColumnToTableBinding {

    private final AttributeColumn attributeColumn;
    private final Table table;

    public AttributeColumnToTableBinding(AttributeColumn attributeColumn, Table table) {
        this.attributeColumn = attributeColumn;
        this.table = table;
    }

    public AttributeColumn getAttributeColumn() {
        return attributeColumn;
    }

    public Table getTable() {
        return table;
    }
}
