package com.ccs.demo;

import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void main() {
        // Case: Happy Path
        App.main(new String[]{"danfickle/openhtmltopdf"});

        // Case: Happy Path
        App.main(new String[]{"danfickle/openhtmltopdf", "google/random"});

        // Case: Empty Parameter
        App.main(new String[]{""});

        // Case: Invalid Parameter
        App.main(new String[]{"invalid/repo"});
    }
}