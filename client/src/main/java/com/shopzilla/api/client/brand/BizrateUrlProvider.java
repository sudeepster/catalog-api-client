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

/**
 * @author sscanlon
 * 
 */
public class BizrateUrlProvider extends AbstractBaseUrlProvider {

    private static final String BASE_URL = "http://catalog.bizrate.com/services/catalog/v1/api/";

    private static final String PRODUCT_QUERY_FRAGMENT = "?" +
            "apiKey={apiKey}" +
            "&publisherId={publisherId}" +
            "&placementId={placementId}" +
            "&categoryId={categoryId}" +
            "&keyword={keyword}" +
            "&productId={productId}" +
            "&productIdType={productType}" +
            "&offersOnly={offersOnly}" +
            "&merchantId={merchantId}" +
            "&brandId=&" +
            "biddedOnly=" +
            "&minPrice=" +
            "&maxPrice=" +
            "&minMarkdown=" +
            "&zipCode=" +
            "&freeShipping=" +
            "&start={start}" +
            "&results={numResults}" +
            "&startOffers=0" +
            "&resultsOffers=0" +
            "&sort=relevancy_desc" +
            "&attFilter={attFilter}" +
            "&showAttributes={showAttributes}" +
            "&showProductAttributes={showProductAttributes}" +
            "&minRelevancyScore=100" +
            "&maxAge=" +
            "&showRawUrl=" +
            "&imageOnly=";

    private static final String TAXONOMY_QUERY_FRAGMENT = "?" +
            "apiKey={apiKey}" +
            "&publisherId={publisherId}" +
            "&placementId={placementId}" +
            "&categoryId={categoryId}" +
            "&keyword={keyword}" +
            "&ancestors=" +
            "&results=10" +
            "&sort=prob_desc";

    public String getProductServiceURL() {
        return new StringBuilder(BASE_URL)
                .append("product/1")
                .append(PRODUCT_QUERY_FRAGMENT)
                .toString();
    }

    public String getTaxonomyServiceURL() {
        return new StringBuilder(BASE_URL)
                .append("taxonomy/1")
                .append(TAXONOMY_QUERY_FRAGMENT)
                .toString();
    }

    public String getBrandServiceURL() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getMerchantServiceURL() {
        // TODO Auto-generated method stub
        return null;
    }

}
