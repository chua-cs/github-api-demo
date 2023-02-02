package com.ccs.demo;

import com.ccs.demo.service.GithubApi;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

import java.util.List;

import static com.ccs.demo.service.GithubApi.KEY_CONTRIBUTIONS;
import static com.ccs.demo.service.GithubApi.KEY_LOGIN;

/**
 * @author chua.cs@outlook.com
 * @since 2023/02/01
 */
public class App {

    public static void main(String[] args) {
        // Validating parameter input
        if (ArrayUtils.isEmpty(args) || StringUtils.isEmpty(args[0])) {
            System.out.println("Parameter string cannot be empty.");
            return;
        }

        String parameterInput = args[0];
        if (args.length > 1) {
            System.out.println("Multiple parameter inputs detected. However, only the first value will be accepted.");
        }
        System.out.println("Accepted Value: " + parameterInput);

        // Calling the API method
        List<JSONObject> sortedList = GithubApi.fetchListOfTopContributor(parameterInput, 25);
        if (CollectionUtils.isNotEmpty(sortedList)) {
            System.out.println("Top Contributors for the repo:");
            int counter = 0;
            for (JSONObject jsonObject : sortedList) {
                System.out.printf("%d. %s, contributed: %d%n", ++counter, jsonObject.get(KEY_LOGIN), jsonObject.getInt(KEY_CONTRIBUTIONS));
            }
        } else {
            System.out.println("Seems like no result is fetched. Please try again later.");
        }
    }
}
