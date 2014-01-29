// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.v201306.basicoperations;

import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201306.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201306.cm.Criterion;
import com.google.api.ads.adwords.axis.v201306.cm.Operator;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.client.auth.oauth2.Credential;

/**
 * This example deletes an ad group criterion using the 'REMOVE' operator. To
 * get ad group criteria, run GetKeywords.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: AdGroupCriterionService.mutate
 *
 * Category: adx-exclude
 *
 * @author Kevin Winter
 */
public class DeleteKeyword {

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential similar to a ClientLogin token
    // and can be used in place of a service account.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.ADWORDS)
        .fromFile()
        .build()
        .generateCredential();

    // Construct an AdWordsSession.
    AdWordsSession session = new AdWordsSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    long adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
    long criterionId = Long.parseLong("INSERT_CRITERION_ID_HERE");

    AdWordsServices adWordsServices = new AdWordsServices();

    runExample(adWordsServices, session, adGroupId, criterionId);
  }

  public static void runExample(
      AdWordsServices adWordsServices, AdWordsSession session, long adGroupId,
      long criterionId) throws Exception {
    // Get the AdGroupCriterionService.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    // Create base class criterion to avoid setting keyword specific fields.
    Criterion criterion = new Criterion();
    criterion.setId(criterionId);

    // Create ad group criterion.
    AdGroupCriterion adGroupCriterion = new AdGroupCriterion();
    adGroupCriterion.setAdGroupId(adGroupId);
    adGroupCriterion.setCriterion(criterion);

    // Create operations.
    AdGroupCriterionOperation operation = new AdGroupCriterionOperation();
    operation.setOperand(adGroupCriterion);
    operation.setOperator(Operator.REMOVE);

    AdGroupCriterionOperation[] operations = new AdGroupCriterionOperation[] {operation};

    // Delete ad group criteria.
    AdGroupCriterionReturnValue result = adGroupCriterionService.mutate(operations);

    // Display ad group criteria.
    for (AdGroupCriterion adGroupCriterionResult : result.getValue()) {
      System.out.println("Ad group criterion with ad group id \""
          + adGroupCriterionResult.getAdGroupId() + "\", criterion id \""
          + adGroupCriterionResult.getCriterion().getId() + "\", and type \""
          + adGroupCriterionResult.getCriterion().getCriterionType() + "\" was deleted.");
    }
  }
}
