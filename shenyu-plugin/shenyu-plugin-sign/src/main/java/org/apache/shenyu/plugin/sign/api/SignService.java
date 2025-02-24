/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.plugin.sign.api;

import org.apache.commons.lang3.tuple.Pair;
import org.springframework.web.server.ServerWebExchange;

import java.util.Map;

/**
 * The interface Sign service.
 */
public interface SignService {

    /**
     * Sign verify pair.
     * @param exchange   the exchange
     * @param requestBody the requestBody
     * @param queryParams  url query params
     * @return the pair
     */
    Pair<Boolean, String> signVerify(ServerWebExchange exchange, Map<String, Object> requestBody, Map<String, String> queryParams);

    /**
     * Sign verify pair.
     * @param exchange   the exchange
     * @return the pair
     */
    default Pair<Boolean, String> signVerify(ServerWebExchange exchange) {
        return signVerify(exchange, null, null);
    }
}
