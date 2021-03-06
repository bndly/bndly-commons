package org.bndly.common.ical.api;

/*-
 * #%L
 * iCal API
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

import org.bndly.common.ical.api.extensions.DescriptionExtension;
import org.bndly.common.ical.api.extensions.DurationExtension;
import org.bndly.common.ical.api.extensions.LocationExtension;
import org.bndly.common.ical.api.extensions.PrioExtension;

import java.util.Date;

/**
 * Created by alexp on 07.05.15.
 */
public interface ICSEventBuilder
        extends ICSComponentBuilder<ICSEventBuilder>,
        //Extensions
        LocationExtension<ICSEventBuilder>,
        PrioExtension<ICSEventBuilder>,
        DescriptionExtension<ICSEventBuilder>,
        DurationExtension<ICSEventBuilder> {

    ICSEventBuilder end(Date end);

    ICSEventBuilder tentativeStatus();

    ICSEventBuilder confirmedStatus();

    ICSEventBuilder opaque();

    ICSEventBuilder transparent();
}
