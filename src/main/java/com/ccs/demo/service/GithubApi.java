package com.ccs.demo.service;

import org.apache.hc.client5.http.fluent.Request;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chua.cs@outlook.com
 * @since 2023/02/01
 */
public final class GithubApi {

    public static final String KEY_LOGIN = "login";
    public static final String KEY_CONTRIBUTIONS = "contributions";

    /**
     * To fetch a list of contributor from a specific repo.
     *
     * @param repo The repo name. Usually in the format: "owner/repo"
     * @param maxRecordSize The maximum record to be fetched.
     * @return The list of {@link JSONObject} representing the contributors for a repo.
     */
    public static List<JSONObject> fetchListOfTopContributor(String repo, int maxRecordSize) {
        List<JSONObject> topContributor = new ArrayList<>();
        try {
            String responseString = Request
                    .get(String.format("https://api.github.com/repos/%s/contributors?page=1&per_page=%d", repo, maxRecordSize))
                    .execute()
                    .returnContent()
                    .toString();
            JSONArray jsonArray = new JSONArray(responseString);

            for (int i = 0; i < jsonArray.length(); i++) {
                topContributor.add(jsonArray.getJSONObject(i));
            }

            /* Sorting is not required, as the API guaranteed result with descending order in contribution. */
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
        return topContributor;
    }
}
