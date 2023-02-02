package com.ccs.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class GithubApiTest {

    @Test
    void fetchListOfTopContributor() {
        assertNotNull(GithubApi.fetchListOfTopContributor("danfickle/openhtmltopdf", 1));
    }
}