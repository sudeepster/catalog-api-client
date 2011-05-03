/**
 * Copyright 2011 Shopzilla.com
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.shopzilla.api.client.brand;

import java.util.HashMap;
import java.util.Map;

import com.shopzilla.api.client.ProductSearchRequest;
import com.shopzilla.api.client.UrlProvider;

/**
 * @author sscanlon
 * 
 */
public abstract class AbstractBaseUrlProvider implements UrlProvider {

    public Map<String, ?> makeParameterMap(ProductSearchRequest request) {

        Map<String, Object> parameters = new HashMap<String, Object>();

        parameters.put("apiKey", request.getApiKey());
        parameters.put("publisherId", request.getPublisherId());
        parameters.put("placementId", request.getPlacementId());
        parameters.put("categoryId", request.getCategoryId());
        parameters.put("keyword", request.getKeyword());
        parameters.put("start", request.getStart());
        parameters.put("productType", request.getProductType());
        parameters.put("numResults", request.getNumResults());
        parameters.put("productId", request.getProductId());
        parameters.put("attFilter", request.getAttFilter());
        parameters.put("offersOnly", request.getOffersOnly());
        parameters.put("showAttributes", request.isShowAttributes());
        parameters.put("showProductAttributes", request.isShowProductAttributes());
        parameters.put("merchantId", request.getMerchantId());

        return parameters;
    }
}
