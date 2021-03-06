package org.bndly.schema.impl.test.beans;

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

import java.math.BigDecimal;
import java.util.Date;

public interface JsonType {
    String getStringValue();
    void setStringValue(String value);
    BigDecimal getDecimalValue();
    void setDecimalValue(BigDecimal value);
    Boolean getBooleanValue();
    void setBooleanValue(Boolean value);
    Date getDateValue();
    void setDateValue(Date value);
    AnotherJsonType getComplexValue();
    void setComplexValue(AnotherJsonType value);
}
