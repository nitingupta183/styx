/**
 * Copyright (C) 2013-2018 Expedia Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hotels.styx.api.client;


/**
 * Holds the origins that are considered ready to accept traffic.
 */
public interface ActiveOrigins {

    /**
     * Returns the list of the origins ready to accept traffic.
     *
     * @return a list of connection pools for each active origin
     */
    Iterable<RemoteHost> snapshot();
}
